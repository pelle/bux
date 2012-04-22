(ns bux.money)

(defprotocol FormatString
  (format-string [this]))

(defrecord Money [currency cents])

(defn create-money [currency cents]
  (let [value (with-precision (:decimal_points currency) (/ cents (:subunit_to_unit currency)))]
    (proxy [Number] []
      (hashCode [] (+ (.hashCode currency) (.hashCode cents))) 
      (intValue [] (int value))
      (longValue [] (long value))
      (floatValue [] (float value))
      (doubleValue [] (double value))
      (toString [] (format (format-string currency) (double value))) 
      )))

