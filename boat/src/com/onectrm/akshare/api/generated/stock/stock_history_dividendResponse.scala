package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_history_dividendResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_history_dividend 目标地址:
  * http://vip.stock.finance.sina.com.cn/q/go.php/vInvestConsult/kind/lsfh/index.phtml?p=1&amp;num=5000
  * 描述: 新浪财经-发行与分配-历史分红 限量: 单次获取所有股票的历史分红数据
  */
case class Respstock_history_dividendResponse(
  `p_dai4ma3`: String,
  `p_ming2cheng1`: String,
  `p_shang4shi4ri4qi1`: String,
  `p_lei3ji4gu3xi1`: Double,
  `p_nian2jun1gu3xi1`: Double,
  `p_fen1hong2ci4shu4`: Double,
  `p_rong2zi1zong3e2`: Double,
  `p_rong2zi1ci4shu4`: Double
)

case class stock_history_dividendResponse(
  `p_dai4ma3`: String,
  `p_ming2cheng1`: String,
  `p_shang4shi4ri4qi1`: String,
  `p_lei3ji4gu3xi1`: Double,
  `p_nian2jun1gu3xi1`: Double,
  `p_fen1hong2ci4shu4`: Double,
  `p_rong2zi1zong3e2`: Double,
  `p_rong2zi1ci4shu4`: Double
)

trait Json_stock_history_dividendResponse {

  implicit val a_stock_history_dividendResponse = new Decoder[stock_history_dividendResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_history_dividendResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_dai4ma3 <- c.downField("代码").as[String]

        p_ming2cheng1 <- c.downField("名称").as[String]

        p_shang4shi4ri4qi1 <- c.downField("上市日期").as[String]

        p_lei3ji4gu3xi1 <- c.downField("累计股息").as[Double]

        p_nian2jun1gu3xi1 <- c.downField("年均股息").as[Double]

        p_fen1hong2ci4shu4 <- c.downField("分红次数").as[Double]

        p_rong2zi1zong3e2 <- c.downField("融资总额").as[Double]

        p_rong2zi1ci4shu4 <- c.downField("融资次数").as[Double]

      } yield {
        stock_history_dividendResponse(
          p_dai4ma3,
          p_ming2cheng1,
          p_shang4shi4ri4qi1,
          p_lei3ji4gu3xi1,
          p_nian2jun1gu3xi1,
          p_fen1hong2ci4shu4,
          p_rong2zi1zong3e2,
          p_rong2zi1ci4shu4
        )
      }
  }

}

object JsonItem_stock_history_dividendResponse extends Json_stock_history_dividendResponse
