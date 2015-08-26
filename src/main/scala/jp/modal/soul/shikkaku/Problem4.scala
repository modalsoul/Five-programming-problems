package jp.modal.soul.shikkaku

/**
 * Created by imae on 2015/07/04.
 */
object Problem4 {
  def max(list:Seq[Int]) = list.permutations.map(_.map(_.toString).mkString.toInt).max
}