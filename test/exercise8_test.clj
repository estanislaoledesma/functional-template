(ns exercise8-test
  (:require [clojure.test :refer :all]
            [exercise8 :refer :all]))

(deftest separador-of-array-of-numbers
  (testing "Returns an array formed by lists of the array of numbers split by the 4th element."
    (is (= (separador 3 [1 2 3 4 5 6]) ['(1 2 3) '(4 5 6)]))))

(deftest separador-of-array-of-keys
  (testing "Returns an array formed by lists of the array of keys split by the second element."
    (is (= (separador 1 [:a :b :c :d]) ['(:a) '(:b :c :d)]))))

(deftest separador-of-array-of-arrays
  (testing "Returns an array formed by lists of the array of arrays split by the third element."
    (is (= (separador 2 [[1 2] [3 4] [5 6]]) ['([1 2] [3 4]) '([5 6])]))))
