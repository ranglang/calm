package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_fund_flow_industryResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_fund_flow_industry 目标地址:
  * http://data.10jqka.com.cn/funds/hyzjl/#refCountId=data_55f13c2c_254 描述: 同花顺-数据中心-资金流向-行业资金流 限量:
  * 单次获取指定 symbol 的行业资金流数据
  */
case class Respstock_fund_flow_industryResponse(
  `p_xu4hao4`: Long,
  `p_xing2ye4`: String,
  `p_xing2ye4zhi3shu4`: Double,
  `p_xing2ye4zhang3die1fu2`: String,
  `p_liu2ru4zi1jin1`: Double,
  `p_liu2chu1zi1jin1`: Double,
  `p_jing4e2`: Double,
  `p_gong1si1jia1shu4`: Double,
  `p_ling3zhang3gu3`: String,
  `p_ling3zhang3gu3zhang3die1fu2`: String,
  `p_dang1qian2jia4`: Double
)

case class stock_fund_flow_industryResponse(
  `p_xu4hao4`: Long,
  `p_xing2ye4`: String,
  `p_xing2ye4zhi3shu4`: Double,
  `p_xing2ye4zhang3die1fu2`: String,
  `p_liu2ru4zi1jin1`: Double,
  `p_liu2chu1zi1jin1`: Double,
  `p_jing4e2`: Double,
  `p_gong1si1jia1shu4`: Double,
  `p_ling3zhang3gu3`: String,
  `p_ling3zhang3gu3zhang3die1fu2`: String,
  `p_dang1qian2jia4`: Double
)

trait Json_stock_fund_flow_industryResponse {

  implicit val a_stock_fund_flow_industryResponse = new Decoder[stock_fund_flow_industryResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_fund_flow_industryResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_xu4hao4 <- c.downField("序号").as[Long]

        p_xing2ye4 <- c.downField("行业").as[String]

        p_xing2ye4zhi3shu4 <- c.downField("行业指数").as[Double]

        p_xing2ye4zhang3die1fu2 <- c.downField("行业-涨跌幅").as[String]

        p_liu2ru4zi1jin1 <- c.downField("流入资金").as[Double]

        p_liu2chu1zi1jin1 <- c.downField("流出资金").as[Double]

        p_jing4e2 <- c.downField("净额").as[Double]

        p_gong1si1jia1shu4 <- c.downField("公司家数").as[Double]

        p_ling3zhang3gu3 <- c.downField("领涨股").as[String]

        p_ling3zhang3gu3zhang3die1fu2 <- c.downField("领涨股-涨跌幅").as[String]

        p_dang1qian2jia4 <- c.downField("当前价").as[Double]

      } yield {
        stock_fund_flow_industryResponse(
          p_xu4hao4,
          p_xing2ye4,
          p_xing2ye4zhi3shu4,
          p_xing2ye4zhang3die1fu2,
          p_liu2ru4zi1jin1,
          p_liu2chu1zi1jin1,
          p_jing4e2,
          p_gong1si1jia1shu4,
          p_ling3zhang3gu3,
          p_ling3zhang3gu3zhang3die1fu2,
          p_dang1qian2jia4
        )
      }
  }

}

object JsonItem_stock_fund_flow_industryResponse extends Json_stock_fund_flow_industryResponse
