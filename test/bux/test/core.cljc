(ns bux.test.core
  (:use bux.core)
  (:require [bux.currencies :as currencies])
  #?(:clj (:use clojure.test)
     :cljs (:use cljs.test)))

(deftest creating-currency
  (let [c {:symbol      "$", :subunit "Centavo", :name "Argentine Peso", :iso-code "ARS", :iso-numeric "032",
           :html-entity "&#x20B1;", :symbol-first true, :decimal-points 2, :priority 100}]
    (is (= (parse$ c "1.23") 1.23M))
    (is (= (parse$ c "$1.23") 1.23M))
    (is (= (parse$ c "$11,231.23") 11231.23M))
    (is (= (format$ c 1.23M) "1.23"))
    (is (= (format$ c 1) "1.00"))
    (is (= (format$ c 11231.23M) "11,231.23"))
    (is (= (str$ c 1) "$1.00"))
    (is (= (str$ c 1.23M) "$1.23"))
    (is (= (str$ c 11231.23M) "$11,231.23"))
    (is (= ($ c 1.23M) "$1.23"))))

(deftest testing-various-preset-currencies
  (is (= ($ 1.234M) "$1.23"))
  (is (= (round$ 1.231M) 1.23M))
  (is (= (round$ 1.235M) 1.24M))
  (is (= (str$ 1.23M) "$1.23"))
  (is (= (parse$ "$1.23") 1.23M))

  (let [USD currencies/default$]
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
