package com.onectrm.akshare.api.generated.fx;

import com.onectrm.akshare.api.generated.fx.currency_boc_safeResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: fx 接口: currency_boc_safe 目标地址: http://www.safe.gov.cn/safe/rmbhlzjj/index.html 描述:
  * 外汇管理局-人民币汇率中间价 限量: 单次返回所有历史数据
  */
case class Respcurrency_boc_safeResponse(
  `p_ri4qi1`: String,
  `p_mei3yuan2`: Double,
  `p_ou1yuan2`: Double,
  `p_ri4yuan2`: Double,
  `p_gang3yuan2`: Double,
  `p_ying1bang4`: Double,
  `p_lin2ji2te4`: Double,
  `p_lu2bu4`: Double,
  `p_ao4yuan2`: Double,
  `p_jia1yuan2`: Double,
  `p_xin1xi1lan2yuan2`: Double,
  `p_xin1jia1po1yuan2`: Double,
  `p_rui4shi4fa3lang2`: Double,
  `p_lan2te4`: Double,
  `p_han2yuan2`: Double,
  `p_di2la1mu3`: Double,
  `p_li3ya4er3`: Double,
  `p_fu2lin2`: Double,
  `p_zi1luo2ti2`: Double,
  `p_dan1mai4ke4lang3`: Double,
  `p_rui4dian3ke4lang3`: Double,
  `p_nuo2wei1ke4lang3`: Double,
  `p_li3la1`: Double,
  `p_bi3suo3`: Double,
  `p_tai4zhu1`: Double
)

case class currency_boc_safeResponse(
  `p_ri4qi1`: String,
  `p_mei3yuan2`: Double,
  `p_ou1yuan2`: Double,
  `p_ri4yuan2`: Double,
  `p_gang3yuan2`: Double,
  `p_ying1bang4`: Double,
  `p_lin2ji2te4`: Double,
  `p_lu2bu4`: Double,
  `p_ao4yuan2`: Double,
  `p_jia1yuan2`: Double,
  `p_xin1xi1lan2yuan2`: Double,
  `p_xin1jia1po1yuan2`: Double,
  `p_rui4shi4fa3lang2`: Double,
  `p_lan2te4`: Double,
  `p_han2yuan2`: Double,
  `p_di2la1mu3`: Double,
  `p_li3ya4er3`: Double,
  `p_fu2lin2`: Double,
  `p_zi1luo2ti2`: Double,
  `p_dan1mai4ke4lang3`: Double,
  `p_rui4dian3ke4lang3`: Double,
  `p_nuo2wei1ke4lang3`: Double,
  `p_li3la1`: Double,
  `p_bi3suo3`: Double,
  `p_tai4zhu1`: Double
)

trait Json_currency_boc_safeResponse {

  implicit val a_currency_boc_safeResponse = new Decoder[currency_boc_safeResponse] {
    final def apply(c: HCursor): Decoder.Result[currency_boc_safeResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_ri4qi1 <- c.downField("日期").as[String]

        p_mei3yuan2 <- c.downField("美元").as[Double]

        p_ou1yuan2 <- c.downField("欧元").as[Double]

        p_ri4yuan2 <- c.downField("日元").as[Double]

        p_gang3yuan2 <- c.downField("港元").as[Double]

        p_ying1bang4 <- c.downField("英镑").as[Double]

        p_lin2ji2te4 <- c.downField("林吉特").as[Double]

        p_lu2bu4 <- c.downField("卢布").as[Double]

        p_ao4yuan2 <- c.downField("澳元").as[Double]

        p_jia1yuan2 <- c.downField("加元").as[Double]

        p_xin1xi1lan2yuan2 <- c.downField("新西兰元").as[Double]

        p_xin1jia1po1yuan2 <- c.downField("新加坡元").as[Double]

        p_rui4shi4fa3lang2 <- c.downField("瑞士法郎").as[Double]

        p_lan2te4 <- c.downField("兰特").as[Double]

        p_han2yuan2 <- c.downField("韩元").as[Double]

        p_di2la1mu3 <- c.downField("迪拉姆").as[Double]

        p_li3ya4er3 <- c.downField("里亚尔").as[Double]

        p_fu2lin2 <- c.downField("福林").as[Double]

        p_zi1luo2ti2 <- c.downField("兹罗提").as[Double]

        p_dan1mai4ke4lang3 <- c.downField("丹麦克朗").as[Double]

        p_rui4dian3ke4lang3 <- c.downField("瑞典克朗").as[Double]

        p_nuo2wei1ke4lang3 <- c.downField("挪威克朗").as[Double]

        p_li3la1 <- c.downField("里拉").as[Double]

        p_bi3suo3 <- c.downField("比索").as[Double]

        p_tai4zhu1 <- c.downField("泰铢").as[Double]

      } yield {
        currency_boc_safeResponse(
          p_ri4qi1,
          p_mei3yuan2,
          p_ou1yuan2,
          p_ri4yuan2,
          p_gang3yuan2,
          p_ying1bang4,
          p_lin2ji2te4,
          p_lu2bu4,
          p_ao4yuan2,
          p_jia1yuan2,
          p_xin1xi1lan2yuan2,
          p_xin1jia1po1yuan2,
          p_rui4shi4fa3lang2,
          p_lan2te4,
          p_han2yuan2,
          p_di2la1mu3,
          p_li3ya4er3,
          p_fu2lin2,
          p_zi1luo2ti2,
          p_dan1mai4ke4lang3,
          p_rui4dian3ke4lang3,
          p_nuo2wei1ke4lang3,
          p_li3la1,
          p_bi3suo3,
          p_tai4zhu1
        )
      }
  }

}

object JsonItem_currency_boc_safeResponse extends Json_currency_boc_safeResponse
