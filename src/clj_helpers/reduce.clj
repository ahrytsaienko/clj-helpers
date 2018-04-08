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




