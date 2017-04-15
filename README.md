# clj-tachyons

A Clojure(Script)? library designed to validate Tachyons configuration and generate Tachyons classes

## Usage

Add to your dependencies:

[benefactor "0.1.0"]

```clj
(ns my.app
  (:require [clj-tachyons.core :as tachyons]))

;; Using a set
(tachyons/generate-class #{:white :z-0})
;; "white z-0"

;; Using a vector
(tachyons/generate-class [:white :z-0])
;; "white z-0"

;; Invalid classes throw
(tachyons/generate-class [:z-6])
;; Error: Invalid tachyons-class: z-6
```

## License

Copyright © 2017 Marcelo Nomoto

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
