package com.onectrm.akshare.api.generated.bond;

import com.onectrm.akshare.api.generated.bond.bond_cb_adj_logs_jslResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: bond 接口: bond_cb_adj_logs_jsl 目标地址: https://app.jisilu.cn/data/cbnew/#cb;
  * 点击带红色星号的转股价会弹出转股价调整记录 描述: 集思录-单个可转债的转股价格-调整记录 限量: 返回当前时刻该可转债的所有转股价格调整记录
  */
case class Respbond_cb_adj_logs_jslResponse(
  `p_zhuan3zhai4ming2cheng1`: String,
  `p_gu3dong1da4hui4ri4`: String,
  `p_xia4xiu1qian2zhuan3gu3jia4`: Double,
  `p_xia4xiu1hou4zhuan3gu3jia4`: Double,
  `p_xin1zhuan3gu3jia4sheng1xiao4ri4qi1`: String,
  `p_xia4xiu1di3jia4`: Double
)

case class bond_cb_adj_logs_jslResponse(
  `p_zhuan3zhai4ming2cheng1`: String,
  `p_gu3dong1da4hui4ri4`: String,
  `p_xia4xiu1qian2zhuan3gu3jia4`: Double,
  `p_xia4xiu1hou4zhuan3gu3jia4`: Double,
  `p_xin1zhuan3gu3jia4sheng1xiao4ri4qi1`: String,
  `p_xia4xiu1di3jia4`: Double
)

trait Json_bond_cb_adj_logs_jslResponse {

  implicit val a_bond_cb_adj_logs_jslResponse = new Decoder[bond_cb_adj_logs_jslResponse] {
    final def apply(c: HCursor): Decoder.Result[bond_cb_adj_logs_jslResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_zhuan3zhai4ming2cheng1 <- c.downField("转债名称").as[String]

        p_gu3dong1da4hui4ri4 <- c.downField("股东大会日").as[String]

        p_xia4xiu1qian2zhuan3gu3jia4 <- c.downField("下修前转股价").as[Double]

        p_xia4xiu1hou4zhuan3gu3jia4 <- c.downField("下修后转股价").as[Double]

        p_xin1zhuan3gu3jia4sheng1xiao4ri4qi1 <- c.downField("新转股价生效日期").as[String]

        p_xia4xiu1di3jia4 <- c.downField("下修底价").as[Double]

      } yield {
        bond_cb_adj_logs_jslResponse(
          p_zhuan3zhai4ming2cheng1,
          p_gu3dong1da4hui4ri4,
          p_xia4xiu1qian2zhuan3gu3jia4,
          p_xia4xiu1hou4zhuan3gu3jia4,
          p_xin1zhuan3gu3jia4sheng1xiao4ri4qi1,
          p_xia4xiu1di3jia4
        )
      }
  }

}

object JsonItem_bond_cb_adj_logs_jslResponse extends Json_bond_cb_adj_logs_jslResponse
