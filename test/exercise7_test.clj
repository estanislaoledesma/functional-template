(ns exercise7-test
  (:require [clojure.test :refer :all]
              [exercise7 :refer :all]))

(deftest enesimo-of-list-of-numbers
  (testing "Returns the third element of a list of numbers."
    (is (= (enesimo 2 '(4 5 6 7)) 6))))

(deftest enesimo-of-array-of-keys
  (testing "Returns the first element of an array of keys."
    (is (= (enesimo 0 [:a :b :c]) :a))))

(deftest enesimo-of-array-of-numbers
  (testing "Returns the second element of an array of numbers."
    (is (= (enesimo 1 [1 2 3 4]) 2))))

(deftest enesimo-of-a-list-of-arrays
  (testing "Returns the third element of a list of arrays."
    (is (= (enesimo 2 '([1 2] [3 4] [5 6])) [5 6]))))
