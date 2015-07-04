package jp.modal.soul.shikkaku

/**
 * Created by imae on 2015/07/04.
 */
object Problem3 {
  def fib(size:Int) = {
    def go(a:BigInt = 0, b:BigInt = 1, ac:Seq[BigInt] = Nil):Seq[BigInt] = {
      if(ac.size == size-1) ac
      else go(b, b+a, ac:+b)
    }
    0+:go()
  }
}
