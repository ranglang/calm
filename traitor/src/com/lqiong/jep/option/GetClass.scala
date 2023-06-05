package com.lqiong.jep.option

import org.apache.spark.sql.types._

object GetClass {

//  23:57:47 dataFrameDao_df22222 - item1 float64 getType DoubleType
//    INFO  2021-07-03 23:57:47 dataFrameDao_df22222 - item1 total_operating_cost
//    INFO  2021-07-03 23:57:47 dataFrameDao_df22222 - item1 float64 getType DoubleType
//    INFO  2021-07-03 23:57:47 dataFrameDao_df22222 - item1 operating_cost
//    INFO  2021-07-03 23:57:47 dataFrameDao_df22222 - item1 float64 getType DoubleType
//    INFO  2021-07-03 23:57:47 dataFrameDao_df22222 - item1 interest_expense
//    INFO  2021-07-03 23:57:47 dataFrameDao_df22222 - item1 float64 getType DoubleType
//    INFO  2021-07-03 23:57:47 dataFrameDao_df22222 - item1 commission_expense
//    INFO  2021-07-03 23:57:47 dataFrameDao_df22222 - item1 float64 getType DoubleType
//    INFO  2021-07-03 23:57:47 dataFrameDao_df22222 - item1 refunded_premiums
//    INFO  2021-07-03 23:57:47 dataFrameDao_df22222 - item1 float64 getType DoubleType
//    INFO  2021-07-03 23:57:47 dataFrameDao_df22222 - item1 net_pay_insurance_claims
//    INFO  2021-07-03 23:57:47 dataFrameDao_df22222 - item1 float64 getType DoubleType
//    INFO  2021-07-03 23:57:47 dataFrameDao_df22222 - item1 withdraw_insurance_contract_reserve
//    INFO  2021-07-03 23:57:47 dataFrameDao_df22222 - item1 float64 getType DoubleType
//    INFO  2021-07-03 23:57:47 dataFrameDao_df22222 - item1 policy_dividend_payout
//    INFO  2021-07-03 23:57:47 dataFrameDao_df22222 - item1 float64 getType DoubleType
//    INFO  2021-07-03 23:57:47 dataFrameDao_df22222 - item1 reinsurance_cost
//    INFO  2021-07-03 23:57:47 dataFrameDao_df22222 - item1 float64 getType DoubleType
//    INFO  2021-07-03 23:57:47 dataFrameDao_df22222 - item1 operating_tax_surcharges
//    INFO  2021-07-03 23:57:47 dataFrameDao_df22222 - item1 float64 getType DoubleType
//    INFO  2021-07-03 23:57:47 dataFrameDao_df22222 - item1 sale_expense
//    INFO  2021-07-03 23:57:47 dataFrameDao_df22222 - item1 float64 getType DoubleType
//    INFO  2021-07-03 23:57:47 dataFrameDao_df22222 - item1 administration_expense
//    INFO  2021-07-03 23:57:47 dataFrameDao_df22222 - item1 float64 getType DoubleType
//    INFO  2021-07-03 23:57:47 dataFrameDao_df22222 - item1 financial_expense
//    INFO  2021-07-03 23:57:47 dataFrameDao_df22222 - item1 float64 getType DoubleType
//    INFO  2021-07-03 23:57:47 dataFrameDao_df22222 - item1 asset_impairment_loss
//    INFO  2021-07-03 23:57:47 dataFrameDao_df22222 - item1 float64 getType DoubleType
//    INFO  2021-07-03 23:57:47 dataFrameDao_df22222 - item1 fair_value_variable_income
//    INFO  2021-07-03 23:57:47 dataFrameDao_df22222 - item1 float64 getType DoubleType
//    INFO  2021-07-03 23:57:47 dataFrameDao_df22222 - item1 investment_income
//    INFO  2021-07-03 23:57:47 dataFrameDao_df22222 - item1 float64 getType DoubleType
//    INFO  2021-07-03 23:57:47 dataFrameDao_df22222 - item1 invest_income_associates
//    INFO  2021-07-03 23:57:47 dataFrameDao_df22222 - item1 float64 getType DoubleType
//    INFO  2021-07-03 23:57:47 dataFrameDao_df22222 - item1 exchange_income
//    INFO  2021-07-03 23:57:47 dataFrameDao_df22222 - item1 float64 getType DoubleType
//    INFO  2021-07-03 23:57:47 dataFrameDao_df22222 - item1 operating_profit
//    INFO  2021-07-03 23:57:47 dataFrameDao_df22222 - item1 float64 getType DoubleType
//    INFO  2021-07-03 23:57:47 dataFrameDao_df22222 - item1 non_operating_revenue
//    INFO  2021-07-03 23:57:47 dataFrameDao_df22222 - item1 float64 getType DoubleType
//    INFO  2021-07-03 23:57:47 dataFrameDao_df22222 - item1 non_operating_expense
//    INFO  2021-07-03 23:57:47 dataFrameDao_df22222 - item1 float64 getType DoubleType
//    INFO  2021-07-03 23:57:47 dataFrameDao_df22222 - item1 disposal_loss_non_current_liability
//    INFO  2021-07-03 23:57:47 dataFrameDao_df22222 - item1 float64 getType DoubleType
//    INFO  2021-07-03 23:57:47 dataFrameDao_df22222 - item1 total_profit
//    INFO  2021-07-03 23:57:47 dataFrameDao_df22222 - item1 float64 getType DoubleType
//    INFO  2021-07-03 23:57:47 dataFrameDao_df22222 - item1 income_tax_expense
//    INFO  2021-07-03 23:57:47 dataFrameDao_df22222 - item1 float64 getType DoubleType
//    INFO  2021-07-03 23:57:47 dataFrameDao_df22222 - item1 net_profit
//    INFO  2021-07-03 23:57:47 dataFrameDao_df22222 - item1 float64 getType DoubleType
//    INFO  2021-07-03 23:57:47 dataFrameDao_df22222 - item1 np_parent_company_owners
//    INFO  2021-07-03 23:57:47 dataFrameDao_df22222 - item1 float64 getType DoubleType
//    INFO  2021-07-03 23:57:47 dataFrameDao_df22222 - item1 minority_profit
//    INFO  2021-07-03 23:57:47 dataFrameDao_df22222 - item1 float64 getType DoubleType
//    INFO  2021-07-03 23:57:47 dataFrameDao_df22222 - item1 basic_eps
//    INFO  2021-07-03 23:57:47 dataFrameDao_df22222 - item1 float64 getType DoubleType
//    INFO  2021-07-03 23:57:47 dataFrameDao_df22222 - item1 diluted_eps
//    INFO  2021-07-03 23:57:47 dataFrameDao_df22222 - item1 float64 getType DoubleType
//    INFO  2021-07-03 23:57:47 dataFrameDao_df22222 - item1 other_composite_income
//    INFO  2021-07-03 23:57:47 dataFrameDao_df22222 - item1 float64 getType DoubleType
//    INFO  2021-07-03 23:57:47 dataFrameDao_df22222 - item1 total_composite_income
//    INFO  2021-07-03 23:57:47 dataFrameDao_df22222 - item1 float64 getType DoubleType
//    INFO  2021-07-03 23:57:47 dataFrameDao_df22222 - item1 ci_parent_company_owners
//    INFO  2021-07-03 23:57:47 dataFrameDao_df22222 - item1 float64 getType DoubleType
//    INFO  2021-07-03 23:57:47 dataFrameDao_df22222 - item1 ci_minority_owners
//    INFO  2021-07-03 23:57:47 dataFrameDao_df22222 - item1 float64 getType DoubleType
//
  def getClassClassValue(name: String): String = {
    name match {
      case "float64"        => "Double"
      case "datetime64[ns]" => "Timestamp"
      case "double"         => "Double"
      case "str"            => "String"
      case "int64"          => "Long"
      case _ =>
        "String"
    }
  }

  def getTypeValue(name: String): DataType = {
    name match {
      case "datetime64[ns]" => StringType
      case "float64"        => DoubleType
      case "double"         => DoubleType
      case "str"            => StringType
      case "bool"           => BooleanType
      case "int"            => ShortType
      case "int64"          => LongType
//      case "datetime64[ns]" => DateType
//        omJep_df22222 - item1 chaodie
//          INFO  2021-06-25 23:18:53 dataFrameDao_df22222 - item1 float64
//    INFO  2021-06-25 23:18:53 dataFrameDao_df22222 - item1 date
//    INFO  2021-06-25 23:18:53 dataFrameDao_df22222 - item1 int64
      case _ => StringType
    }
  }

}
