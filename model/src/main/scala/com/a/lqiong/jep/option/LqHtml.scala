package com.lqiong.jep.option

import levsha.dsl.html._
import levsha.dsl._
import levsha.text.renderHtml
object LqHtml {

  val htmlAttr = AttrDef("href")
//  ,
//
  def link(href: String, content: String) = {
    val a2 = a(clazz := "title", htmlAttr := href, content)
    renderHtml(
      optimize(a2)
    ).replaceAll("\\n", "")
  }

}
