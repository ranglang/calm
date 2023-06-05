package tech.shangche.boat.generic

import shapeless._
import shapeless.labelled.{field, FieldType}

trait FromMap1[L <: HList] {
  def apply(m: Map[String, Any]): Option[L]
}

object FromMap1 {
  implicit val hnilFromMap1: FromMap1[HNil] = new FromMap1[HNil] {
    def apply(m: Map[String, Any]): Option[HNil] = Some(HNil)
  }

  implicit def hconsFromMap1[K <: Symbol, V, T <: HList](implicit
    witness: Witness.Aux[K],
    typeable: Typeable[V],
    fromMapT: FromMap1[T]
  ): FromMap1[FieldType[K, V] :: T] = new FromMap1[FieldType[K, V] :: T] {
    def apply(m: Map[String, Any]): Option[FieldType[K, V] :: T] = for {
      v <- m.get(witness.value.name.toString)
      r <- typeable.cast(v)
      t <- fromMapT(m)
    } yield field[K][V](r) :: t
  }
}

class Helper[A] {
  def from[R <: HList](
    m: Map[String, Any]
  )(implicit gen: LabelledGeneric.Aux[A, R], fromMap: FromMap1[R]): Option[A] = {
    fromMap(m).map(gen.from(_))
  }
}

object Helper {
  def to[A]: Helper[A] = new Helper[A]
}
