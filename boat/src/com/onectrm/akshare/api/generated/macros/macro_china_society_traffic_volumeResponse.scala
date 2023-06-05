package com.onectrm.akshare.api.generated.macros;

import com.onectrm.akshare.api.generated.macros.macro_china_society_traffic_volumeResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: macro 接口: macro_china_society_traffic_volume 目标地址:
  * http://finance.sina.com.cn/mac/#industry-10-0-31-1 描述: 国家统计局-全社会客货运输量-非累计 限量: 单次返回所有历史数据
  */
case class Respmacro_china_society_traffic_volumeResponse(
  `p_tong3ji4shi2jian1`: String,
  `p_tong3ji4dui4xiang4`: Double,
  `p_huo4yun4liang4`: Double,
  `p_huo4yun4liang4tong2bi3zeng1zhang3`: Double,
  `p_huo4wu4zhou1zhuan3liang4`: Double,
  `p_gong1li3huo4wu4zhou1zhuan3liang4tong2bi3zeng1zhang3`: Double,
  `p_ke4yun4liang4`: Double,
  `p_ke4yun4liang4tong2bi3zeng1zhang3`: Double,
  `p_lu3ke4zhou1zhuan3liang4`: Double,
  `p_gong1li3lu3ke4zhou1zhuan3liang4tong2bi3zeng1zhang3`: Double,
  `p_yan2hai3zhu3yao4gang3kou3huo4wu4tun1tu3liang4`: Double,
  `p_yan2hai3zhu3yao4gang3kou3huo4wu4tun1tu3liang4tong2bi3zeng1zhang3`: Double,
  `p_qi2zhong1wai4mao4huo4wu4tun1tu3liang4`: Double,
  `p_qi2zhong1wai4mao4huo4wu4tun1tu3liang4tong2bi3zeng1zhang3`: Double,
  `p_min2hang2zong3zhou1zhuan3liang4`: Double,
  `p_gong1li3min2hang2zong3zhou1zhuan3`: Double
)

case class macro_china_society_traffic_volumeResponse(
  `p_tong3ji4shi2jian1`: String,
  `p_tong3ji4dui4xiang4`: Double,
  `p_huo4yun4liang4`: Double,
  `p_huo4yun4liang4tong2bi3zeng1zhang3`: Double,
  `p_huo4wu4zhou1zhuan3liang4`: Double,
  `p_gong1li3huo4wu4zhou1zhuan3liang4tong2bi3zeng1zhang3`: Double,
  `p_ke4yun4liang4`: Double,
  `p_ke4yun4liang4tong2bi3zeng1zhang3`: Double,
  `p_lu3ke4zhou1zhuan3liang4`: Double,
  `p_gong1li3lu3ke4zhou1zhuan3liang4tong2bi3zeng1zhang3`: Double,
  `p_yan2hai3zhu3yao4gang3kou3huo4wu4tun1tu3liang4`: Double,
  `p_yan2hai3zhu3yao4gang3kou3huo4wu4tun1tu3liang4tong2bi3zeng1zhang3`: Double,
  `p_qi2zhong1wai4mao4huo4wu4tun1tu3liang4`: Double,
  `p_qi2zhong1wai4mao4huo4wu4tun1tu3liang4tong2bi3zeng1zhang3`: Double,
  `p_min2hang2zong3zhou1zhuan3liang4`: Double,
  `p_gong1li3min2hang2zong3zhou1zhuan3`: Double
)

trait Json_macro_china_society_traffic_volumeResponse {

  implicit val a_macro_china_society_traffic_volumeResponse =
    new Decoder[macro_china_society_traffic_volumeResponse] {
      final def apply(c: HCursor): Decoder.Result[macro_china_society_traffic_volumeResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_tong3ji4shi2jian1 <- c.downField("统计时间").as[String]

          p_tong3ji4dui4xiang4 <- c.downField("统计对象").as[Double]

          p_huo4yun4liang4 <- c.downField("货运量").as[Double]

          p_huo4yun4liang4tong2bi3zeng1zhang3 <- c.downField("货运量同比增长").as[Double]

          p_huo4wu4zhou1zhuan3liang4 <- c.downField("货物周转量").as[Double]

          p_gong1li3huo4wu4zhou1zhuan3liang4tong2bi3zeng1zhang3 <- c
            .downField("公里货物周转量同比增长")
            .as[Double]

          p_ke4yun4liang4 <- c.downField("客运量").as[Double]

          p_ke4yun4liang4tong2bi3zeng1zhang3 <- c.downField("客运量同比增长").as[Double]

          p_lu3ke4zhou1zhuan3liang4 <- c.downField("旅客周转量").as[Double]

          p_gong1li3lu3ke4zhou1zhuan3liang4tong2bi3zeng1zhang3 <- c
            .downField("公里旅客周转量同比增长")
            .as[Double]

          p_yan2hai3zhu3yao4gang3kou3huo4wu4tun1tu3liang4 <- c.downField("沿海主要港口货物吞吐量").as[Double]

          p_yan2hai3zhu3yao4gang3kou3huo4wu4tun1tu3liang4tong2bi3zeng1zhang3 <- c
            .downField("沿海主要港口货物吞吐量同比增长")
            .as[Double]

          p_qi2zhong1wai4mao4huo4wu4tun1tu3liang4 <- c.downField("其中:外贸货物吞吐量").as[Double]

          p_qi2zhong1wai4mao4huo4wu4tun1tu3liang4tong2bi3zeng1zhang3 <- c
            .downField("其中:外贸货物吞吐量同比增长")
            .as[Double]

          p_min2hang2zong3zhou1zhuan3liang4 <- c.downField("民航总周转量").as[Double]

          p_gong1li3min2hang2zong3zhou1zhuan3 <- c.downField("公里民航总周转").as[Double]

        } yield {
          macro_china_society_traffic_volumeResponse(
            p_tong3ji4shi2jian1,
            p_tong3ji4dui4xiang4,
            p_huo4yun4liang4,
            p_huo4yun4liang4tong2bi3zeng1zhang3,
            p_huo4wu4zhou1zhuan3liang4,
            p_gong1li3huo4wu4zhou1zhuan3liang4tong2bi3zeng1zhang3,
            p_ke4yun4liang4,
            p_ke4yun4liang4tong2bi3zeng1zhang3,
            p_lu3ke4zhou1zhuan3liang4,
            p_gong1li3lu3ke4zhou1zhuan3liang4tong2bi3zeng1zhang3,
            p_yan2hai3zhu3yao4gang3kou3huo4wu4tun1tu3liang4,
            p_yan2hai3zhu3yao4gang3kou3huo4wu4tun1tu3liang4tong2bi3zeng1zhang3,
            p_qi2zhong1wai4mao4huo4wu4tun1tu3liang4,
            p_qi2zhong1wai4mao4huo4wu4tun1tu3liang4tong2bi3zeng1zhang3,
            p_min2hang2zong3zhou1zhuan3liang4,
            p_gong1li3min2hang2zong3zhou1zhuan3
          )
        }
    }

}

object JsonItem_macro_china_society_traffic_volumeResponse
    extends Json_macro_china_society_traffic_volumeResponse
