package e.model

import enumeratum.{Enum, EnumEntry}

object ListOptionCategory extends Enum[ListOptionCategory] {
  case object list_contract extends ListOptionCategory
  case object status extends ListOptionCategory
  val values = findValues
}

sealed trait ListOptionCategory extends EnumEntry with EnumEntry.Lowercase
