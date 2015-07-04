package jp.modal.soul.shikkaku

/**
 * Created by imae on 2015/07/04.
 */
object Problem2 {
  def mutuallyList(a:Seq[Any], b:Seq[Any]) = {
    a.zip(b).map {
      case (one, two) => Seq(one, two)
    }.flatten
  }
}
