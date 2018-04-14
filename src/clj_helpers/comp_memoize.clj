(ns clj-helpers.comp-memoize)

; 2 * 3 * 6 and result will inc; In comp func appy to args from right to left.
((comp dec inc *) 2 3 6)

(def character
  {:name "Smooches McCutes"
   :attributes {:intelligence 10
                :strange 4
                :dextirity 5}})

(def c-int (comp :intelligence :attributes))
(def c-str (comp :strange :attributes))
(def c-dex (comp :dextirity :attributes))

#_(c-int character)
