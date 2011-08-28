package com.jm2dev

/**
 * Created by IntelliJ IDEA.
 * User: jm
 * Date: 23/08/2011
 * Time: 23:30
 * To change this template use File | Settings | File Templates.
 */
import org.scalatest.Spec
import org.scalatest.matchers.ShouldMatchers
import scala.collection.mutable.Stack

class StackSpec extends Spec with ShouldMatchers {

  describe("A Stack") {

    describe("(when empty)") {

      val stack = new Stack[Int]

      it("should be empty") {
        stack should be ('empty)
      }

      it("should complain when popped") {
        evaluating { stack.pop() } should produce [NoSuchElementException]
      }
    }
  }
}
