(ns site.about
  (:use hiccup.core)
  (:require [site.layout :refer [page-layout]]))


(def about
  (page-layout
   "About Me"
   [:div.main
    [:p "I am a developer with a chemical engineering background, living in New York City. I am familiar with javascript and node.js for web programming, python and MATLAB for scientific computing, and functional programming in clojure for everything between."]
    [:p "The site is still under construction but I hope to include pages on past projects and a blog about learning functional programming and working with open-source libraries"]
    [:h3 "About the site"]
    [:p "The site is built with "
     [:a {:href "http://clojure.com"} "Clojure."]
     "  I love clojure for its syntax, i.e. S-expressions and the ease of editing them in emacs.  On the recommendation of "
     [:a {:href "http://www.lispcast.com/what-web-framework-should-i-use"} "LispCast"] ", I used a stack of ring, compojure and hiccup to run a minimal app and learn the most from doing so.  I eventually caved to writing my CSS in clojure using the library "
     [:a {:href "http://github.com/noprompt/garden"} "garden."]]]
   [:div.meta "I'm currently seeking employment in the NYC Metro Area, as either a chemical engineer or full-stack developer"]))

(def resume
  (page-layout
   "Resume"
   [:div.main
    [:h3 "Education"]
    [:div.company
     "Columbia University"]
    [:div.place
     "New York, NY"]
    [:div {:style "clear: both;"}]
    [:div.position
     "M.S. Chemical Engineering"]
    [:div.dates
     "Aug 2012 - Feb 2014"]
    [:div {:style "clear: both;"}]
    [:div.desc "GPA: 3.77/4.00, M.S./Ph.D. Program Research Fellow"]
    [:div.company "University of Maryland"]
    [:div.place
     "College Park, MD"]
    [:div {:style "clear: both;"}]
    [:div.position
     "B.S. Chemical Engineering"]
    [:div.dates
     "Aug 2008 - May 2012"]
    [:div {:style "clear: both;"}]
    [:div.desc
     "GPA: 3.90/4.00, " [:em "Magna Cum Laude"]
     ", Honors Citation, Gemstone Honors Citation, President's Scholarship"]

    [:h3 "Experience"]
    [:div.company
     "Arthena"]
    [:div.place
     "SoHo, New York City, New York"]
    [:div {:style "clear: both;"}]
    [:div.position
     "Full Stack Engineer"]
    [:div.dates
     "May 2015 - May 2016"]
    [:div {:style "clear: both;"}]
    [:div.desc
     [:ul
      [:li
       " Developed company's web product using node.js, express-js, mongodb and less-css templating"]
      [:li
       " Initiated quality assurance strategies and wrote Behavioral Driven Development suite with mocha.js and chai.js"]]]
    [:div.company
     "Complex, Resilient and Intelligent Systems Lab"]
    [:div.place
     "Columbia University, NY"]
    [:div {:style "clear: both;"}]
    [:div.position
     "Graduate Research Assistant"]
    [:div.dates
     "Jan 2013 - Jan 2015"]
    [:div {:style "clear: both;"}]
    [:div.desc
     [:ul
      [:li
       " Architected scalable machine learning system to glean insights from chemical engineering literature"]
      [:li
       " Wrote crawlers in Selenium to gather journal articles from open-access journals"]
      [:li
       " Supervised twelve computer science students building individual machine learning submodules"]
      [:li
       " Wrote predictive models in MATLAB for complex crytallographic nanoscale self-assembly"]]]
    [:div.company
     "Metabolic Engineering Laboratory"]
    [:div.place
     "University of Maryland, MD"]
    [:div {:style "clear: both;"}]
    [:div.position
     "Howard Hughes Medical Institute Scholar"]
    [:div.dates
     "Jun 2011 - Jun 2012"]
    [:div {:style "clear: both;"}]
    [:div.desc
     [:ul
      [:li
       " Earned a stipend and grant to investigate methods of measuring metabolic flux in genetically modified yeast"]
      [:li
       " Computed genome scale flux maps using open-source libraries and related these to experimental measurements toward improving yields of desired metabolic product"]]]
    [:div.company "Bioprocess Scale-Up Facility"]
    [:div.place
     "University of Maryland, MD"]
    [:div {:style "clear: both;"}]
    [:div.position
     "Lab Technician"]
    [ :div.dates
     "Jan 2009 - Jun 2012"]
    [:div {:style "clear: both;"}]
    [:div.desc
     [:ul
      [:li
       " Monitored and adjusted process parameters to facilitate scale-up of bioprocesses from shake-flasks to fermenter scale"]
      [:li
       " Co-taught workshops and classes on biotechnology research and development"]
      [:li
       " Awarded `Student Employee of the Semester' 6 times for initiative and dedication to work"]]]
    [:div.company "Engineers Without Borders-USA, UMCP"]
    [:div.place
     "University of Maryland, MD"]
    [:div {:style "clear: both;"}]
    [:div.position
     "Project Leader - Burkina Faso IV Health Project"]
    [:div.dates
     "Aug 2010 - Apr 2012"]
    [:div {:style "clear: both;"}]
    [:div.desc
     [:ul
      [:li
       " Assessed a West African rural community health center's solar power and water treatment needs"]
      [:li
       " Led weekly design meetings of 10-25 students to draft engineering reports, work out implementation logistics, and write successful grant proposals"]
      [:li
       " Implemented design in Burkina Faso, acting as a foreman of construction site"]]]
    [:div {:style "clear: both;"}]
    [:div.position
     "Travel Team Member"]
    [:div.dates
     "Sep 2009 - Aug 2010"]
    [:div {:style "clear: both;"}]
    [:div.desc
     [:ul
      [:li
       " Selected to travel to Burkina Faso to install solar powered lighting systems in four health clinics"]
      [:li
       " Adapted lab skills to create mobile microbiology testing lab to test clinic waters for pathogens"]]]
    [:h3 "Skills"]
    [:dl
     [:dt.company "Programming Languages"]
     [:div {:style "clear: both;"}]
     [:dd.desc " Javascript, Clojure, Java, MATLAB, Python, Emacs Lisp"]
     [:dt.company "Software Skills"]
     [:div {:style "clear: both;"}]
     [:dd.desc
      " Git, Linux, Bash, Excel with Visual Basic, PowerPoint, "
      [:span.roman "L"]
      [:sup [:span.roman "A"]]
      [:span.roman "T"]
      [:sub [:span.roman "E"]]
      [:span.roman "X"]
      ", HTML5/CSS3"]
     [:dt.company "Wetware Skills"]
     [:div {:style "clear: both;"}]
     [:dd.desc
      " Aseptic technique, column chromatography, high pressure liquid chromatography, GC-MS"]]]))
