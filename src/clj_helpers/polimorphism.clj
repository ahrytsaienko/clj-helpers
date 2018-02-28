; if 1 argument - will execute first block, if 2 - another
(defn greet
 ([name] (str "Hello my name is " name))
 ([name1 name2] (str "Hi " name1 ", " name2 "!")))

(greet "John" "Doe")

;default values for arguments
(defn test-John-Doe 
    ([name] (test-John-Doe name "default argument"))
    ([name second-name] (str "Name " name " and default arg " second-name)))

(test-John-Doe "John")


;add destruct in fnc params 
