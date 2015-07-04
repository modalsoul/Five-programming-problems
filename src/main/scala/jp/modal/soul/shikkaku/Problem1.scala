package jp.modal.soul.shikkaku

/**
 * Created by imae on 2015/07/04.
 */
object Problem1 {
  def sumByWhile(list:Seq[Int]) = {
    var sum = 0
    var index = 0
    while(index < list.length) {
      sum = sum + list(index)
      index = index + 1
    }
    sum
  }

  def sumByFor(list:Seq[Int]) = {
    var sum = 0
    for(i <- list) sum = sum + i
    sum
  }
  
  def sumByRec(list:Seq[Int]) = {
    def go(list:Seq[Int], ac:Int = 0):Int = {
      list match {
        case head :: Nil => ac + head
        case head :: tail => go(tail, ac + head)
      }
    }
    go(list)
  }
}
