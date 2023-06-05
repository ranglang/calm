package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_rank_forecast_cninfoResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_rank_forecast_cninfo 目标地址:
  * http://webapi.cninfo.com.cn/#/thematicStatistics?name=%E6%8A%95%E8%B5%84%E8%AF%84%E7%BA%A7 描述:
  * 巨潮资讯-数据中心-评级预测-投资评级 限量: 单次获取指定交易日的所有数据
  */
case class Respstock_rank_forecast_cninfoResponse(
  `p_zheng4quan4dai4ma3`: String,
  `p_zheng4quan4jian3cheng1`: String,
  `p_fa1bu4ri4qi1`: String,
  `p_yan2jiu1ji1gou4jian3cheng1`: String,
  `p_yan2jiu1yuan2ming2cheng1`: String,
  `p_tou2zi1ping2ji2`: String,
  `p_shi4fou3shou3ci4ping2ji2`: String,
  `p_ping2ji2bian4hua4`: String,
  `p_qian2yi1ci4tou2zi1ping2ji2`: String,
  `p_mu4biao1jia4ge2xia4xian4`: Double,
  `p_mu4biao1jia4ge2shang4xian4`: Double
)

case class stock_rank_forecast_cninfoResponse(
  `p_zheng4quan4dai4ma3`: String,
  `p_zheng4quan4jian3cheng1`: String,
  `p_fa1bu4ri4qi1`: String,
  `p_yan2jiu1ji1gou4jian3cheng1`: String,
  `p_yan2jiu1yuan2ming2cheng1`: String,
  `p_tou2zi1ping2ji2`: String,
  `p_shi4fou3shou3ci4ping2ji2`: String,
  `p_ping2ji2bian4hua4`: String,
  `p_qian2yi1ci4tou2zi1ping2ji2`: String,
  `p_mu4biao1jia4ge2xia4xian4`: Double,
  `p_mu4biao1jia4ge2shang4xian4`: Double
)

trait Json_stock_rank_forecast_cninfoResponse {

  implicit val a_stock_rank_forecast_cninfoResponse =
    new Decoder[stock_rank_forecast_cninfoResponse] {
      final def apply(c: HCursor): Decoder.Result[stock_rank_forecast_cninfoResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_zheng4quan4dai4ma3 <- c.downField("证券代码").as[String]

          p_zheng4quan4jian3cheng1 <- c.downField("证券简称").as[String]

          p_fa1bu4ri4qi1 <- c.downField("发布日期").as[String]

          p_yan2jiu1ji1gou4jian3cheng1 <- c.downField("研究机构简称").as[String]

          p_yan2jiu1yuan2ming2cheng1 <- c.downField("研究员名称").as[String]

          p_tou2zi1ping2ji2 <- c.downField("投资评级").as[String]

          p_shi4fou3shou3ci4ping2ji2 <- c.downField("是否首次评级").as[String]

          p_ping2ji2bian4hua4 <- c.downField("评级变化").as[String]

          p_qian2yi1ci4tou2zi1ping2ji2 <- c.downField("前一次投资评级").as[String]

          p_mu4biao1jia4ge2xia4xian4 <- c.downField("目标价格-下限").as[Double]

          p_mu4biao1jia4ge2shang4xian4 <- c.downField("目标价格-上限").as[Double]

        } yield {
          stock_rank_forecast_cninfoResponse(
            p_zheng4quan4dai4ma3,
            p_zheng4quan4jian3cheng1,
            p_fa1bu4ri4qi1,
            p_yan2jiu1ji1gou4jian3cheng1,
            p_yan2jiu1yuan2ming2cheng1,
            p_tou2zi1ping2ji2,
            p_shi4fou3shou3ci4ping2ji2,
            p_ping2ji2bian4hua4,
            p_qian2yi1ci4tou2zi1ping2ji2,
            p_mu4biao1jia4ge2xia4xian4,
            p_mu4biao1jia4ge2shang4xian4
          )
        }
    }

}

object JsonItem_stock_rank_forecast_cninfoResponse extends Json_stock_rank_forecast_cninfoResponse
