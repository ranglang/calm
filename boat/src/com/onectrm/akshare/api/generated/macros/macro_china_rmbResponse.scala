package com.onectrm.akshare.api.generated.macros;

import com.onectrm.akshare.api.generated.macros.macro_china_rmbResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: macro 接口: macro_china_rmb 目标地址: https://datacenter.jin10.com/reportType/dc_rmb_data 描述:
  * 中国人民币汇率中间价报告, 数据区间从 20170103-20210513 限量: 单次返回所有历史数据
  */
case class Respmacro_china_rmbResponse(
  `p_ri4qi1`: String,
  `p_mei3yuan2ren2min2bi4zhong1jian1jia4`: Double,
  `p_mei3yuan2ren2min2bi4zhang3die1fu2`: Double,
  `p_ou1yuan2ren2min2bi4zhong1jian1jia4`: Double,
  `p_ou1yuan2ren2min2bi4zhang3die1fu2`: Double,
  `p_100ri4yuan2ren2min2bi4zhong1jian1jia4`: Double,
  `p_100ri4yuan2ren2min2bi4zhang3die1fu2`: Double,
  `p_gang3yuan2ren2min2bi4zhong1jian1jia4`: Double,
  `p_gang3yuan2ren2min2bi4zhang3die1fu2`: Double,
  `p_ying1bang4ren2min2bi4zhong1jian1jia4`: Double,
  `p_ying1bang4ren2min2bi4zhang3die1fu2`: Double,
  `p_ao4yuan2ren2min2bi4zhong1jian1jia4`: Double,
  `p_ao4yuan2ren2min2bi4zhang3die1fu2`: Double,
  `p_xin1xi1lan2yuan2ren2min2bi4zhong1jian1jia4`: Double,
  `p_xin1xi1lan2yuan2ren2min2bi4zhang3die1fu2`: Double,
  `p_xin1jia1po1yuan2ren2min2bi4zhong1jian1jia4`: Double,
  `p_xin1jia1po1yuan2ren2min2bi4zhang3die1fu2`: Double,
  `p_rui4lang2ren2min2bi4zhong1jian1jia4`: Double,
  `p_rui4lang2ren2min2bi4zhang3die1fu2`: Double,
  `p_jia1yuan2ren2min2bi4zhong1jian1jia4`: Double,
  `p_jia1yuan2ren2min2bi4zhang3die1fu2`: Double,
  `p_ren2min2bi4ma3lai2xi1ya4lin2ji2te4zhong1jian1jia4`: Double,
  `p_ren2min2bi4ma3lai2xi1ya4lin2ji2te4zhang3die1fu2`: Double,
  `p_ren2min2bi4e2luo2si1lu2bu4zhong1jian1jia4`: Double,
  `p_ren2min2bi4e2luo2si1lu2bu4zhang3die1fu2`: Double,
  `p_ren2min2bi4nan2fei1lan2te4zhong1jian1jia4`: Double,
  `p_ren2min2bi4nan2fei1lan2te4zhang3die1fu2`: Double,
  `p_ren2min2bi4han2yuan2zhong1jian1jia4`: Double,
  `p_ren2min2bi4han2yuan2zhang3die1fu2`: Double,
  `p_ren2min2bi4a1lian2qiu2di2la1mu3zhong1jian1jia4`: Double,
  `p_ren2min2bi4a1lian2qiu2di2la1mu3zhang3die1fu2`: Double,
  `p_ren2min2bi4sha1te4li3ya4er3zhong1jian1jia4`: Double,
  `p_ren2min2bi4sha1te4li3ya4er3zhang3die1fu2`: Double,
  `p_ren2min2bi4xiong1ya2li4fu2lin2zhong1jian1jia4`: Double,
  `p_ren2min2bi4xiong1ya2li4fu2lin2zhang3die1fu2`: Double,
  `p_ren2min2bi4bo1lan2zi1luo2ti2zhong1jian1jia4`: Double,
  `p_ren2min2bi4bo1lan2zi1luo2ti2zhang3die1fu2`: Double,
  `p_ren2min2bi4rui4dian3ke4lang3zhong1jian1jia4`: Double,
  `p_ren2min2bi4rui4dian3ke4lang3zhang3die1fu2`: Double,
  `p_ren2min2bi4nuo2wei1ke4lang3zhong1jian1jia4`: Double,
  `p_ren2min2bi4nuo2wei1ke4lang3zhang3die1fu2`: Double,
  `p_ren2min2bi4tu3er3qi2li3la1zhong1jian1jia4`: Double,
  `p_ren2min2bi4tu3er3qi2li3la1zhang3die1fu2`: Double,
  `p_ren2min2bi4mo4xi1ge1bi3suo3zhong1jian1jia4`: Double,
  `p_ren2min2bi4mo4xi1ge1bi3suo3zhang3die1fu2`: Double,
  `p_ren2min2bi4tai4zhu1zhong1jian1jia4`: Double,
  `p_ren2min2bi4tai4zhu1zhang3die1fu2`: Double
)

