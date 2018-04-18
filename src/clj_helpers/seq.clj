(ns clj-helpers.seq)

;cons add a new node to the beginning of the list
(cons 1 [1 2 3 4])

;first
(first [1 2 3])

;rest return seq without first element
(rest [1 2 3])

;seq map treats it like list of vectors
(seq {:a 1 :b 2})


