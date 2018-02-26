;when - its only macros which use "if"
(if (< 5 10) "true" "false")

;when помещает код в оператор do (вернет только последн. значение)
(when (< 1 10) (println "test") 1)

;возвращается только последний результат
(do () () ())

; invert
(if-not false 1 0)

;Если условие выполнится, запишет в перменную последн. выражение (5)
(if-let [x (< 7 3)] 
        5 
        7)

;return value if only when-not
(when-not (< 15 10) (println "test when not") 55)

;bindings only after when
(when-let [a (str "ok" "go")] (println a) (str "test" a))

;conditions
(cond  
    false 1 
    false 2
    :else "default")

;Первое значение то что будет тестироваться
(case "oki" 
    1 1 
    2 2 
    "ok" "ok"
    "default")
    