case class macro_china_rmbResponse(
  `p_ri4qi1`: String,
  `p_mei3yuan2ren2min2bi4zhong1jian1jia4`: Double,
  `p_mei3yuan2ren2min2bi4zhang3die1fu2`: Double,
  `p_ou1yuan2ren2min2bi4zhong1jian1jia4`: Double,
  `p_ou1yuan2ren2min2bi4zhang3die1fu2`: Double,
  `p_100ri4yuan2ren2min2bi4zhong1jian1jia4`: Double,
  `p_100ri4yuan2ren2min2bi4zhang3die1fu2`: Double,
  `p_gang3yuan2ren2min2bi4zhong1jian1jia4`: Double,
  `p_gang3yuan2ren2min2bi4zhang3die1fu2`: Double,
  `p_ying1bang4ren2min2bi4zhong1jian1jia4`: Double,
  `p_ying1bang4ren2min2bi4zhang3die1fu2`: Double,
  `p_ao4yuan2ren2min2bi4zhong1jian1jia4`: Double,
  `p_ao4yuan2ren2min2bi4zhang3die1fu2`: Double,
  `p_xin1xi1lan2yuan2ren2min2bi4zhong1jian1jia4`: Double,
  `p_xin1xi1lan2yuan2ren2min2bi4zhang3die1fu2`: Double,
  `p_xin1jia1po1yuan2ren2min2bi4zhong1jian1jia4`: Double,
  `p_xin1jia1po1yuan2ren2min2bi4zhang3die1fu2`: Double,
  `p_rui4lang2ren2min2bi4zhong1jian1jia4`: Double,
  `p_rui4lang2ren2min2bi4zhang3die1fu2`: Double,
  `p_jia1yuan2ren2min2bi4zhong1jian1jia4`: Double,
  `p_jia1yuan2ren2min2bi4zhang3die1fu2`: Double,
  `p_ren2min2bi4ma3lai2xi1ya4lin2ji2te4zhong1jian1jia4`: Double,
  `p_ren2min2bi4ma3lai2xi1ya4lin2ji2te4zhang3die1fu2`: Double,
  `p_ren2min2bi4e2luo2si1lu2bu4zhong1jian1jia4`: Double,
  `p_ren2min2bi4e2luo2si1lu2bu4zhang3die1fu2`: Double,
  `p_ren2min2bi4nan2fei1lan2te4zhong1jian1jia4`: Double,
  `p_ren2min2bi4nan2fei1lan2te4zhang3die1fu2`: Double,
  `p_ren2min2bi4han2yuan2zhong1jian1jia4`: Double,
  `p_ren2min2bi4han2yuan2zhang3die1fu2`: Double,
  `p_ren2min2bi4a1lian2qiu2di2la1mu3zhong1jian1jia4`: Double,
  `p_ren2min2bi4a1lian2qiu2di2la1mu3zhang3die1fu2`: Double,
  `p_ren2min2bi4sha1te4li3ya4er3zhong1jian1jia4`: Double,
  `p_ren2min2bi4sha1te4li3ya4er3zhang3die1fu2`: Double,
  `p_ren2min2bi4xiong1ya2li4fu2lin2zhong1jian1jia4`: Double,
  `p_ren2min2bi4xiong1ya2li4fu2lin2zhang3die1fu2`: Double,
  `p_ren2min2bi4bo1lan2zi1luo2ti2zhong1jian1jia4`: Double,
  `p_ren2min2bi4bo1lan2zi1luo2ti2zhang3die1fu2`: Double,
  `p_ren2min2bi4rui4dian3ke4lang3zhong1jian1jia4`: Double,
  `p_ren2min2bi4rui4dian3ke4lang3zhang3die1fu2`: Double,
  `p_ren2min2bi4nuo2wei1ke4lang3zhong1jian1jia4`: Double,
  `p_ren2min2bi4nuo2wei1ke4lang3zhang3die1fu2`: Double,
  `p_ren2min2bi4tu3er3qi2li3la1zhong1jian1jia4`: Double,
  `p_ren2min2bi4tu3er3qi2li3la1zhang3die1fu2`: Double,
  `p_ren2min2bi4mo4xi1ge1bi3suo3zhong1jian1jia4`: Double,
  `p_ren2min2bi4mo4xi1ge1bi3suo3zhang3die1fu2`: Double,
  `p_ren2min2bi4tai4zhu1zhong1jian1jia4`: Double,
  `p_ren2min2bi4tai4zhu1zhang3die1fu2`: Double
)

