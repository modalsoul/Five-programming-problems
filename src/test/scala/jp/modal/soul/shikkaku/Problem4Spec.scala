package jp.modal.soul.shikkaku

import org.scalatest.{FlatSpec, Matchers}
/**
 * Created by imae on 2015/07/04.
 */
class Problem4Spec extends FlatSpec with Matchers {
  val list = Seq(50, 2, 1, 9)
  val expected = 95021
  
  "Problem4.max" should "return correct order" in {
    Problem4.max(list) shouldBe(expected)
  }
}
