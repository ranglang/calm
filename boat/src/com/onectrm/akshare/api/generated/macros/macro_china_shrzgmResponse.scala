package com.onectrm.akshare.api.generated.macros;

import com.onectrm.akshare.api.generated.macros.macro_china_shrzgmResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: macro 接口: macro_china_shrzgm 目标地址: http://data.mofcom.gov.cn/gnmy/shrzgm.shtml 描述:
  * 商务数据中心-国内贸易-社会融资规模增量统计, 数据区间从 201501-至今 限量: 单次返回所有历史数据
  */
case class Respmacro_china_shrzgmResponse(
  `p_yue4fen4`: String,
  `p_she4hui4rong2zi1gui1mo2zeng1liang4`: Double,
  `p_qi2zhong1ren2min2bi4dai4kuan3`: Double,
  `p_qi2zhong1wei3tuo1dai4kuan3wai4bi4dai4kuan3`: Double,
  `p_qi2zhong1wei3tuo1dai4kuan3`: Double,
  `p_qi2zhong1xin4tuo1dai4kuan3`: Double,
  `p_qi2zhong1wei4tie1xian4yin2xing2cheng2dui4hui4piao4`: Double,
  `p_qi2zhong1qi3ye4zhai4quan4`: Double,
  `p_qi2zhong1fei1jin1rong2qi3ye4jing4nei4gu3piao4rong2zi1`: Double
)

case class macro_china_shrzgmResponse(
  `p_yue4fen4`: String,
  `p_she4hui4rong2zi1gui1mo2zeng1liang4`: Double,
  `p_qi2zhong1ren2min2bi4dai4kuan3`: Double,
  `p_qi2zhong1wei3tuo1dai4kuan3wai4bi4dai4kuan3`: Double,
  `p_qi2zhong1wei3tuo1dai4kuan3`: Double,
  `p_qi2zhong1xin4tuo1dai4kuan3`: Double,
  `p_qi2zhong1wei4tie1xian4yin2xing2cheng2dui4hui4piao4`: Double,
  `p_qi2zhong1qi3ye4zhai4quan4`: Double,
  `p_qi2zhong1fei1jin1rong2qi3ye4jing4nei4gu3piao4rong2zi1`: Double
)

trait Json_macro_china_shrzgmResponse {

  implicit val a_macro_china_shrzgmResponse = new Decoder[macro_china_shrzgmResponse] {
    final def apply(c: HCursor): Decoder.Result[macro_china_shrzgmResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_yue4fen4 <- c.downField("月份").as[String]

        p_she4hui4rong2zi1gui1mo2zeng1liang4 <- c.downField("社会融资规模增量").as[Double]

        p_qi2zhong1ren2min2bi4dai4kuan3 <- c.downField("其中-人民币贷款").as[Double]

        p_qi2zhong1wei3tuo1dai4kuan3wai4bi4dai4kuan3 <- c.downField("其中-委托贷款外币贷款").as[Double]

        p_qi2zhong1wei3tuo1dai4kuan3 <- c.downField("其中-委托贷款").as[Double]

        p_qi2zhong1xin4tuo1dai4kuan3 <- c.downField("其中-信托贷款").as[Double]

        p_qi2zhong1wei4tie1xian4yin2xing2cheng2dui4hui4piao4 <- c
          .downField("其中-未贴现银行承兑汇票")
          .as[Double]

        p_qi2zhong1qi3ye4zhai4quan4 <- c.downField("其中-企业债券").as[Double]

        p_qi2zhong1fei1jin1rong2qi3ye4jing4nei4gu3piao4rong2zi1 <- c
          .downField("其中-非金融企业境内股票融资")
          .as[Double]

      } yield {
        macro_china_shrzgmResponse(
          p_yue4fen4,
          p_she4hui4rong2zi1gui1mo2zeng1liang4,
          p_qi2zhong1ren2min2bi4dai4kuan3,
          p_qi2zhong1wei3tuo1dai4kuan3wai4bi4dai4kuan3,
          p_qi2zhong1wei3tuo1dai4kuan3,
          p_qi2zhong1xin4tuo1dai4kuan3,
          p_qi2zhong1wei4tie1xian4yin2xing2cheng2dui4hui4piao4,
          p_qi2zhong1qi3ye4zhai4quan4,
          p_qi2zhong1fei1jin1rong2qi3ye4jing4nei4gu3piao4rong2zi1
        )
      }
  }

}

object JsonItem_macro_china_shrzgmResponse extends Json_macro_china_shrzgmResponse
