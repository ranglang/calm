package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_em_sy_yq_listResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_em_sy_yq_list 目标地址: http://data.eastmoney.com/sy/yqlist.html 描述:
  * 获取东方财富网-数据中心-特色数据-商誉-商誉减值预期明细 限量: 单次所有历史数据, 由于数据量比较大需要等待一定时间
  */
case class Respstock_em_sy_yq_listResponse(
  `p_gu3piao4dai4ma3`: String,
  `p_gong1si1ming2cheng1`: Double,
  `p_zui4xin1yi1qi1shang1yu4yuan2`: Double,
  `p_gong1gao4ri4qi1`: String,
  `p_yu4ji4jing4li4run4yuan2xia4xian4`: Double,
  `p_yu4ji4jing4li4run4yuan2shang4xian4`: Double,
  `p_ye4ji4bian4dong4fu2du4shang4xian4`: Double,
  `p_ye4ji4bian4dong4fu2du4xia4xian4`: Double,
  `p_yu4gao4nei4rong2`: Double,
  `p_ye4ji4bian4dong4yuan2yin1`: Double,
  `p_shang4nian2du4tong2qi1jing4li4run4yuan2`: Double,
  `p_shang4nian2shang1yu4`: Double,
  `p_shang1yu4bao4gao4ri4qi1`: String
)

case class stock_em_sy_yq_listResponse(
  `p_gu3piao4dai4ma3`: String,
  `p_gong1si1ming2cheng1`: Double,
  `p_zui4xin1yi1qi1shang1yu4yuan2`: Double,
  `p_gong1gao4ri4qi1`: String,
  `p_yu4ji4jing4li4run4yuan2xia4xian4`: Double,
  `p_yu4ji4jing4li4run4yuan2shang4xian4`: Double,
  `p_ye4ji4bian4dong4fu2du4shang4xian4`: Double,
  `p_ye4ji4bian4dong4fu2du4xia4xian4`: Double,
  `p_yu4gao4nei4rong2`: Double,
  `p_ye4ji4bian4dong4yuan2yin1`: Double,
  `p_shang4nian2du4tong2qi1jing4li4run4yuan2`: Double,
  `p_shang4nian2shang1yu4`: Double,
  `p_shang1yu4bao4gao4ri4qi1`: String
)

trait Json_stock_em_sy_yq_listResponse {

  implicit val a_stock_em_sy_yq_listResponse = new Decoder[stock_em_sy_yq_listResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_em_sy_yq_listResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_gu3piao4dai4ma3 <- c.downField("股票代码").as[String]

        p_gong1si1ming2cheng1 <- c.downField("公司名称").as[Double]

        p_zui4xin1yi1qi1shang1yu4yuan2 <- c.downField("最新一期商誉(元)").as[Double]

        p_gong1gao4ri4qi1 <- c.downField("公告日期").as[String]

        p_yu4ji4jing4li4run4yuan2xia4xian4 <- c.downField("预计净利润(元)-下限").as[Double]

        p_yu4ji4jing4li4run4yuan2shang4xian4 <- c.downField("预计净利润(元)-上限").as[Double]

        p_ye4ji4bian4dong4fu2du4shang4xian4 <- c.downField("业绩变动幅度-上限").as[Double]

        p_ye4ji4bian4dong4fu2du4xia4xian4 <- c.downField("业绩变动幅度-下限").as[Double]

        p_yu4gao4nei4rong2 <- c.downField("预告内容").as[Double]

        p_ye4ji4bian4dong4yuan2yin1 <- c.downField("业绩变动原因").as[Double]

        p_shang4nian2du4tong2qi1jing4li4run4yuan2 <- c.downField("上年度同期净利润(元)").as[Double]

        p_shang4nian2shang1yu4 <- c.downField("上年商誉").as[Double]

        p_shang1yu4bao4gao4ri4qi1 <- c.downField("商誉报告日期").as[String]

      } yield {
        stock_em_sy_yq_listResponse(
          p_gu3piao4dai4ma3,
          p_gong1si1ming2cheng1,
          p_zui4xin1yi1qi1shang1yu4yuan2,
          p_gong1gao4ri4qi1,
          p_yu4ji4jing4li4run4yuan2xia4xian4,
          p_yu4ji4jing4li4run4yuan2shang4xian4,
          p_ye4ji4bian4dong4fu2du4shang4xian4,
          p_ye4ji4bian4dong4fu2du4xia4xian4,
          p_yu4gao4nei4rong2,
          p_ye4ji4bian4dong4yuan2yin1,
          p_shang4nian2du4tong2qi1jing4li4run4yuan2,
          p_shang4nian2shang1yu4,
          p_shang1yu4bao4gao4ri4qi1
        )
      }
  }

}

object JsonItem_stock_em_sy_yq_listResponse extends Json_stock_em_sy_yq_listResponse
