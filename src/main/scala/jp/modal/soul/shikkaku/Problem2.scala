package jp.modal.soul.shikkaku

/**
 * Created by imae on 2015/07/04.
 */
object Problem2 {
  def mutuallyList(a:Any*)(b:Any*) = a.zip(b).flatMap{x => x._1::x._2::Nil}
}
