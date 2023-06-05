package com.lqiong.jep.option

object QuickLink {

  def getLinks = {
    s"""${LqHtml.link(
        "https://www.9fzt.com/xlhxg.rdzj.zyjc/research_index.html",
        "重大事件"
      )}
        |${LqHtml.link("https://stock.9fzt.com/lhb.html", "龙虎榜")}
        |${LqHtml.link("https://xuangubao.cn/top-gainer", "石大胜华")}
        |""".stripMargin
  }
}
