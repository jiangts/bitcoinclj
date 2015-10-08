(defproject btclj "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.bitcoinj/bitcoinj-core "0.13.1"]
                 #_[org.clojure/tools.logging "0.3.1"]]
  :main ^:skip-aot btclj.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
