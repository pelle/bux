(ns bux.currency )

(defn get-iso [c _] (:iso-code c))

(defmulti str$ "formats amount as money for currency with symbol" get-iso)
(defmulti parse$ "parse money string value"  get-iso)
(defmulti round$ "parse"  get-iso)
(defmulti money-formatter "returns Decimal formatter with correct decimal points for currency" :iso-code)

(defrecord Currency 
  [iso-code name symbol subunit symbol-first html-entity iso-numeric decimal-points priority]
  clojure.lang.IFn 
    (invoke [this] (this 0)) 
    (invoke [this value] 
      (if (instance? String value)
        (parse$ this value)
        (round$ this value))) 
    (applyTo [this args] (clojure.lang.AFn/applyToHelper this args))
)

(defmethod money-formatter :default [c]
  (let [ decimal-points (:decimal-points c)
         fs (if (= 0 decimal-points) "#,###,###" (str "#,###,###." (reduce str (repeat decimal-points "#"))))]
      (java.text.DecimalFormat. fs)
    ))

(defmethod round$ :default [c amount]
  (let [decimal-points (:decimal-points c)
        d (bigdec amount)]
    (if (= decimal-points (.scale d))
      d
      (.setScale d decimal-points java.math.RoundingMode/HALF_UP))))

(defmethod str$ :default [c amount]
  (let [ a (round$ c amount)
         symbol (:symbol c)]
    (if symbol 
      (if (:symbol-first c)
        (str symbol a)
        (str a " " symbol))
      (str a ))))

(defmethod parse$ :default [c value]
  (round$ c (.parse (money-formatter c) (first (re-find #"([0123456789.,]+)" value )))))
  

(defn create-currency
  "Create a currency record"
  ([ params ]
    (apply create-currency
      (map params 
        [:iso-code :name :symbol :subunit :symbol-first :html-entity :iso-numeric :decimal-points :priority]) ))

  ([iso-code name symbol subunit symbol-first html-entity iso-numeric decimal-points priority]
    (Currency. iso-code name symbol subunit symbol-first html-entity iso-numeric decimal-points priority)))

