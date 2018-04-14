(ns clj-helpers.func-prgr)

; In functional programming this is the way how to work instead of for/while looping
; recursion is all for us.
(defn sum
  ([vals] (sum vals 0))
  ([vals accumulating-total]
   (if (empty? vals)
     accumulating-total
     (sum (rest vals) (+ (first vals) accumulating-total)))))

#_(sum [1 3 5] 25)
#_(sum [1 3 5])
