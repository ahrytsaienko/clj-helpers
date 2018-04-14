(ns clj-helpers.lazy-seq)

(def vampire-database
  {0 {:makes-blood-puns? false, :has-pulse? true  :name "McFishwich"}
   1 {:makes-blood-puns? false, :has-pulse? true  :name "McMackson"}
   2 {:makes-blood-puns? true,  :has-pulse? false :name "Damon Salvatore"}
   3 {:makes-blood-puns? true,  :has-pulse? true  :name "Mickey Mouse"}})

(defn vampire-related-details
  [social-security-number]
  (Thread/sleep 1000)
  (get vampire-database social-security-number))

;if true will return record otherwise false
(defn vampire?
  [record]
  (and (:makes-blood-puns? record)
       (not (:has-pulse? record))
       record))

(defn identify-vampire
  [social-security-numbers]
  (first (filter vampire?
                 (map vampire-related-details social-security-numbers))))

(identify-vampire [0 1 2 3])

(vampire-related-details 0)

; lazy seq - will not evaluate
(time (def mapped-details (map vampire-related-details (range 0 1))))

; on this stage we call lazy seq and only now it will evaluate
(time (first mapped-details))

(time (second mapped-details))





