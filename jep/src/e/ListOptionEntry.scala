package e

import _root_.enumeratum._
import akka.actor.ActorSystem
import akka.event.LoggingAdapter
import com.google.inject.Guice
import com.lqiong.email.module.ConfigModule
import com.lqiong.jep.entry._
import com.lqiong.jep.modules._
import com.lqiong.jep.option.QuantEngine
import com.lqiong.model.IndexSymbol
import com.monovore.decline.enumeratum._
import com.monovore.decline.{CommandApp, Opts}
import e.model.ListOptionCategory
import io.circe.jawn
import org.joda.time.DateTime

import scala.concurrent.Await
import scala.util.Try

object ListOptionEntry
    extends CommandApp(
      name = "claim",
      header = "add option strategy",
      main = {

        val categoryArgument = Opts.argument[ListOptionCategory]("category")
        import cats.syntax.apply._

        categoryArgument.map { categoryArgument =>
          {
            categoryArgument match {
              case ListOptionCategory.status =>
                val a = OptionConfig.default

                val system = ActorSystem("claim")
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
                val logger = injector.instance[LoggingAdapter]
                import scala.concurrent.duration._

                var result = "\n"
                result += s"${DateFormat.getDayHourFormat(DateTime.now)}\n"
                result += "\n"
                result += "\n"
                result += "\n"
                result += "\n"
                result += "\n"

                val f12 = Await
                  .result(
                    quantEngine.panMingFactor.getRealTimeLatest(IndexSymbol("000016")),
                    900.seconds
                  )
                result += s"000016 超跌指数: ${f12}"

                val a1 = quantEngine.getIndexCurrentPrice(IndexSymbol("000016"))
                result += s"000016 ${a1.map(_.last_close).getOrElse("")}: ${a1.map(_.percent).getOrElse("")}"

                result += "\n"
                val f13 = Await
                  .result(
                    quantEngine.panMingFactor.getRealTimeLatest(IndexSymbol("000300")),
                    850.seconds
                  )
                result += s"000300 超跌指数: ${f13}"
                val b1 = quantEngine.getIndexCurrentPrice(IndexSymbol("000300"))
                result += s"000016 ${b1.map(_.last_close).getOrElse("")} 超跌指数: ${b1.map(_.percent).getOrElse("")}"
                result += "\n"

                val wd = os.root / "tmp"

                val w1 = Try {
                  jawn
                    .decode[List[OptionTradeHistory]](os.read(wd / "option_log.json"))
                    .getOrElse(List.empty[OptionTradeHistory])
                }.toOption.getOrElse(List.empty[OptionTradeHistory])
//                Await.result(quantEngine.factor_option_risk_analysis_em.fetchData, 400.seconds)
//                List[Itemoption_risk_analysis_em] = List.empty
                val list = Await
                  .result(quantEngine.factor_option_risk_analysis_em.getRealTimeList(), 200.seconds)
//                logger.info("task start");
//                Await.result(quantEngine.factor_ptionRiskMiniFactor.fetchData(), 50.seconds)

                val f34 =
                  Await.result(quantEngine.factor_ptionRiskMiniFactor.getRealTimeOne(), 200.seconds)
                result += s"qvix ${f34}"
                result += "\n"

                def print = (a: OptionTradeHistory) => {
                  val r = list.find(item => item.`期权代码` == a.code)
                  r match {
                    case Some(r) =>
                      s"事件:${a.date} ${r.`期权代码`} ${r.`期权名称`} 方向: ${a.direction} 持有数量: ${a.tradeAmount} 买入价格: ${a.price} 最新价${r.`最新价`} 涨跌幅: ${r.`涨跌幅`} vega: ${r.`vega`}  delta: ${r.`delta`}"
                    case _ => ""
                  }
                }

                result += s"仓位: ${a.usedCapital / a.capital}"
                result += "\n"
                result += w1.map(print).mkString("\n")
                result += "\n"
                result += a.nextShot
                result += "\n"
                result += s"善后:\n"
                result += a.closing
                result += "历史\n"
                result += a.history
                result += "\n"
                result += "https://xuangubao.cn/dingpan";
                logger.info(result)

                val wd1 = os.root / "tmp" / "status.md"
                os.write.over(wd1, result)
                sys.addShutdownHook(system.terminate())
                sys.exit(0)
              case ListOptionCategory.list_contract =>
                val system = ActorSystem("claim")
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

                val f1 = f.map(r => s"${r.`期权名称`}").mkString("\n")
                val wd = os.root / "tmp"
                os.write.over(wd / "tmp_option_list.json", f1)

                sys.addShutdownHook(system.terminate())
                sys.exit(0)
            }
          }
        }
      }
    )
