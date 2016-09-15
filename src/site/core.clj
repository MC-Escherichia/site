(ns site.core
  (:gen-class)
  (:use ring.adapter.jetty
        ring.middleware.reload
        ring.middleware.stacktrace
        ring.middleware.resource
        ring.middleware.content-type
        ring.middleware.not-modified
        ring.middleware.refresh
        compojure.core
        site.middleware
        site.layout)
  (:require site.about))



(def production?
  (= "production" (get (System/getenv) "APP_ENV")))

(def port (Integer/parseInt (get (System/getenv) "PORT" "3001")))

(def development?
  (not production?))

(defroutes rts
  (GET "/" [] (layout "About" site.about/about))
  (GET "/resume" [] (layout "Resume" site.about/resume)))

(def app
  (-> #'rts
      (wrap-resource "public")
      (wrap-content-type)
      (wrap-if production? wrap-not-modified)
      (wrap-request-logging)
      (wrap-if development? wrap-reload)
      (wrap-exception-logging)
      (wrap-bounce-favicon)
      (wrap-refresh ["src/site""resources/public/styles" "resources/public"])
      (wrap-if production? wrap-failsafe)
      (wrap-if development? wrap-stacktrace)))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (run-jetty #'app {:port port}))
