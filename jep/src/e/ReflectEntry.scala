package e

import cats.implicits.catsSyntaxTuple9Semigroupal
import com.lqiong.jep.entry.DateFormat
import com.monovore.decline.enumeratum._
import com.monovore.decline.{CommandApp, Opts}
import org.joda.time.DateTime

import scala.util.Try

object ReflectEntry
    extends CommandApp(
      name = "claim",
      header = "be a claim and a rich guy",
      main = {

        val target1: Opts[String] =
          Opts
            .option[String]("topic", help = "you should have a object/target.", short = "t")
            .withDefault("")

        val meditation: Opts[String] =
          Opts
            .option[String]("meditation", help = "you have meditation")
            .withDefault("")

        val step: Opts[String] =
          Opts
            .option[String]("step", help = "add Content.")
            .withDefault("")

        val breakdown: Opts[String] =
          Opts
            .option[String]("breakdown", help = "add Content.")
            .withDefault("")

        val careful: Opts[String] =
          Opts
            .option[String]("careful", help = "brack input/output")
            .withDefault("")

        val centered: Opts[String] =
          Opts
            .option[String]("centered", help = "add Content.")
            .withDefault("")

        val communicate: Opts[String] =
          Opts
            .option[String]("communicate", help = "add Content.")
            .withDefault("")

        val time: Opts[String] =
          Opts
            .option[String]("time", help = "add Content.")
            .withDefault("")

        val output: Opts[String] =
          Opts
            .option[String]("output", help = "add Content.")
            .withDefault("")

        (target1, careful, centered, output, breakdown, time, step, communicate, meditation).mapN {
          (target1, careful, output, centered, breakdown, time, step, communicate, meditation) =>
            {
              val wd = os.pwd / "logs"
              val text =
                s"时间: ${DateFormat.getDay(DateTime.now)} meditation:${meditation} \n communicate: ${communicate}\n step: ${step} 时长:${time} \n拆解: ${breakdown}\n 话题: $target1 \n谨慎(推导): ${careful}\n 深度(实践): $output \n 专注化:${centered}\n\n"
              val w1 = Try(os.read(wd / "Events.md")).toOption.getOrElse("")
              os.write.over(wd / "Events.md", s"""${text}\n${w1}""")
            }
        }
      }
    )
