package com.onectrm.akshare.api.generated.option;

import com.onectrm.akshare.api.generated.option.option_commodity_contract_sinaResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: option 接口: option_commodity_contract_sina 目标地址:
  * https://stock.finance.sina.com.cn/futures/view/optionsDP.php 描述: 新浪财经-商品期权当前在交易的合约 限量: 单次返回指定
  * symbol 的所有合约数据
  */
case class Respoption_commodity_contract_sinaResponse(
  `p_xu4hao4`: Long,
  `p_he2yue1`: String
)

case class option_commodity_contract_sinaResponse(
  `p_xu4hao4`: Long,
  `p_he2yue1`: String
)

trait Json_option_commodity_contract_sinaResponse {

  implicit val a_option_commodity_contract_sinaResponse =
    new Decoder[option_commodity_contract_sinaResponse] {
      final def apply(c: HCursor): Decoder.Result[option_commodity_contract_sinaResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_xu4hao4 <- c.downField("序号").as[Long]

          p_he2yue1 <- c.downField("合约").as[String]

        } yield {
          option_commodity_contract_sinaResponse(
            p_xu4hao4,
            p_he2yue1
          )
        }
    }

}

object JsonItem_option_commodity_contract_sinaResponse
    extends Json_option_commodity_contract_sinaResponse
