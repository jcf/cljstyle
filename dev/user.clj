(ns user
  (:require
   [clojure.tools.namespace.repl :refer [set-refresh-dirs]]))

(set-refresh-dirs "dev" "src" "test")
