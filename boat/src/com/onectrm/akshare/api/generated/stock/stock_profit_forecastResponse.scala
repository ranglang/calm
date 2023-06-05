package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_profit_forecastResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_profit_forecast 目标地址:
  * http://data.eastmoney.com/report/profitforecast.jshtml 描述: 东方财富网-数据中心-研究报告-盈利预测 限量: 单次返回所有历史数据
  */
case class Respstock_profit_forecastResponse(
  `p_xu4hao4`: Integer,
  `p_dai4ma3`: String,
  `p_ming2cheng1`: String,
  `p_yan2bao4shu4`: Integer,
  `p_ji1gou4tou2zi1ping2ji2jin4liu4ge4yue4mai3ru4`: Double,
  `p_ji1gou4tou2zi1ping2ji2jin4liu4ge4yue4zeng1chi2`: Double,
  `p_ji1gou4tou2zi1ping2ji2jin4liu4ge4yue4zhong1xing4`: Double,
  `p_ji1gou4tou2zi1ping2ji2jin4liu4ge4yue4jian3chi2`: Double,
  `p_ji1gou4tou2zi1ping2ji2jin4liu4ge4yue4mai4chu1`: Double
)

case class stock_profit_forecastResponse(
  `p_xu4hao4`: Integer,
  `p_dai4ma3`: String,
  `p_ming2cheng1`: String,
  `p_yan2bao4shu4`: Integer,
  `p_ji1gou4tou2zi1ping2ji2jin4liu4ge4yue4mai3ru4`: Double,
  `p_ji1gou4tou2zi1ping2ji2jin4liu4ge4yue4zeng1chi2`: Double,
  `p_ji1gou4tou2zi1ping2ji2jin4liu4ge4yue4zhong1xing4`: Double,
  `p_ji1gou4tou2zi1ping2ji2jin4liu4ge4yue4jian3chi2`: Double,
  `p_ji1gou4tou2zi1ping2ji2jin4liu4ge4yue4mai4chu1`: Double
)

trait Json_stock_profit_forecastResponse {

  implicit val a_stock_profit_forecastResponse = new Decoder[stock_profit_forecastResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_profit_forecastResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_xu4hao4 <- c.downField("序号").as[Integer]

        p_dai4ma3 <- c.downField("代码").as[String]

        p_ming2cheng1 <- c.downField("名称").as[String]

        p_yan2bao4shu4 <- c.downField("研报数").as[Integer]

        p_ji1gou4tou2zi1ping2ji2jin4liu4ge4yue4mai3ru4 <- c.downField("机构投资评级(近六个月)-买入").as[Double]

        p_ji1gou4tou2zi1ping2ji2jin4liu4ge4yue4zeng1chi2 <- c
          .downField("机构投资评级(近六个月)-增持")
          .as[Double]

        p_ji1gou4tou2zi1ping2ji2jin4liu4ge4yue4zhong1xing4 <- c
          .downField("机构投资评级(近六个月)-中性")
          .as[Double]

        p_ji1gou4tou2zi1ping2ji2jin4liu4ge4yue4jian3chi2 <- c
          .downField("机构投资评级(近六个月)-减持")
          .as[Double]

        p_ji1gou4tou2zi1ping2ji2jin4liu4ge4yue4mai4chu1 <- c.downField("机构投资评级(近六个月)-卖出").as[Double]

      } yield {
        stock_profit_forecastResponse(
          p_xu4hao4,
          p_dai4ma3,
          p_ming2cheng1,
          p_yan2bao4shu4,
          p_ji1gou4tou2zi1ping2ji2jin4liu4ge4yue4mai3ru4,
          p_ji1gou4tou2zi1ping2ji2jin4liu4ge4yue4zeng1chi2,
          p_ji1gou4tou2zi1ping2ji2jin4liu4ge4yue4zhong1xing4,
          p_ji1gou4tou2zi1ping2ji2jin4liu4ge4yue4jian3chi2,
          p_ji1gou4tou2zi1ping2ji2jin4liu4ge4yue4mai4chu1
        )
      }
  }

}

object JsonItem_stock_profit_forecastResponse extends Json_stock_profit_forecastResponse
