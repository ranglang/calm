package com.lqiong.jep.option

import com.outworkers.phantom.Manager.logger
import org.apache.spark.sql.types.{
  BooleanType,
  DataType,
  DateType,
  DoubleType,
  FloatType,
  LongType,
  ObjectType,
  ShortType,
  StringType,
  TimestampType
}

case class Fundammanntal(
  id: Long,
  code: String,
  pe_ratio: Double,
  turnover_ratio: Double,
  pb_ratio: Double,
  ps_ratio: Double,
  pcf_ratio: Double,
  capitalization: Double,
  market_cap: Double,
  circulating_cap: Double,
  circulating_market_cap: Double,
  day: String,
  pe_ratio_lyr: Double,
  pubDate: String,
  statDate: String,
  total_operating_revenue: Double,
  operating_revenue: Double,
  interest_income: Double,
  premiums_earned: Double,
  commission_income: Double,
  total_operating_cost: Double,
  operating_cost: Double,
  interest_expense: Double,
  commission_expense: Double,
  refunded_premiums: Double,
  net_pay_insurance_claims: Double,
  withdraw_insurance_contract_reserve: Double,
  policy_dividend_payout: Double,
  reinsurance_cost: Double,
  operating_tax_surcharges: Double,
  sale_expense: Double,
  administration_expense: Double,
  financial_expense: Double,
  asset_impairment_loss: Double,
  fair_value_variable_income: Double,
  investment_income: Double,
  invest_income_associates: Double,
  exchange_income: Double,
  operating_profit: Double,
  non_operating_revenue: Double,
  non_operating_expense: Double,
  disposal_loss_non_current_liability: Double,
  total_profit: Double,
  income_tax_expense: Double,
  net_profit: Double,
  np_parent_company_owners: Double,
  minority_profit: Double,
  basic_eps: Double,
  diluted_eps: Double,
  other_composite_income: Double,
  total_composite_income: Double,
  ci_parent_company_owners: Double,
  ci_minority_owners: Double
)
