(ns bux.currency
  (:use [bux.money]))


(defrecord Currency 
  [iso_code name symbol subunit subunit_to_unit symbol_first html_entity iso_numeric decimal_points priority]
  clojure.lang.IFn 
    (invoke [this] (this 0)) 
    (invoke [this cents] (create-money this cents)) 
    (applyTo [this args] (clojure.lang.AFn/applyToHelper this args))
  AmountFormattable
    (amount-formatter [_]
      (let [fs (if (= 0 decimal_points) "#,###,###" (str "#,###,###." (reduce str (repeat decimal_points "#"))))]
          (java.text.DecimalFormat. fs)
        ))
    (format-amount [this amount]
      (let [ s (.format (amount-formatter this) amount)]
        (if symbol 
          (if symbol_first
            (str symbol s)
            (str s " " symbol))
          s )))

    (parse-amount [this value]
      (create-money this (.parse (amount-formatter this) value))))
  

(defn create-currency
  "Create a currency record"
  ([ params ]
    (apply create-currency
      (map params 
        [:iso_code :name :symbol :subunit :subunit_to_unit :symbol_first :html_entity :iso_numeric :decimal_points :priority]) ))

  ([iso_code name symbol subunit subunit_to_unit symbol_first html_entity iso_numeric decimal_points priority]
    (Currency. iso_code name symbol subunit subunit_to_unit symbol_first html_entity iso_numeric decimal_points priority)))


(defn defcurrency 
  "Create a currency and add it as a var to the current namespace using the iso_code as the name"
  [params]
  (eval (list 'def (symbol (:iso_code params)) (create-currency params) )))


