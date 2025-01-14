(defproject beoliver/clj-arangodb "0.0.9"
  :description "A Clojure wrapper for ArangoDB"
  :url "https://github.com/beoliver/clj-arangodb"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :source-paths ["src/clojure"]
  :java-source-paths ["src/java"]
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [com.arangodb/arangodb-java-driver "6.17.0"]
                 [org.slf4j/slf4j-simple "1.7.30"]
                 [cheshire "5.11.0"]])
