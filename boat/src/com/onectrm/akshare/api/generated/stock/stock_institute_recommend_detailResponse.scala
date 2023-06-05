package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_institute_recommend_detailResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_institute_recommend_detail 目标地址:
  * http://stock.finance.sina.com.cn/stock/go.php/vIR_StockSearch/key/sz000001.phtml 描述:
  * 新浪财经-机构推荐池-股票评级记录 限量: 单次获取新浪财经-机构推荐池-股票评级记录的所有数据
  */
case class Respstock_institute_recommend_detailResponse(
  `p_gu3piao4dai4ma3`: String,
  `p_gu3piao4ming2cheng1`: String,
  `p_mu4biao1jia4`: String,
  `p_zui4xin1ping2ji2`: String,
  `p_ping2ji2ji1gou4`: String,
  `p_fen1xi1shi1`: String,
  `p_xing2ye4`: String,
  `p_ping2ji2ri4qi1`: String
)

case class stock_institute_recommend_detailResponse(
  `p_gu3piao4dai4ma3`: String,
  `p_gu3piao4ming2cheng1`: String,
  `p_mu4biao1jia4`: String,
  `p_zui4xin1ping2ji2`: String,
  `p_ping2ji2ji1gou4`: String,
  `p_fen1xi1shi1`: String,
  `p_xing2ye4`: String,
  `p_ping2ji2ri4qi1`: String
)

trait Json_stock_institute_recommend_detailResponse {

  implicit val a_stock_institute_recommend_detailResponse =
    new Decoder[stock_institute_recommend_detailResponse] {
      final def apply(c: HCursor): Decoder.Result[stock_institute_recommend_detailResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_gu3piao4dai4ma3 <- c.downField("股票代码").as[String]

          p_gu3piao4ming2cheng1 <- c.downField("股票名称").as[String]

          p_mu4biao1jia4 <- c.downField("目标价").as[String]

          p_zui4xin1ping2ji2 <- c.downField("最新评级").as[String]

          p_ping2ji2ji1gou4 <- c.downField("评级机构").as[String]

          p_fen1xi1shi1 <- c.downField("分析师").as[String]

          p_xing2ye4 <- c.downField("行业").as[String]

          p_ping2ji2ri4qi1 <- c.downField("评级日期").as[String]

        } yield {
          stock_institute_recommend_detailResponse(
            p_gu3piao4dai4ma3,
            p_gu3piao4ming2cheng1,
            p_mu4biao1jia4,
            p_zui4xin1ping2ji2,
            p_ping2ji2ji1gou4,
            p_fen1xi1shi1,
            p_xing2ye4,
            p_ping2ji2ri4qi1
          )
        }
    }

}

object JsonItem_stock_institute_recommend_detailResponse
    extends Json_stock_institute_recommend_detailResponse
