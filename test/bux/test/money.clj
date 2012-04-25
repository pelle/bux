(ns bux.test.money
  (:use [bux.money])
  (:use [bux.currencies])
  (:use [clojure.test]))


(deftest creating-money-usd
  (let [ m (create-money USD 123)]
      (is (= (value m) 1.23))
      (is (= (base-value m) 123))
      (is (= (format-me m) "$1.23"))
      (is (= (str m) "$1.23"))
      ))


(deftest creating-money-from-currency
  (let [ m (JPY 123)]
      (is (= (value m) 123))
      (is (= (base-value m) 123))
      (is (= (format-me m) "¥123"))
      (is (= (str m) "¥123")))
  (let [ m (RUB 123)]
      (is (= (value m) 1.23))
      (is (= (base-value m) 123))
      (is (= (format-me m) "1.23 р."))
      (is (= (str m) "1.23 р.")))
  (let [ m (KGS 123)]
      (is (= (value m) 1.23))
      (is (= (base-value m) 123))
      (is (= (format-me m) "1.23"))
      (is (= (str m) "1.23"))))
