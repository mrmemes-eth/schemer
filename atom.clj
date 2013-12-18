(defn atom? [sexpr]
  "Is this S-Expression not a list"
  (not (list? sexpr)))
