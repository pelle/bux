(ns bux.currency
  (:use [bux.money]))


(defrecord Currency 
  [iso-code name symbol subunit subunit-to-unit symbol-first html-entity iso-numeric decimal-points priority]
  clojure.lang.IFn 
    (invoke [this] (this 0)) 
    (invoke [this cents] (create-money this cents)) 
    (applyTo [this args] (clojure.lang.AFn/applyToHelper this args))
  AmountFormattable
    (amount-formatter [_]
      (let [fs (if (= 0 decimal-points) "#,###,###" (str "#,###,###." (reduce str (repeat decimal-points "#"))))]
          (java.text.DecimalFormat. fs)
        ))
    (format-amount [this amount]
      (let [ s (.format (amount-formatter this) amount)]
        (if symbol 
          (if symbol-first
            (str symbol s)
            (str s " " symbol))
          s )))

    (parse-amount [this value]
      (create-money this (long (* subunit-to-unit (.parse (amount-formatter this) (first (re-find #"([0123456789.,]+)" value ))))))))
  

(defn create-currency
  "Create a currency record"
  ([ params ]
    (apply create-currency
      (map params 
        [:iso-code :name :symbol :subunit :subunit-to-unit :symbol-first :html-entity :iso-numeric :decimal-points :priority]) ))

  ([iso-code name symbol subunit subunit-to-unit symbol-first html-entity iso-numeric decimal-points priority]
    (Currency. iso-code name symbol subunit subunit-to-unit symbol-first html-entity iso-numeric decimal-points priority)))


(defn defcurrency 
  "Create a currency and add it as a var to the current namespace using the iso-code as the name"
  [params]
  (eval (list 'def (symbol (:iso-code params)) (create-currency params) )))


