organization := "com.example"

name := "jj"
version := "0.8.0"
scalaVersion := "2.12.10"
scalatsTypeExcludes := Set()

enablePlugins(TypeScriptGeneratorPlugin)

resolvers += Resolver.sonatypeRepo("releases")
addCompilerPlugin("org.scalamacros" % "paradise" % "2.1.1" cross CrossVersion.full)

lazy val root = (project.in(file(".")))

scalatsUnionWithLiteral

autoScalaLibrary := true
libraryDependencies ++= Seq(
  "io.circe" %% "circe-core" % "0.13.0",
  "joda-time" % "joda-time" % "2.10.5",
  "io.circe" %% "circe-shapes" % "0.13.0",
  "com.beachape" %% "enumeratum-slick" % "1.6.0",
  "io.circe" %% "circe-generic" % "0.13.0",
  "io.circe" %% "circe-parser" % "0.13.0",
  "com.outworkers" %% "phantom-connectors" % "2.59.0", //exclude(("io.dropwizard.metrics","metrics-jmx")),
  "com.outworkers" %% "phantom-dsl" % "2.59.0",
  "com.beachape" %% "enumeratum-circe" % "1.6.1",
  "com.beachape" %% "enumeratum" % "1.6.1",
  "com.davegurnell" %% "bridges" % "0.24.0",
  "io.scalaland" %% "chimney" % "0.3.2",
  "org.picoworks" %% "pico-hashids" % "4.4.141",
  "com.typesafe.slick" %% "slick" % "3.3.2",
  "io.spray" %% "spray-json" % "1.3.5",
  "commons-codec" % "commons-codec" % "1.9",
  "com.github.tototoshi" %% "slick-joda-mapper" % "2.4.1"
)