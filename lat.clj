(load-file "atom.clj")

(defn lat? [l]
  (cond
    (empty? l) true
    (atom? (first l)) (lat? (rest l))
    :else false))
