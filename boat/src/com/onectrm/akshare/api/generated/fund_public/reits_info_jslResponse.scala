package com.onectrm.akshare.api.generated.fund_public;

import com.onectrm.akshare.api.generated.fund_public.reits_info_jslResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: fund_public 接口: reits_info_jsl 目标地址: https://www.jisilu.cn/data/cnreits/#CnReits 描述:
  * 集思录-实时数据-REITs-A股 REITs 限量: 单次返回所有 REITs 的基本信息数据
  */
case class Respreits_info_jslResponse(
  `p_dai4ma3`: String,
  `p_jian3cheng1`: String,
  `p_xian4jia4`: Double,
  `p_zhang3fu2`: Double,
  `p_cheng2jiao1e2`: Double,
  `p_jing4zhi2`: Double,
  `p_jing4zhi2ri4qi1`: String,
  `p_zhe2jia4lu4`: Double,
  `p_gui1mo2`: Double,
  `p_dao4qi1ri4`: String,
  `p_sheng4yu2nian2xian4`: Double,
  `p_quan2cheng1`: String,
  `p_xiang4mu4lei4xing2`: String,
  `p_ji1jin1gong1si1`: String
)

case class reits_info_jslResponse(
  `p_dai4ma3`: String,
  `p_jian3cheng1`: String,
  `p_xian4jia4`: Double,
  `p_zhang3fu2`: Double,
  `p_cheng2jiao1e2`: Double,
  `p_jing4zhi2`: Double,
  `p_jing4zhi2ri4qi1`: String,
  `p_zhe2jia4lu4`: Double,
  `p_gui1mo2`: Double,
  `p_dao4qi1ri4`: String,
  `p_sheng4yu2nian2xian4`: Double,
  `p_quan2cheng1`: String,
  `p_xiang4mu4lei4xing2`: String,
  `p_ji1jin1gong1si1`: String
)

trait Json_reits_info_jslResponse {

  implicit val a_reits_info_jslResponse = new Decoder[reits_info_jslResponse] {
    final def apply(c: HCursor): Decoder.Result[reits_info_jslResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_dai4ma3 <- c.downField("代码").as[String]

        p_jian3cheng1 <- c.downField("简称").as[String]

        p_xian4jia4 <- c.downField("现价").as[Double]

        p_zhang3fu2 <- c.downField("涨幅").as[Double]

        p_cheng2jiao1e2 <- c.downField("成交额").as[Double]

        p_jing4zhi2 <- c.downField("净值").as[Double]

        p_jing4zhi2ri4qi1 <- c.downField("净值日期").as[String]

        p_zhe2jia4lu4 <- c.downField("折价率").as[Double]

        p_gui1mo2 <- c.downField("规模").as[Double]

        p_dao4qi1ri4 <- c.downField("到期日").as[String]

        p_sheng4yu2nian2xian4 <- c.downField("剩余年限").as[Double]

        p_quan2cheng1 <- c.downField("全称").as[String]

        p_xiang4mu4lei4xing2 <- c.downField("项目类型").as[String]

        p_ji1jin1gong1si1 <- c.downField("基金公司").as[String]

      } yield {
        reits_info_jslResponse(
          p_dai4ma3,
          p_jian3cheng1,
          p_xian4jia4,
          p_zhang3fu2,
          p_cheng2jiao1e2,
          p_jing4zhi2,
          p_jing4zhi2ri4qi1,
          p_zhe2jia4lu4,
          p_gui1mo2,
          p_dao4qi1ri4,
          p_sheng4yu2nian2xian4,
          p_quan2cheng1,
          p_xiang4mu4lei4xing2,
          p_ji1jin1gong1si1
        )
      }
  }

}

object JsonItem_reits_info_jslResponse extends Json_reits_info_jslResponse
