(ns clj-tachyons.fonts
  (:require
    [clojure.spec :as s]))

(s/def ::breakpoints #{:all :not-small :medium :large})

(s/def ::font-sizes #{1 2 3 4 5 6 7 :headline :subheadline})

(s/def ::font (s/or :font-size ::font-sizes (s/keys ) ))

(def font-config
  {:font {:all 1
          :medium 1
          :large 1
          :not-small 1}})
