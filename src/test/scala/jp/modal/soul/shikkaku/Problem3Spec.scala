package jp.modal.soul.shikkaku

import org.scalatest.{FlatSpec, Matchers}
/**
 * Created by imae on 2015/07/04.
 */
class Problem3Spec extends FlatSpec with Matchers {
  val five:Seq[BigInt] = Seq(0, 1, 1, 2, 3)
  val ten:Seq[BigInt] = five ++: Seq[BigInt](5, 8, 13, 21, 34)
  
  "fib" should "return correct seq" in {
    Problem3.fib(5) should be(five)
    Problem3.fib(10) should be(ten)
  }
}
