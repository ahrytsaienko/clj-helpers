(ns clj-helpers.data-structure)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; VECTORS

(def v [1 2 3 4 5])

;get element by index
(nth v 4)

;or shurtcut
(v 3)

;get last element
(peek v)

;cut elements from vector
(subvec v 1 3)

;push new element
(conj v 6)

; fnc map-vector
(mapv #(* 2 %) v)
(mapv dec v)

; filter-vector
(filterv #(> 3 %) v)

;predicated example (function with ?)
(filterv odd? v)

;annonymous fn couldn't be nested (annon in annon)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; HASH-MAPS

(def m {:key1 "a" :key2 {:key21 "b"}})

;get key from map
(get m :key1)

;alternative 1 get
(m :key1)

;alternative 2 get
(:key1 m)

; get from nested map
(get-in m [:key2 :key21])

;add element to map
(assoc m :key3 "c")

;nested insert
(assoc-in m [:key3 :key31] "c")

;remove element from map
(dissoc m :key2)

;merge maps
(merge {:a 1} {:b 2} {:c 3})

;fnction on map
(update-in m [:key2 :key21] #(str % "c"))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;:SET

(def s #{1 2 3 4 5})

;add element
(conj s 5)

;delete element by index
(disj s 3)
    
;merge
(clojure.set/union #{1 2 3} #{2 3 4})
    
;difference
(clojure.set/difference #{1 2 3} #{2 3 4})

;intersection
(clojure.set/intersection #{1 2 3} #{2 3 4})

;;;;;;;;;;;; COLLECITION OPERATION (for all data structures)

;result will be list thats why need to use "mapv"
(map inc [1 2 3 4])

;concatination
(concat [1 4] [2 3])

;if we need to save array/map
(into [] (concat [1 2] [3 4]))
(into {} (concat {:a 2} {:b 4}))

;all except first
(rest #{1 2 3})

;generator
(take 5 (range))

;for arrays in array. for operation on each element in array. result linear array
(mapcat #(map inc %) [[1] [2 3] [4]])



    
