package jp.modal.soul.shikkaku

/**
 * Created by imae on 2015/07/04.
 */
import scala.reflect.runtime.currentMirror
import scala.tools.reflect.ToolBox

object Eval {
  def apply[A](string: String): A = {
    val toolbox = currentMirror.mkToolBox()
    val tree = toolbox.parse(string)
    toolbox.eval(tree).asInstanceOf[A]
  }
}
