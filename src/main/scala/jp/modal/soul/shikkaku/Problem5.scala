package jp.modal.soul.shikkaku

/**
 * Created by imae on 2015/07/04.
 */
object Problem5 {
  val numberReg = """([0-9]+)(.*)""".r
  val opReg = """([\+\-])([0-9]+)(.*)""".r

  def calc(expr:String) = {
    def recur(str:String, acc:Int = 0):Int = {
      str match {
        case "" => acc
        case numberReg(x, xs) => recur(xs, acc + x.toInt)
        case opReg("+", x, xs) => recur(xs, acc + x.toInt)
        case opReg("-", x, xs) => recur(xs, acc - x.toInt)
      }
    }
    recur(expr)
  }

  def find = {
    var comb = Seq("1")
    for(n <- 2 to 9) comb = comb.flatMap{c => Seq(c+n, s"$c+$n", s"$c-$n")}
    comb.filter(calc(_) == 100)
  }
}