trait Json_macro_china_rmbResponse {

  implicit val a_macro_china_rmbResponse = new Decoder[macro_china_rmbResponse] {
    final def apply(c: HCursor): Decoder.Result[macro_china_rmbResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_ri4qi1 <- c.downField("日期").as[String]

        p_mei3yuan2ren2min2bi4zhong1jian1jia4 <- c.downField("美元/人民币_中间价").as[Double]

        p_mei3yuan2ren2min2bi4zhang3die1fu2 <- c.downField("美元/人民币_涨跌幅").as[Double]

        p_ou1yuan2ren2min2bi4zhong1jian1jia4 <- c.downField("欧元/人民币_中间价").as[Double]

        p_ou1yuan2ren2min2bi4zhang3die1fu2 <- c.downField("欧元/人民币_涨跌幅").as[Double]

        p_100ri4yuan2ren2min2bi4zhong1jian1jia4 <- c.downField("100日元/人民币_中间价").as[Double]

        p_100ri4yuan2ren2min2bi4zhang3die1fu2 <- c.downField("100日元/人民币_涨跌幅").as[Double]

        p_gang3yuan2ren2min2bi4zhong1jian1jia4 <- c.downField("港元/人民币_中间价").as[Double]

        p_gang3yuan2ren2min2bi4zhang3die1fu2 <- c.downField("港元/人民币_涨跌幅").as[Double]

        p_ying1bang4ren2min2bi4zhong1jian1jia4 <- c.downField("英镑/人民币_中间价").as[Double]

        p_ying1bang4ren2min2bi4zhang3die1fu2 <- c.downField("英镑/人民币_涨跌幅").as[Double]

        p_ao4yuan2ren2min2bi4zhong1jian1jia4 <- c.downField("澳元/人民币_中间价").as[Double]

        p_ao4yuan2ren2min2bi4zhang3die1fu2 <- c.downField("澳元/人民币_涨跌幅").as[Double]

        p_xin1xi1lan2yuan2ren2min2bi4zhong1jian1jia4 <- c.downField("新西兰元/人民币_中间价").as[Double]

        p_xin1xi1lan2yuan2ren2min2bi4zhang3die1fu2 <- c.downField("新西兰元/人民币_涨跌幅").as[Double]

        p_xin1jia1po1yuan2ren2min2bi4zhong1jian1jia4 <- c.downField("新加坡元/人民币_中间价").as[Double]

        p_xin1jia1po1yuan2ren2min2bi4zhang3die1fu2 <- c.downField("新加坡元/人民币_涨跌幅").as[Double]

        p_rui4lang2ren2min2bi4zhong1jian1jia4 <- c.downField("瑞郎/人民币_中间价").as[Double]

        p_rui4lang2ren2min2bi4zhang3die1fu2 <- c.downField("瑞郎/人民币_涨跌幅").as[Double]

        p_jia1yuan2ren2min2bi4zhong1jian1jia4 <- c.downField("加元/人民币_中间价").as[Double]

        p_jia1yuan2ren2min2bi4zhang3die1fu2 <- c.downField("加元/人民币_涨跌幅").as[Double]

        p_ren2min2bi4ma3lai2xi1ya4lin2ji2te4zhong1jian1jia4 <- c
          .downField("人民币/马来西亚林吉特_中间价")
          .as[Double]

        p_ren2min2bi4ma3lai2xi1ya4lin2ji2te4zhang3die1fu2 <- c
          .downField("人民币/马来西亚林吉特_涨跌幅")
          .as[Double]

        p_ren2min2bi4e2luo2si1lu2bu4zhong1jian1jia4 <- c.downField("人民币/俄罗斯卢布_中间价").as[Double]

        p_ren2min2bi4e2luo2si1lu2bu4zhang3die1fu2 <- c.downField("人民币/俄罗斯卢布_涨跌幅").as[Double]

        p_ren2min2bi4nan2fei1lan2te4zhong1jian1jia4 <- c.downField("人民币/南非兰特_中间价").as[Double]

        p_ren2min2bi4nan2fei1lan2te4zhang3die1fu2 <- c.downField("人民币/南非兰特_涨跌幅").as[Double]

        p_ren2min2bi4han2yuan2zhong1jian1jia4 <- c.downField("人民币/韩元_中间价").as[Double]

        p_ren2min2bi4han2yuan2zhang3die1fu2 <- c.downField("人民币/韩元_涨跌幅").as[Double]

        p_ren2min2bi4a1lian2qiu2di2la1mu3zhong1jian1jia4 <- c.downField("人民币/阿联酋迪拉姆_中间价").as[Double]

        p_ren2min2bi4a1lian2qiu2di2la1mu3zhang3die1fu2 <- c.downField("人民币/阿联酋迪拉姆_涨跌幅").as[Double]

        p_ren2min2bi4sha1te4li3ya4er3zhong1jian1jia4 <- c.downField("人民币/沙特里亚尔_中间价").as[Double]

        p_ren2min2bi4sha1te4li3ya4er3zhang3die1fu2 <- c.downField("人民币/沙特里亚尔_涨跌幅").as[Double]

        p_ren2min2bi4xiong1ya2li4fu2lin2zhong1jian1jia4 <- c.downField("人民币/匈牙利福林_中间价").as[Double]

        p_ren2min2bi4xiong1ya2li4fu2lin2zhang3die1fu2 <- c.downField("人民币/匈牙利福林_涨跌幅").as[Double]

        p_ren2min2bi4bo1lan2zi1luo2ti2zhong1jian1jia4 <- c.downField("人民币/波兰兹罗提_中间价").as[Double]

        p_ren2min2bi4bo1lan2zi1luo2ti2zhang3die1fu2 <- c.downField("人民币/波兰兹罗提_涨跌幅").as[Double]

        p_ren2min2bi4rui4dian3ke4lang3zhong1jian1jia4 <- c.downField("人民币/瑞典克朗_中间价").as[Double]

        p_ren2min2bi4rui4dian3ke4lang3zhang3die1fu2 <- c.downField("人民币/瑞典克朗_涨跌幅").as[Double]

        p_ren2min2bi4nuo2wei1ke4lang3zhong1jian1jia4 <- c.downField("人民币/挪威克朗_中间价").as[Double]

        p_ren2min2bi4nuo2wei1ke4lang3zhang3die1fu2 <- c.downField("人民币/挪威克朗_涨跌幅").as[Double]

        p_ren2min2bi4tu3er3qi2li3la1zhong1jian1jia4 <- c.downField("人民币/土耳其里拉_中间价").as[Double]

        p_ren2min2bi4tu3er3qi2li3la1zhang3die1fu2 <- c.downField("人民币/土耳其里拉_涨跌幅").as[Double]

        p_ren2min2bi4mo4xi1ge1bi3suo3zhong1jian1jia4 <- c.downField("人民币/墨西哥比索_中间价").as[Double]

        p_ren2min2bi4mo4xi1ge1bi3suo3zhang3die1fu2 <- c.downField("人民币/墨西哥比索_涨跌幅").as[Double]

        p_ren2min2bi4tai4zhu1zhong1jian1jia4 <- c.downField("人民币/泰铢_中间价").as[Double]

        p_ren2min2bi4tai4zhu1zhang3die1fu2 <- c.downField("人民币/泰铢_涨跌幅").as[Double]

      } yield {
        macro_china_rmbResponse(
          p_ri4qi1,
          p_mei3yuan2ren2min2bi4zhong1jian1jia4,
          p_mei3yuan2ren2min2bi4zhang3die1fu2,
          p_ou1yuan2ren2min2bi4zhong1jian1jia4,
          p_ou1yuan2ren2min2bi4zhang3die1fu2,
          p_100ri4yuan2ren2min2bi4zhong1jian1jia4,
          p_100ri4yuan2ren2min2bi4zhang3die1fu2,
          p_gang3yuan2ren2min2bi4zhong1jian1jia4,
          p_gang3yuan2ren2min2bi4zhang3die1fu2,
          p_ying1bang4ren2min2bi4zhong1jian1jia4,
          p_ying1bang4ren2min2bi4zhang3die1fu2,
          p_ao4yuan2ren2min2bi4zhong1jian1jia4,
          p_ao4yuan2ren2min2bi4zhang3die1fu2,
          p_xin1xi1lan2yuan2ren2min2bi4zhong1jian1jia4,
          p_xin1xi1lan2yuan2ren2min2bi4zhang3die1fu2,
          p_xin1jia1po1yuan2ren2min2bi4zhong1jian1jia4,
          p_xin1jia1po1yuan2ren2min2bi4zhang3die1fu2,
          p_rui4lang2ren2min2bi4zhong1jian1jia4,
          p_rui4lang2ren2min2bi4zhang3die1fu2,
          p_jia1yuan2ren2min2bi4zhong1jian1jia4,
          p_jia1yuan2ren2min2bi4zhang3die1fu2,
          p_ren2min2bi4ma3lai2xi1ya4lin2ji2te4zhong1jian1jia4,
          p_ren2min2bi4ma3lai2xi1ya4lin2ji2te4zhang3die1fu2,
          p_ren2min2bi4e2luo2si1lu2bu4zhong1jian1jia4,
          p_ren2min2bi4e2luo2si1lu2bu4zhang3die1fu2,
          p_ren2min2bi4nan2fei1lan2te4zhong1jian1jia4,
          p_ren2min2bi4nan2fei1lan2te4zhang3die1fu2,
          p_ren2min2bi4han2yuan2zhong1jian1jia4,
          p_ren2min2bi4han2yuan2zhang3die1fu2,
          p_ren2min2bi4a1lian2qiu2di2la1mu3zhong1jian1jia4,
          p_ren2min2bi4a1lian2qiu2di2la1mu3zhang3die1fu2,
          p_ren2min2bi4sha1te4li3ya4er3zhong1jian1jia4,
          p_ren2min2bi4sha1te4li3ya4er3zhang3die1fu2,
          p_ren2min2bi4xiong1ya2li4fu2lin2zhong1jian1jia4,
          p_ren2min2bi4xiong1ya2li4fu2lin2zhang3die1fu2,
          p_ren2min2bi4bo1lan2zi1luo2ti2zhong1jian1jia4,
          p_ren2min2bi4bo1lan2zi1luo2ti2zhang3die1fu2,
          p_ren2min2bi4rui4dian3ke4lang3zhong1jian1jia4,
          p_ren2min2bi4rui4dian3ke4lang3zhang3die1fu2,
          p_ren2min2bi4nuo2wei1ke4lang3zhong1jian1jia4,
          p_ren2min2bi4nuo2wei1ke4lang3zhang3die1fu2,
          p_ren2min2bi4tu3er3qi2li3la1zhong1jian1jia4,
          p_ren2min2bi4tu3er3qi2li3la1zhang3die1fu2,
          p_ren2min2bi4mo4xi1ge1bi3suo3zhong1jian1jia4,
          p_ren2min2bi4mo4xi1ge1bi3suo3zhang3die1fu2,
          p_ren2min2bi4tai4zhu1zhong1jian1jia4,
          p_ren2min2bi4tai4zhu1zhang3die1fu2
        )
      }
  }

}

object JsonItem_macro_china_rmbResponse extends Json_macro_china_rmbResponse
