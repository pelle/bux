(ns bux.test.calc
  (:require [bux.calc :as bc ]
            [bux.currencies :as currencies])
  (:use [clojure.test]))

(deftest percentages
  (let [JPY (currencies/iso$ :JPY)]
    (is (= (bc/pct JPY 1.23M 10) 0M))
    (is (= (bc/pct+ JPY 1.23M 10) 1M))
    (is (= (bc/pct- JPY 1.23M 10) 1M)))

  (is (= (bc/pct 1.23M 10) 0.12M))
  (is (= (bc/pct+ 1.23M 10) 1.35M))
  (is (= (bc/pct- 1.23M 10) 1.11M)))
