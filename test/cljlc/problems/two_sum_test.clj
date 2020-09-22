(ns cljlc.problems.two-sum-test
  (:require [cljlc.problems.two-sum :refer :all]
            [clojure.test :refer :all]))

(deftest base
  (testing "Two sum"
    (is (= [0 1] (two-sum [2 7 11 15] 9)))
    (is (= [1 2] (two-sum [3 2 4] 6)))
    (is (= [0 1] (two-sum [3 3] 6)))))
