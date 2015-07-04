package jp.modal.soul.shikkaku

import org.scalatest.{FlatSpec, Matchers}
/**
 * Created by imae on 2015/07/04.
 */
class Problem2Spec extends FlatSpec with Matchers {
  val one = Seq("a", "b", "c")
  val two = Seq(1, 2, 3)
  
  "connect mutually" must "success" in {
    Problem2.mutuallyList(one, two) shouldBe(Seq("a",1,"b",2,"c",3))
  }
}
