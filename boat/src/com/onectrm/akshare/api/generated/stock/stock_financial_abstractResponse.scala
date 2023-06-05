package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_financial_abstractResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_financial_abstract 目标地址:
  * https://vip.stock.finance.sina.com.cn/corp/go.php/vFD_FinanceSummary/stockid/600004.phtml 描述:
  * 新浪财经-财务报表-财务摘要 限量: 单次获取财务摘要所有历史数据
  */
case class Respstock_financial_abstractResponse(
  `p_jie2zhi3ri4qi1`: String,
  `p_mei3gu3jing4zi1chan3tan1bo2qi1mo4gu3shu4`: String,
  `p_mei3gu3xian4jin1liu2`: String,
  `p_mei3gu3zi1ben3gong1ji1jin1`: String,
  `p_gu4ding4zi1chan3he2ji4`: String,
  `p_liu2dong4zi1chan3he2ji4`: String,
  `p_zi1chan3zong3ji4`: String,
  `p_zhang3qi1fu4zhai4he2ji4`: String,
  `p_zhu3ying2ye4wu4shou1ru4`: String,
  `p_cai2wu4fei4yong4`: String,
  `p_jing4li4run4`: String
)

case class stock_financial_abstractResponse(
  `p_jie2zhi3ri4qi1`: String,
  `p_mei3gu3jing4zi1chan3tan1bo2qi1mo4gu3shu4`: String,
  `p_mei3gu3xian4jin1liu2`: String,
  `p_mei3gu3zi1ben3gong1ji1jin1`: String,
  `p_gu4ding4zi1chan3he2ji4`: String,
  `p_liu2dong4zi1chan3he2ji4`: String,
  `p_zi1chan3zong3ji4`: String,
  `p_zhang3qi1fu4zhai4he2ji4`: String,
  `p_zhu3ying2ye4wu4shou1ru4`: String,
  `p_cai2wu4fei4yong4`: String,
  `p_jing4li4run4`: String
)

trait Json_stock_financial_abstractResponse {

  implicit val a_stock_financial_abstractResponse = new Decoder[stock_financial_abstractResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_financial_abstractResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_jie2zhi3ri4qi1 <- c.downField("截止日期").as[String]

        p_mei3gu3jing4zi1chan3tan1bo2qi1mo4gu3shu4 <- c.downField("每股净资产-摊薄/期末股数").as[String]

        p_mei3gu3xian4jin1liu2 <- c.downField("每股现金流").as[String]

        p_mei3gu3zi1ben3gong1ji1jin1 <- c.downField("每股资本公积金").as[String]

        p_gu4ding4zi1chan3he2ji4 <- c.downField("固定资产合计").as[String]

        p_liu2dong4zi1chan3he2ji4 <- c.downField("流动资产合计").as[String]

        p_zi1chan3zong3ji4 <- c.downField("资产总计").as[String]

        p_zhang3qi1fu4zhai4he2ji4 <- c.downField("长期负债合计").as[String]

        p_zhu3ying2ye4wu4shou1ru4 <- c.downField("主营业务收入").as[String]

        p_cai2wu4fei4yong4 <- c.downField("财务费用").as[String]

        p_jing4li4run4 <- c.downField("净利润").as[String]

      } yield {
        stock_financial_abstractResponse(
          p_jie2zhi3ri4qi1,
          p_mei3gu3jing4zi1chan3tan1bo2qi1mo4gu3shu4,
          p_mei3gu3xian4jin1liu2,
          p_mei3gu3zi1ben3gong1ji1jin1,
          p_gu4ding4zi1chan3he2ji4,
          p_liu2dong4zi1chan3he2ji4,
          p_zi1chan3zong3ji4,
          p_zhang3qi1fu4zhai4he2ji4,
          p_zhu3ying2ye4wu4shou1ru4,
          p_cai2wu4fei4yong4,
          p_jing4li4run4
        )
      }
  }

}

object JsonItem_stock_financial_abstractResponse extends Json_stock_financial_abstractResponse
