; Состояние хранится в атоме. Атом - спец. контейнер для имут. данных, содержит значение и дает инетрфейс для чтения/изменения данных. Атом - ссылочный тип данных


(def state (atom 0))

; Достать из атома
(deref state)
@state

;Изменить атом
(swap! state #(inc %))

;Полностью заменить значение атома
(reset! state 5)

;Сравнение и изменение значения. Если compare=false тогда значение не поменяется
(compare-and-set! state 5 10)


;Watcher следит за состоянием атома
(add-watch state :key (fn [key ato old-value new-value] (println ato old-value new-value)))
(swap! state inc)

; Любые функции с сайдэфектом должны заканчиваться "!"

;validator
(set-validator! state #(< %  13))
(swap! state inc)


