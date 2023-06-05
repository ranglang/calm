package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_share_change_cninfoResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_share_change_cninfo 目标地址: http://webapi.cninfo.com.cn/#/apiDoc 描述:
  * 巨潮资讯-数据-公司股本变动 限量: 单次获取指定 symbol 在 start_date 和 end_date 之间的公司股本变动数据
  */
case class Respstock_share_change_cninfoResponse(
  `p_zheng4quan4jian3cheng1`: String,
  `p_ji1gou4ming2cheng1`: String,
  `p_jing4wai4fa3ren2chi2gu3`: Double,
  `p_zheng4quan4tou2zi1ji1jin1chi2gu3`: Double,
  `p_guo2jia1chi2gu3shou4xian4`: Double,
  `p_guo2you3fa3ren2chi2gu3`: Double,
  `p_pei4shou4fa3ren2gu3`: Double,
  `p_fa1qi3ren2gu3fen4`: Double,
  `p_wei4liu2tong1gu3fen4`: Double,
  `p_qi2zhong1jing4wai4zi4ran2ren2chi2gu3`: Double,
  `p_qi2ta1liu2tong1shou4xian4gu3fen4`: Double,
  `p_qi2ta1liu2tong1gu3`: Double,
  `p_wai4zi1chi2gu3shou4xian4`: Double,
  `p_nei4bu4zhi2gong1gu3`: Double,
  `p_jing4wai4shang4shi4wai4zi1gu3Hgu3`: Double,
  `p_qi2zhong1jing4nei4fa3ren2chi2gu3`: Double,
  `p_zi4ran2ren2chi2gu3`: Double,
  `p_ren2min2bi4pu3tong1gu3`: Double,
  `p_guo2you3fa3ren2chi2gu3shou4xian4`: Double,
  `p_yi1ban1fa3ren2chi2gu3`: Double,
  `p_kong4gu3gu3dong1shi2ji4kong4zhi4ren2`: Double,
  `p_qi2zhong1xian4shou4Hgu3`: Double,
  `p_bian4dong4yuan2yin1`: String,
  `p_gong1gao4ri4qi1`: String,
  `p_jing4nei4fa3ren2chi2gu3`: Double,
  `p_zheng4quan4dai4ma3`: String,
  `p_bian4dong4ri4qi1`: String,
  `p_zhan4lue4tou2zi1zhe3chi2gu3`: Double,
  `p_guo2jia1chi2gu3`: Double,
  `p_qi2zhong1xian4shou4Bgu3`: Double,
  `p_qi2ta1wei4liu2tong1gu3`: Double,
  `p_liu2tong1shou4xian4gu3fen4`: Double,
  `p_you1xian1gu3`: Double,
  `p_gao1guan3gu3`: Double,
  `p_zong3gu3ben3`: Double,
  `p_qi2zhong1xian4shou4gao1guan3gu3`: Double,
  `p_zhuan3pei4gu3`: Double,
  `p_jing4nei4shang4shi4wai4zi1gu3Bgu3`: Double,
  `p_qi2zhong1jing4wai4fa3ren2chi2gu3`: Double,
  `p_mu4ji2fa3ren2gu3`: Double,
  `p_yi3liu2tong1gu3fen4`: Double,
  `p_qi2zhong1jing4nei4zi4ran2ren2chi2gu3`: Double,
  `p_qi2ta1nei4zi1chi2gu3shou4xian4`: Double,
  `p_bian4dong4yuan2yin1bian1ma3`: String
)

