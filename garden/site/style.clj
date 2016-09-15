(ns site.style
  (:require [garden.def :refer [defstylesheet defstyles]]
            [garden.units :refer [em percent]]))

(defn fluid-type [fixed-px]
  (em (/ fixed-px 16)))

(defn fluid-width
  ([fixed-px] (fluid-width fixed-px 988))
  ([fixed-px width]
   (percent (* 100 (/ fixed-px width)))))

(def left-head {:width (fluid-width 349 700)
                :float 'left})
(def right-head )
(defstyles main
  [:* {:margin 0
       :padding 0}]
  [:#page {:margin "40px auto"
           :padding [[0 (em 1)]]
           :max-width (fluid-type 988)}]

  [:body {:background "#1E1E1E"
          :color "#FFF"
          :font-family ["Helvetica" "Arial" "sans-serif"]
          :font-size (percent 100)
          :font-weight 'normal}]
  [:a
   {:color "#8FDFFD"
    :text-decoration 'none}
   [:&:hover
    {:font-weight 'bold
     :text-decoration 'underline
     :color "#3366CC"
     }]]
  [:h3 [:a {:text-align 'right}]]

  [:p {:margin-bottom (em 1)}]
  [:h1 {:font-size (fluid-type 36)
        :line-height (/ 55 48)
        :margin-left  (fluid-width 144)
        :margin-bottom (em 1.07)
        :width (fluid-width 700)
        :text-transform "uppercase"}]
  [:.entry
   {:float 'left
    :width (fluid-width 988)
    :position 'relative}
   [:h2 :.content {:float "right"
                   :width (fluid-width 844)}]
   [:.info :.meta
    {:font-size (fluid-type 11)
     :font-weight 'bold
     :line-height (/ 16 11)}]
   [:h2 {:font-size (em 1.5)
         :margin-bottom (em (/ 16 24))}]
   [:.entypo {:height (em 1.5)
              :width (em 1.5)
              :margin (fluid-type 8)}]
   [:.info {:letter-spacing (em 0.08)
            :text-transform "uppercase"
            :position 'fixed
            :float "left"
            :margin-top (fluid-type (* 16 (/ 8 11)))
            :width (fluid-width 124)}]
   [:.main
    {:font-weight 'normal
     :font-size (em 1)
     :line-height 1.375
     :font-family ["Georgia" "Times" "serif"]
     :float 'left
     :width (fluid-width 700 844)}
    [:p {:text-indent (fluid-type 24)}
     [:&:first-child {:text-indent 0}]]]
   [:h3 {:margin-top (fluid-type 12)}
    [:&:first-child {:margin-top 0}]]
   [:.meta {:margin [[(em 0.5) 0]]
            :opacity 0.7
            :float 'right
            :width (fluid-width 124)}]
   [:.company :.position {:font-size (fluid-type 14)
                          :width (fluid-width 350 700)
                          :float 'left}]
   [:.place :.dates {:font-size (fluid-type 14)
                     :width (fluid-width 349 700)
                     :float 'right
                     :text-align 'right}]
   [:.company :.place  {:line-height 1.375}]
   [:.dates :.position  {:font-variant "small-caps"
                         :line-height 1.125}]
   [:.desc {:font-size (fluid-type 12)
            :margin-bottom (fluid-type 16)} ]

   ])
