(ns bux.test.calc
  (:require [bux.calc :as bc ])
  (:use [bux.currencies])
  (:use [clojure.test]))

(deftest percentages
  (is (= (bc/pct JPY 1.23M 10) 0M))
  (is (= (bc/pct+ JPY 1.23M 10) 1M))
  (is (= (bc/pct- JPY 1.23M 10) 1M))

  (is (= (bc/pct 1.23M 10) 0.12M))
  (is (= (bc/pct+ 1.23M 10) 1.35M))
  (is (= (bc/pct- 1.23M 10) 1.11M)))
