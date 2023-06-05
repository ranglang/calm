package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_average_position_leguResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_average_position_legu 目标地址:
  * https://www.legulegu.com/stockdata/averageposition 描述: 乐咕乐股网-调查平均持仓数据; 该数据近期未更新 限量: 单次返回所有平均持仓数据
  */
case class Respstock_average_position_leguResponse(
  `p_ri4qi1`: String,
  `p_shang4zheng4zhi3shu4`: Double,
  `p_man3cang1rong2zi1`: Integer,
  `p_8099`: Integer,
  `p_6079`: Integer,
  `p_4059`: Integer,
  `p_2039`: Integer,
  `p_019`: Integer,
  `p_ping2jun1chi2cang1`: Integer
)

case class stock_average_position_leguResponse(
  `p_ri4qi1`: String,
  `p_shang4zheng4zhi3shu4`: Double,
  `p_man3cang1rong2zi1`: Integer,
  `p_8099`: Integer,
  `p_6079`: Integer,
  `p_4059`: Integer,
  `p_2039`: Integer,
  `p_019`: Integer,
  `p_ping2jun1chi2cang1`: Integer
)

trait Json_stock_average_position_leguResponse {

  implicit val a_stock_average_position_leguResponse =
    new Decoder[stock_average_position_leguResponse] {
      final def apply(c: HCursor): Decoder.Result[stock_average_position_leguResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_ri4qi1 <- c.downField("日期").as[String]

          p_shang4zheng4zhi3shu4 <- c.downField("上证指数").as[Double]

          p_man3cang1rong2zi1 <- c.downField("满仓+融资").as[Integer]

          p_8099 <- c.downField("80%~99%").as[Integer]

          p_6079 <- c.downField("60%~79%").as[Integer]

          p_4059 <- c.downField("40%~59%").as[Integer]

          p_2039 <- c.downField("20%~39%").as[Integer]

          p_019 <- c.downField("0%~19%").as[Integer]

          p_ping2jun1chi2cang1 <- c.downField("平均持仓").as[Integer]

        } yield {
          stock_average_position_leguResponse(
            p_ri4qi1,
            p_shang4zheng4zhi3shu4,
            p_man3cang1rong2zi1,
            p_8099,
            p_6079,
            p_4059,
            p_2039,
            p_019,
            p_ping2jun1chi2cang1
          )
        }
    }

}

object JsonItem_stock_average_position_leguResponse extends Json_stock_average_position_leguResponse
