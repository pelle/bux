(ns bux.test.currency
  (:use [bux.currency]
        [bux.money])
  (:use [clojure.test]))


(deftest creating-currency
  (let [ params {:symbol "$", :subunit "Centavo", :name "Argentine Peso", :iso_code "ARS", :iso_numeric "032", 
    :subunit_to_unit 100, :html_entity "&#x20B1;", :symbol_first true, :decimal_points 2, :priority 100} 
         c (create-currency params )]
      (is (= (:symbol c) "$"))
      (is (= (:subunit c) "Centavo"))
      (is (= (:name c) "Argentine Peso"))
      (is (= (:iso_code c) "ARS"))
      (is (= (:iso_numeric c) "032"))
      (is (= (:subunit_to_unit c) 100))
      (is (= (:html_entity c) "&#x20B1;"))
      (is (= (:symbol_first c) true))
      (is (= (:priority c) 100))
      (let [m (parse-amount c "1.23")]
        (is (= (value m) 1.23))
        (is (= (base-value m) 123))
        (is (= (format-me m) "$1.23")))
      
      (let [m (parse-amount c "$1.23")]
        (is (= (value m) 1.23))
        (is (= (base-value m) 123))
        (is (= (format-me m) "$1.23")))))
  


(deftest testing-defcurrency
  (let [ params {:symbol "$", :subunit "Centavo", :name "Argentine Peso", :iso_code "ARS", :iso_numeric "032", 
    :subunit_to_unit 100, :html_entity "&#x20B1;", :symbol_first true, :decimal_points 2, :priority 100} 
         v (defcurrency params )
         c (var-get v)]
      (is (= (:symbol c) "$"))
      (is (= (:subunit c) "Centavo"))
      (is (= (:name c) "Argentine Peso"))
      (is (= (:iso_code c) "ARS"))
      (is (= (:iso_numeric c) "032"))
      (is (= (:subunit_to_unit c) 100))
      (is (= (:html_entity c) "&#x20B1;"))
      (is (= (:symbol_first c) true))
      (is (= (:priority c) 100))))
  
