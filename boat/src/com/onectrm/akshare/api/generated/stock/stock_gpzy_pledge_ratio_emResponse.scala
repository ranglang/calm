package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_gpzy_pledge_ratio_emResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_gpzy_pledge_ratio_em 目标地址: http://data.eastmoney.com/gpzy/pledgeRatio.aspx
  * 描述: 东方财富网-数据中心-特色数据-股权质押-上市公司质押比例 限量: 单次返回指定交易日的所有历史数据; 其中的交易日需要根据网站提供的为准; 请访问
  * http://data.eastmoney.com/gpzy/pledgeRatio.aspx 查询具体交易日
  */
case class Respstock_gpzy_pledge_ratio_emResponse(
  `p_xu4hao4`: Integer,
  `p_gu3piao4dai4ma3`: String,
  `p_gu3piao4jian3cheng1`: String,
  `p_jiao1yi4ri4qi1`: String,
  `p_suo3shu3xing2ye4`: String,
  `p_zhi4ya1bi3li4`: Double,
  `p_zhi4ya1gu3shu4`: Double,
  `p_zhi4ya1shi4zhi2`: Double,
  `p_zhi4ya1bi3shu4`: Double,
  `p_wu2xian4shou4gu3zhi4ya1shu4`: Double,
  `p_xian4shou4gu3zhi4ya1shu4`: Double,
  `p_jin4yi1nian2zhang3die1fu2`: Double
)

case class stock_gpzy_pledge_ratio_emResponse(
  `p_xu4hao4`: Integer,
  `p_gu3piao4dai4ma3`: String,
  `p_gu3piao4jian3cheng1`: String,
  `p_jiao1yi4ri4qi1`: String,
  `p_suo3shu3xing2ye4`: String,
  `p_zhi4ya1bi3li4`: Double,
  `p_zhi4ya1gu3shu4`: Double,
  `p_zhi4ya1shi4zhi2`: Double,
  `p_zhi4ya1bi3shu4`: Double,
  `p_wu2xian4shou4gu3zhi4ya1shu4`: Double,
  `p_xian4shou4gu3zhi4ya1shu4`: Double,
  `p_jin4yi1nian2zhang3die1fu2`: Double
)

trait Json_stock_gpzy_pledge_ratio_emResponse {

  implicit val a_stock_gpzy_pledge_ratio_emResponse =
    new Decoder[stock_gpzy_pledge_ratio_emResponse] {
      final def apply(c: HCursor): Decoder.Result[stock_gpzy_pledge_ratio_emResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_xu4hao4 <- c.downField("序号").as[Integer]

          p_gu3piao4dai4ma3 <- c.downField("股票代码").as[String]

          p_gu3piao4jian3cheng1 <- c.downField("股票简称").as[String]

          p_jiao1yi4ri4qi1 <- c.downField("交易日期").as[String]

          p_suo3shu3xing2ye4 <- c.downField("所属行业").as[String]

          p_zhi4ya1bi3li4 <- c.downField("质押比例").as[Double]

          p_zhi4ya1gu3shu4 <- c.downField("质押股数").as[Double]

          p_zhi4ya1shi4zhi2 <- c.downField("质押市值").as[Double]

          p_zhi4ya1bi3shu4 <- c.downField("质押笔数").as[Double]

          p_wu2xian4shou4gu3zhi4ya1shu4 <- c.downField("无限售股质押数").as[Double]

          p_xian4shou4gu3zhi4ya1shu4 <- c.downField("限售股质押数").as[Double]

          p_jin4yi1nian2zhang3die1fu2 <- c.downField("近一年涨跌幅").as[Double]

        } yield {
          stock_gpzy_pledge_ratio_emResponse(
            p_xu4hao4,
            p_gu3piao4dai4ma3,
            p_gu3piao4jian3cheng1,
            p_jiao1yi4ri4qi1,
            p_suo3shu3xing2ye4,
            p_zhi4ya1bi3li4,
            p_zhi4ya1gu3shu4,
            p_zhi4ya1shi4zhi2,
            p_zhi4ya1bi3shu4,
            p_wu2xian4shou4gu3zhi4ya1shu4,
            p_xian4shou4gu3zhi4ya1shu4,
            p_jin4yi1nian2zhang3die1fu2
          )
        }
    }

}

object JsonItem_stock_gpzy_pledge_ratio_emResponse extends Json_stock_gpzy_pledge_ratio_emResponse
