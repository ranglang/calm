package com.lqiong.jep.entry

import _root_.enumeratum._
sealed trait Category extends EnumEntry with EnumEntry.Lowercase

object Category extends Enum[Category] {

  case object list extends Category

  case object enable_schedule extends Category
  case object disable_schedule extends Category
  case object test extends Category
  case object snowball extends Category
  case object hk extends Category
  case object code extends Category
  case object indexx extends Category
  case object upodate_spot_count extends Category

  case object update_clouds extends Category
  case object sync extends Category
  case object update_notes extends Category
  case object rainer extends Category
  case object volumes extends Category

  case object opt extends Category
  case object chaodie_quill extends Category
//  2021-07-04
  case object study extends Category
  case object syncCode extends Category
  case object earn extends Category

  case object continues extends Category

  case object movie extends Category

//  case object trade_days extends Category

  case object portfolio extends Category
  case object volume extends Category
  case object trace extends Category

  case object portfolio_line extends Category

  case object bug extends Category
  case object egg extends Category

  case object server extends Category
  case object forcast extends Category
  case object execute extends Category
  case object checkConfig extends Category
  case object groups extends Category
  case object indexName extends Category
//  case object contain extends Category
  case object lian5 extends Category

  case object vega extends Category

  case object spot extends Category
  case object hot extends Category

  case object history4 extends Category
  case object clean extends Category

  case object nname extends Category
  case object option extends Category
  case object panming extends Category

  case object convertible_bond extends Category

  case object quill extends Category
  case object logic extends Category
  case object ball extends Category
  case object codename extends Category

  case object cassandra extends Category
  case object group_price extends Category
  case object note_price extends Category
  case object sync_all extends Category
  case object create extends Category
  case object pg extends Category
  case object chaodie extends Category
  case object target extends Category
  case object table extends Category
  case object order extends Category

  case object sell extends Category

//  case object  extends Category

  case object notion1 extends Category

  case object pdf extends Category
  case object vix extends Category
  case object sw_index extends Category

  case object see_contract extends Category

  case object items extends Category
  case object sell_note extends Category

//  case object panming extends Category
  case object email extends Category
  case object scheduler extends Category
  case object strategy extends Category
  case object value extends Category
  case object create_vega extends Category
  case object memcached extends Category
  case object notice extends Category
  case object default extends Category
  case object retro extends Category
  case object pilu extends Category
  case object login extends Category
  case object contracts extends Category
  case object before extends Category
  case object before_sync extends Category

  case object sell_contract extends Category

  case object contractnum extends Category
  case object index extends Category
  case object fundamentals extends Category
  case object indexChaodie extends Category
  case object north extends Category
  case object cal_opt extends Category
  case object pig extends Category

  val values = findValues
}
