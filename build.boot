(set-env!
  :resource-paths #{"src"}
  :dependencies '[[org.clojure/clojure "1.9.0-alpha15"]
                  [org.clojure/clojurescript "1.9.293"]

                  [crisptrutski/boot-cljs-test "0.3.0" :scope "test"]
                  [juxt/iota "0.2.3" :scope "test"]])

(task-options!
  pom {:project 'clj-tachyons
       :version "0.1.0"
       :description "Tachyons for Clojure(Script)?"
       :url "http://tachyons.io"
       :scm {:url "https://github.com/mynomoto/clj-tachyons"}
       :license {"Eclipse Public License"
                 "http://www.eclipse.org/legal/epl-v10.html"}}
  push {:repo "deploy-clojars"})

(ns-unmap *ns* 'test)

(require
  '[crisptrutski.boot-cljs-test :refer [test-cljs]])

(deftask build
  "Build and install the project locally."
  []
  (comp (pom) (jar) (install)))

(deftask testing []
  (merge-env! :source-paths #{"test"})
  identity)

(deftask autotest
  []
  (comp
    (testing)
    (watch)
    (speak)
    (test-cljs)))

(deftask test
  []
  (comp
    (test-cljs :exit? true)
    (testing)))

(deftask local-install []
  (comp
    (pom)
    (jar)
    (install)))

(deftask release []
  (merge-env!
    :repositories [["deploy-clojars" {:url "https://clojars.org/repo"
                                      :username (System/getenv "CLOJARS_USER")
                                      :password (System/getenv "CLOJARS_PASS")}]])
  (comp
    (local-install)
    (sift :include [#".*\.jar"])
    (push)))
