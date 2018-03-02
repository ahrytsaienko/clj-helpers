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

;example default value
(defn get-user
 ([name second-name]
  (get-user name second-name nil))

 ([name second-name {:keys [age] :or {age 25}}]

  [name second-name age]))

(get-user "John" "Doe" {:age 30})
(get-user "John" "Doe")
 

;add doseq 

;add destruct in fnc params 
