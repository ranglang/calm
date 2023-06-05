package com.lqiong.jep.entry

import com.github.takezoe.retry.RetryPolicy
import com.google.inject.Inject
import com.lqiong.jep.EmailService
import com.lqiong.jep.entry.util.LqSegment
import com.lqiong.model.trade.TradeLogic
import com.lqiong.model.{IndexSymbol, QueryTableInter, StockSymbol, StockTrait}

case class LogicResult(
  logic: TradeLogic,
  content: String,
  reference: Option[String] = Option.empty[String]
)

class TradeStrategy @Inject() (
  val emailService: EmailService,
  implicit val stockImpl: StockTrait,
  implicit val queryTableInter: QueryTableInter,
  implicit val retryPolicy: RetryPolicy
) {

  def next(logic: TradeLogic): LogicResult = {
    if (logic.valid) {
      logic.symbol match {
        case symbol: IndexSymbol => {
          if (logic.enterReason.isDefined) {
            val checkResult = logic.enterReason.get(symbol)
            val content = s"""
               |${
                              if (checkResult)
                                s"买入 ${logic.currentStep}${LqSegment.separator} ${logic}"
                              else ""
                            }
               |
               |""".stripMargin
            LogicResult(logic, content)
          } else if (logic.leaveReason.isDefined) {
            val checkResult = logic.leaveReason.get(symbol)
            val content = s"""
               |${
                              if (checkResult)
                                s"卖出 ${logic.currentStep} ${LqSegment.separator}  ${logic}"
                              else ""
                            }
               |
               |""".stripMargin
            LogicResult(logic, content)
          } else {
            val content = s""""""
            LogicResult(logic, content)
          }
        }
        case symbol: StockSymbol => {
          if (logic.enterReason.isDefined) {
            val checkResult = logic.enterReason.get(symbol)
            val content = s"""
               |${
                              if (checkResult)
                                s"买入 ${logic.currentStep} ${LqSegment.separator} ${logic}"
                              else ""
                            }
               |
               |""".stripMargin
            LogicResult(logic, content)
          } else if (logic.leaveReason.isDefined) {
            val checkResult = logic.leaveReason.get(symbol)
            val content = s"""
               |${
                              if (checkResult)
                                s"卖出 ${logic.currentStep} ${LqSegment.separator}  ${logic}"
                              else ""
                            }
               |
               |""".stripMargin
            LogicResult(logic, content)
          } else {
            val content = s""""""
            LogicResult(logic, content)
          }
        }
        case _ => {
          val content = "暂不支持"
          LogicResult(logic, content)
        }
      }
    } else {
      val content = s""""""
      LogicResult(logic, content)
    }
  }

}
