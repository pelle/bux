(ns bux.calc)

;; I would really like it to be use regular clojure +, - etc but I can't find any protocol or similar to implement, although I'm sure there is one.
;;
;; TODO add [x y & more] support
(defprotocol Calculator
  (add [x]
       [x y]
       "Add numbers and produce a money object")
  (subtract [x]
       [x y]
       "Subtract numbers and produce a money object")
  (multiply [x]
       [x y]
       "Multiply numbers and produce a money object")
  (divide [x]
       [x y]
       "Divide numbers and produce a money object"))

(defn percentage 
  "Calculate percentage of value"
  [x p]
  (multiply (divide x 100) p))

(defn with-percentage
  "calculate and add percentage of value"
  [x p]
  (add x (percentage x p)))