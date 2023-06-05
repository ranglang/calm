package e

import _root_.enumeratum._
import akka.actor.ActorSystem
import com.google.inject.Guice
import com.lqiong.email.module.ConfigModule
import com.lqiong.jep.entry._
import com.lqiong.jep.modules._
import com.lqiong.jep.option.QuantEngine
import com.lqiong.model.order.OrderCommand
import com.monovore.decline.enumeratum._
import com.monovore.decline.{CommandApp, Opts}
import io.circe.generic.JsonCodec
import io.circe.jawn
import io.circe.syntax.EncoderOps
import org.joda.time.DateTime

import scala.concurrent.Await
import scala.util.Try

@JsonCodec
case class OptionTradeHistory(
  direction: OrderCommand,
  tradeAmount: Int = 0,
  price: Double = 0,
  code: String,
  name: String,
  date: String
)

object OptionJourneyEntry
    extends CommandApp(
      name = "claim",
      header = "be a claim and a rich guy",
      main = {

        import cats.syntax.apply._

        val content: Opts[String] =
          Opts
            .option[String]("content", help = "Person to greet.", short = "c")
        val direction: Opts[OrderCommand] =
          Opts
            .option[OrderCommand]("direction", help = "Person to greet.", short = "d")

        val price: Opts[Double] =
          Opts
            .option[Double]("price", help = "Person to greet.", short = "p")

        val amount: Opts[Int] =
          Opts
            .option[Int]("num", help = "Person to greet.", short = "n")
            .withDefault(1)

        (content, amount, price, direction).mapN { (content, amount, price, direction) =>
          {
            val system = ActorSystem("claim")
            sys.addShutdownHook(system.terminate())
            val injector = Guice.createInjector(
              new ConfigModule(),
              new AkkaMaterializerModule(system),
              new AkkaSharedClusterModule(),
              new ExecutionContextModule,
              new EmailModule,
              new MemcachedClientModule(),
              new LoggingModule(""),
              new JepExecutorModule,
              new RetryModule,
              new SparkModule,
              new QueryTableModule,
              new QuantEngineModule,
              new JoinquantModule
            )
            import net.codingwell.scalaguice.InjectorExtensions._
            val quantEngine = injector.instance[QuantEngine]
            import scala.concurrent.duration._
            val f = Await
              .result(quantEngine.factor_option_value_analysis_em.getDataList(), 50.seconds)

            val f1 = f.find(r => r.`期权名称` == content)

            f1 match {
              case Some(x) =>
                val code = x.`期权代码`
                println(s"code ${code}")
                val d = OptionTradeHistory(
                  direction = direction,
                  price = price,
                  code = code,
                  tradeAmount = amount,
                  name = content,
                  date = DateFormat.getDay(DateTime.now)
                )

                val list = List(d)

                val wd = os.root / "tmp"

                val w2 = Try {
                  jawn
                    .decode[List[OptionTradeHistory]](os.read(wd / "option_log.json"))
                    .getOrElse(List.empty[OptionTradeHistory])
                }.toOption

                val w1 = w2.getOrElse(List.empty[OptionTradeHistory])

                os.write.over(wd / "option_log.json", (list ::: w1).asJson.spaces2)

                println("cat /tmp/option_log.json")
                println("cat /tmp/option_log.json")
                println("cat /tmp/option_log.json")
            }
            sys.exit(0)
          }
        }
      }
    )
