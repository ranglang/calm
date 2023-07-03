package m.utils

import cats.effect.{IO, Resource}
import com.typesafe.config.ConfigFactory
import jep.{MainInterpreter, SharedInterpreter}

import scala.util.control.NonFatal

object Clipboard {

  private val acquire = IO {
    try {
      val file = ConfigFactory.load().getString("JEP_SO")
      MainInterpreter.setJepLibraryPath(file)
    } catch {
      case NonFatal(x) => {}
    }
    val interp = new SharedInterpreter()
    interp
  }

  private def release(s: SharedInterpreter) = IO {
    s.close()
  }

  def text(content: String) = {

    val resource = Resource.make(acquire)(release)
    resource.use { case interp =>
      IO {
        interp.exec("import pyperclip");
        interp.exec(s"a=\"${content.replaceAll("\n", "__UNSAFE_SPLIT")}\"");
        interp.exec("""a=a.replace("__UNSAFE_SPLIT", "\n")""");
        interp.exec(s"pyperclip.copy(a)")
      }
    }
  }

}
