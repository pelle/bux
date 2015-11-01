(ns bux.core)

(defmulti str$ "formats amount as money for currency with symbol" :iso-code)
(defmulti parse$ "parse money string value" :iso-code)
(defmulti round$ "parse" :iso-code)
(defmulti money-formatter "returns Decimal formatter with correct decimal points for currency" :iso-code)


(defmethod money-formatter :default [c]
  (let [decimal-points (:decimal-points c)
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
  (let [a (round$ c amount)
        symbol (:symbol c)]
    (if symbol
      (if (:symbol-first c)
        (str symbol a)
        (str a " " symbol))
      (str a))))

()
(defmethod parse$ :default [c value]
  (round$ c (.parse (money-formatter c) (first (re-find #"([0123456789.,]+)" value)))))
