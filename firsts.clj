(defn firsts [l]
  (map #(first %) l))

; conversely and litterally:

(defn firsts-literal [l]
  (cond
    (empty? l) '()
    :else (cons (first (first l))
                (firsts-literal (rest l)))))
