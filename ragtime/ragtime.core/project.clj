(defproject ragtime/ragtime.core "0.3.9"
  :description "A database-independent migration library"
  :url "https://github.com/weavejester/ragtime"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.3.0"]
                 [org.clojure/tools.cli "0.2.2"]]
  :aot [ragtime.main]
  :clean-non-project-classes true
  :main ragtime.main)
