package jp.modal.soul.shikkaku

/**
 * Created by imae on 2015/07/04.
 */
object Problem3 {
  def fibStream(a:BigInt, b:BigInt):Stream[BigInt] = a #:: fibStream(b, a+b)
  def fib(n:Int) = fibStream(0,1).take(n).toList
  def fib100 = fib(100)
}
