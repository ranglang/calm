package e
import cats.effect.IO
import org.fusesource.jansi.Ansi.Color._
import org.fusesource.jansi.Ansi._
import org.fusesource.jansi.AnsiConsole
import org.jline.reader.LineReaderBuilder
import org.jline.terminal.TerminalBuilder

import java.awt.event.KeyEvent
import scala.collection.mutable.ListBuffer

object TerminalSingleton {

  lazy val get = {
    val terminal = TerminalBuilder.builder().jna(true).system(true).build()
    terminal.enterRawMode()
    terminal
  }
}

trait ReadList {
  def prompt: String;;
  val list: ListBuffer[String];

  def printList(options: ListBuffer[String], selectedIndex: Int): Unit = {
    println(ansi().eraseScreen().fg(GREEN).a(prompt));

    for ((option, index) <- options.zipWithIndex) {
      if (index == selectedIndex) {
        print(ansi().fg(YELLOW).a(s"> $option\n"))
      } else {
        print(ansi().fg(WHITE).a(s"  $option\n"))
      }
    }
  }

  def clearScreen(): Unit = {
    print(ansi().eraseScreen())
  }

  def get() = {
    IO {
      val reader = TerminalSingleton.get.reader()
      var input = -1

      val options = list
      var selectedIndex = 0

      var find = true
      var key1 = 1
      while (find) {
        printList(options, selectedIndex)

        val key = reader.read()
        key1 = key;
        key match {
          case 65              => selectedIndex = (selectedIndex - 1) % options.length
          case 66              => selectedIndex = (selectedIndex + 1) % options.length
          case KeyEvent.VK_TAB => selectedIndex = (selectedIndex + 1) % options.length
          case KeyEvent.VK_ENTER =>
            find = false
            clearScreen()
            println(s"You selected: ${options(selectedIndex)}")
          case 13 =>
            find = false
            clearScreen()
            println(s"You selected: ${options(selectedIndex)}")
//            print(ansi().eraseScreen().fg(GREEN).a(s"${options(selectedIndex)}"))
          case _ => {
            println(key);
          }
        }
      }
      options(selectedIndex)
    }
  }
}

case class ReadListItem(
  promptInput: String,
  list: ListBuffer[String] = ListBuffer.empty
) extends ReadList {
  def prompt: String = promptInput
}
object ReadListOption {
  def apply(prompt: String, List: ListBuffer[String]) = {
    ReadListItem(prompt, List).get()
  }
}

object ReadBuyOption extends ReadList {
  def prompt: String = "是否进入超跌或者超高区间"
  val list: ListBuffer[String] = ListBuffer("已进入持有区间", "未进入持有区间")
}

object PeriodBuyOption extends ReadList {
  def prompt: String = "是否距离上次交易比较长时间"
  val list: ListBuffer[String] = ListBuffer("1", "2", "3")
}

import cats.effect._
import cats.effect.std.Console
import cats.syntax.all._

import java.io.File

object TradeEntry extends IOApp {

  val program: IO[Unit] = {
    for {
      _ <- Console[IO].println("Please enter your name: ")
      n <- Console[IO].readLine
      _ <- {
        IO(print(n))
      }
    } yield ()
  }

  override def run(args: List[String]): IO[ExitCode] =
    for {
      _ <- {
        IO {
          AnsiConsole.systemInstall()
        }
      }
      name <- ReadBuyOption.get()
      a    <- PeriodBuyOption.get()
      n <- {
        IO {
          val reader = LineReaderBuilder
            .builder()
            .terminal(TerminalSingleton.get)
            .build();
          reader.readLine("请填写你的持股策略: ")
        }
      }
      c <- {
        IO {
          println("距离上次操作 %s", n)
          println("距离上次操作 %s", a)
          println("是否进入 %s", a)
        }
      }
    } yield ExitCode.Success

}
