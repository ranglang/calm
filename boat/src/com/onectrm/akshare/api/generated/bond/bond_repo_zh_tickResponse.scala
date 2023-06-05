package com.onectrm.akshare.api.generated.bond;

import com.onectrm.akshare.api.generated.bond.bond_repo_zh_tickResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: bond 接口: bond_repo_zh_tick 目标地址: http://stockhtm.finance.qq.com/sstock/ggcx/131802.shtml
  * 描述: 债券-质押式回购-实时行情-成交明细; 该接口暂不可用 限量: 单次返回所有指定日期的成交明细数据
  */
case class Respbond_repo_zh_tickResponse(
  `p_cheng2jiao1shi2jian1`: String,
  `p_cheng2jiao1jia4ge2`: Double,
  `p_jia4ge2bian4dong4`: Double,
  `p_cheng2jiao1liang4shou3`: Double,
  `p_cheng2jiao1e2yuan2`: Double,
  `p_xing4zhi4`: String
)

case class bond_repo_zh_tickResponse(
  `p_cheng2jiao1shi2jian1`: String,
  `p_cheng2jiao1jia4ge2`: Double,
  `p_jia4ge2bian4dong4`: Double,
  `p_cheng2jiao1liang4shou3`: Double,
  `p_cheng2jiao1e2yuan2`: Double,
  `p_xing4zhi4`: String
)

trait Json_bond_repo_zh_tickResponse {

  implicit val a_bond_repo_zh_tickResponse = new Decoder[bond_repo_zh_tickResponse] {
    final def apply(c: HCursor): Decoder.Result[bond_repo_zh_tickResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_cheng2jiao1shi2jian1 <- c.downField("成交时间").as[String]

        p_cheng2jiao1jia4ge2 <- c.downField("成交价格").as[Double]

        p_jia4ge2bian4dong4 <- c.downField("价格变动").as[Double]

        p_cheng2jiao1liang4shou3 <- c.downField("成交量(手)").as[Double]

        p_cheng2jiao1e2yuan2 <- c.downField("成交额(元)").as[Double]

        p_xing4zhi4 <- c.downField("性质").as[String]

      } yield {
        bond_repo_zh_tickResponse(
          p_cheng2jiao1shi2jian1,
          p_cheng2jiao1jia4ge2,
          p_jia4ge2bian4dong4,
          p_cheng2jiao1liang4shou3,
          p_cheng2jiao1e2yuan2,
          p_xing4zhi4
        )
      }
  }

}

object JsonItem_bond_repo_zh_tickResponse extends Json_bond_repo_zh_tickResponse
