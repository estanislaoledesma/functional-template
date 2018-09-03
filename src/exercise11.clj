(ns exercise11)

(defn fmap-nil
  "Devuelve true si el valor de la clave en el mapa es nil, false en caso contrario."
  [mapa clave]
  (= (get mapa clave) nil))
