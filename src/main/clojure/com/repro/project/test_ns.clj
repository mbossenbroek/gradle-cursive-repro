(ns com.repro.project.test-ns
    (:require [clojure.string :as str])
    (:import (com.repro.project TestClass)))

(println (str/join " " ["hello" (TestClass/getMessage)]))
