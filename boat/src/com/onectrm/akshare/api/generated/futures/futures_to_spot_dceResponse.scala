package com.onectrm.akshare.api.generated.futures;

import com.onectrm.akshare.api.generated.futures.futures_to_spot_dceResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: futures 接口: futures_to_spot_dce 目标地址:
  * http://www.dce.com.cn/dalianshangpin/xqsj/tjsj26/jgtj/qzxcx/index.html 描述: 提供大连商品交易所-期转现统计数据 限量:
  * 单次返回指定交易日的期转现统计数据
  */
case class Respfutures_to_spot_dceResponse(
  `p_he2yue1dai4ma3`: String,
  `p_qi1zhuan3xian4fa1sheng1ri4qi1`: String,
  `p_qi1zhuan3xian4shu4liang4`: String
)

case class futures_to_spot_dceResponse(
  `p_he2yue1dai4ma3`: String,
  `p_qi1zhuan3xian4fa1sheng1ri4qi1`: String,
  `p_qi1zhuan3xian4shu4liang4`: String
)

trait Json_futures_to_spot_dceResponse {

  implicit val a_futures_to_spot_dceResponse = new Decoder[futures_to_spot_dceResponse] {
    final def apply(c: HCursor): Decoder.Result[futures_to_spot_dceResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_he2yue1dai4ma3 <- c.downField("合约代码").as[String]

        p_qi1zhuan3xian4fa1sheng1ri4qi1 <- c.downField("期转现发生日期").as[String]

        p_qi1zhuan3xian4shu4liang4 <- c.downField("期转现数量").as[String]

      } yield {
        futures_to_spot_dceResponse(
          p_he2yue1dai4ma3,
          p_qi1zhuan3xian4fa1sheng1ri4qi1,
          p_qi1zhuan3xian4shu4liang4
        )
      }
  }

}

object JsonItem_futures_to_spot_dceResponse extends Json_futures_to_spot_dceResponse
