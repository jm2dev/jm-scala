package com.jm2dev

import org.specs._

class HelloWorld extends Specification {
  "'hello world' has 11 characters" in {
    "hello worls".size must_== 11
  }
  "'hello world' matches 'h.* w.*'" in {
    "hello world" must be matching("h.* w.*")
  }
}