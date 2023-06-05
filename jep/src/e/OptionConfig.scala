package e

import com.lqiong.jep.config.{CurrrentOptionTradeLogic, OptionTradeRestrict, UserInput}

object OptionConfig {
  val default = CurrrentOptionTradeLogic(
    capital = 1500,
    userInput = UserInput(
      1
    ),
    optionTradeRestrict = OptionTradeRestrict(1),
    usedCapital = 0,
    holds = List.empty, // TODO  updateAt  target number  it shouldbejson
    strategyName = "时间UNIT 期权交易, 只有极端值才有意义, 需要看超跌后的指标, 需要跟技术面起来, 尽可能需要2个指标一起来, 这样容易",
    description = Some("Ok"),
    notification = List.empty,
    watchedIndicator = List.empty,
    tradingRestrictions = List.empty,
    closing = """
        | 增加凯利公式 仓位管理设计
        | bracket(input, output)
        | 精简代码 设计框架
        | program计划
        | 尝试制作超涨,  超涨
        | 高跌之后再处理，短跌一半不Work
        | 需要处理这个notion笔记
        | 没有把握，就不做，没把握就不做
        | 就是指标上来，不要做比较难的事情，事情不对什么时候退出，马上退出。可以么？
        | 需要提前处理这个目标XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX 超过30个工作日间隔的超跌更有意义。
        |还没有想清楚这个善后操作
        |""".stripMargin,
    history = List(
      "如果 可以尝试卖认购",
      "止损， 损失260块钱 很惨, 末日论 掉得特别快，不适合比较比较高的超跌指数",
      "如果没有善后措施,那么久不应该持有",
      "仓促买入 2023-05-16 在车上持有对50 金融的预期",
      "公告，座谈会就是空头开始",
      "大量的需求事件就是开始",
      "超跌的时候期权标的选择是随意的。",
      "尽量在尾盘的时候买入"
    ),
    nextShot = """超跌指数到达30一下， 推荐买入10%, 20%, 30%
        |
        | 关键数据:
        | 关键时间:
        |
        | 需要考虑波动率的方向
        |
        |""".stripMargin
  )

}
