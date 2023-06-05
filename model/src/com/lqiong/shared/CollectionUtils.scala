package com.lqiong.shared

object CollectionUtils {

  def distinctBy[A, B](xs: List[A])(f: A => B): List[A] =
    scala.reflect.internal.util.Collections.distinctBy(xs)(f)

}
