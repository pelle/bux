(defproject bux "0.3.0"
  :description "Simple money handling library"
  :dependencies [[org.clojure/clojure "1.7.0" :scope "provided"]
                 [org.clojure/clojurescript "1.7.145" :scope "provided"]]

  :plugins [[lein-cljsbuild "1.1.0"]]
  :cljsbuild {
              :builds [{:source-paths ["src"]
                        :compiler     {:optimizations :whitespace
                                       :pretty-print  true}}]})
