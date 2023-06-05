package com.onectrm.akshare.api.generated.futures;

import com.onectrm.akshare.api.generated.futures.futures_spot_stockResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: futures 接口: futures_spot_stock 目标地址: http://data.eastmoney.com/ifdata/xhgp.html 描述:
  * 东方财富网-数据中心-现货与股票 限量: 单次返回指定 indicator 的所有数据
  */
case class Respfutures_spot_stockResponse(
  `p_shang1pin3ming2cheng1`: String,
  `p_jin45yue4`: String,
  `p_jin44yue4`: String,
  `p_jin43yue4`: String,
  `p_jin42yue4`: String,
  `p_jin41yue4`: String,
  `p_zui4xin1jia4`: Double,
  `p_jin4ban4nian2zhang3die1fu2`: Double,
  `p_sheng1chan3shang1`: String,
  `p_xia4you2yong4hu4`: String
)

case class futures_spot_stockResponse(
  `p_shang1pin3ming2cheng1`: String,
  `p_jin45yue4`: String,
  `p_jin44yue4`: String,
  `p_jin43yue4`: String,
  `p_jin42yue4`: String,
  `p_jin41yue4`: String,
  `p_zui4xin1jia4`: Double,
  `p_jin4ban4nian2zhang3die1fu2`: Double,
  `p_sheng1chan3shang1`: String,
  `p_xia4you2yong4hu4`: String
)

trait Json_futures_spot_stockResponse {

  implicit val a_futures_spot_stockResponse = new Decoder[futures_spot_stockResponse] {
    final def apply(c: HCursor): Decoder.Result[futures_spot_stockResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_shang1pin3ming2cheng1 <- c.downField("商品名称").as[String]

        p_jin45yue4 <- c.downField("近5月").as[String]

        p_jin44yue4 <- c.downField("近4月").as[String]

        p_jin43yue4 <- c.downField("近3月").as[String]

        p_jin42yue4 <- c.downField("近2月").as[String]

        p_jin41yue4 <- c.downField("近1月").as[String]

        p_zui4xin1jia4 <- c.downField("最新价").as[Double]

        p_jin4ban4nian2zhang3die1fu2 <- c.downField("近半年涨跌幅").as[Double]

        p_sheng1chan3shang1 <- c.downField("生产商").as[String]

        p_xia4you2yong4hu4 <- c.downField("下游用户").as[String]

      } yield {
        futures_spot_stockResponse(
          p_shang1pin3ming2cheng1,
          p_jin45yue4,
          p_jin44yue4,
          p_jin43yue4,
          p_jin42yue4,
          p_jin41yue4,
          p_zui4xin1jia4,
          p_jin4ban4nian2zhang3die1fu2,
          p_sheng1chan3shang1,
          p_xia4you2yong4hu4
        )
      }
  }

}

object JsonItem_futures_spot_stockResponse extends Json_futures_spot_stockResponse
