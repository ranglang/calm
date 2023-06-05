package com.lqiong.jep.entry

import cats.effect.{IO, Resource}
import com.evolutiongaming.scassandra.CassandraSession
import com.google.inject.Inject
import com.lqiong.shared.email.PostgresqlConfig

import java.util.concurrent.Executors
import scala.concurrent.{ExecutionContext, ExecutionContextExecutor}

object SCassandra {

  type SSession = Resource[IO, CassandraSession[IO]]
}

class DBDefaults @Inject() (
  cassandraConfig: PostgresqlConfig,
  implicit val executionContext: ExecutionContext
) {
  import com.evolutiongaming.scassandra._
  val aList = com.evolutiongaming.nel.Nel(cassandraConfig.host)
  implicit val ec: ExecutionContextExecutor =
    ExecutionContext.fromExecutor(Executors.newFixedThreadPool(1))

  println(s"cassandraConfig.cassandraPort${cassandraConfig.port}")
  val config1 = CassandraConfig(
    contactPoints = aList,
    authentication = Some(
      AuthenticationConfig(
        cassandraConfig.user,
        cassandraConfig.password
      )
    )
  )
  val session: Resource[IO, CassandraSession[IO]] = for {
    cluster <- CassandraCluster.of[IO](config1, clusterId = 0)
    session <- cluster.connect
  } yield session

}
