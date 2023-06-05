package e

import effekt._

trait Amb {
  def flip(): Control[Boolean]
}

object Main {
  def prog(amb: Amb): Control[Int] = for {
    x <- amb.flip()
  } yield if (x) 2 else 3

  def ambList[R](prog: Amb => Control[R]): Control[List[R]] =
    new Handler[List[R]] with Amb {
      def flip() = use { resume =>
        for {
          ts <- resume(true)
          fs <- resume(false)
        } yield ts ++ fs
      }
    } handle { amb => prog(amb) map { r => List(r) } }

  val handled: Control[List[Int]] = ambList { amb => prog(amb) }

  def main(args: Array[String]): Unit = {
    val l = run { handled }
    println(s"Hello,World! ${l}")
  }
}
