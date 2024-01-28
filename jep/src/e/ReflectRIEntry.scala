package e

import cats.effect.{ExitCode, IO, IOApp}
import e.model.LineIO
import m.utils.Clipboard
import org.fusesource.jansi.AnsiConsole

import scala.collection.mutable.ListBuffer

object ReflectRIEntry extends IOApp {
  override def run(args: List[String]): IO[ExitCode] =
    for {
      _ <- {
        IO {
          AnsiConsole.systemInstall()
        }
      }
      i <- {
        LineIO.prompt(
          """
            | build your momentum. change any underlying structure.
            |""".stripMargin,
          required = true
        )
      }
      ia <- {
        LineIO.prompt(
          """
            | describe action : just do it .
            |""".stripMargin,
          required = true
        )
      }
      i0 <- {
        LineIO.prompt(
          """
            | Broaden hirozan
            |""".stripMargin,
          required = true
        )
      }

      i133 <- {
        LineIO.prompt(
          """
            |      智、信、仁、勇、严
            |      仁以附衆，敬以招賢，信以必賞，勇以益氣，嚴以一令
            |            |""".stripMargin,
          required = true
        )
      }
      repeatInfo <- {
        LineIO.prompt(
          """
            |Make a Plan 制定计划(抓住主要矛盾) \nCreate Milestones 分解目标（新闻发布会)）\nActually Make Time for Your Goals (日程表)  切实为你的目标腾出时间\nOnly worry about the present moment 只关注当下\nStop negotiating with yourself 不要和自己协商，尽情去完成\nRevisit Your Goals often 经常回顾你的目标,想象你完成目标的感受，真正激励自己\nForgive Your Failures（And then keep Going）原谅你的失败（然后继续前进）\nDo it anyway 无论如何都要去做，Just do it
            |            |
            |""".stripMargin,
          required = true
        )
      }
      i1 <- {
        LineIO.prompt(
          """
            |Create 超转 的方法
            |""".stripMargin,
          required = true
        )
      }
      i2 <- {
        LineIO.prompt(
          """
              | 沟通 事实, 自我表达，关系，诉求维度
              |
              |""".stripMargin,
          required = true
        )
      }

      i3 <- {
        LineIO.prompt(
          """
            |构建个人形象 (丢弃内容)
            |""".stripMargin,
          required = true
        )
      }

      i7 <- {
        LineIO.prompt(
          """
            |//      What we do ?（背景）
            |//      Why we do it ? or What’s the problem（解决什么问题）
            |//      How we do it ?（我们怎样做）
            |//      Validation（如何验证）
            |//      Discussion / Analysis（讨论、分析）
            |//      Summary（总结）
            |            |""".stripMargin,
          required = true
        )
      }

      i4 <- {
        LineIO.prompt(
          """
            |Breakout 突破自己
            |""".stripMargin,
          required = true
        )
      }
      i11 <- {
        LineIO.prompt(
          """
            | At least you can try 10 times
            |
            |""".stripMargin,
          required = true
        )
      }
      i5 <- {
        LineIO.prompt(
          """
            | Problem solving is no creating，
            | Don't be limited by
            | This principle is that energy always moves along the path of least resistance
            |and that any change you attempt to make in your life will not work if the
            |path of least resistance does not lead in that direction.
            |""".stripMargin,
          required = true
        )
      }
      _ <- {
        val resultMsg = List(
          repeatInfo,
          i,
          i0,
          i1,
          i7,
          i2,
          i3,
          i4,
          i5,
          ia,
          i11,
          i133
        ).mkString("\n")
        Clipboard.text(resultMsg)
      }
    } yield ExitCode.Success
}
