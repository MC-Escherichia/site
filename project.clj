(defproject site "0.1.0-SNAPSHOT"
  :description "Personal Website of Matthew Conway"
  :url "http://mfconway.com"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :plugins [[lein-ring "0.9.7"]
            [lein-garden "0.2.8"]]
  :ring {:handler site.core/app}
  :garden {:builds [{
                     :id "main"
                     :source-paths ["garden"]
                     :stylesheet site.style/main
                     :compiler {:output-to "resources/public/styles/site.css"
                                :pretty-print? true}}]}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [ring/ring-core "1.5.0"]
                 [ring/ring-jetty-adapter "1.5.0"]
                 [ring/ring-devel "1.5.0"]
                 [ring-refresh "0.1.1"]
                 [hiccup "1.0.5"]
                 [compojure "1.5.1"]
                 [garden "1.3.2"]
                 [facjure/mesh "0.4.0"]
                 ]
  :main ^:skip-aot site.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
