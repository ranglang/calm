package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_board_concept_name_thsResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_board_concept_name_ths 目标地址: http://q.10jqka.com.cn/gn/detail/code/301558/
  * 描述: 同花顺-板块-概念板块-概念 限量: 单次返回当前所有概念时间表数据
  */
case class Respstock_board_concept_name_thsResponse(
  `p_ri4qi1`: String,
  `p_gai4nian4ming2cheng1`: String,
  `p_cheng2fen1gu3shu4liang4`: Integer,
  `p_wang3zhi3`: String,
  `p_dai4ma3`: String
)

case class stock_board_concept_name_thsResponse(
  `p_ri4qi1`: String,
  `p_gai4nian4ming2cheng1`: String,
  `p_cheng2fen1gu3shu4liang4`: Integer,
  `p_wang3zhi3`: String,
  `p_dai4ma3`: String
)

trait Json_stock_board_concept_name_thsResponse {

  implicit val a_stock_board_concept_name_thsResponse =
    new Decoder[stock_board_concept_name_thsResponse] {
      final def apply(c: HCursor): Decoder.Result[stock_board_concept_name_thsResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_ri4qi1 <- c.downField("日期").as[String]

          p_gai4nian4ming2cheng1 <- c.downField("概念名称").as[String]

          p_cheng2fen1gu3shu4liang4 <- c.downField("成分股数量").as[Integer]

          p_wang3zhi3 <- c.downField("网址").as[String]

          p_dai4ma3 <- c.downField("代码").as[String]

        } yield {
          stock_board_concept_name_thsResponse(
            p_ri4qi1,
            p_gai4nian4ming2cheng1,
            p_cheng2fen1gu3shu4liang4,
            p_wang3zhi3,
            p_dai4ma3
          )
        }
    }

}

object JsonItem_stock_board_concept_name_thsResponse
    extends Json_stock_board_concept_name_thsResponse
