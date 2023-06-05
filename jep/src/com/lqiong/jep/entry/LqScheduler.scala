package com.lqiong.jep.entry

import akka.actor.ActorSystem
import akka.actor.typed.ActorRef
import akka.event.LoggingAdapter
import com.google.inject.{Inject, Injector}
import com.lqiong.claim.items.SchedulerCommand
import com.lqiong.claim.spot.SpotActor
import com.lqiong.email.EmailServiceTrait
import com.lqiong.jep.option.QuantEngine
import com.lqiong.model.StockTrait
import com.typesafe.config.Config
import cronish.dsl.task

import scala.util.control.NonFatal

class LqScheduler @Inject() (
  val emailService: EmailServiceTrait,
  val quantEngine: QuantEngine,
  val orderConfig: QuantConfig,
  val logger: LoggingAdapter,
  val injector: Injector,
  val handleChecker: HandleChecker,
  val system: ActorSystem,
  implicit val stockImpl: StockTrait,
  config: Config
) {

  def runScheduleMessage(
    spotMsg: ActorRef[SpotActor.SpotMsg]
  ): Unit = {

    val scheduleEnable = config.getString("scheduleEnable").equals("1")

    if (orderConfig.getSchedulerFlag.getOrElse(scheduleEnable)) {
      val l = quantEngine.stashCommands()
      l.headOption match {
        case Some(cmd) =>
          quantEngine.handleCommand(cmd, spotMsg)
        case _ => ()
      }

      task(
        quantEngine.handleCommand(SchedulerCommand.syncNotePrice, spotMsg)
      ) executes "Every day at 11:50"

      task(
        quantEngine.handleCommand(SchedulerCommand.sellNotice, spotMsg)
      ) executes "Every day at 14:30"

      task(
        quantEngine.handleCommand(SchedulerCommand.syncContract, spotMsg)
      ) executes "Every day at 10:00"

      task(
        quantEngine.handleCommand(SchedulerCommand.syncContract, spotMsg)
      ) executes "Every day at 11:00"

      task(
        quantEngine.handleCommand(SchedulerCommand.syncContract, spotMsg)
      ) executes "Every day at 13:00"

      task(
        quantEngine.handleCommand(SchedulerCommand.syncUsedPrice, spotMsg)
      ) executes "Every day at 16:20"

      task(
        quantEngine.handleCommand(SchedulerCommand.syncContract, spotMsg)
      ) executes "Every day at 15:20"

      task(
        quantEngine.handleCommand(SchedulerCommand.sector, spotMsg)
      ) executes "Every day at 17:00"

//      task(
//        quantEngine.handleCommand(SchedulerCommand.saveTrace, spotMsg)
//      ) executes "Every day at 18:00"

      task(
        quantEngine.handleCommand(SchedulerCommand.syncOptions, spotMsg)
      ) executes "Every day at 18:20"

      task(
        quantEngine.handleCommand(SchedulerCommand.retro, spotMsg)
      ) executes "Every day at 18:30"

      task(
        quantEngine.handleCommand(SchedulerCommand.syncUsedPrice, spotMsg)
      ) executes "Every day at 20:30"

//      task(
//        quantEngine.handleCommand(SchedulerCommand.saveTrace, spotMsg)
//      ) executes "Every day at 21:20"
//
      task(
        quantEngine.handleCommand(SchedulerCommand.factorData, spotMsg)
      ) executes "Every day at 21:42"

      task(
        quantEngine.handleCommand(SchedulerCommand.chaodie, spotMsg)
      ) executes "Every day at 22:00"

//      task(
//        quantEngine.handleCommand(SchedulerCommand.sellNotice, spotMsg)
//      ) executes "Every day at 02:20"
      task(
        quantEngine.handleCommand(SchedulerCommand.continue, spotMsg)
      ) executes "Every day at 00:41"

      task(
        quantEngine.handleCommand(SchedulerCommand.syncVix, spotMsg)
      ) executes "Every day at 07:40"

      task(
        quantEngine.handleCommand(SchedulerCommand.syncPig, spotMsg)
      ) executes "Every day at 08:00"

      task(
        quantEngine.handleCommand(SchedulerCommand.strategy, spotMsg)
      ) executes "Every day at 09:00"

      // month
      task(
        quantEngine.handleCommand(SchedulerCommand.syncCodeName, spotMsg)
      ) executes "Every 1st day in every month at 11:00"

      task {
        quantEngine.handleCommand(SchedulerCommand.tradeDay, spotMsg)
      } executes "Every 1st day in every month at 08:00"
      run_scheduler()
    }

//    try {
//      val r = Await.result(
//        quantEngine.getCodeNameFromDynamicActor(StockSymbol("000002")),
//        2.minutes
//      )
//      logger.info(
//        "000002 rgetCodeName1getCodeName1getCodeName1getCodeName1getCodeName1 0 {}",
//        r
//      )
//    } catch {
//      case NonFatal(x) =>
//        logger.error("000002 xxxxxxxxxxxxxxxx error 0 {}", x)
//    }

//    try {
//      val r = Await.result(
//        quantEngine.getCodeNameFromDynamicActor(StockSymbol("000002")),
//        2.minutes
//      )
//      logger.info(
//        "000002 rgetCodeName1getCodeName1getCodeName1getCodeName1getCodeName1 1 {}",
//        r
//      )
//    } catch {
//      case NonFatal(x) =>
//        logger.error("000002 xxxxxxxxxxxxxxxx error {} 1", x)
//    }

//    try {
//      val r = Await.result(
//        quantEngine.getCodeNameFromDynamicActor(StockSymbol("000002")),
//        2.minutes
//      )
//      logger.info(
//        "000002 rgetCodeName1getCodeName1getCodeName1getCodeName1getCodeName1 2 {}",
//        r
//      )
//    } catch {
//      case NonFatal(x) =>
//        logger.error("000002 xxxxxxxxxxxxxxxx error {} 2", x)
//    }

//    try {
//      val r = Await.result(
//        quantEngine.getCodeNameFromDynamicActor(StockSymbol("000002")),
//        2.minutes
//      )
//      logger.info(
//        "000002 rgetCodeName1getCodeName1getCodeName1getCodeName1getCodeName1 3 {}",
//        r
//      )
//    } catch {
//      case NonFatal(x) =>
//        logger.error("000002 xxxxxxxxxxxxxxxx error {} 3", x)
//    }

//    task(
//      quantEngine.handleCommand(SchedulerCommand.fetchSpot, spotMsg)
//    ) executes "Every day at 01:59"

  }

  def run_scheduler(): Unit = {
    try {

      import cronish.dsl._
      val isConfigOk = true
      //      quantEngince.checkStrategy().getOrElse(false)
      //    val checkCloudOrder = orderConfig.validateOrder();
      //    if (checkCloudOrder.isLeft) {
      //      logger.info("日程 order错误");
      //      emailService.sendEmail("日程错误", "请勿操作")
      //    }

//      val checkStrategy = task {
//        quantEngine.checkStrategy()
//      }

      //    val logics = task {
      //      quantEngine.checkStrategy()
      //    }

//      val vixx = task {
//        quantEngine.saveVixDataframe2DB()
//      }

      val savecar_cpca_energy_saleListList = task {
        quantEngine.savecar_cpca_energy_saleListList()
      }

      val notices = task {
        quantEngine.checkNotice
      }

//      val getForcast = task {
//        val f = Try {
//          emailService.sendEmail(
//            "已经拉取价格数据",
//            quantEngine.getForcastToday()
//          )
//          Right("")
//        }.recover { case NonFatal(x) =>
//          logger.error(s"parse data ${}", x)
//          Left(new Error(x.toString))
//          emailService.sendEmail(
//            "getForcastToday",
//            x.toString
//          )
//        }
//
//        f.toOption
//      }

//      val syncSellNotice = task {
//        quantEngine.getSellNotice()
//      }

//      val options = task {
//        println(" Finally!")
//        //      quantEngince.saveOptionVix();
//        injector.instance[PolytyPrinter].getVixImage(isSave = true)
//        //      emailService.sendEmail(
//        //        "波动率数据xxxxxxx",
//        //        "已经发送文件",
//        //        List(
//        //          new File("/tmp/vix.png")
//        //        )
//        //      )
//      }

      val order = task {
        logger.info(" Order start!")

        quantEngine.orderClound()
        emailService.sendEmail("执行Order", orderConfig.clouds.toString)
      }

      //    val contain6Lianyang = task {
      //    }

//      retro executes "Every day at 05:00"
//      task {
//        quantEngine.saveTrace()
//      } executes "Every day at 04:00"
      //    getPilu executes "Every day at 04:30"
      //    getForcast executes "Every day at 04:30"
//      checkStrategy executes "Every day at 09:00"

      notices executes "Every day at 13:10"

      task {
        emailService.sendEmail(
          "计划任务",
          s"鸡肉价格1, 萝卜投研 https://lqiong.atlassian.net/wiki/spaces/RICH/pages/162398211"
        )
      } executes "Every 1st day in every month at 08:00"

      task {
        emailService.sendEmail("计划任务", s"每周强势板块")
      } executes "Every 2st day in every month at 08:00"

      task {
        emailService.sendEmail("快递价格", s"检查快递价格1")
      } executes "Every 10st day in every month at 08:00"

      task {
        emailService.sendEmail("指数估值", s"中证能源")
      } executes "Every 9st day in every month at 08:00"
//      https://funddb.cn/site/index

      if (isConfigOk) {
        emailService.sendEmail("cloud", s"checkCloudOrder scheduler started")
        order executes "Every day at 14:03"
      } else {
        emailService.sendEmail(
          "cloud",
          s"checkCloudOrder  isConfigOk $isConfigOk autoTrade"
        )
      }
//      orderConfig.updateDefaultClounds()
    } catch {
      case NonFatal(e) =>
        logger.error("run scheduler  {}", e)
    }
  }

}
