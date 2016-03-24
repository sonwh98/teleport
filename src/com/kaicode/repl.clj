(ns com.kaicode.repl
  (:require [com.kaicode.teleport :as t]))

(defn -main [& args]
  (println "main" (t/serialize (bigdec 1)))
  )


