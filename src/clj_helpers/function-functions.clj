(ns clj-helpers.function-functions)

(max 0 1 2)

; apply "explode" the data structure, so max could apply to elements
; apply works with rest args [0 1 2 ] etc
(apply max [0 1 2])

; explode [1 2 3]
(conj [0] [1 2 3]) ; => [0 [1 2 3]]
(apply conj [0] [1 2 3]) ; => [0 1 2 3]

;;; partial
;TODO
;;; complement
;TODO
(defn my-complement
  [fun]
  (fn [& args]
    (not (apply fun args))))

(def my-pos? (complement neg?))
(my-pos? 1)
(my-pos? -1)







