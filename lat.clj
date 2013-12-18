(defn atom? [sexpr]
  (not (list? sexpr)))

(defn lat? [l]
  (cond
    (empty? l) true
    (atom? (first l)) (lat? (rest l))
    :else false))
