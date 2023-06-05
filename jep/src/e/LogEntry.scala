package e

import cats.implicits.catsSyntaxTuple3Semigroupal
import com.github.nscala_time.time.Imports.{DateTime, DateTimeFormat}
import com.monovore.decline.{CommandApp, Opts}

object LogEntry
    extends CommandApp(
      name = "claim",
      header = "be a claim and a rich guy",
      main = {

        val days: Opts[String] =
          Opts
            .option[String]("day", help = "days ago.", short = "d")
            .withDefault(DateTimeFormat.forPattern("yyyy-MM-dd HH:mm").print(DateTime.now))

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
