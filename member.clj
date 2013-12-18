(defn member? [a lat]
  (cond
    (empty? lat) false
    :else (or (= (first lat) a)
              (member? a (rest lat)))))
