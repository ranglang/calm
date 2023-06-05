package e

import com.lqiong.model.order.OrderCommand
import com.monovore.decline.enumeratum._
import com.monovore.decline.{CommandApp, Opts}
object OptionLogEntry
    extends CommandApp(
      name = "claim",
      header = "be a claim and a rich guy",
      main = {

        import cats.syntax.apply._

        val days: Opts[OrderCommand] =
          Opts
            .option[OrderCommand]("direction", help = "buy direction.", short = "d")
            .withDefault(OrderCommand.commandBuy)

        val target1: Opts[String] =
          Opts
            .option[String]("target", help = "Person to greet.", short = "t")
            .withDefault("")

        val contract: Opts[String] =
          Opts
            .option[String]("content", help = "add Content.", short = "c")
            .withDefault("")

        (days, target1, contract).mapN { (days, target, contract) =>
          {
            val wd = os.pwd / "logs"
            val text = s"$days,${target},$contract"
            val w1 = os.read(wd / "Logs.md")
            os.write.over(wd / "Logs.md", s"""${text}\n${w1}""")
          }
        }
      }
    )
