(ns bux.calc
  (:require [bux.currencies :as currencies]
            [bux.core :as bux]))

(defn pct
  "Calculate percentage of value"
  ([x p] (pct currencies/default$ x p))
  ([c x p]
    (bux/round$ c (* (/ x 100) p))))

(defn pct+
  "calculate and add percentage of value"
  ([x p] (pct+ currencies/default$ x p))
  ([c x p]
    (bux/round$ c (+ x (pct x p)))))

(defn pct-
  "calculate and discount percentage of value"
  ([x p] (pct- currencies/default$ x p))
  ([c x p]
    (bux/round$ c (- x (pct x p)))))
