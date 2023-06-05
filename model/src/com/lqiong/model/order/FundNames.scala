package com.lqiong.model.order

//'基金代码'
//'拼音缩写'
//'基金简称'
//'基金类型'
//'拼音全称
case class FundNames(
  code: String,
  short_pinyin: String,
  short_name: String,
  fund_type: String,
  full_fund: String
)
