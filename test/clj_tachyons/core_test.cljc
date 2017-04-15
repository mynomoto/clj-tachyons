(ns clj-tachyons.core-test
  (:require [clojure.test :refer [deftest testing is]]
            [clj-tachyons.core :as t]))

(deftest valid?
  (testing "valid?"
    (is (t/valid? :absolute))
    (is (not (t/valid? :abslute)))))

(deftest valid!
  (testing "valid!"
    (is (t/valid! :absolute))
    (is (thrown? js/Error (t/valid! :abslute)))))

(deftest generate-class
  (testing "vectors"
    (is (= "white" (t/generate-class [:white])))
    (is (= "white z-0" (t/generate-class [:white :z-0])))
    (is (= "white z-0" (t/generate-class [:white :z-0 nil])))
    (is (thrown? js/Error (t/generate-class [:z-6]))))
  (testing "sets"
    (is (= "white" (t/generate-class #{:white})))
    (is (= "white z-0" (t/generate-class #{:white :z-0})))
    (is (= "white z-0" (t/generate-class #{:white :z-0 nil})))
    (is (thrown? js/Error (t/generate-class #{:z-6})))))
