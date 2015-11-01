(ns bux.test.core
  (:use [bux.core]
        [clojure.test])
  (:require         [bux.currencies :as currencies]
                    ))


(deftest creating-currency
  (let [ c {:symbol "$", :subunit "Centavo", :name "Argentine Peso", :iso-code "ARS", :iso-numeric "032",
     :html-entity "&#x20B1;", :symbol-first true, :decimal-points 2, :priority 100}]
      (is (= (parse$ c "1.23") 1.23M))
      (is (= (parse$ c "$1.23") 1.23M))
      (is (= (str 1.23M) "1.23"))
      (is (= (str$ c 1.23M) "$1.23"))))

(deftest testing-various-preset-currencies
  (let [USD currencies/$]
    (is (= (round$ USD 1.231M) 1.23M))
    (is (= (round$ USD 1.235M) 1.24M))
    (is (= (str$ USD 1.23M) "$1.23"))
    (is (= (parse$ USD "$1.23") 1.23M)))

  (let [JPY (currencies/iso$ :JPY)]
    (is (= (round$ JPY 1.231M) 1M))
    (is (= (round$ JPY 1.5M) 2M))
    (is (= (str$ JPY 123M) "¥123"))
    (is (= (parse$ JPY "¥123") 123M)))

  (let [RUB (currencies/iso$ :RUB)]
    (is (= (str$ RUB 1.23M) "1.23 р."))
    (is (= (parse$ RUB "1.23 р.") 1.23M)))

  (let [DKK (currencies/iso$ :DKK)]
    (is (= (str$ DKK 1.23M) "1.23 kr"))
    (is (= (parse$ DKK "1.23 kr") 1.23M)))

  (let [KGS (currencies/iso$ :KGS)]
    (is (= (str$ KGS 1.23M) "1.23"))
    (is (= (parse$ KGS "1.23") 1.23M))))
