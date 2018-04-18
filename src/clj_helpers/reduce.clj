(ns clj-helpers.reduce)

(defn my-reduce
  ([f initial coll]
   (loop [result initial
          remaining coll]
     (if (empty? remaining)
       result
       (recur (f result (first remaining)) (rest remaining)))))
  ([f [head & tail]]
   (my-reduce f head tail)))

;inc vals of map with reduce
(reduce (fn [new-map [k v]]
          (assoc new-map k (inc v)))
        {}
        {:max 30 :min 10})

;reduce as filter
(reduce (fn [new-map [key val]]
          (if (> val 4)
            (assoc new-map key val)
            new-map))
        {}
        {:human 4.1 :critter 3.9 :tester 4.4})




(defn connect
  [board max-pos pos neighbor destination]
  (if (<= destination max-pos)
    (reduce (fn [new-board [p1 p2]]
              (assoc-in new-board [p1 :connections p2] neighbor))
      board
      [[pos destination] [destination pos] [pos destination]])
    board))

(connect {} 15 1 2 4)

;sample reduce with several functions works as recursion
(defn testing
  [text]
  (reduce (fn [text text-fn] (text-fn text))
    text
    [clojure.string/trim #(clojure.string/replace  % #"lol" "LOL")]))

(testing " lolhahalol ")
