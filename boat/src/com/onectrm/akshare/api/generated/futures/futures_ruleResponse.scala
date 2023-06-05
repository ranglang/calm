package com.onectrm.akshare.api.generated.futures;

import com.onectrm.akshare.api.generated.futures.futures_ruleResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: futures 接口: futures_rule 目标地址: https://www.gtjaqh.com/pc/calendar.html 描述: 国泰君安期货-交易日历数据表
  * 限量: 单次返回指定交易日所有合约的交易日历数据
  */
case class Respfutures_ruleResponse(
  `p_jiao1yi4suo3`: String,
  `p_pin3zhong3`: String,
  `p_dai4ma3`: String,
  `p_jiao1yi4bao3zheng4jin1bi3li4`: Double,
  `p_zhang3die1ting2ban3fu2du4`: Double,
  `p_he2yue1cheng2shu4`: Integer,
  `p_zui4xiao3bian4dong4jia4wei4`: Double,
  `p_xian4jia4dan1mei3bi3zui4da4xia4dan1shou3shu4`: Integer,
  `p_te4shu1he2yue1can1shu4diao4zheng3`: String,
  `p_diao4zheng3bei4zhu4`: String
)

case class futures_ruleResponse(
  `p_jiao1yi4suo3`: String,
  `p_pin3zhong3`: String,
  `p_dai4ma3`: String,
  `p_jiao1yi4bao3zheng4jin1bi3li4`: Double,
  `p_zhang3die1ting2ban3fu2du4`: Double,
  `p_he2yue1cheng2shu4`: Integer,
  `p_zui4xiao3bian4dong4jia4wei4`: Double,
  `p_xian4jia4dan1mei3bi3zui4da4xia4dan1shou3shu4`: Integer,
  `p_te4shu1he2yue1can1shu4diao4zheng3`: String,
  `p_diao4zheng3bei4zhu4`: String
)

trait Json_futures_ruleResponse {

  implicit val a_futures_ruleResponse = new Decoder[futures_ruleResponse] {
    final def apply(c: HCursor): Decoder.Result[futures_ruleResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_jiao1yi4suo3 <- c.downField("交易所").as[String]

        p_pin3zhong3 <- c.downField("品种").as[String]

        p_dai4ma3 <- c.downField("代码").as[String]

        p_jiao1yi4bao3zheng4jin1bi3li4 <- c.downField("交易保证金比例").as[Double]

        p_zhang3die1ting2ban3fu2du4 <- c.downField("涨跌停板幅度").as[Double]

        p_he2yue1cheng2shu4 <- c.downField("合约乘数").as[Integer]

        p_zui4xiao3bian4dong4jia4wei4 <- c.downField("最小变动价位").as[Double]

        p_xian4jia4dan1mei3bi3zui4da4xia4dan1shou3shu4 <- c.downField("限价单每笔最大下单手数").as[Integer]

        p_te4shu1he2yue1can1shu4diao4zheng3 <- c.downField("特殊合约参数调整").as[String]

        p_diao4zheng3bei4zhu4 <- c.downField("调整备注").as[String]

      } yield {
        futures_ruleResponse(
          p_jiao1yi4suo3,
          p_pin3zhong3,
          p_dai4ma3,
          p_jiao1yi4bao3zheng4jin1bi3li4,
          p_zhang3die1ting2ban3fu2du4,
          p_he2yue1cheng2shu4,
          p_zui4xiao3bian4dong4jia4wei4,
          p_xian4jia4dan1mei3bi3zui4da4xia4dan1shou3shu4,
          p_te4shu1he2yue1can1shu4diao4zheng3,
          p_diao4zheng3bei4zhu4
        )
      }
  }

}

object JsonItem_futures_ruleResponse extends Json_futures_ruleResponse
