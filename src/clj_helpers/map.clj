(ns clj-helpers.map)

;; concat each element from 2 seq
(map str ["a" "b" "c"] ["d" "e"])

;;; WOW
(def sum #(reduce + %))
(def avg #(/ (sum %) (count %)))

(defn stats
  [numbers]
  (map #(% numbers) [sum count avg]))

(stats [3 4 10])

;retrieve value from vetor of maps with map
(def identities
   [{:alias "Batman" :real "Bruce Wayne"}
    {:alias "Spider-Man" :real "Peter Parker"}
    {:alias "Santa" :real "Your mom"}
    {:alias "Easter Bunny" :real "Your dad"}])

(map :real identities)





