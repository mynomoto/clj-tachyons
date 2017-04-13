(ns clj-tachyons.font
  (:require
    [clojure.string :as str]
    [clojure.spec :as s]))

(s/def ::breakpoints #{:all :not-small :medium :large})

(def is-int? #{1 2 3 4 5 6 7})
(def is-hero? #{:headline :subheadline})

(s/def ::int-sizes is-int?)
(s/def ::hero-sizes is-hero?)

(s/def ::sizes (s/or :int-size ::int-sizes
                     :hero-size ::hero-sizes))

(s/def ::all ::sizes)
(s/def ::not-small ::sizes)
(s/def ::medium ::sizes)
(s/def ::large ::sizes)

(s/def ::size
  (s/or :font-size ::sizes
        :breakpoints (s/keys :opt-un [::all ::not-small ::medium ::large])))

(s/def ::measure #{:narrow :medium :wide})

(s/def ::options #{:indent :measure :small-caps :truncate})

(s/def ::configuration (s/keys :opt-un [::size ::measure ::options]))

(s/valid? ::size :headline)
(s/valid? ::size 1)
(s/conform ::size 1)
(s/conform ::size {:all 1
                   :not-small 3})

(defn breakpoint->class
  [breakpoint]
  {:pre [(s/valid? ::breakpoints breakpoint)]}
  (case breakpoint
    :all ""
    :not-small "-ns"
    :medium "-m"
    :large "-l"))

(defn size->class
  [size]
  {:pre [(s/valid? ::sizes size)]}
  (if (is-int? size)
    (str "f" size)
    (str "f-" (name size))))

(defn breakpoint-size->class
  [[breakpoint size]]
  {:pre [(s/valid? ::breakpoints breakpoint) (s/valid? ::sizes size)]}
  (str (size->class size) (breakpoint->class breakpoint)))

(defn font->class
  [font]
  {:pre [(s/valid? ::size font)]}
  (if (map? font)
    (str/join " " (map breakpoint-size->class font))
    (size->class font)))

(font->class 1)
(font->class {:not-small 1 :medium 3})
