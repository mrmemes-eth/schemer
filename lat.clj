(load-file "atom.clj")

(defn lat? [l]
  "Is every member of this list an atom?"
  (cond
    (empty? l) true
    (atom? (first l)) (lat? (rest l))
    :else false))
