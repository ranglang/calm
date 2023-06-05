package e

import cats.effect.{ExitCode, IO, IOApp}
import e.model.LineIO
import m.utils.Clipboard
import org.fusesource.jansi.AnsiConsole

import scala.collection.mutable.ListBuffer

object CommitEntry extends IOApp {
  override def run(args: List[String]): IO[ExitCode] =
    for {
      _ <- {
        IO {
          AnsiConsole.systemInstall()
        }
      }
      whyInput <- {
        LineIO.prompt("请填写你为什么提交: ", required = true)
      }
      selfCheckInput <- {
        ReadListOption("是否已经列出自测case并通过自测", ListBuffer("已通过自测", "未通过自测"))
      }
      moduleInput <- {
        LineIO.prompt("你的模块划分是否合理(文件夹路径是否正确: ")
      }
      namingInput <- LineIO.prompt("您的命名是否正确: ")
      changeLogInput <- {
        LineIO.prompt("是否已经填写ChangeLog Entry: ")
      }
      testInput <- {
        LineIO.prompt("是否可测试: ")
      }
      fileInput <- {
        LineIO.prompt("文件结构是否合理: ")
      }
      uselessInput <- {
        LineIO.prompt("是否有其他代码需要移除或重构: ")
      }
      relationshipInput <- {
        LineIO.prompt("实体关系，抽象，组装有更好的办法么: ")
      }
      sureInput <- {
        LineIO.prompt("你了解模块关系和边界条件，异常处理处理么？ ")
      }
      designPatternInput <- {
        LineIO.prompt("SOLID满足么？")
      }
      _ <- {
        val resultMsg = List(
          whyInput,
          moduleInput,
          namingInput,
          changeLogInput,
          testInput,
          fileInput,
          uselessInput,
          relationshipInput,
          sureInput,
          designPatternInput,
          selfCheckInput
        ).mkString("\n")
        Clipboard.text(resultMsg)
      }
    } yield ExitCode.Success
}
