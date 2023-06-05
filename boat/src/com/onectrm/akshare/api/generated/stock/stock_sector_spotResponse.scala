package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_sector_spotResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_sector_spot 目标地址: http://finance.sina.com.cn/stock/sl/ 描述: 新浪行业-板块行情 限量:
  * 单次获取指定的板块行情实时数据
  */
case class Respstock_sector_spotResponse(
  `p_label`: String,
  `p_ban3kuai4`: String,
  `p_gong1si1jia1shu4`: Integer,
  `p_ping2jun1jia4ge2`: Double,
  `p_zhang3die1e2`: Double,
  `p_zhang3die1fu2`: Double,
  `p_zong3cheng2jiao1liang4`: Integer,
  `p_zong3cheng2jiao1e2`: Integer,
  `p_gu3piao4dai4ma3`: String,
  `p_ge4gu3zhang3die1fu2`: Double,
  `p_ge4gu3dang1qian2jia4`: Double,
  `p_ge4gu3zhang3die1e2`: Double,
  `p_gu3piao4ming2cheng1`: String
)

case class stock_sector_spotResponse(
  `p_label`: String,
  `p_ban3kuai4`: String,
  `p_gong1si1jia1shu4`: Integer,
  `p_ping2jun1jia4ge2`: Double,
  `p_zhang3die1e2`: Double,
  `p_zhang3die1fu2`: Double,
  `p_zong3cheng2jiao1liang4`: Integer,
  `p_zong3cheng2jiao1e2`: Integer,
  `p_gu3piao4dai4ma3`: String,
  `p_ge4gu3zhang3die1fu2`: Double,
  `p_ge4gu3dang1qian2jia4`: Double,
  `p_ge4gu3zhang3die1e2`: Double,
  `p_gu3piao4ming2cheng1`: String
)

trait Json_stock_sector_spotResponse {

  implicit val a_stock_sector_spotResponse = new Decoder[stock_sector_spotResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_sector_spotResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_label <- c.downField("label").as[String]

        p_ban3kuai4 <- c.downField("板块").as[String]

        p_gong1si1jia1shu4 <- c.downField("公司家数").as[Integer]

        p_ping2jun1jia4ge2 <- c.downField("平均价格").as[Double]

        p_zhang3die1e2 <- c.downField("涨跌额").as[Double]

        p_zhang3die1fu2 <- c.downField("涨跌幅").as[Double]

        p_zong3cheng2jiao1liang4 <- c.downField("总成交量").as[Integer]

        p_zong3cheng2jiao1e2 <- c.downField("总成交额").as[Integer]

        p_gu3piao4dai4ma3 <- c.downField("股票代码").as[String]

        p_ge4gu3zhang3die1fu2 <- c.downField("个股-涨跌幅").as[Double]

        p_ge4gu3dang1qian2jia4 <- c.downField("个股-当前价").as[Double]

        p_ge4gu3zhang3die1e2 <- c.downField("个股-涨跌额").as[Double]

        p_gu3piao4ming2cheng1 <- c.downField("股票名称").as[String]

      } yield {
        stock_sector_spotResponse(
          p_label,
          p_ban3kuai4,
          p_gong1si1jia1shu4,
          p_ping2jun1jia4ge2,
          p_zhang3die1e2,
          p_zhang3die1fu2,
          p_zong3cheng2jiao1liang4,
          p_zong3cheng2jiao1e2,
          p_gu3piao4dai4ma3,
          p_ge4gu3zhang3die1fu2,
          p_ge4gu3dang1qian2jia4,
          p_ge4gu3zhang3die1e2,
          p_gu3piao4ming2cheng1
        )
      }
  }

}

object JsonItem_stock_sector_spotResponse extends Json_stock_sector_spotResponse
