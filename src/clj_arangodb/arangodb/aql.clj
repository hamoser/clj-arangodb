(ns clj-arangodb.arangodb.aql
  (:refer-clojure :exclude []))

;;; the ArangoDB Query Language

(defn stmt [bindings stmt]
  (fn [db return-type]
    (.query db stmt bindings nil return-type)))

(defn -for [who what]
  (format "FOR %s IN %s\n" (name who) (name what)))

(defn -let [who what]
  (format "LET %s = %s\n" (name who) (name what)))


(defn query [& lines]
  (apply str lines))

;; FOR: array iteration
;; RETURN: results projection
;; FILTER: results filtering
;; SORT: result sorting
;; LIMIT: result slicing
;; LET: variable assignment
;; COLLECT: result grouping
;; INSERT: insertion of new documents
;; UPDATE: (partial) update of existing documents
;; REPLACE: replacement of existing documents
;; REMOVE: removal of existing documents
;; UPSERT: insertion or update of existing documents

;; FOR u IN users
;; FILTER u.type == "newbie" && u.active == true
;; RETURN u.name

;;; complete list

;; AGGREGATE
;; ALL
;; AND
;; ANY
;; ASC
;; COLLECT
;; DESC
;; DISTINCT
;; FALSE
;; FILTER
;; FOR
;; GRAPH
;; IN
;; INBOUND
;; INSERT
;; INTO
;; LET
;; LIMIT
;; NONE
;; NOT
;; NULL
;; OR
;; OUTBOUND
;; REMOVE
;; REPLACE
;; RETURN
;; SHORTEST_PATH
;; SORT
;; TRUE
;; UPDATE
;; UPSERT
;; WITH
