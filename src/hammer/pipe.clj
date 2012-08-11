(ns hammer.pipe
  (:import (cc.mallet.pipe Pipe
                           SerialPipes)))


(defn ^SerialPipes compose-pipeline
  "Creates a pipeline from a sequence of pipe instances from right-to-left.
  Returns a Mallet SerialPipes instance."
  [& pipes]
  (SerialPipes. (reverse pipes)))