(ns exercise2)

(defn only-greater-than-five
      "Filtra los números de una secuencia mayores a 5."
      [x]
      (filter (fn [x] (> x 5)) x))