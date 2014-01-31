(defn insert-r [new old l]
  (cond (empty? l)  '()
        :else
        (cond (= (first l) old) (cons old (cons new (rest l)))
              :else (cons (first l)
                          (insert-r new old (rest l))))))
