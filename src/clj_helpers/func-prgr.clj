(ns clj-helpers.func-prgr)

; In functional programming this is the way how to work instead of for/while looping
; recursion is all for us.
; warning. need to use "recur" because of better perfomance
(defn sum
  ([vals] (sum vals 0))
  ([vals accumulating-total]
   (if (empty? vals)
     accumulating-total
     (sum (rest vals) (+ (first vals) accumulating-total)))))

#_(sum [1 3 5] 25)
#_(sum [1 3 5])

;better perfomance
(defn sum-recur
  ([vals] (sum-recur vals 0))
  ([vals accumulating-total]
   (if (empty? vals)
     accumulating-total
     (recur (rest vals) (+ (first vals) accumulating-total)))))

#_(sum-recur [2 4 6])

(defn mult
  ([vals] (mult vals []))
  ([vals final]
   (if (empty? vals)
     final
     (mult (rest vals) (->> (* 2 (first vals))
                            (conj final))))))

#_(mult [2 3 4])


