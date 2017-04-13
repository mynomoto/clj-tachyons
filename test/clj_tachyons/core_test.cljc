(ns clj-tachyons.core-test
  (:require [clojure.test :refer [deftest testing is]]
            [clj-tachyons.core :as t]))

(deftest a-test
  (testing "valid?"
    (is (t/valid? :absolute))
    (is (not (t/valid? :abslute)))))

(deftest a-test
  (testing "valid!"
    (is (t/valid! :absolute))
    (is (thrown? js/Error (t/valid! :abslute)))))
