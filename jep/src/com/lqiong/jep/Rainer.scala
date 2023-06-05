package com.lqiong.jep

object Rainer {

  import com.stripe.rainier.core._
  import com.stripe.rainier.compute._

  def run() = {
    val a = Uniform(0, 1).latent
    val b = a + 1
    println(s"b ${b}")

    import com.stripe.rainier.core._
    import com.stripe.rainier.compute._
    import com.stripe.rainier.sampler._

    implicit val rng = RNG.default

    val eggs = List[(Int, Long)](
      (0, 31),
      (2, 47),
      (0, 35),
      (2, 40),
      (0, 33),
      (2, 44),
      (0, 30),
      (2, 46),
      (0, 33),
      (0, 30),
      (2, 36),
      (2, 54),
      (1, 45),
      (1, 39),
      (2, 62),
      (2, 54),
      (1, 30),
      (2, 40),
      (2, 48),
      (1, 33),
      (0, 40),
      (2, 38),
      (0, 31),
      (2, 46),
      (1, 41),
      (1, 42),
      (0, 39),
      (1, 29),
      (0, 28),
      (1, 36),
      (2, 46),
      (2, 33),
      (2, 41),
      (2, 48),
      (1, 32),
      (0, 24),
      (1, 34),
      (2, 48),
      (1, 52),
      (1, 37),
      (0, 28),
      (0, 37),
      (2, 51),
      (2, 44),
      (1, 40),
      (0, 41),
      (0, 36),
      (1, 44),
      (0, 32),
      (0, 31),
      (0, 31),
      (0, 32),
      (0, 33),
      (1, 27),
      (0, 40),
      (2, 45),
      (2, 40),
      (1, 46),
      (0, 35),
      (2, 46),
      (0, 34),
      (1, 41),
      (0, 38),
      (0, 34),
      (2, 46),
      (1, 44),
      (2, 49),
      (2, 39),
      (1, 41),
      (2, 37),
      (1, 29),
      (0, 29),
      (2, 41),
      (2, 46),
      (1, 42),
      (1, 34),
      (1, 32),
      (1, 35),
      (0, 32),
      (1, 40),
      (1, 37),
      (1, 38),
      (1, 42),
      (1, 38),
      (1, 36),
      (0, 38),
      (0, 41),
      (1, 51),
      (1, 40)
    )

    val lambda = Gamma(0.5, 100).latent
    val logFeeds = Normal(lambda.log, 0.1).latentVec(3)
    val feeds = logFeeds.map(_.exp)

    val eggFeeds = eggs.map(_._1)
    val eggCounts = eggs.map(_._2)

    val feedsVec = Vec.from(eggFeeds)
    val poissonVec = feedsVec.map { i: Real => Poisson(feeds(i)) }
    val vecModel = Model.observe(eggCounts, poissonVec)

    println("vec {}", vecModel)

  }
}
