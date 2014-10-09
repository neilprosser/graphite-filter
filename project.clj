(defproject mixradio/graphite-filter "1.0.1-SNAPSHOT"
  :description "A Clojure library providing a Logback filter to prevent GraphiteReporter messages polluting our logs in the event that they can't send to Graphite."
  :license "https://github.com/mixradio/graphite-filter/blob/master/LICENSE"
  :url "https://github.com/mixradio/graphite-filter"

  :profiles {:provided {:dependencies [[ch.qos.logback/logback-classic "1.1.2"]
                                       [org.clojure/clojure "1.6.0"]]}}

  :aot [mixradio.graphite-filter])
