package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_financial_analysis_indicatorResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_financial_analysis_indicator 目标地址:
  * https://money.finance.sina.com.cn/corp/go.php/vFD_FinancialGuideLine/stockid/600004/ctrl/2019/displaytype/4.phtml
  * 描述: 新浪财经-财务分析-财务指标 限量: 单次获取指定 symbol 财务指标所有历史数据
  */
case class Respstock_financial_analysis_indicatorResponse(
  `p_ri4qi1`: String,
  `p_tan1bo2mei3gu3shou1yi4yuan2`: String,
  `p_jia1quan2mei3gu3shou1yi4yuan2`: String,
  `p_mei3gu3shou1yi4diao4zheng3hou4yuan2`: String,
  `p_kou4chu2fei1jing1chang2xing4sun3yi4hou4de5mei3gu3shou1yi4yuan2`: String,
  `p_mei3gu3jing4zi1chan3diao4zheng3qian2yuan2`: String,
  `p_mei3gu3jing4zi1chan3diao4zheng3hou4yuan2`: String,
  `p_mei3gu3jing1ying2xing4xian4jin1liu2yuan2`: String,
  `p_mei3gu3zi1ben3gong1ji1jin1yuan2`: String,
  `p_mei3gu3wei4fen1pei4li4run4yuan2`: String,
  `p_diao4zheng3hou4de5mei3gu3jing4zi1chan3yuan2`: String,
  `p_zong3zi1chan3li4run4lu4`: String,
  `p_zhu3ying2ye4wu4li4run4lu4`: String,
  `p_zong3zi1chan3jing4li4run4lu4`: String,
  `p_cheng2ben3fei4yong4li4run4lu4`: String,
  `p_ying2ye4li4run4lu4`: String,
  `p_zhu3ying2ye4wu4cheng2ben3lu4`: String,
  `p_xiao1shou4jing4li4lu4`: String,
  `p_gu3ben3bao4chou2lu4`: String,
  `p_jing4zi1chan3bao4chou2lu4`: String,
  `p_zi1chan3bao4chou2lu4`: String,
  `p_xiao1shou4mao2li4lu4`: String,
  `p_san1xiang4fei4yong4bi3zhong4`: String,
  `p_fei1zhu3ying2bi3zhong4`: String,
  `p_zhu3ying2li4run4bi3zhong4`: String,
  `p_gu3xi1fa1fang4lu4`: String,
  `p_tou2zi1shou1yi4lu4`: String,
  `p_zhu3ying2ye4wu4li4run4yuan2`: String,
  `p_jing4zi1chan3shou1yi4lu4`: String,
  `p_jia1quan2jing4zi1chan3shou1yi4lu4`: String,
  `p_kou4chu2fei1jing1chang2xing4sun3yi4hou4de5jing4li4run4yuan2`: String,
  `p_zhu3ying2ye4wu4shou1ru4zeng1zhang3lu4`: String,
  `p_jing4li4run4zeng1zhang3lu4`: String,
  `p_jing4zi1chan3zeng1zhang3lu4`: String,
  `p_zong3zi1chan3zeng1zhang3lu4`: String,
  `p_ying1shou1zhang4kuan3zhou1zhuan3lu4ci4`: String,
  `p_ying1shou1zhang4kuan3zhou1zhuan3tian1shu4tian1`: String,
  `p_cun2huo4zhou1zhuan3tian1shu4tian1`: String,
  `p_cun2huo4zhou1zhuan3lu4ci4`: String,
  `p_gu4ding4zi1chan3zhou1zhuan3lu4ci4`: String,
  `p_zong3zi1chan3zhou1zhuan3lu4ci4`: String,
  `p_zong3zi1chan3zhou1zhuan3tian1shu4tian1`: String,
  `p_liu2dong4zi1chan3zhou1zhuan3lu4ci4`: String,
  `p_liu2dong4zi1chan3zhou1zhuan3tian1shu4tian1`: String,
  `p_gu3dong1quan2yi4zhou1zhuan3lu4ci4`: String,
  `p_liu2dong4bi3lu4`: String,
  `p_su4dong4bi3lu4`: String,
  `p_xian4jin1bi3lu4`: String,
  `p_li4xi1zhi1fu4bei4shu4`: String,
  `p_zhang3qi1zhai4wu4yu3ying2yun4zi1jin1bi3lu4`: String,
  `p_gu3dong1quan2yi4bi3lu4`: String,
  `p_zhang3qi1fu4zhai4bi3lu4`: String,
  `p_gu3dong1quan2yi4yu3gu4ding4zi1chan3bi3lu4`: String,
  `p_fu4zhai4yu3suo3you3zhe3quan2yi4bi3lu4`: String,
  `p_zhang3qi1zi1chan3yu3zhang3qi1zi1jin1bi3lu4`: String,
  `p_zi1ben3hua4bi3lu4`: String,
  `p_gu4ding4zi1chan3jing4zhi2lu4`: String,
  `p_zi1ben3gu4ding4hua4bi3lu4`: String,
  `p_chan3quan2bi3lu4`: String,
  `p_qing1suan4jia4zhi2bi3lu4`: String,
  `p_gu4ding4zi1chan3bi3zhong4`: String,
  `p_zi1chan3fu4zhai4lu4`: String,
  `p_zong3zi1chan3yuan2`: String,
  `p_jing1ying2xian4jin1jing4liu2liang4dui4xiao1shou4shou1ru4bi3lu4`: String,
  `p_zi1chan3de5jing1ying2xian4jin1liu2liang4hui2bao4lu4`: String,
  `p_jing1ying2xian4jin1jing4liu2liang4yu3jing4li4run4de5bi3lu4`: String,
  `p_jing1ying2xian4jin1jing4liu2liang4dui4fu4zhai4bi3lu4`: String,
  `p_xian4jin1liu2liang4bi3lu4`: String,
  `p_duan3qi1gu3piao4tou2zi1yuan2`: String,
  `p_duan3qi1zhai4quan4tou2zi1yuan2`: String,
  `p_duan3qi1qi2ta1jing1ying2xing4tou2zi1yuan2`: String,
  `p_zhang3qi1gu3piao4tou2zi1yuan2`: String,
  `p_zhang3qi1zhai4quan4tou2zi1yuan2`: String,
  `p_zhang3qi1qi2ta1jing1ying2xing4tou2zi1yuan2`: String,
  `p_1nian2yi3nei4ying1shou1zhang4kuan3yuan2`: String,
  `p_12nian2yi3nei4ying1shou1zhang4kuan3yuan2`: String,
  `p_23nian2yi3nei4ying1shou1zhang4kuan3yuan2`: String,
  `p_3nian2yi3nei4ying1shou1zhang4kuan3yuan2`: String,
  `p_1nian2yi3nei4yu4fu4huo4kuan3yuan2`: String,
  `p_12nian2yi3nei4yu4fu4huo4kuan3yuan2`: String,
  `p_23nian2yi3nei4yu4fu4huo4kuan3yuan2`: String,
  `p_3nian2yi3nei4yu4fu4huo4kuan3yuan2`: String,
  `p_1nian2yi3nei4qi2ta1ying1shou1kuan3yuan2`: String,
  `p_12nian2yi3nei4qi2ta1ying1shou1kuan3yuan2`: String,
  `p_23nian2yi3nei4qi2ta1ying1shou1kuan3yuan2`: String,
  `p_3nian2yi3nei4qi2ta1ying1shou1kuan3yuan2`: String
)

