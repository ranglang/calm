package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_register_dbResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_register_db 目标地址: http://data.eastmoney.com/xg/cyb/ 描述:
  * 东方财富网-数据中心-新股数据-注册制审核-达标企业 限量: 单次返回所有历史数据
  */
case class Respstock_register_dbResponse(
  `p_xu4hao4`: Long,
  `p_qi3ye4ming2cheng1`: String,
  `p_jing1ying2fan4wei2`: String,
  `p_jin4san1nian2ying2ye4shou1ru42019`: Double,
  `p_jin4san1nian2jing4li4run42019`: Double,
  `p_jin4san1nian2yan2fa1fei4yong42019`: String,
  `p_jin4san1nian2ying2ye4shou1ru42018`: Double,
  `p_jin4san1nian2jing4li4run42018`: Double,
  `p_jin4san1nian2yan2fa1fei4yong42018`: String,
  `p_jin4san1nian2ying2ye4shou1ru42017`: String,
  `p_jin4san1nian2jing4li4run42017`: String,
  `p_jin4san1nian2yan2fa1fei4yong42017`: String,
  `p_jin4liang3nian2lei3ji4jing4li4run4`: Double
)

case class stock_register_dbResponse(
  `p_xu4hao4`: Long,
  `p_qi3ye4ming2cheng1`: String,
  `p_jing1ying2fan4wei2`: String,
  `p_jin4san1nian2ying2ye4shou1ru42019`: Double,
  `p_jin4san1nian2jing4li4run42019`: Double,
  `p_jin4san1nian2yan2fa1fei4yong42019`: String,
  `p_jin4san1nian2ying2ye4shou1ru42018`: Double,
  `p_jin4san1nian2jing4li4run42018`: Double,
  `p_jin4san1nian2yan2fa1fei4yong42018`: String,
  `p_jin4san1nian2ying2ye4shou1ru42017`: String,
  `p_jin4san1nian2jing4li4run42017`: String,
  `p_jin4san1nian2yan2fa1fei4yong42017`: String,
  `p_jin4liang3nian2lei3ji4jing4li4run4`: Double
)

trait Json_stock_register_dbResponse {

  implicit val a_stock_register_dbResponse = new Decoder[stock_register_dbResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_register_dbResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_xu4hao4 <- c.downField("序号").as[Long]

        p_qi3ye4ming2cheng1 <- c.downField("企业名称").as[String]

        p_jing1ying2fan4wei2 <- c.downField("经营范围").as[String]

        p_jin4san1nian2ying2ye4shou1ru42019 <- c.downField("近三年营业收入-2019").as[Double]

        p_jin4san1nian2jing4li4run42019 <- c.downField("近三年净利润-2019").as[Double]

        p_jin4san1nian2yan2fa1fei4yong42019 <- c.downField("近三年研发费用-2019").as[String]

        p_jin4san1nian2ying2ye4shou1ru42018 <- c.downField("近三年营业收入-2018").as[Double]

        p_jin4san1nian2jing4li4run42018 <- c.downField("近三年净利润-2018").as[Double]

        p_jin4san1nian2yan2fa1fei4yong42018 <- c.downField("近三年研发费用-2018").as[String]

        p_jin4san1nian2ying2ye4shou1ru42017 <- c.downField("近三年营业收入-2017").as[String]

        p_jin4san1nian2jing4li4run42017 <- c.downField("近三年净利润-2017").as[String]

        p_jin4san1nian2yan2fa1fei4yong42017 <- c.downField("近三年研发费用-2017").as[String]

        p_jin4liang3nian2lei3ji4jing4li4run4 <- c.downField("近两年累计净利润").as[Double]

      } yield {
        stock_register_dbResponse(
          p_xu4hao4,
          p_qi3ye4ming2cheng1,
          p_jing1ying2fan4wei2,
          p_jin4san1nian2ying2ye4shou1ru42019,
          p_jin4san1nian2jing4li4run42019,
          p_jin4san1nian2yan2fa1fei4yong42019,
          p_jin4san1nian2ying2ye4shou1ru42018,
          p_jin4san1nian2jing4li4run42018,
          p_jin4san1nian2yan2fa1fei4yong42018,
          p_jin4san1nian2ying2ye4shou1ru42017,
          p_jin4san1nian2jing4li4run42017,
          p_jin4san1nian2yan2fa1fei4yong42017,
          p_jin4liang3nian2lei3ji4jing4li4run4
        )
      }
  }

}

object JsonItem_stock_register_dbResponse extends Json_stock_register_dbResponse
