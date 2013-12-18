(defn member? [a lat]
  "Is the supplied atom a member of the suplied list?"
  (cond
    (empty? lat) false
    :else (or (= (first lat) a)
              (member? a (rest lat)))))
