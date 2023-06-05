package com.lqiong.admin.model.offer

import enumeratum._

sealed trait EnumeratumOfferChargeType extends EnumEntry

object EnumeratumOfferChargeType
    extends Enum[EnumeratumOfferChargeType]
    with CirceEnum[EnumeratumOfferChargeType] {
  val values = findValues
  case object EnumeratumOfferChargeType_DURATION extends EnumeratumOfferChargeType
  case object EnumeratumOfferChargeType_TIMES extends EnumeratumOfferChargeType
  case object EnumeratumOfferChargeType_CUSTOM extends EnumeratumOfferChargeType
}
