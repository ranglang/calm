package com.lqiong.jep.config

import com.lqiong.jep.entry.EnterReason
import com.lqiong.model.trade.LogicPeriod

object LogicConfig {

  def getInitialTradeLogic(enterReason: EnterReason) = {
    import com.lqiong.model.trade.shot._
    import com.lqiong.model.trade.tradeLogic11._
    // 国产替代
    val tradeLogicList = List(
      trade index i"600233" step LogicPeriod.interst logic "连续快速增长" leaveBy enterReason
        .abovePriceBy(
          23.55
        ),
      trade index i"000016" step LogicPeriod.interst logic "saas收入增加" leaveBy enterReason
        .abovePriceBy(
          23.55
        ),
      trade index i"000016" step LogicPeriod.interst logic "saas收入增加" leaveBy enterReason
        .downPanmingBy(
          23.55
        ),
      trade code c"603233" step LogicPeriod.start logic "医药连锁" shots List(),
      trade code c"300673" step LogicPeriod.start logic "医药连锁" shots List(),
      trade code c"603233" step LogicPeriod.start logic "医药连锁" shots List(),
      trade code c"002705" step LogicPeriod.start logic "小家电可能超预期" shots List(),
      trade code c"600233" step LogicPeriod.start logic "快递供给侧持续" shots List(),
      trade code c"600233" step LogicPeriod.start logic "快递供给侧持续" shots List(),
      trade code c"601008" step LogicPeriod.start logic "疫情收益" shots List(),
      trade code c"000593" step LogicPeriod.start logic "城市燃气" shots List(),
      trade code c"600419" step LogicPeriod.start logic "高景气" shots List(),
      trade code c"601952" step LogicPeriod.start logic "业绩提升不错" shots List(),
      trade code c"603218" step LogicPeriod.start logic "IC高景气" shots List(
        call when t"2021-08-07" amount 100 msg "买入"
      ),
      trade code c"002273" logic "AR-HUD" shots List(),
      trade code c"002241" step LogicPeriod.start logic "VR, 利润持续增长" shots List(
      ),
      trade code c"002273" step LogicPeriod.start logic "游戏超预期,VR, 利润持续增长" enterBy enterReason
        .downChaodieBy(30) shots List(),
      trade code c"300533" step LogicPeriod.start logic "游戏超预期,VR, 利润持续增长" shots List(
      ),
      trade code c"002957" step LogicPeriod.start logic "VR, 利润持续增长" shots List(
      ),
      trade code c"002825" step LogicPeriod.start logic "车身涂印" enterBy enterReason.downChaodieBy(
        30
      ),
      trade code c"002470" step LogicPeriod.start logic "自主品牌,毛利率水平高" updateAt t"2022-08-23",
      trade code c"603727" step LogicPeriod.start logic "石油行业景气" updateAt t"2022-08-23",
      trade code c"002414" step LogicPeriod.start logic "自主品牌,毛利率水平高",
      trade code c"300653" step LogicPeriod.start logic "国产医疗材料替代，超级替代",
      trade code c"300915" step LogicPeriod.start logic "自主品牌",
      trade code c"000888" step LogicPeriod.start logic "旅游复苏",
      trade code c"002539" step LogicPeriod.start logic "海联金汇",
      trade code c"600038" step LogicPeriod.start logic "自主品牌",
      trade code c"600038" step LogicPeriod.start logic "或将受益于“十四五”期间航空装备需求的快速增长以及通航市场的加速发展",
      trade code c"002938" step LogicPeriod.start logic "鼎鹏控股",
      trade code c"603855" step LogicPeriod.start logic "华荣控股, EPC业务能源业务快速发展",
      trade code c"000967" step LogicPeriod.start logic "自主品牌",
      trade code c"300902" step LogicPeriod.start logic "自主品牌",
      trade code c"002286" step LogicPeriod.start logic "代糖消费升级",
      trade code c"603300" step LogicPeriod.start logic "自主品牌",
      trade code c"002120" step LogicPeriod.start logic "自主品牌",
      trade code c"000534" step LogicPeriod.start logic "",
      trade code c"000035" step LogicPeriod.start logic "",
      trade code c"002402" step LogicPeriod.start logic "自主品牌",
      trade code c"603186" step LogicPeriod.start logic "自主品牌",
      trade code c"600459" step LogicPeriod.start logic "贵金属",
      trade code c"603115" step LogicPeriod.start logic "huaxuebo",
      trade code c"605358" step LogicPeriod.start logic "自主品牌",
      trade code c"002180" step LogicPeriod.start logic "自主品牌",
      trade code c"002291" step LogicPeriod.start logic "遥感网络,互联网业务",
      trade code c"002034" step LogicPeriod.start logic "自主品牌",
      trade code c"300589" step LogicPeriod.start logic "自主品牌",
      trade code c"002139" step LogicPeriod.start logic "自动化 ",
      trade code c"002286" step LogicPeriod.start logic "保龄宝, 量价齐升",
      trade code c"002967" step LogicPeriod.start logic "广电计量" current "Something",
      trade code c"300671" step LogicPeriod.start logic "IC高景气",
      trade code c"002832" step LogicPeriod.start logic "002832",
      trade code c"600332" step LogicPeriod.start logic "中药构成",
      trade code c"002286" step LogicPeriod.start logic "功能糖龙头,快速增长" enterBy enterReason
        .downChaodieBy(
          28
        ),
      trade code c"600746" step LogicPeriod.start logic "醋酸景气",
      trade code c"603228" step LogicPeriod.interst logic "saas收入增加" leaveBy enterReason
        .downPriceBy(
          23.55
        ),
      trade code c"002368" step LogicPeriod.start logic "saas收入增加" enterBy enterReason
        .downChaodieBy(
          28
        ),
      trade code c"002001" step LogicPeriod.start logic "产能扩张" enterBy enterReason.downChaodieBy(
        20
      ),
      trade code c"002891" step LogicPeriod.start logic "中宠股份" leaveBy enterReason.downPriceBy(
        24.04
      ),
      trade code c"002809" step LogicPeriod.start
        enterBy enterReason.downChaodieBy(
          28
        ),
      trade code c"603565" logic "冷链物流" step LogicPeriod.start
        enterBy enterReason.downChaodieBy(
          28
        ),
      trade code c"603317" logic "周期行业景气" enterBy enterReason.downChaodieBy(
        10
      ) start t"2022-08-23" enter "OKKKKk" leave "离开" shots List(
        call when t"2022-08-15" amount 100,
        put when t"2022-08-23" amount 100
      ), // 四方股份

      trade code c"000959" enterBy enterReason.abovePriceBy(
        4.70
      ) step LogicPeriod.interst, // leave TODO
      trade code c"002261" logic "利润快速增长" start t"2021-06-19" enter "OKKKKk" enterBy enterReason
        .downChaodieBy(20) leave "离开" leaveBy enterReason.timeAfter(t"2023-08-10") shots List(),
      trade code c"002261" logic "电动车" start t"2021-06-19" enter "OKKKKk" leave "离开" shots List(),
      trade code c"603529" logic "电动车" start t"2021-06-19" enter "OKKKKk" leave "离开" shots List(),
      trade code c"605198" logic "果汁业务增长" start t"2021-06-19" enter "OKKKKk" leave "离开" shots List(),
      trade code c"002221" logic "用电荒，高景气" start t"2021-06-19" enter "新能源,新材料" leave "离开" shots List(),
      trade code c"000612" logic "用电荒，高景气" start t"2021-06-19" enter "铝业价格上涨" leave "离开" shots List(),
      trade code c"002141" logic "化工高景气" start t"2021-06-19" enter "铝业价格上涨" leave "离开" shots List(),
      trade code c"002493" logic "用电荒，高景气" start t"2021-06-19" enter "铝业价格上涨" leave "离开" shots List(),
      trade code c"600230" logic "用电荒，高景气" start t"2021-06-19" enter "越南建厂" leave "离开" shots List(),
      trade code c"601139" logic "用电荒，高景气" start t"2021-06-19" enter "越南建厂" leave "离开" shots List(),
      trade code c"002877" logic "电动车" start t"2021-06-19" enter "越南建厂" leave "离开" shots List(),
      trade code c"605183" logic "电动车" start t"2021-06-19" enter "越南建厂" leave "离开" shots List(),
      trade code c"002930" step LogicPeriod.interst enterBy enterReason.downChaodieBy(20)
        logic "宏川智慧,化学物品运输,逻辑需要3年" start t"2021-07-02" enter "OKKKKk" leave "离开" shots List(
          put when t"2021-07-02" amount 200 msg "ok some message"
        ),
      trade code c"601238" leaveBy enterReason.downChaodieBy(
        40
      ) enterBy enterReason.aboveChaoDieBy(50)
        logic "新能源车，小米上来，格局变更" start t"2021-07-02" enter "OKKKKk" leave "离开" shots List(
          put when t"2021-07-02" amount 600
        ),
      trade code c"603568" leaveBy enterReason.downChaodieBy(
        40
      ) enterBy enterReason.aboveChaoDieBy(50)
        logic "伟明环保, 龙头，绿水清山，环保订单确保" start t"2021-07-02" enter "OKKKKk" leave "离开" shots List(
          put when t"2021-07-02" amount 300
        )
    )

    tradeLogicList
  }
}
