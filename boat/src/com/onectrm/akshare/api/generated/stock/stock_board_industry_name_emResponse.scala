package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_board_industry_name_emResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_board_industry_name_em 目标地址:
  * http://quote.eastmoney.com/center/boardlist.html#industry_board 描述: 东方财富-沪深京板块-行业板块 限量:
  * 单次返回当前时刻所有行业板块数据
  */
case class Respstock_board_industry_name_emResponse(
  `p_pai2ming2`: Integer,
  `p_ban3kuai4ming2cheng1`: String,
  `p_ban3kuai4dai4ma3`: String,
  `p_zui4xin1jia4`: Double,
  `p_zhang3die1e2`: Double,
  `p_zhang3die1fu2`: Double,
  `p_zong3shi4zhi2`: Integer,
  `p_huan4shou3lu4`: Double,
  `p_shang4zhang3jia1shu4`: Integer,
  `p_xia4die1jia1shu4`: Integer,
  `p_ling3zhang3gu3piao4`: String,
  `p_ling3zhang3gu3piao4zhang3die1fu2`: Double
)

case class stock_board_industry_name_emResponse(
  `p_pai2ming2`: Integer,
  `p_ban3kuai4ming2cheng1`: String,
  `p_ban3kuai4dai4ma3`: String,
  `p_zui4xin1jia4`: Double,
  `p_zhang3die1e2`: Double,
  `p_zhang3die1fu2`: Double,
  `p_zong3shi4zhi2`: Integer,
  `p_huan4shou3lu4`: Double,
  `p_shang4zhang3jia1shu4`: Integer,
  `p_xia4die1jia1shu4`: Integer,
  `p_ling3zhang3gu3piao4`: String,
  `p_ling3zhang3gu3piao4zhang3die1fu2`: Double
)

trait Json_stock_board_industry_name_emResponse {

  implicit val a_stock_board_industry_name_emResponse =
    new Decoder[stock_board_industry_name_emResponse] {
      final def apply(c: HCursor): Decoder.Result[stock_board_industry_name_emResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_pai2ming2 <- c.downField("排名").as[Integer]

          p_ban3kuai4ming2cheng1 <- c.downField("板块名称").as[String]

          p_ban3kuai4dai4ma3 <- c.downField("板块代码").as[String]

          p_zui4xin1jia4 <- c.downField("最新价").as[Double]

          p_zhang3die1e2 <- c.downField("涨跌额").as[Double]

          p_zhang3die1fu2 <- c.downField("涨跌幅").as[Double]

          p_zong3shi4zhi2 <- c.downField("总市值").as[Integer]

          p_huan4shou3lu4 <- c.downField("换手率").as[Double]

          p_shang4zhang3jia1shu4 <- c.downField("上涨家数").as[Integer]

          p_xia4die1jia1shu4 <- c.downField("下跌家数").as[Integer]

          p_ling3zhang3gu3piao4 <- c.downField("领涨股票").as[String]

          p_ling3zhang3gu3piao4zhang3die1fu2 <- c.downField("领涨股票-涨跌幅").as[Double]

        } yield {
          stock_board_industry_name_emResponse(
            p_pai2ming2,
            p_ban3kuai4ming2cheng1,
            p_ban3kuai4dai4ma3,
            p_zui4xin1jia4,
            p_zhang3die1e2,
            p_zhang3die1fu2,
            p_zong3shi4zhi2,
            p_huan4shou3lu4,
            p_shang4zhang3jia1shu4,
            p_xia4die1jia1shu4,
            p_ling3zhang3gu3piao4,
            p_ling3zhang3gu3piao4zhang3die1fu2
          )
        }
    }

}

object JsonItem_stock_board_industry_name_emResponse
    extends Json_stock_board_industry_name_emResponse
