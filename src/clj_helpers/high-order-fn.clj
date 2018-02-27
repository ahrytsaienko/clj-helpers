(ns clj-helpers.high-order-fn)

;Идет от конца в начало
(def do-nums (comp inc inc dec))
(do-nums 5)

;partial. Можно частично применять аргументы (если не все есть)
(defn plus-three [a b  c] (+ a b c))
(def fnc (partial plus-three 1 2))
(fnc 3)

;Полезно использовать с функциями высшего порядка. Во вращает аргумент который передается
(identity 4)
(filter identity [1 2 3 nil true false])


 