case class stock_share_change_cninfoResponse(
  `p_zheng4quan4jian3cheng1`: String,
  `p_ji1gou4ming2cheng1`: String,
  `p_jing4wai4fa3ren2chi2gu3`: Double,
  `p_zheng4quan4tou2zi1ji1jin1chi2gu3`: Double,
  `p_guo2jia1chi2gu3shou4xian4`: Double,
  `p_guo2you3fa3ren2chi2gu3`: Double,
  `p_pei4shou4fa3ren2gu3`: Double,
  `p_fa1qi3ren2gu3fen4`: Double,
  `p_wei4liu2tong1gu3fen4`: Double,
  `p_qi2zhong1jing4wai4zi4ran2ren2chi2gu3`: Double,
  `p_qi2ta1liu2tong1shou4xian4gu3fen4`: Double,
  `p_qi2ta1liu2tong1gu3`: Double,
  `p_wai4zi1chi2gu3shou4xian4`: Double,
  `p_nei4bu4zhi2gong1gu3`: Double,
  `p_jing4wai4shang4shi4wai4zi1gu3Hgu3`: Double,
  `p_qi2zhong1jing4nei4fa3ren2chi2gu3`: Double,
  `p_zi4ran2ren2chi2gu3`: Double,
  `p_ren2min2bi4pu3tong1gu3`: Double,
  `p_guo2you3fa3ren2chi2gu3shou4xian4`: Double,
  `p_yi1ban1fa3ren2chi2gu3`: Double,
  `p_kong4gu3gu3dong1shi2ji4kong4zhi4ren2`: Double,
  `p_qi2zhong1xian4shou4Hgu3`: Double,
  `p_bian4dong4yuan2yin1`: String,
  `p_gong1gao4ri4qi1`: String,
  `p_jing4nei4fa3ren2chi2gu3`: Double,
  `p_zheng4quan4dai4ma3`: String,
  `p_bian4dong4ri4qi1`: String,
  `p_zhan4lue4tou2zi1zhe3chi2gu3`: Double,
  `p_guo2jia1chi2gu3`: Double,
  `p_qi2zhong1xian4shou4Bgu3`: Double,
  `p_qi2ta1wei4liu2tong1gu3`: Double,
  `p_liu2tong1shou4xian4gu3fen4`: Double,
  `p_you1xian1gu3`: Double,
  `p_gao1guan3gu3`: Double,
  `p_zong3gu3ben3`: Double,
  `p_qi2zhong1xian4shou4gao1guan3gu3`: Double,
  `p_zhuan3pei4gu3`: Double,
  `p_jing4nei4shang4shi4wai4zi1gu3Bgu3`: Double,
  `p_qi2zhong1jing4wai4fa3ren2chi2gu3`: Double,
  `p_mu4ji2fa3ren2gu3`: Double,
  `p_yi3liu2tong1gu3fen4`: Double,
  `p_qi2zhong1jing4nei4zi4ran2ren2chi2gu3`: Double,
  `p_qi2ta1nei4zi1chi2gu3shou4xian4`: Double,
  `p_bian4dong4yuan2yin1bian1ma3`: String
)

trait Json_stock_share_change_cninfoResponse {

