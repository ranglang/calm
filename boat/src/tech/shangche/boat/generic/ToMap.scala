package tech.shangche.boat.generic

object ToMap {

  import shapeless._
  import shapeless.labelled.FieldType

  trait ToMap[T] {
    def apply(x: T): Map[String, Any]
  }

  implicit val hnilToMap = new ToMap[HNil] {
    override def apply(x: HNil) = Map.empty
  }

  implicit def hconsToMap[K <: Symbol, H, T <: HList](implicit
    wit: Witness.Aux[K],
    ttm: ToMap[T]
  ): ToMap[FieldType[K, H] :: T] = new ToMap[FieldType[K, H] :: T] {
    override def apply(x: FieldType[K, H] :: T): Map[String, Any] =
      ttm(x.tail) + (wit.value.name -> x.head)
  }

  def apply[T, L <: HList](
    x: T
  )(implicit gen: LabelledGeneric.Aux[T, L], tm: ToMap[L]): Map[String, Any] =
    tm(gen.to(x))

}
