(ns dojo.core
  (:use compojure.core)
  (:use ring.middleware.json)
  (:use ring.util.codec)
  (:require [compojure.core :refer :all]
            [cheshire.core :refer :all]
            [compojure.route :as route]
            [clojure.string :refer [join]]
            [compojure.handler :as handler]
            [org.httpkit.client :as http]
            [clojure.core.memoize :as memo]))

