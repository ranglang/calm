package com.lqiong.email.module

import com.google.inject.{AbstractModule, Provides, Singleton}
import com.lqiong.shared.email.{AppConfig, EmailConfig, PostgresqlConfig}
import com.typesafe.config.{Config, ConfigFactory}
import net.codingwell.scalaguice.ScalaModule

import java.time.Duration

class ConfigModule extends AbstractModule with ScalaModule {

  override def configure(): Unit = {
    bind[Config].toInstance(ConfigFactory.load().withFallback(
      ConfigFactory.parseString(
        """
        akka.loglevel = "ERROR"
        """)
    ))
  }

  @Provides
  @Singleton
  def getEmailConfig(config: Config): EmailConfig = {
    EmailConfig(
      mailHost = config.getString("email.host"),
      mailPort = config.getString("email.port"),
      mailUserName = config.getString("email.user_name"),
      mailPassword = config.getString("email.password")
    )
  }

  @Provides
  @Singleton
  def getAppConfig(config: Config): AppConfig = {
    val r: Duration = config.getDuration("request-idle")
    AppConfig(r)
  }


  @Provides
  @Singleton
  def getCassadnra(config: Config): PostgresqlConfig = {
    PostgresqlConfig(
      database = config.getString("ctx.default.database"),
      host = config.getString("ctx.default.host"),
      user = config.getString("ctx.default.user"),
      password = config.getString("ctx.default.password"),
      port = config.getInt("ctx.default.port")
    )
  }
}
