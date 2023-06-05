package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_xgsglb_emResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_xgsglb_em 目标地址: http://data.eastmoney.com/xg/xg/default_2.html 描述:
  * 东方财富网-数据中心-新股数据-新股申购-新股申购与中签查询 限量: 单次获取指定 market 的新股申购与中签查询数据
  */
case class Respstock_xgsglb_emResponse(
  `p_gu3piao4dai4ma3`: String,
  `p_gu3piao4jian3cheng1`: String,
  `p_shen1gou4dai4ma3`: String,
  `p_fa1xing2zong3shu4`: Double,
  `p_wang3shang4fa1xing2`: Integer,
  `p_ding3ge2shen1gou4xu1pei4shi4zhi2`: Double,
  `p_shen1gou4shang4xian4`: Integer,
  `p_fa1xing2jia4ge2`: Double,
  `p_zui4xin1jia4`: Double,
  `p_shou3ri4shou1pan2jia4`: Double,
  `p_shen1gou4ri4qi1`: String,
  `p_zhong1qian1hao4gong1bu4ri4`: String,
  `p_zhong1qian1jiao3kuan3ri4qi1`: String,
  `p_shang4shi4ri4qi1`: String,
  `p_fa1xing2shi4ying2lu4`: Double,
  `p_xing2ye4shi4ying2lu4`: Double,
  `p_zhong1qian1lu4`: Double,
  `p_xun2jia4lei3ji4bao4jia4bei4shu4`: Double,
  `p_pei4shou4dui4xiang4bao4jia4jia1shu4`: Double,
  `p_lian2xu4yi1zi4ban3shu4liang4`: String,
  `p_zhang3fu2`: Double,
  `p_mei3zhong1yi1qian1huo4li4`: Double
)

case class stock_xgsglb_emResponse(
  `p_gu3piao4dai4ma3`: String,
  `p_gu3piao4jian3cheng1`: String,
  `p_shen1gou4dai4ma3`: String,
  `p_fa1xing2zong3shu4`: Double,
  `p_wang3shang4fa1xing2`: Integer,
  `p_ding3ge2shen1gou4xu1pei4shi4zhi2`: Double,
  `p_shen1gou4shang4xian4`: Integer,
  `p_fa1xing2jia4ge2`: Double,
  `p_zui4xin1jia4`: Double,
  `p_shou3ri4shou1pan2jia4`: Double,
  `p_shen1gou4ri4qi1`: String,
  `p_zhong1qian1hao4gong1bu4ri4`: String,
  `p_zhong1qian1jiao3kuan3ri4qi1`: String,
  `p_shang4shi4ri4qi1`: String,
  `p_fa1xing2shi4ying2lu4`: Double,
  `p_xing2ye4shi4ying2lu4`: Double,
  `p_zhong1qian1lu4`: Double,
  `p_xun2jia4lei3ji4bao4jia4bei4shu4`: Double,
  `p_pei4shou4dui4xiang4bao4jia4jia1shu4`: Double,
  `p_lian2xu4yi1zi4ban3shu4liang4`: String,
  `p_zhang3fu2`: Double,
  `p_mei3zhong1yi1qian1huo4li4`: Double
)

trait Json_stock_xgsglb_emResponse {

  implicit val a_stock_xgsglb_emResponse = new Decoder[stock_xgsglb_emResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_xgsglb_emResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_gu3piao4dai4ma3 <- c.downField("股票代码").as[String]

        p_gu3piao4jian3cheng1 <- c.downField("股票简称").as[String]

        p_shen1gou4dai4ma3 <- c.downField("申购代码").as[String]

        p_fa1xing2zong3shu4 <- c.downField("发行总数").as[Double]

        p_wang3shang4fa1xing2 <- c.downField("网上发行").as[Integer]

        p_ding3ge2shen1gou4xu1pei4shi4zhi2 <- c.downField("顶格申购需配市值").as[Double]

        p_shen1gou4shang4xian4 <- c.downField("申购上限").as[Integer]

        p_fa1xing2jia4ge2 <- c.downField("发行价格").as[Double]

        p_zui4xin1jia4 <- c.downField("最新价").as[Double]

        p_shou3ri4shou1pan2jia4 <- c.downField("首日收盘价").as[Double]

        p_shen1gou4ri4qi1 <- c.downField("申购日期").as[String]

        p_zhong1qian1hao4gong1bu4ri4 <- c.downField("中签号公布日").as[String]

        p_zhong1qian1jiao3kuan3ri4qi1 <- c.downField("中签缴款日期").as[String]

        p_shang4shi4ri4qi1 <- c.downField("上市日期").as[String]

        p_fa1xing2shi4ying2lu4 <- c.downField("发行市盈率").as[Double]

        p_xing2ye4shi4ying2lu4 <- c.downField("行业市盈率").as[Double]

        p_zhong1qian1lu4 <- c.downField("中签率").as[Double]

        p_xun2jia4lei3ji4bao4jia4bei4shu4 <- c.downField("询价累计报价倍数").as[Double]

        p_pei4shou4dui4xiang4bao4jia4jia1shu4 <- c.downField("配售对象报价家数").as[Double]

        p_lian2xu4yi1zi4ban3shu4liang4 <- c.downField("连续一字板数量").as[String]

        p_zhang3fu2 <- c.downField("涨幅").as[Double]

        p_mei3zhong1yi1qian1huo4li4 <- c.downField("每中一签获利").as[Double]

      } yield {
        stock_xgsglb_emResponse(
          p_gu3piao4dai4ma3,
          p_gu3piao4jian3cheng1,
          p_shen1gou4dai4ma3,
          p_fa1xing2zong3shu4,
          p_wang3shang4fa1xing2,
          p_ding3ge2shen1gou4xu1pei4shi4zhi2,
          p_shen1gou4shang4xian4,
          p_fa1xing2jia4ge2,
          p_zui4xin1jia4,
          p_shou3ri4shou1pan2jia4,
          p_shen1gou4ri4qi1,
          p_zhong1qian1hao4gong1bu4ri4,
          p_zhong1qian1jiao3kuan3ri4qi1,
          p_shang4shi4ri4qi1,
          p_fa1xing2shi4ying2lu4,
          p_xing2ye4shi4ying2lu4,
          p_zhong1qian1lu4,
          p_xun2jia4lei3ji4bao4jia4bei4shu4,
          p_pei4shou4dui4xiang4bao4jia4jia1shu4,
          p_lian2xu4yi1zi4ban3shu4liang4,
          p_zhang3fu2,
          p_mei3zhong1yi1qian1huo4li4
        )
      }
  }

}

object JsonItem_stock_xgsglb_emResponse extends Json_stock_xgsglb_emResponse