case class stock_financial_analysis_indicatorResponse(
  `p_ri4qi1`: String,
  `p_tan1bo2mei3gu3shou1yi4yuan2`: String,
  `p_jia1quan2mei3gu3shou1yi4yuan2`: String,
  `p_mei3gu3shou1yi4diao4zheng3hou4yuan2`: String,
  `p_kou4chu2fei1jing1chang2xing4sun3yi4hou4de5mei3gu3shou1yi4yuan2`: String,
  `p_mei3gu3jing4zi1chan3diao4zheng3qian2yuan2`: String,
  `p_mei3gu3jing4zi1chan3diao4zheng3hou4yuan2`: String,
  `p_mei3gu3jing1ying2xing4xian4jin1liu2yuan2`: String,
  `p_mei3gu3zi1ben3gong1ji1jin1yuan2`: String,
  `p_mei3gu3wei4fen1pei4li4run4yuan2`: String,
  `p_diao4zheng3hou4de5mei3gu3jing4zi1chan3yuan2`: String,
  `p_zong3zi1chan3li4run4lu4`: String,
  `p_zhu3ying2ye4wu4li4run4lu4`: String,
  `p_zong3zi1chan3jing4li4run4lu4`: String,
  `p_cheng2ben3fei4yong4li4run4lu4`: String,
  `p_ying2ye4li4run4lu4`: String,
  `p_zhu3ying2ye4wu4cheng2ben3lu4`: String,
  `p_xiao1shou4jing4li4lu4`: String,
  `p_gu3ben3bao4chou2lu4`: String,
  `p_jing4zi1chan3bao4chou2lu4`: String,
  `p_zi1chan3bao4chou2lu4`: String,
  `p_xiao1shou4mao2li4lu4`: String,
  `p_san1xiang4fei4yong4bi3zhong4`: String,
  `p_fei1zhu3ying2bi3zhong4`: String,
  `p_zhu3ying2li4run4bi3zhong4`: String,
  `p_gu3xi1fa1fang4lu4`: String,
  `p_tou2zi1shou1yi4lu4`: String,
  `p_zhu3ying2ye4wu4li4run4yuan2`: String,
  `p_jing4zi1chan3shou1yi4lu4`: String,
  `p_jia1quan2jing4zi1chan3shou1yi4lu4`: String,
  `p_kou4chu2fei1jing1chang2xing4sun3yi4hou4de5jing4li4run4yuan2`: String,
  `p_zhu3ying2ye4wu4shou1ru4zeng1zhang3lu4`: String,
  `p_jing4li4run4zeng1zhang3lu4`: String,
  `p_jing4zi1chan3zeng1zhang3lu4`: String,
  `p_zong3zi1chan3zeng1zhang3lu4`: String,
  `p_ying1shou1zhang4kuan3zhou1zhuan3lu4ci4`: String,
  `p_ying1shou1zhang4kuan3zhou1zhuan3tian1shu4tian1`: String,
  `p_cun2huo4zhou1zhuan3tian1shu4tian1`: String,
  `p_cun2huo4zhou1zhuan3lu4ci4`: String,
  `p_gu4ding4zi1chan3zhou1zhuan3lu4ci4`: String,
  `p_zong3zi1chan3zhou1zhuan3lu4ci4`: String,
  `p_zong3zi1chan3zhou1zhuan3tian1shu4tian1`: String,
  `p_liu2dong4zi1chan3zhou1zhuan3lu4ci4`: String,
  `p_liu2dong4zi1chan3zhou1zhuan3tian1shu4tian1`: String,
  `p_gu3dong1quan2yi4zhou1zhuan3lu4ci4`: String,
  `p_liu2dong4bi3lu4`: String,
  `p_su4dong4bi3lu4`: String,
  `p_xian4jin1bi3lu4`: String,
  `p_li4xi1zhi1fu4bei4shu4`: String,
  `p_zhang3qi1zhai4wu4yu3ying2yun4zi1jin1bi3lu4`: String,
  `p_gu3dong1quan2yi4bi3lu4`: String,
  `p_zhang3qi1fu4zhai4bi3lu4`: String,
  `p_gu3dong1quan2yi4yu3gu4ding4zi1chan3bi3lu4`: String,
  `p_fu4zhai4yu3suo3you3zhe3quan2yi4bi3lu4`: String,
  `p_zhang3qi1zi1chan3yu3zhang3qi1zi1jin1bi3lu4`: String,
  `p_zi1ben3hua4bi3lu4`: String,
  `p_gu4ding4zi1chan3jing4zhi2lu4`: String,
  `p_zi1ben3gu4ding4hua4bi3lu4`: String,
  `p_chan3quan2bi3lu4`: String,
  `p_qing1suan4jia4zhi2bi3lu4`: String,
  `p_gu4ding4zi1chan3bi3zhong4`: String,
  `p_zi1chan3fu4zhai4lu4`: String,
  `p_zong3zi1chan3yuan2`: String,
  `p_jing1ying2xian4jin1jing4liu2liang4dui4xiao1shou4shou1ru4bi3lu4`: String,
  `p_zi1chan3de5jing1ying2xian4jin1liu2liang4hui2bao4lu4`: String,
  `p_jing1ying2xian4jin1jing4liu2liang4yu3jing4li4run4de5bi3lu4`: String,
  `p_jing1ying2xian4jin1jing4liu2liang4dui4fu4zhai4bi3lu4`: String,
  `p_xian4jin1liu2liang4bi3lu4`: String,
  `p_duan3qi1gu3piao4tou2zi1yuan2`: String,
  `p_duan3qi1zhai4quan4tou2zi1yuan2`: String,
  `p_duan3qi1qi2ta1jing1ying2xing4tou2zi1yuan2`: String,
  `p_zhang3qi1gu3piao4tou2zi1yuan2`: String,
  `p_zhang3qi1zhai4quan4tou2zi1yuan2`: String,
  `p_zhang3qi1qi2ta1jing1ying2xing4tou2zi1yuan2`: String,
  `p_1nian2yi3nei4ying1shou1zhang4kuan3yuan2`: String,
  `p_12nian2yi3nei4ying1shou1zhang4kuan3yuan2`: String,
  `p_23nian2yi3nei4ying1shou1zhang4kuan3yuan2`: String,
  `p_3nian2yi3nei4ying1shou1zhang4kuan3yuan2`: String,
  `p_1nian2yi3nei4yu4fu4huo4kuan3yuan2`: String,
  `p_12nian2yi3nei4yu4fu4huo4kuan3yuan2`: String,
  `p_23nian2yi3nei4yu4fu4huo4kuan3yuan2`: String,
  `p_3nian2yi3nei4yu4fu4huo4kuan3yuan2`: String,
  `p_1nian2yi3nei4qi2ta1ying1shou1kuan3yuan2`: String,
  `p_12nian2yi3nei4qi2ta1ying1shou1kuan3yuan2`: String,
  `p_23nian2yi3nei4qi2ta1ying1shou1kuan3yuan2`: String,
  `p_3nian2yi3nei4qi2ta1ying1shou1kuan3yuan2`: String
)

