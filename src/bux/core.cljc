(ns bux.core
  (:require [bux.currencies :as currencies])
  #?(:cljs (:import goog.i18n.NumberFormat)))

(defn to-iso [& args]
  (:iso-code (first args) currencies/default-iso))

(defmulti format$ "formats amount as money for currency without symbol" to-iso)
(defmulti str$ "formats amount as money for currency with symbol" to-iso)
(defmulti parse$ "parse money string value" to-iso)
(defmulti round$ "parse" to-iso)
(defmulti money-formatter "returns Decimal formatter with correct decimal points for currency" to-iso)


(defmethod money-formatter :default
  ([]
    (money-formatter currencies/default$))
  ([c]
    (let [decimal-points (:decimal-points c)]
      #?(:clj  (java.text.DecimalFormat. (if (= 0 decimal-points) "#,###,###" (str "#,###,###." (reduce str (repeat decimal-points "0")))))
         :cljs (let [f (goog.i18n.NumberFormat. goog.i18n.NumberFormat.Format.DECIMAL)]
                    (.setMinimumFractionDigits f decimal-points)
                    (.setMaximumFractionDigits f decimal-points)
                    f)))))

(defmethod round$ :default
  ([amount]
    (round$ currencies/default$ amount))
  ([{decimal-points :decimal-points} amount]
    #?(:clj  (let [d (bigdec amount)]
               (if (= decimal-points (.scale d))
                 d
                 (.setScale d decimal-points java.math.RoundingMode/HALF_UP)))
       :cljs (.toFixed amount decimal-points))))

(defmethod format$ :default
  ([amount]
    (format$ currencies/default$ amount))
  ([c amount]
    (.format (money-formatter c) (round$ c amount))))

(defmethod str$ :default
  ([amount] (str$ currencies/default$ amount))
  ([c amount]
    (let [a (format$ c amount)
          symbol (:symbol c)]
      (if symbol
        (if (:symbol-first c)
          (str symbol a)
          (str a " " symbol))
        (str a)))))

(def $ str$)

(defmethod parse$ :default
  ([value] (parse$ currencies/default$ value))
  ([c value]
    (round$ c (.parse (money-formatter c) (first (re-find #"([0123456789.,]+)" value))))))
