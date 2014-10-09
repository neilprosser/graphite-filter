(ns mixradio.graphite-filter
  (:import [ch.qos.logback.core.spi FilterReply]
           [ch.qos.logback.classic.spi ILoggingEvent]))

(gen-class
   :extends ch.qos.logback.core.filter.Filter
   :name mixradio.metrics.GraphiteReporterFilter)

(defn- logger-name
  [event]
  (.getLoggerName event))

(defn -decide
  [_ ^ILoggingEvent event]
  (if (.contains (logger-name event) "GraphiteReporter")
    FilterReply/DENY
    FilterReply/NEUTRAL))
