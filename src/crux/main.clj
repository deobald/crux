(ns crux.main
  (:gen-class))

(defn -main [& args]
  (require 'crux.bootstrap.cli)
  ((resolve 'crux.bootstrap.cli/start-system-from-command-line) args))
