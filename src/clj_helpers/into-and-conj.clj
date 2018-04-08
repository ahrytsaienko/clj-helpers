(ns clj-helpers.into-and-conj)

;into will return from lazy seq - data structure 
(into {} (map identity {:a 1 :b 2}))

;map iz seq function {:a 1 :b 2} => ([:a 1] [:b 2])
(map identity {:a 1 :b 2})

;not nesessary to give data structure to "into".
;into can create 1 data structure if u give 2
;into addd all elements from second coll to first
(into [1 2 3] [4 5 6])
(into {:a 1 :b 2} {:ff 2 :xx 3} {:e 5 :x 5})

(conj [0] [1]) ; => [0 [1]] wowowooww
(conj [0] 1) ; => [0 1] - now its ok

;u can conj as many elements as u want
(conj [0] 1 2 3 4)


