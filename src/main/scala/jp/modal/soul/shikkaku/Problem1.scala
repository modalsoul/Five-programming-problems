package jp.modal.soul.shikkaku

/**
 * Created by imae on 2015/07/04.
 */
object Problem1 {
  def sumByWhile(list:Int*) = {
    var sum = 0
    var index = 0
    while(index < list.length) {
      sum = sum + list(index)
      index = index + 1
    }
    sum
  }

  def sumByFor(list:Int*) = {
    var sum = 0
    for(i <- list) sum = sum + i
    sum
  }

  def sumByRec(list:Int*) = {
    def go(list:Seq[Int], ac:Int = 0):Int = {
      list match {
        case Nil => ac
        case head :: tail => go(tail, ac + head)
      }
    }
    go(list.toList)
  }
}
