(ns bux.currency)

(defprotocol MoneyFormatter
  (money-formatter [this] "returns Decimal formatter with correct decimal points for currency")
  (to-unit [this subunits] "returns a numeric value with correct decimal points")
  (->$ [this amount] "formats amount with currency symbol")
  ($-> [this value] "parse string containing amount"))

(defrecord Currency 
  [iso-code name symbol subunit subunit-to-unit symbol-first html-entity iso-numeric decimal-points priority]
  clojure.lang.IFn 
    (invoke [this] (this 0)) 
    (invoke [this subunits] (->$ this subunits)) 
    (applyTo [this args] (clojure.lang.AFn/applyToHelper this args))
  MoneyFormatter
    (money-formatter [_]
      (let [fs (if (= 0 decimal-points) "#,###,###" (str "#,###,###." (reduce str (repeat decimal-points "#"))))]
          (java.text.DecimalFormat. fs)
        ))
    (to-unit [this subunits]
      (if (= 0 decimal-points)
        subunits
        (/ subunits subunit-to-unit))
      )
    (->$ [this amount]
      (let [ s (.format (money-formatter this) (to-unit this amount))]
        (if symbol 
          (if symbol-first
            (str symbol s)
            (str s " " symbol))
          s )))

    ($-> [this value]
      (long (* subunit-to-unit (.parse (money-formatter this) (first (re-find #"([0123456789.,]+)" value )))))))
  

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


