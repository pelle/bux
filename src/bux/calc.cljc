(ns bux.calc
  (:use [bux.currencies]
        [bux.core]))

(defn pct
  "Calculate percentage of value"

  ([x p] (pct $ x p))
  ([c x p]
    (round$ c (* (/ x 100) p))))

(defn pct+
  "calculate and add percentage of value"
  ([x p] (pct+ $ x p))
  ([c x p]
    (round$ c (+ x (pct x p)))))

(defn pct-
  "calculate and discount percentage of value"
  ([x p] (pct- $ x p))
  ([c x p]
    (round$ c (- x (pct x p)))))