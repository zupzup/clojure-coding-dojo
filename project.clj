(defproject dojo "1.0.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [ring "1.4.0"]
                 [ring/ring-json "0.4.0"]
                 [ring/ring-codec "1.0.0"]
                 [compojure "1.4.0"]
                 [cheshire "5.5.0"]
                 [http-kit "2.1.4"]
                 [org.clojure/core.memoize "0.5.8"]
                 [midje "1.8.2"]]
  :plugins [[lein-ring "0.9.7"] [venantius/ultra "0.3.4"] [lein-midje "3.1.3"] [lein-cloverage "1.0.6"]]
  :ring {:handler dojo.core/app}
  :main ^:skip-aot dojo.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
