package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_comment_emResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_comment_em 目标地址: http://data.eastmoney.com/stockcomment/ 描述:
  * 东方财富网-数据中心-特色数据-千股千评 限量: 单次获取所有数据
  */
case class Respstock_comment_emResponse(
  `p_xu4hao4`: Integer,
  `p_dai4ma3`: String,
  `p_ming2cheng1`: String,
  `p_zui4xin1jia4`: Double,
  `p_zhang3die1fu2`: Double,
  `p_huan4shou3lu4`: Double,
  `p_shi4ying2lu4`: Double,
  `p_zhu3li4cheng2ben3`: Double,
  `p_ji1gou4can1yu3du4`: Double,
  `p_zong1he2de2fen1`: Double,
  `p_shang4sheng1`: Integer,
  `p_mu4qian2pai2ming2`: Integer,
  `p_guan1zhu4zhi3shu4`: Double,
  `p_jiao1yi4ri4`: Double
)

case class stock_comment_emResponse(
  `p_xu4hao4`: Integer,
  `p_dai4ma3`: String,
  `p_ming2cheng1`: String,
  `p_zui4xin1jia4`: Double,
  `p_zhang3die1fu2`: Double,
  `p_huan4shou3lu4`: Double,
  `p_shi4ying2lu4`: Double,
  `p_zhu3li4cheng2ben3`: Double,
  `p_ji1gou4can1yu3du4`: Double,
  `p_zong1he2de2fen1`: Double,
  `p_shang4sheng1`: Integer,
  `p_mu4qian2pai2ming2`: Integer,
  `p_guan1zhu4zhi3shu4`: Double,
  `p_jiao1yi4ri4`: Double
)

trait Json_stock_comment_emResponse {

  implicit val a_stock_comment_emResponse = new Decoder[stock_comment_emResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_comment_emResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_xu4hao4 <- c.downField("序号").as[Integer]

        p_dai4ma3 <- c.downField("代码").as[String]

        p_ming2cheng1 <- c.downField("名称").as[String]

        p_zui4xin1jia4 <- c.downField("最新价").as[Double]

        p_zhang3die1fu2 <- c.downField("涨跌幅").as[Double]

        p_huan4shou3lu4 <- c.downField("换手率").as[Double]

        p_shi4ying2lu4 <- c.downField("市盈率").as[Double]

        p_zhu3li4cheng2ben3 <- c.downField("主力成本").as[Double]

        p_ji1gou4can1yu3du4 <- c.downField("机构参与度").as[Double]

        p_zong1he2de2fen1 <- c.downField("综合得分").as[Double]

        p_shang4sheng1 <- c.downField("上升").as[Integer]

        p_mu4qian2pai2ming2 <- c.downField("目前排名").as[Integer]

        p_guan1zhu4zhi3shu4 <- c.downField("关注指数").as[Double]

        p_jiao1yi4ri4 <- c.downField("交易日").as[Double]

      } yield {
        stock_comment_emResponse(
          p_xu4hao4,
          p_dai4ma3,
          p_ming2cheng1,
          p_zui4xin1jia4,
          p_zhang3die1fu2,
          p_huan4shou3lu4,
          p_shi4ying2lu4,
          p_zhu3li4cheng2ben3,
          p_ji1gou4can1yu3du4,
          p_zong1he2de2fen1,
          p_shang4sheng1,
          p_mu4qian2pai2ming2,
          p_guan1zhu4zhi3shu4,
          p_jiao1yi4ri4
        )
      }
  }

}

object JsonItem_stock_comment_emResponse extends Json_stock_comment_emResponse
