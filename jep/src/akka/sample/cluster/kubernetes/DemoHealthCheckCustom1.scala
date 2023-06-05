package akka.sample.cluster.kubernetes

import akka.actor.ActorSystem

import scala.concurrent.Future

// Enabled in application.conf
class DemoHealthCheckCustom1(system: ActorSystem) extends (() => Future[Boolean]) {

  override def apply(): Future[Boolean] = {
    Future.successful(true)
  }
}
