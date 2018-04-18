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

;example if need more then one argument 
(def spell-slots-comp (comp int inc #(/ % 2) c-int))
#_(spell-slots-comp character)

;MEMOIZE (works if always same arguments)
(defn sleepy-identity
  [x]
  (Thread/sleep 1000)
  x)

; 1 second evaluate time
(sleepy-identity "Mr. Fantastico")

(def memo-sleepy-identity (memoize sleepy-identity))
; 1 sec
(memo-sleepy-identity "Mr. Fantastico")
;immediately
(memo-sleepy-identity "Mr. Fantastico")
