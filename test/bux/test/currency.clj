(ns bux.test.currency
  (:use [bux.currency])
  (:use [bux.currencies])
  (:use [clojure.test]))


(deftest creating-currency
  (let [ params {:symbol "$", :subunit "Centavo", :name "Argentine Peso", :iso-code "ARS", :iso-numeric "032", 
    :subunit-to-unit 100, :html-entity "&#x20B1;", :symbol-first true, :decimal-points 2, :priority 100} 
         c (create-currency params )]
      (is (= (:symbol c) "$"))
      (is (= (:subunit c) "Centavo"))
      (is (= (:name c) "Argentine Peso"))
      (is (= (:iso-code c) "ARS"))
      (is (= (:iso-numeric c) "032"))
      (is (= (:subunit-to-unit c) 100))
      (is (= (:html-entity c) "&#x20B1;"))
      (is (= (:symbol-first c) true))
      (is (= (:priority c) 100))
      (is (= ($-> c "1.23") 123))
      (is (= ($-> c "$1.23") 123))
      (is (= (->$ c 123) "$1.23"))
      (is (= (c 123) "$1.23"))))
  
(deftest testing-defcurrency
  (let [ params {:symbol "$", :subunit "Centavo", :name "Argentine Peso", :iso-code "ARS", :iso-numeric "032", 
    :subunit-to-unit 100, :html-entity "&#x20B1;", :symbol-first true, :decimal-points 2, :priority 100} 
         v (defcurrency params )
         c (var-get v)]
      (is (= (:symbol c) "$"))
      (is (= (:subunit c) "Centavo"))
      (is (= (:name c) "Argentine Peso"))
      (is (= (:iso-code c) "ARS"))
      (is (= (:iso-numeric c) "032"))
      (is (= (:subunit-to-unit c) 100))
      (is (= (:html-entity c) "&#x20B1;"))
      (is (= (:symbol-first c) true))
      (is (= (:priority c) 100))))
  
(deftest testing-various-preset-currencies
  (is (= (USD 123) "$1.23"))
  (is (= ($-> USD "$1.23") 123))

  (is (= (JPY 123) "¥123"))
  (is (= ($-> JPY "¥123") 123))

  (is (= (RUB 123) "1.23 р."))
  (is (= ($-> RUB "1.23 р.") 123))

  (is (= (DKK 123) "1.23 kr"))
  (is (= ($-> DKK "1.23 kr") 123))

  (is (= (KGS 123) "1.23"))
  (is (= ($-> KGS "1.23") 123)))