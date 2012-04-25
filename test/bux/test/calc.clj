(ns bux.test.calc
  (:require [bux.calc :as bc ])
  (:use [bux.money])
  (:use [bux.currencies])
  (:use [clojure.test]))


(deftest adding-money-usd
  (let [ m (create-money USD 123)]
    (let [s (bc/add m 2)]
      (is (= (value s) 3.23))
      (is (= (format-me s) "$3.23")))

    (let [s (bc/add m (create-money USD 200))]
      (is (= (value s) 3.23))
      (is (= (format-me s) "$3.23")))
    ))

(deftest subtracting-money-usd
  (let [ m (create-money USD 123)]
    (let [s (bc/subtract m)]
      (is (= (value s) -1.23))
      (is (= (format-me s) "$-1.23")))
    (let [s (bc/subtract m 2)]
      (is (= (value s) -0.77))
      (is (= (format-me s) "$-0.77")))

    (let [s (bc/subtract m (create-money USD 200))]
      (is (= (value s) -0.77))
      (is (= (format-me s) "$-0.77")))
    ))

(deftest multiplying-money-usd
  (let [ m (create-money USD 123)]
    (let [s (bc/multiply m)]
      (is (= (value s) 1.23))
      (is (= (format-me s) "$1.23")))
    (let [s (bc/multiply m 2)]
      (is (= (value s) 2.46))
      (is (= (format-me s) "$2.46")))))

(deftest dividing-money-usd
  (let [ m (create-money USD 123)]
    (let [s (bc/divide m)]
      (is (= (value s) 1.23))
      (is (= (format-me s) "$1.23")))
    (let [s (bc/divide m 2)]
      (is (= (value s) 0.62))
      (is (= (format-me s) "$0.62")))))

(deftest percentage-of-money
  (let [ m (create-money USD 123)]
    (let [fee (bc/percentage m 10)]
      (is (= (value fee) 0.12))
      (is (= (format-me fee) "$0.12")))
    (let [fee (bc/with-percentage m 10)]
      (is (= (value fee) 1.35))
      (is (= (format-me fee) "$1.35")))))


