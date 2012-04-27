(ns bux.calc
  (:use [bux.currencies]))

(defn pct
  "Calculate percentage of value"

  ([x p] (pct default-currency x p))
  ([c x p]
    (with-precision (:decimal-points c)
      (bigdec (* (/ x 100) p)))))

(defn pct+
  "calculate and add percentage of value"
  ( [x p] (pct+ default-currency x p))
  ([c x p]
    (with-precision (:decimal-points c)
      (bigdec (+ x (pct x p))))))

(defn pct-
  "calculate and discount percentage of value"
  ([x p] (pct- default-currency x p))
  ([c x p]
    (with-precision (:decimal-points c)
      (bigdec (- x (pct x p))))))