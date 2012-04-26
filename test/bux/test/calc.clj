(ns bux.test.calc
  (:require [bux.calc :as bc ])
  (:use [bux.currencies])
  (:use [clojure.test]))

(deftest percentages
  (is (= (bc/perc 123 10) 12))
  (is (= (bc/perc+ 123 10) 135))
  (is (= (bc/perc- 123 10) 111)))
