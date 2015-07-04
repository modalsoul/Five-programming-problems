package jp.modal.soul.shikkaku

import org.scalatest.{FlatSpec, Matchers}
/**
 * Created by imae on 2015/07/04.
 */
class Problem5Spec extends FlatSpec with Matchers {
  "All sum" should "be 100" in {
    Problem5.find.foreach{ str =>
      val sum:Int = Eval(str)
      sum should be(100)
    }
  }
}
