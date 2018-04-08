(ns clj-helpers.take-drop-while)

;take
(take 2 [1 2 3 4 5])

;drop
(drop 3 [1 2 3 4 5])

;take-while (fn working untill returns first false)
(def food-journal
  [{:month 1 :day 1 :human 5.3 :critter 2.3}
   {:month 1 :day 2 :human 5.1 :critter 2.0}
   {:month 2 :day 1 :human 4.9 :critter 2.1}
   {:month 2 :day 2 :human 5.0 :critter 2.5}
   {:month 3 :day 1 :human 4.2 :critter 3.3}
   {:month 3 :day 2 :human 4.0 :critter 3.8}
   {:month 4 :day 1 :human 3.7 :critter 3.9}
   {:month 4 :day 2 :human 3.7 :critter 3.6}])

(take-while #(< (:month %) 3) food-journal)

;nested with drop-while
(take-while #(< (:month %) 4)
            (drop-while #(< (:month %) 2) food-journal))

(ns clj-helpers.take-drop-while)

;take
(take 2 [1 2 3 4 5])

;drop
(drop 3 [1 2 3 4 5])


; difference between take-while and filter
(def sample-vector [6 7 4 92 ])

(take-while #(< % 5) sample-vector)
(filter #(< % 5) sample-vector)

;some return first truthy value
(some odd? [1 2 3])

;this will return truthy data
(some #(and (> (:critter %) 3) %) food-journal)

;and this only logical true/false
(some #(> (:critter %) 3) food-journal)