trait Json_stock_financial_analysis_indicatorResponse {

  implicit val a_stock_financial_analysis_indicatorResponse =
    new Decoder[stock_financial_analysis_indicatorResponse] {
      final def apply(c: HCursor): Decoder.Result[stock_financial_analysis_indicatorResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_ri4qi1 <- c.downField("日期").as[String]

          p_tan1bo2mei3gu3shou1yi4yuan2 <- c.downField("摊薄每股收益(元)").as[String]

          p_jia1quan2mei3gu3shou1yi4yuan2 <- c.downField("加权每股收益(元)").as[String]

          p_mei3gu3shou1yi4diao4zheng3hou4yuan2 <- c.downField("每股收益_调整后(元)").as[String]

          p_kou4chu2fei1jing1chang2xing4sun3yi4hou4de5mei3gu3shou1yi4yuan2 <- c
            .downField("扣除非经常性损益后的每股收益(元)")
            .as[String]

          p_mei3gu3jing4zi1chan3diao4zheng3qian2yuan2 <- c.downField("每股净资产_调整前(元)").as[String]

          p_mei3gu3jing4zi1chan3diao4zheng3hou4yuan2 <- c.downField("每股净资产_调整后(元)").as[String]

          p_mei3gu3jing1ying2xing4xian4jin1liu2yuan2 <- c.downField("每股经营性现金流(元)").as[String]

          p_mei3gu3zi1ben3gong1ji1jin1yuan2 <- c.downField("每股资本公积金(元)").as[String]

          p_mei3gu3wei4fen1pei4li4run4yuan2 <- c.downField("每股未分配利润(元)").as[String]

          p_diao4zheng3hou4de5mei3gu3jing4zi1chan3yuan2 <- c.downField("调整后的每股净资产(元)").as[String]

          p_zong3zi1chan3li4run4lu4 <- c.downField("总资产利润率(%)").as[String]

          p_zhu3ying2ye4wu4li4run4lu4 <- c.downField("主营业务利润率(%)").as[String]

          p_zong3zi1chan3jing4li4run4lu4 <- c.downField("总资产净利润率(%)").as[String]

          p_cheng2ben3fei4yong4li4run4lu4 <- c.downField("成本费用利润率(%)").as[String]

          p_ying2ye4li4run4lu4 <- c.downField("营业利润率(%)").as[String]

          p_zhu3ying2ye4wu4cheng2ben3lu4 <- c.downField("主营业务成本率(%)").as[String]

          p_xiao1shou4jing4li4lu4 <- c.downField("销售净利率(%)").as[String]

          p_gu3ben3bao4chou2lu4 <- c.downField("股本报酬率(%)").as[String]

          p_jing4zi1chan3bao4chou2lu4 <- c.downField("净资产报酬率(%)").as[String]

          p_zi1chan3bao4chou2lu4 <- c.downField("资产报酬率(%)").as[String]

          p_xiao1shou4mao2li4lu4 <- c.downField("销售毛利率(%)").as[String]

          p_san1xiang4fei4yong4bi3zhong4 <- c.downField("三项费用比重").as[String]

          p_fei1zhu3ying2bi3zhong4 <- c.downField("非主营比重").as[String]

          p_zhu3ying2li4run4bi3zhong4 <- c.downField("主营利润比重").as[String]

          p_gu3xi1fa1fang4lu4 <- c.downField("股息发放率(%)").as[String]

          p_tou2zi1shou1yi4lu4 <- c.downField("投资收益率(%)").as[String]

          p_zhu3ying2ye4wu4li4run4yuan2 <- c.downField("主营业务利润(元)").as[String]

          p_jing4zi1chan3shou1yi4lu4 <- c.downField("净资产收益率(%)").as[String]

          p_jia1quan2jing4zi1chan3shou1yi4lu4 <- c.downField("加权净资产收益率(%)").as[String]

          p_kou4chu2fei1jing1chang2xing4sun3yi4hou4de5jing4li4run4yuan2 <- c
            .downField("扣除非经常性损益后的净利润(元)")
            .as[String]

          p_zhu3ying2ye4wu4shou1ru4zeng1zhang3lu4 <- c.downField("主营业务收入增长率(%)").as[String]

          p_jing4li4run4zeng1zhang3lu4 <- c.downField("净利润增长率(%)").as[String]

          p_jing4zi1chan3zeng1zhang3lu4 <- c.downField("净资产增长率(%)").as[String]

          p_zong3zi1chan3zeng1zhang3lu4 <- c.downField("总资产增长率(%)").as[String]

          p_ying1shou1zhang4kuan3zhou1zhuan3lu4ci4 <- c.downField("应收账款周转率(次)").as[String]

          p_ying1shou1zhang4kuan3zhou1zhuan3tian1shu4tian1 <- c.downField("应收账款周转天数(天)").as[String]

          p_cun2huo4zhou1zhuan3tian1shu4tian1 <- c.downField("存货周转天数(天)").as[String]

          p_cun2huo4zhou1zhuan3lu4ci4 <- c.downField("存货周转率(次)").as[String]

          p_gu4ding4zi1chan3zhou1zhuan3lu4ci4 <- c.downField("固定资产周转率(次)").as[String]

          p_zong3zi1chan3zhou1zhuan3lu4ci4 <- c.downField("总资产周转率(次)").as[String]

          p_zong3zi1chan3zhou1zhuan3tian1shu4tian1 <- c.downField("总资产周转天数(天)").as[String]

          p_liu2dong4zi1chan3zhou1zhuan3lu4ci4 <- c.downField("流动资产周转率(次)").as[String]

          p_liu2dong4zi1chan3zhou1zhuan3tian1shu4tian1 <- c.downField("流动资产周转天数(天)").as[String]

          p_gu3dong1quan2yi4zhou1zhuan3lu4ci4 <- c.downField("股东权益周转率(次)").as[String]

          p_liu2dong4bi3lu4 <- c.downField("流动比率").as[String]

          p_su4dong4bi3lu4 <- c.downField("速动比率").as[String]

          p_xian4jin1bi3lu4 <- c.downField("现金比率(%)").as[String]

          p_li4xi1zhi1fu4bei4shu4 <- c.downField("利息支付倍数").as[String]

          p_zhang3qi1zhai4wu4yu3ying2yun4zi1jin1bi3lu4 <- c.downField("长期债务与营运资金比率(%)").as[String]

          p_gu3dong1quan2yi4bi3lu4 <- c.downField("股东权益比率(%)").as[String]

          p_zhang3qi1fu4zhai4bi3lu4 <- c.downField("长期负债比率(%)").as[String]

          p_gu3dong1quan2yi4yu3gu4ding4zi1chan3bi3lu4 <- c.downField("股东权益与固定资产比率(%)").as[String]

          p_fu4zhai4yu3suo3you3zhe3quan2yi4bi3lu4 <- c.downField("负债与所有者权益比率(%)").as[String]

          p_zhang3qi1zi1chan3yu3zhang3qi1zi1jin1bi3lu4 <- c.downField("长期资产与长期资金比率(%)").as[String]

          p_zi1ben3hua4bi3lu4 <- c.downField("资本化比率(%)").as[String]

          p_gu4ding4zi1chan3jing4zhi2lu4 <- c.downField("固定资产净值率(%)").as[String]

          p_zi1ben3gu4ding4hua4bi3lu4 <- c.downField("资本固定化比率(%)").as[String]

          p_chan3quan2bi3lu4 <- c.downField("产权比率(%)").as[String]

          p_qing1suan4jia4zhi2bi3lu4 <- c.downField("清算价值比率(%)").as[String]

          p_gu4ding4zi1chan3bi3zhong4 <- c.downField("固定资产比重(%)").as[String]

          p_zi1chan3fu4zhai4lu4 <- c.downField("资产负债率(%)").as[String]

          p_zong3zi1chan3yuan2 <- c.downField("总资产(元)").as[String]

          p_jing1ying2xian4jin1jing4liu2liang4dui4xiao1shou4shou1ru4bi3lu4 <- c
            .downField("经营现金净流量对销售收入比率(%)")
            .as[String]

          p_zi1chan3de5jing1ying2xian4jin1liu2liang4hui2bao4lu4 <- c
            .downField("资产的经营现金流量回报率(%)")
            .as[String]

          p_jing1ying2xian4jin1jing4liu2liang4yu3jing4li4run4de5bi3lu4 <- c
            .downField("经营现金净流量与净利润的比率(%)")
            .as[String]

          p_jing1ying2xian4jin1jing4liu2liang4dui4fu4zhai4bi3lu4 <- c
            .downField("经营现金净流量对负债比率(%)")
            .as[String]

          p_xian4jin1liu2liang4bi3lu4 <- c.downField("现金流量比率(%)").as[String]

          p_duan3qi1gu3piao4tou2zi1yuan2 <- c.downField("短期股票投资(元)").as[String]

          p_duan3qi1zhai4quan4tou2zi1yuan2 <- c.downField("短期债券投资(元)").as[String]

          p_duan3qi1qi2ta1jing1ying2xing4tou2zi1yuan2 <- c.downField("短期其它经营性投资(元)").as[String]

          p_zhang3qi1gu3piao4tou2zi1yuan2 <- c.downField("长期股票投资(元)").as[String]

          p_zhang3qi1zhai4quan4tou2zi1yuan2 <- c.downField("长期债券投资(元)").as[String]

          p_zhang3qi1qi2ta1jing1ying2xing4tou2zi1yuan2 <- c.downField("长期其它经营性投资(元)").as[String]

          p_1nian2yi3nei4ying1shou1zhang4kuan3yuan2 <- c.downField("1年以内应收帐款(元)").as[String]

          p_12nian2yi3nei4ying1shou1zhang4kuan3yuan2 <- c.downField("1-2年以内应收帐款(元)").as[String]

          p_23nian2yi3nei4ying1shou1zhang4kuan3yuan2 <- c.downField("2-3年以内应收帐款(元)").as[String]

          p_3nian2yi3nei4ying1shou1zhang4kuan3yuan2 <- c.downField("3年以内应收帐款(元)").as[String]

          p_1nian2yi3nei4yu4fu4huo4kuan3yuan2 <- c.downField("1年以内预付货款(元)").as[String]

          p_12nian2yi3nei4yu4fu4huo4kuan3yuan2 <- c.downField("1-2年以内预付货款(元)").as[String]

          p_23nian2yi3nei4yu4fu4huo4kuan3yuan2 <- c.downField("2-3年以内预付货款(元)").as[String]

          p_3nian2yi3nei4yu4fu4huo4kuan3yuan2 <- c.downField("3年以内预付货款(元)").as[String]

          p_1nian2yi3nei4qi2ta1ying1shou1kuan3yuan2 <- c.downField("1年以内其它应收款(元)").as[String]

          p_12nian2yi3nei4qi2ta1ying1shou1kuan3yuan2 <- c.downField("1-2年以内其它应收款(元)").as[String]

          p_23nian2yi3nei4qi2ta1ying1shou1kuan3yuan2 <- c.downField("2-3年以内其它应收款(元)").as[String]

          p_3nian2yi3nei4qi2ta1ying1shou1kuan3yuan2 <- c.downField("3年以内其它应收款(元)").as[String]

        } yield {
          stock_financial_analysis_indicatorResponse(
            p_ri4qi1,
            p_tan1bo2mei3gu3shou1yi4yuan2,
            p_jia1quan2mei3gu3shou1yi4yuan2,
            p_mei3gu3shou1yi4diao4zheng3hou4yuan2,
            p_kou4chu2fei1jing1chang2xing4sun3yi4hou4de5mei3gu3shou1yi4yuan2,
            p_mei3gu3jing4zi1chan3diao4zheng3qian2yuan2,
            p_mei3gu3jing4zi1chan3diao4zheng3hou4yuan2,
            p_mei3gu3jing1ying2xing4xian4jin1liu2yuan2,
            p_mei3gu3zi1ben3gong1ji1jin1yuan2,
            p_mei3gu3wei4fen1pei4li4run4yuan2,
            p_diao4zheng3hou4de5mei3gu3jing4zi1chan3yuan2,
            p_zong3zi1chan3li4run4lu4,
            p_zhu3ying2ye4wu4li4run4lu4,
            p_zong3zi1chan3jing4li4run4lu4,
            p_cheng2ben3fei4yong4li4run4lu4,
            p_ying2ye4li4run4lu4,
            p_zhu3ying2ye4wu4cheng2ben3lu4,
            p_xiao1shou4jing4li4lu4,
            p_gu3ben3bao4chou2lu4,
            p_jing4zi1chan3bao4chou2lu4,
            p_zi1chan3bao4chou2lu4,
            p_xiao1shou4mao2li4lu4,
            p_san1xiang4fei4yong4bi3zhong4,
            p_fei1zhu3ying2bi3zhong4,
            p_zhu3ying2li4run4bi3zhong4,
            p_gu3xi1fa1fang4lu4,
            p_tou2zi1shou1yi4lu4,
            p_zhu3ying2ye4wu4li4run4yuan2,
            p_jing4zi1chan3shou1yi4lu4,
            p_jia1quan2jing4zi1chan3shou1yi4lu4,
            p_kou4chu2fei1jing1chang2xing4sun3yi4hou4de5jing4li4run4yuan2,
            p_zhu3ying2ye4wu4shou1ru4zeng1zhang3lu4,
            p_jing4li4run4zeng1zhang3lu4,
            p_jing4zi1chan3zeng1zhang3lu4,
            p_zong3zi1chan3zeng1zhang3lu4,
            p_ying1shou1zhang4kuan3zhou1zhuan3lu4ci4,
            p_ying1shou1zhang4kuan3zhou1zhuan3tian1shu4tian1,
            p_cun2huo4zhou1zhuan3tian1shu4tian1,
            p_cun2huo4zhou1zhuan3lu4ci4,
            p_gu4ding4zi1chan3zhou1zhuan3lu4ci4,
            p_zong3zi1chan3zhou1zhuan3lu4ci4,
            p_zong3zi1chan3zhou1zhuan3tian1shu4tian1,
            p_liu2dong4zi1chan3zhou1zhuan3lu4ci4,
            p_liu2dong4zi1chan3zhou1zhuan3tian1shu4tian1,
            p_gu3dong1quan2yi4zhou1zhuan3lu4ci4,
            p_liu2dong4bi3lu4,
            p_su4dong4bi3lu4,
            p_xian4jin1bi3lu4,
            p_li4xi1zhi1fu4bei4shu4,
            p_zhang3qi1zhai4wu4yu3ying2yun4zi1jin1bi3lu4,
            p_gu3dong1quan2yi4bi3lu4,
            p_zhang3qi1fu4zhai4bi3lu4,
            p_gu3dong1quan2yi4yu3gu4ding4zi1chan3bi3lu4,
            p_fu4zhai4yu3suo3you3zhe3quan2yi4bi3lu4,
            p_zhang3qi1zi1chan3yu3zhang3qi1zi1jin1bi3lu4,
            p_zi1ben3hua4bi3lu4,
            p_gu4ding4zi1chan3jing4zhi2lu4,
            p_zi1ben3gu4ding4hua4bi3lu4,
            p_chan3quan2bi3lu4,
            p_qing1suan4jia4zhi2bi3lu4,
            p_gu4ding4zi1chan3bi3zhong4,
            p_zi1chan3fu4zhai4lu4,
            p_zong3zi1chan3yuan2,
            p_jing1ying2xian4jin1jing4liu2liang4dui4xiao1shou4shou1ru4bi3lu4,
            p_zi1chan3de5jing1ying2xian4jin1liu2liang4hui2bao4lu4,
            p_jing1ying2xian4jin1jing4liu2liang4yu3jing4li4run4de5bi3lu4,
            p_jing1ying2xian4jin1jing4liu2liang4dui4fu4zhai4bi3lu4,
            p_xian4jin1liu2liang4bi3lu4,
            p_duan3qi1gu3piao4tou2zi1yuan2,
            p_duan3qi1zhai4quan4tou2zi1yuan2,
            p_duan3qi1qi2ta1jing1ying2xing4tou2zi1yuan2,
            p_zhang3qi1gu3piao4tou2zi1yuan2,
            p_zhang3qi1zhai4quan4tou2zi1yuan2,
            p_zhang3qi1qi2ta1jing1ying2xing4tou2zi1yuan2,
            p_1nian2yi3nei4ying1shou1zhang4kuan3yuan2,
            p_12nian2yi3nei4ying1shou1zhang4kuan3yuan2,
            p_23nian2yi3nei4ying1shou1zhang4kuan3yuan2,
            p_3nian2yi3nei4ying1shou1zhang4kuan3yuan2,
            p_1nian2yi3nei4yu4fu4huo4kuan3yuan2,
            p_12nian2yi3nei4yu4fu4huo4kuan3yuan2,
            p_23nian2yi3nei4yu4fu4huo4kuan3yuan2,
            p_3nian2yi3nei4yu4fu4huo4kuan3yuan2,
            p_1nian2yi3nei4qi2ta1ying1shou1kuan3yuan2,
            p_12nian2yi3nei4qi2ta1ying1shou1kuan3yuan2,
            p_23nian2yi3nei4qi2ta1ying1shou1kuan3yuan2,
            p_3nian2yi3nei4qi2ta1ying1shou1kuan3yuan2
          )
        }
    }

}

object JsonItem_stock_financial_analysis_indicatorResponse
    extends Json_stock_financial_analysis_indicatorResponse
