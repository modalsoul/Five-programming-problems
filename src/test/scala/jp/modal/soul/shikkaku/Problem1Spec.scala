package jp.modal.soul.shikkaku

import org.scalatest.{FlatSpec, Matchers}
/**
 * Created by imae on 2015/07/04.
 */
class Problem1Spec extends FlatSpec with Matchers {
  val list = Seq(1,2,3)
  val expected = 6
  
  "sum using while" must "success" in {
    Problem1.sumByWhile(list:_*) shouldBe(expected)
  }

  "sum using for" must "success" in {
    Problem1.sumByFor(list:_*) shouldBe(expected)
  }

  "sum using rec" must "success" in {
    Problem1.sumByRec(list:_*) shouldBe(expected)
  }
}
