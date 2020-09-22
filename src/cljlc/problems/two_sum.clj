(ns cljlc.problems.two-sum)

(defn two-sum
  [nums target]
  (let [nums-index (map vector nums (range))
        pairs (for [[x i] nums-index
                    [y j] nums-index
                    :when (< i j)
                    :when (= target (+ x y))]
                [i j])]
    (first pairs)))
