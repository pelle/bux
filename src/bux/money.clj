(ns bux.money
  (:require [bux.calc :as calc]))

(defprotocol AmountFormattable
  (amount-formatter [this])
  (format-amount [this amount])
  (parse-amount [this value]))


(defprotocol Formattable
  (format-me [this]))

(defprotocol Valuable
  (value [this])
  (base-value [this]))

(def create-money )

(deftype Money [currency subunits]
  Valuable
    (value [_] (if (= 0 (:decimal_points currency))
                 subunits
                 (double (/ (Math/round (double subunits)) (:subunit_to_unit currency)))))
    (base-value [_] subunits)

  calc/Calculator
    (add [x] x )
    (add [x y] 
          (create-money currency (+ subunits 
            (if (satisfies? Valuable y)
              (base-value y)              
              (* (:subunit_to_unit currency) y)))))
    (subtract [x] (create-money currency (- subunits)))
    (subtract [x y] 
          (create-money currency (- subunits 
            (if (satisfies? Valuable y)
              (base-value y)              
              (* (:subunit_to_unit currency) y)))))
    (multiply [x] x )
    (multiply [x y] 
          (create-money currency (* subunits y)))
    (divide [x] x )
    (divide [x y] 
          (create-money currency (/ subunits y)))

  Formattable
    (format-me [this] (format-amount currency (value this)))

  Object
    (toString [this] (format-me this)))

(defn create-money [currency subunits]
  (Money. currency  subunits))

