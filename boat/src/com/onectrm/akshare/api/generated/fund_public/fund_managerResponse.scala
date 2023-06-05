package com.onectrm.akshare.api.generated.fund_public;

import com.onectrm.akshare.api.generated.fund_public.fund_managerResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: fund_public 接口: fund_manager 目标地址: http://fund.eastmoney.com/manager/default.html 描述:
  * 天天基金网-基金数据-基金经理大全 限量: 单次返回所有基金经理数据
  */
case class Respfund_managerResponse(
  `p_xu4hao4`: Long,
  `p_xing4ming2`: String,
  `p_suo3shu3gong1si1`: String,
  `p_xian4ren4ji1jin1`: String,
  `p_lei3ji4cong2ye4shi2jian1`: Integer,
  `p_xian4ren4ji1jin1zi1chan3zong3gui1mo2`: Double,
  `p_xian4ren4ji1jin1zui4jia1hui2bao4`: Double
)

case class fund_managerResponse(
  `p_xu4hao4`: Long,
  `p_xing4ming2`: String,
  `p_suo3shu3gong1si1`: String,
  `p_xian4ren4ji1jin1`: String,
  `p_lei3ji4cong2ye4shi2jian1`: Integer,
  `p_xian4ren4ji1jin1zi1chan3zong3gui1mo2`: Double,
  `p_xian4ren4ji1jin1zui4jia1hui2bao4`: Double
)

trait Json_fund_managerResponse {

  implicit val a_fund_managerResponse = new Decoder[fund_managerResponse] {
    final def apply(c: HCursor): Decoder.Result[fund_managerResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_xu4hao4 <- c.downField("序号").as[Long]

        p_xing4ming2 <- c.downField("姓名").as[String]

        p_suo3shu3gong1si1 <- c.downField("所属公司").as[String]

        p_xian4ren4ji1jin1 <- c.downField("现任基金").as[String]

        p_lei3ji4cong2ye4shi2jian1 <- c.downField("累计从业时间").as[Integer]

        p_xian4ren4ji1jin1zi1chan3zong3gui1mo2 <- c.downField("现任基金资产总规模").as[Double]

        p_xian4ren4ji1jin1zui4jia1hui2bao4 <- c.downField("现任基金最佳回报").as[Double]

      } yield {
        fund_managerResponse(
          p_xu4hao4,
          p_xing4ming2,
          p_suo3shu3gong1si1,
          p_xian4ren4ji1jin1,
          p_lei3ji4cong2ye4shi2jian1,
          p_xian4ren4ji1jin1zi1chan3zong3gui1mo2,
          p_xian4ren4ji1jin1zui4jia1hui2bao4
        )
      }
  }

}

object JsonItem_fund_managerResponse extends Json_fund_managerResponse
