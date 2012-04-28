(ns bux.currency )

(defn get-iso [c _] (:iso-code c))

(defmulti ->$ "formats amount as money for currency without symbol" get-iso)
(defmulti ->$$ "formats amount as money for currency with symbol" get-iso)
(defmulti $-> "parse money string value"  get-iso)
(defmulti round$ "parse"  get-iso)
(defmulti money-formatter "returns Decimal formatter with correct decimal points for currency" :iso-code)

(defrecord Currency 
  [iso-code name symbol subunit subunit-to-unit symbol-first html-entity iso-numeric decimal-points priority]
  clojure.lang.IFn 
    (invoke [this] (this 0)) 
    (invoke [this subunits] (->$ this subunits)) 
    (applyTo [this args] (clojure.lang.AFn/applyToHelper this args))
)

(defmethod money-formatter :default [c]
  (let [ decimal-points (:decimal-points c)
         fs (if (= 0 decimal-points) "#,###,###" (str "#,###,###." (reduce str (repeat decimal-points "#"))))]
      (java.text.DecimalFormat. fs)
    ))

(defmethod round$ :default [c amount]
  (.setScale (bigdec amount) (:decimal-points c 2) java.math.RoundingMode/HALF_UP))

(defmethod ->$ :default [c amount]
  (.format (money-formatter c) amount))

(defmethod ->$$ :default [c amount]
  (let [ s (->$ c amount)
         symbol (:symbol c)]
    (if symbol 
      (if (:symbol-first c)
        (str symbol s)
        (str s " " symbol))
      s )))

(defmethod $-> :default [c value]
  (round$ c (.parse (money-formatter c) (first (re-find #"([0123456789.,]+)" value )))))
  

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

