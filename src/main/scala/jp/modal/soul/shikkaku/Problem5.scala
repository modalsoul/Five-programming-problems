package jp.modal.soul.shikkaku

/**
 * Created by imae on 2015/07/04.
 */
object Problem5 {
  val numberReg = """([0-9]+)(.*)""".r
  val plusReg = """([0-9]+)([\+])(.*)""".r
  val minusReg = """([0-9]+)([\-])(.*)""".r
  
  def calc(expr:String) = {
    def recur(str:String, acc:Seq[Int]):Seq[Int] = {
      str match {
        case minusReg(x, xs, xss) =>
          recur(xss, -(x.reverse.toInt) +: acc)
        case plusReg(x, xs, xss) =>
          recur(xss, (x.reverse.toInt) +: acc)
        case numberReg(x,xs) =>
          x.reverse.toInt+:acc
      }
    }
    recur(expr.reverse, Nil).sum
  }
  
  def find = {
    var comb = Seq("1")
    (2 to 9).foreach { n =>
      comb = comb.flatMap { c =>
        (c + n) :: (s"${c}+${n}") :: (s"${c}-${n}") :: Nil
      }
    }
    comb.withFilter(calc(_) == 100).map(identity)
  }
}