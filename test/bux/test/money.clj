(ns bux.test.money
  (:use [bux.money])
  (:use [bux.currencies])
  (:use [clojure.test]))


(deftest creating-money-usd
  (let [ m (create-money USD 123)]
      (is (= (str m) "$1.23"))
      ))


(deftest creating-money-from-currency
  (let [ m (JPY 123)]
      (is (= (str m) "¥123"))
      ))
