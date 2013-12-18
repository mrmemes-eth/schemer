(defn rember [a lat]
  "Remove the provided atom from the provided list"
  (cond (empty? lat) '()
        (= (first lat) a) (rest lat)
        :else (cons (first lat) (rember a (rest lat)))))
