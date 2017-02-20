package sw

import org.scalatest.{FunSuite, Matchers}

/**
  * Created by hakjoongkim on 2/19/17.
  */
class State$Test extends FunSuite with Matchers {
test("It works") {
  State.Travelport.accept("work").accept("great") shouldBe State.Travelport
}
}
