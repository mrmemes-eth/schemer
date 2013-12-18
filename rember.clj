(defn rember [a lat]
  (cond (empty? lat) '()
        (= (first lat) a) (rest lat)
        :else (cons (first lat) (rember a (rest lat)))))
