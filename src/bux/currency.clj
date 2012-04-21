(ns bux.currency)

(defrecord Currency [iso_code name symbol subunit subunit_to_unit symbol_first html_entity decimal_mark thousands_separator iso_numeric priority])

(defn create-currency
  "Create a currency record"
  ([ params ]
    (apply create-currency
      (map params 
        [:iso_code :name :symbol :subunit :subunit_to_unit :symbol_first :html_entity :decimal_mark :thousands_separator :iso_numeric :priority]) ))

  ([iso_code name symbol subunit subunit_to_unit symbol_first html_entity decimal_mark thousands_separator iso_numeric priority]
    (Currency. iso_code name symbol subunit subunit_to_unit symbol_first html_entity decimal_mark thousands_separator iso_numeric priority)))


(defn defcurrency 
  "Create a currency and add it as a var to the current namespace using the iso_code as the name"
  [params]
  (eval (list 'def (symbol (:iso_code params)) (create-currency params) )))