  implicit val a_stock_share_change_cninfoResponse =
    new Decoder[stock_share_change_cninfoResponse] {
      final def apply(c: HCursor): Decoder.Result[stock_share_change_cninfoResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_zheng4quan4jian3cheng1 <- c.downField("证券简称").as[String]

          p_ji1gou4ming2cheng1 <- c.downField("机构名称").as[String]

          p_jing4wai4fa3ren2chi2gu3 <- c.downField("境外法人持股").as[Double]

          p_zheng4quan4tou2zi1ji1jin1chi2gu3 <- c.downField("证券投资基金持股").as[Double]

          p_guo2jia1chi2gu3shou4xian4 <- c.downField("国家持股-受限").as[Double]

          p_guo2you3fa3ren2chi2gu3 <- c.downField("国有法人持股").as[Double]

          p_pei4shou4fa3ren2gu3 <- c.downField("配售法人股").as[Double]

          p_fa1qi3ren2gu3fen4 <- c.downField("发起人股份").as[Double]

          p_wei4liu2tong1gu3fen4 <- c.downField("未流通股份").as[Double]

          p_qi2zhong1jing4wai4zi4ran2ren2chi2gu3 <- c.downField("其中：境外自然人持股").as[Double]

          p_qi2ta1liu2tong1shou4xian4gu3fen4 <- c.downField("其他流通受限股份").as[Double]

          p_qi2ta1liu2tong1gu3 <- c.downField("其他流通股").as[Double]

          p_wai4zi1chi2gu3shou4xian4 <- c.downField("外资持股-受限").as[Double]

          p_nei4bu4zhi2gong1gu3 <- c.downField("内部职工股").as[Double]

          p_jing4wai4shang4shi4wai4zi1gu3Hgu3 <- c.downField("境外上市外资股-H股").as[Double]

          p_qi2zhong1jing4nei4fa3ren2chi2gu3 <- c.downField("其中：境内法人持股").as[Double]

          p_zi4ran2ren2chi2gu3 <- c.downField("自然人持股").as[Double]

          p_ren2min2bi4pu3tong1gu3 <- c.downField("人民币普通股").as[Double]

          p_guo2you3fa3ren2chi2gu3shou4xian4 <- c.downField("国有法人持股-受限").as[Double]

          p_yi1ban1fa3ren2chi2gu3 <- c.downField("一般法人持股").as[Double]

          p_kong4gu3gu3dong1shi2ji4kong4zhi4ren2 <- c.downField("控股股东、实际控制人").as[Double]

          p_qi2zhong1xian4shou4Hgu3 <- c.downField("其中：限售H股").as[Double]

          p_bian4dong4yuan2yin1 <- c.downField("变动原因").as[String]

          p_gong1gao4ri4qi1 <- c.downField("公告日期").as[String]

          p_jing4nei4fa3ren2chi2gu3 <- c.downField("境内法人持股").as[Double]

          p_zheng4quan4dai4ma3 <- c.downField("证券代码").as[String]

          p_bian4dong4ri4qi1 <- c.downField("变动日期").as[String]

          p_zhan4lue4tou2zi1zhe3chi2gu3 <- c.downField("战略投资者持股").as[Double]

          p_guo2jia1chi2gu3 <- c.downField("国家持股").as[Double]

          p_qi2zhong1xian4shou4Bgu3 <- c.downField("其中：限售B股").as[Double]

          p_qi2ta1wei4liu2tong1gu3 <- c.downField("其他未流通股").as[Double]

          p_liu2tong1shou4xian4gu3fen4 <- c.downField("流通受限股份").as[Double]

          p_you1xian1gu3 <- c.downField("优先股").as[Double]

          p_gao1guan3gu3 <- c.downField("高管股").as[Double]

          p_zong3gu3ben3 <- c.downField("总股本").as[Double]

          p_qi2zhong1xian4shou4gao1guan3gu3 <- c.downField("其中：限售高管股").as[Double]

          p_zhuan3pei4gu3 <- c.downField("转配股").as[Double]

          p_jing4nei4shang4shi4wai4zi1gu3Bgu3 <- c.downField("境内上市外资股-B股").as[Double]

          p_qi2zhong1jing4wai4fa3ren2chi2gu3 <- c.downField("其中：境外法人持股").as[Double]

          p_mu4ji2fa3ren2gu3 <- c.downField("募集法人股").as[Double]

          p_yi3liu2tong1gu3fen4 <- c.downField("已流通股份").as[Double]

          p_qi2zhong1jing4nei4zi4ran2ren2chi2gu3 <- c.downField("其中：境内自然人持股").as[Double]

          p_qi2ta1nei4zi1chi2gu3shou4xian4 <- c.downField("其他内资持股-受限").as[Double]

          p_bian4dong4yuan2yin1bian1ma3 <- c.downField("变动原因编码").as[String]

        } yield {
          stock_share_change_cninfoResponse(
            p_zheng4quan4jian3cheng1,
            p_ji1gou4ming2cheng1,
            p_jing4wai4fa3ren2chi2gu3,
            p_zheng4quan4tou2zi1ji1jin1chi2gu3,
            p_guo2jia1chi2gu3shou4xian4,
            p_guo2you3fa3ren2chi2gu3,
            p_pei4shou4fa3ren2gu3,
            p_fa1qi3ren2gu3fen4,
            p_wei4liu2tong1gu3fen4,
            p_qi2zhong1jing4wai4zi4ran2ren2chi2gu3,
            p_qi2ta1liu2tong1shou4xian4gu3fen4,
            p_qi2ta1liu2tong1gu3,
            p_wai4zi1chi2gu3shou4xian4,
            p_nei4bu4zhi2gong1gu3,
            p_jing4wai4shang4shi4wai4zi1gu3Hgu3,
            p_qi2zhong1jing4nei4fa3ren2chi2gu3,
            p_zi4ran2ren2chi2gu3,
            p_ren2min2bi4pu3tong1gu3,
            p_guo2you3fa3ren2chi2gu3shou4xian4,
            p_yi1ban1fa3ren2chi2gu3,
            p_kong4gu3gu3dong1shi2ji4kong4zhi4ren2,
            p_qi2zhong1xian4shou4Hgu3,
            p_bian4dong4yuan2yin1,
            p_gong1gao4ri4qi1,
            p_jing4nei4fa3ren2chi2gu3,
            p_zheng4quan4dai4ma3,
            p_bian4dong4ri4qi1,
            p_zhan4lue4tou2zi1zhe3chi2gu3,
            p_guo2jia1chi2gu3,
            p_qi2zhong1xian4shou4Bgu3,
            p_qi2ta1wei4liu2tong1gu3,
            p_liu2tong1shou4xian4gu3fen4,
            p_you1xian1gu3,
            p_gao1guan3gu3,
            p_zong3gu3ben3,
            p_qi2zhong1xian4shou4gao1guan3gu3,
            p_zhuan3pei4gu3,
            p_jing4nei4shang4shi4wai4zi1gu3Bgu3,
            p_qi2zhong1jing4wai4fa3ren2chi2gu3,
            p_mu4ji2fa3ren2gu3,
            p_yi3liu2tong1gu3fen4,
            p_qi2zhong1jing4nei4zi4ran2ren2chi2gu3,
            p_qi2ta1nei4zi1chi2gu3shou4xian4,
            p_bian4dong4yuan2yin1bian1ma3
          )
        }
    }

}

object JsonItem_stock_share_change_cninfoResponse extends Json_stock_share_change_cninfoResponse
