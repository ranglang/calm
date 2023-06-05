package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_new_ipo_cninfoResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_new_ipo_cninfo 目标地址: http://webapi.cninfo.com.cn/#/xinguList 描述:
  * 巨潮资讯-数据中心-新股数据-新股发行 限量: 单次获取近三年所有新股发行的数据
  */
case class Respstock_new_ipo_cninfoResponse(
  `p_zheng4juan4dai4ma3`: String,
  `p_zheng4quan4jian3cheng1`: String,
  `p_shang4shi4ri4qi1`: String,
  `p_shen1gou4ri4qi1`: String,
  `p_fa1xing2jia4`: Double,
  `p_zong3fa1xing2shu4liang4`: Double,
  `p_fa1xing2shi4ying2lu4`: Double,
  `p_shang4wang3fa1xing2zhong1qian1lu4`: Double,
  `p_yao2hao4jie2guo3gong1gao4ri4`: String,
  `p_zhong1qian1gong1gao4ri4`: String,
  `p_zhong1qian1jiao3kuan3ri4`: String,
  `p_wang3shang4shen1gou4shang4xian4`: Double,
  `p_shang4wang3fa1xing2shu4liang4`: Double
)

case class stock_new_ipo_cninfoResponse(
  `p_zheng4juan4dai4ma3`: String,
  `p_zheng4quan4jian3cheng1`: String,
  `p_shang4shi4ri4qi1`: String,
  `p_shen1gou4ri4qi1`: String,
  `p_fa1xing2jia4`: Double,
  `p_zong3fa1xing2shu4liang4`: Double,
  `p_fa1xing2shi4ying2lu4`: Double,
  `p_shang4wang3fa1xing2zhong1qian1lu4`: Double,
  `p_yao2hao4jie2guo3gong1gao4ri4`: String,
  `p_zhong1qian1gong1gao4ri4`: String,
  `p_zhong1qian1jiao3kuan3ri4`: String,
  `p_wang3shang4shen1gou4shang4xian4`: Double,
  `p_shang4wang3fa1xing2shu4liang4`: Double
)

trait Json_stock_new_ipo_cninfoResponse {

  implicit val a_stock_new_ipo_cninfoResponse = new Decoder[stock_new_ipo_cninfoResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_new_ipo_cninfoResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_zheng4juan4dai4ma3 <- c.downField("证劵代码").as[String]

        p_zheng4quan4jian3cheng1 <- c.downField("证券简称").as[String]

        p_shang4shi4ri4qi1 <- c.downField("上市日期").as[String]

        p_shen1gou4ri4qi1 <- c.downField("申购日期").as[String]

        p_fa1xing2jia4 <- c.downField("发行价").as[Double]

        p_zong3fa1xing2shu4liang4 <- c.downField("总发行数量").as[Double]

        p_fa1xing2shi4ying2lu4 <- c.downField("发行市盈率").as[Double]

        p_shang4wang3fa1xing2zhong1qian1lu4 <- c.downField("上网发行中签率").as[Double]

        p_yao2hao4jie2guo3gong1gao4ri4 <- c.downField("摇号结果公告日").as[String]

        p_zhong1qian1gong1gao4ri4 <- c.downField("中签公告日").as[String]

        p_zhong1qian1jiao3kuan3ri4 <- c.downField("中签缴款日").as[String]

        p_wang3shang4shen1gou4shang4xian4 <- c.downField("网上申购上限").as[Double]

        p_shang4wang3fa1xing2shu4liang4 <- c.downField("上网发行数量").as[Double]

      } yield {
        stock_new_ipo_cninfoResponse(
          p_zheng4juan4dai4ma3,
          p_zheng4quan4jian3cheng1,
          p_shang4shi4ri4qi1,
          p_shen1gou4ri4qi1,
          p_fa1xing2jia4,
          p_zong3fa1xing2shu4liang4,
          p_fa1xing2shi4ying2lu4,
          p_shang4wang3fa1xing2zhong1qian1lu4,
          p_yao2hao4jie2guo3gong1gao4ri4,
          p_zhong1qian1gong1gao4ri4,
          p_zhong1qian1jiao3kuan3ri4,
          p_wang3shang4shen1gou4shang4xian4,
          p_shang4wang3fa1xing2shu4liang4
        )
      }
  }

}

object JsonItem_stock_new_ipo_cninfoResponse extends Json_stock_new_ipo_cninfoResponse
