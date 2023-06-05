package com.onectrm.akshare.api.generated.bond;

import com.onectrm.akshare.api.generated.bond.bond_china_yieldResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: bond 接口: bond_china_yield 目标地址:
  * http://yield.chinabond.com.cn/cbweb-pbc-web/pbc/historyQuery?startDate=2019-02-07&amp;endDate=2020-02-04&amp;gjqx=0&amp;qxId=ycqx&amp;locale=cn_ZH
  * 描述: 中国债券信息网-国债及其他债券收益率曲线 限量: 单次返回所有指定日期间 start_date 到 end_date 需要小于一年的所有数据
  */
case class Respbond_china_yieldResponse(
  `p_qu3xian4ming2cheng1`: String,
  `p_ri4qi1`: String,
  `p_3yue4`: Double,
  `p_6yue4`: Double,
  `p_1nian2`: Double,
  `p_3nian2`: Double,
  `p_5nian2`: Double,
  `p_7nian2`: Double,
  `p_10nian2`: Double,
  `p_30nian2`: Double
)

case class bond_china_yieldResponse(
  `p_qu3xian4ming2cheng1`: String,
  `p_ri4qi1`: String,
  `p_3yue4`: Double,
  `p_6yue4`: Double,
  `p_1nian2`: Double,
  `p_3nian2`: Double,
  `p_5nian2`: Double,
  `p_7nian2`: Double,
  `p_10nian2`: Double,
  `p_30nian2`: Double
)

trait Json_bond_china_yieldResponse {

  implicit val a_bond_china_yieldResponse = new Decoder[bond_china_yieldResponse] {
    final def apply(c: HCursor): Decoder.Result[bond_china_yieldResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_qu3xian4ming2cheng1 <- c.downField("曲线名称").as[String]

        p_ri4qi1 <- c.downField("日期").as[String]

        p_3yue4 <- c.downField("3月").as[Double]

        p_6yue4 <- c.downField("6月").as[Double]

        p_1nian2 <- c.downField("1年").as[Double]

        p_3nian2 <- c.downField("3年").as[Double]

        p_5nian2 <- c.downField("5年").as[Double]

        p_7nian2 <- c.downField("7年").as[Double]

        p_10nian2 <- c.downField("10年").as[Double]

        p_30nian2 <- c.downField("30年").as[Double]

      } yield {
        bond_china_yieldResponse(
          p_qu3xian4ming2cheng1,
          p_ri4qi1,
          p_3yue4,
          p_6yue4,
          p_1nian2,
          p_3nian2,
          p_5nian2,
          p_7nian2,
          p_10nian2,
          p_30nian2
        )
      }
  }

}

object JsonItem_bond_china_yieldResponse extends Json_bond_china_yieldResponse
