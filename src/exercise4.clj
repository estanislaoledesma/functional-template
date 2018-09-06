(ns exercise4)

(defn fibonacci
  "Devuelve el valor correspondiente al fibonacci de n."
  [n]
  (if (< n 2)
    n
    (+ (fibonacci (- n 1)) (fibonacci (- n 2)))
    )
  )
