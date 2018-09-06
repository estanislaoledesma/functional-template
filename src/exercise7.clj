(ns exercise7)

(defn enesimo
  "Devuelve el n-ésimo elemento de list."
  [n list]
  (if (= n 0)
    (first list)
    (enesimo (- n 1) (next list)))
  )
