package e

object TypeSafePandas extends App {

  import org.apache.spark.{SparkConf, SparkContext}
  import org.apache.spark.sql.SparkSession
  import frameless.functions.aggregate._
  import frameless.TypedDataset

  val conf = new SparkConf()
    .setMaster("local[*]")
    .setAppName("Frameless repl")
    .set("spark.ui.enabled", "false")
  implicit val spark = SparkSession.builder().config(conf).appName("REPL").getOrCreate()
  spark.sparkContext.setLogLevel("WARN")

  case class Apartment(city: String, surface: Int, price: Double, bedrooms: Int)

  val apartments = Seq(
    Apartment("Paris", 50, 300000.0, 2),
    Apartment("Paris", 100, 450000.0, 3),
    Apartment("Paris", 25, 250000.0, 1),
    Apartment("Lyon", 83, 200000.0, 2),
    Apartment("Lyon", 45, 133000.0, 1),
    Apartment("Nice", 74, 325000.0, 3)
  )

  val aptTypedDs: TypedDataset[Apartment] = TypedDataset.create(apartments)
  import spark.implicits._
  aptTypedDs.printSchema()
}
//
//import org.apache.spark.sql.Row
//
//import zio._
//import zio.spark.experimental
//import zio.spark.experimental.Pipeline
//import zio.spark.parameter._
//import zio.spark.sql._
//import zio.spark.sql.implicits._
//
//object SimpleApp extends ZIOAppDefault {
//
//  import zio.spark.sql.TryAnalysis.syntax.throwAnalysisException
//
//  final case class Person(name: String, age: Int)
//
//  val filePath: String = "examples/simple-app/src/main/resources/data.csv"
//
//  def read: SIO[DataFrame] = SparkSession.read.schema[Person].withHeader.withDelimiter(";").csv(filePath)
//
//  def transform(inputDs: DataFrame): Dataset[Person] = inputDs.as[Person]
//
//  def output(transformedDs: Dataset[Person]): Task[Option[Person]] = transformedDs.headOption
//
//  val pipeline: Pipeline[Row, Person, Option[Person]] = experimental.Pipeline(read, transform, output)
//
//  val job: ZIO[SparkSession, Throwable, Unit] =
//    for {
//      maybePeople <- pipeline.run
//      _ <-
//        maybePeople match {
//          case None    => Console.printLine("There is nobody :(.")
//          case Some(p) => Console.printLine(s"The first person's name is ${p.name}.")
//        }
//    } yield ()
//
//  private val session = SparkSession.builder.master(localAllNodes).appName("app").asLayer
//
//  override def run: ZIO[ZIOAppArgs, Any, Any] = job.provide(session)
//}
//
