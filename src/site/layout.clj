(ns site.layout
  (:use hiccup.page))

(defn layout [title & content]
  (html5 [:head
          [:title (str "Matthew Conway - " title)]
          (include-css "styles/site.css")]
         [:body.container content]))

(defn entypo-link [link name]
  [:a {:href link}
   [:img.entypo {:src (str "/entypo/" name ".svg")
                 :alt name}]])


(defn page-layout [page-title & content]
  [:div#page
   [:h1 "Matthew Conway"]
   [:div.entry
    [:h2 page-title]
    [:div.info
     [:h3 "Get in touch:"]
     "<!-- Entypo pictograms by Daniel Bruce — www.entypo.com -->"
     (entypo-link "mailto:matt@mfconway.com" "mail")
     (entypo-link "http://facebook.com/mfconway" "facebook")
     (entypo-link "http://github.com/MC-Escherichia" "github")
     (entypo-link "https://www.linkedin.com/in/matthew-conway-7a4a5714" "linkedin")
     [:h3 [:a {:href "/"} "Home"]]
     [:h3 [:a {:href "/resume"} "Resume"]]]
    [:div.content content]]])
