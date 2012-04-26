(ns bux.calc)

(defn perc
  "Calculate percentage of value"
  [x p]
  (long (* (/ x 100) p)))

(defn perc+
  "calculate and add percentage of value"
  [x p]
  (+ x (perc x p)))

(defn perc-
  "calculate and discount percentage of value"
  [x p]
  (- x (perc x p)))