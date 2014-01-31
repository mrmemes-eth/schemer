(defn subst [new old l]
  (cond (empty? l)  '()
        :else
        (cond (= (first l) old) (cons new (rest l))
              :else (cons (first l)
                          (subst new old (rest l))))))
