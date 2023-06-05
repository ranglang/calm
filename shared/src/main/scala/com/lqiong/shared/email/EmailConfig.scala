package com.lqiong.shared.email

import java.time.Duration

case class EmailConfig(
    mailHost: String,
    mailPort: String,
    mailUserName: String,
    mailPassword: String
)

case class AppConfig(
    requestIdle: Duration
)

case class TradeConfig(
    userName: String,
    ak: String
)

case class PostgresqlConfig(
    host: String,
    port: Int,
    user: String,
    password: String,
    database: String = "zz"
)
