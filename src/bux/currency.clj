(ns bux.currency
  (:use [bux.money]))


(defrecord Currency 
  [iso_code name symbol subunit subunit_to_unit symbol_first html_entity decimal_mark thousands_separator iso_numeric decimal_points priority]
  clojure.lang.IFn 
    (invoke [this] (this 0)) 
    (invoke [this cents] (create-money this cents)) 
    (applyTo [this args] (clojure.lang.AFn/applyToHelper this args))
  FormatString
    (format-string [this]
      (let [base (str "%" thousands_separator decimal_mark decimal_points "f")]
        (if symbol_first
          (str symbol base)
          (str base symbol)
        ))))
  

(defn create-currency
  "Create a currency record"
  ([ params ]
    (apply create-currency
      (map params 
        [:iso_code :name :symbol :subunit :subunit_to_unit :symbol_first :html_entity :decimal_mark :thousands_separator :iso_numeric :decimal_points :priority]) ))

  ([iso_code name symbol subunit subunit_to_unit symbol_first html_entity decimal_mark thousands_separator iso_numeric decimal_points priority]
    (Currency. iso_code name symbol subunit subunit_to_unit symbol_first html_entity decimal_mark thousands_separator iso_numeric decimal_points priority)))


(defn defcurrency 
  "Create a currency and add it as a var to the current namespace using the iso_code as the name"
  [params]
  (eval (list 'def (symbol (:iso_code params)) (create-currency params) )))


