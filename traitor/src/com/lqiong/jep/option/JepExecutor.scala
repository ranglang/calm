package com.lqiong.jep.option
import akka.event.LoggingAdapter
import cats.effect.unsafe.implicits.global
import cats.effect.{IO, Resource}
import com.github.takezoe.retry.RetryPolicy
import com.google.inject.Inject
import com.google.inject.name.Named
import com.typesafe.config.ConfigFactory
import com.typesafe.scalalogging.Logger
import jep.{MainInterpreter, SharedInterpreter}
import org.apache.spark.sql.types.{DateType, StructField, StructType}
import org.apache.spark.sql.{DataFrame, Row, SparkSession}

import java.io.File
import java.util
import scala.collection.JavaConverters._
import scala.collection.convert.ImplicitConversions.`collection AsScalaIterable`
import scala.concurrent.Future
import scala.util.Try
import scala.util.control.NonFatal


class JepExecutor @Inject() (
  implicit val spark: SparkSession,
  implicit val retry1: RetryPolicy,
  val logger: LoggingAdapter,
  @Named("isDevelopment") val isDevelopment: Boolean
) {

  private def mkJqResource() = {
    val acquire = IO {
      try {
        val file = ConfigFactory.load().getString("JEP_SO")
        MainInterpreter.setJepLibraryPath(file)
      } catch {
        case NonFatal(x) => {

        }
      }
      val interp = new SharedInterpreter()

      logger.info("jep executor jep mak resource");
      interp.exec("import os;");
      interp.exec("import sys;");
      interp.exec("import os;");
//      interp.runScript("jep/resources/python/login.py")
      val pwd = interp.getValue("os.getcwd()", classOf[String]);
      logger.info("pwd {}", pwd)
      interp.getValue(s"""
                         |sys.path.insert(0, "$pwd/jep/resources/python")
                         |""".stripMargin)
      interp
    }

    def release(s: SharedInterpreter) = IO {
      s.runScript("jep/resources/python/logout.py")
      logger.info("jep executor jep mak resource release");
      s.close()
    }
    Resource.make(acquire)(release)
  }

  def mkResource() = {
    logger.info("jep executor jep mak resource");
    val acquire = IO {
      try {
        val file = ConfigFactory.load().getString("JEP_SO")
        MainInterpreter.setJepLibraryPath(file)
      } catch {
        case NonFatal(x) => {

        }
      }
      val interp = new SharedInterpreter()
      interp.exec("import os;");
      interp.exec("import sys;");
      interp.exec("import os;");
      val pwd = interp.getValue("os.getcwd()", classOf[String]);
      interp.getValue(s"""
                         |sys.path.insert(0, "$pwd/jep/resources/python")
                         |""".stripMargin)
      interp
    }

    def release(s: SharedInterpreter) = IO {
      logger.info("jep executor jep mak resource release");
      s.close()
    }
    Resource.make(acquire)(release)
  }

  private val jepResource: Resource[IO, SharedInterpreter] = for {
    outer <- mkResource()
  } yield outer

  private val jepJqResource: Resource[IO, SharedInterpreter] = for {
    outer <- mkJqResource()
  } yield outer

  private def toDataFrameSchema(
    dfName: String,
    sharedInterpreter: SharedInterpreter,
    schema: Option[StructType] = Option.empty[StructType]
  ): DataFrame = {
    val logger = Logger(s"dataFrameDao_$dfName")
    val columnValus = sharedInterpreter.getValue(
      s"""list($dfName.columns.values)""".stripMargin,
      classOf[util.ArrayList[String]]
    )
    val a3 = sharedInterpreter.getValue(
      s"""$dfName.values.tolist()""".stripMargin,
      classOf[util.ArrayList[util.ArrayList[String]]]
    )
    sharedInterpreter.exec(s"${dfName}.columns.values")
    val dataset: List[Row] =
      a3.asScala.toList.map(item => Row.fromSeq(item.toArray))

    columnValus.toList.zipWithIndex.foreach(item => {
      logger.info(s"trade column ${item} value: ${dataset.head
          .get(item._2)
          .toString} class: ${dataset.head.get(item._2).getClass.toString}")
    })

    val tupleItemList: List[(String, String)] =
      columnValus.asScala.toList.map(r => {
        val item1 = sharedInterpreter
          .getValue(s"$dfName.dtypes['$r'].name", classOf[String])
        (r, item1)
      })

    logger.info(GetObj.convertColumnsToCaseClass(tupleItemList))
    logger.info(GetObj.convertColumnsList(tupleItemList))

    val deptSchema: StructType = StructType(
      columnValus.asScala.toList
        .map(r => {

          if (schema.isDefined) {
            val s = schema.get
            val a = Try(s.fieldIndex(r)).toOption
            a.map(ri => s.fields(ri))
              .getOrElse {
                val item1 = sharedInterpreter
                  .getValue(s"$dfName.dtypes['$r'].name", classOf[String])
                StructField(r, GetClass.getTypeValue(item1))
              }
          } else {
            val item1 = sharedInterpreter
              .getValue(s"$dfName.dtypes['$r'].name", classOf[String])
            StructField(r, GetClass.getTypeValue(item1))
          }
        })
        .toArray
    )

//    symbol: String,code: String,name: String,trade: String,pricechange: String,changepercent: String,buy: String,sell: String,settlement: String,open: String,high: String,low: String,volume: Long,amount: Long,ticktime: String,per: Double,pb: Double,mktcap: Double,nmc: Double,turnoverratio: Double)

    logger.info("a1 {}", deptSchema.fields.mkString)
    logger.info("a1 {}", deptSchema.mkString)
    val a1 = spark.createDataFrame(dataset.asJava, deptSchema)
    a1
  }

  private def toDataFrameDate(
    dfName: String,
    sharedInterpreter: SharedInterpreter,
    convertDate: Option[String] = Option.empty[String]
  ): DataFrame = {
    val logger = Logger(s"dataFrameDao_$dfName")
    val columnValus = sharedInterpreter.getValue(
      s"""list($dfName.columns.values)""".stripMargin,
      classOf[util.ArrayList[String]]
    )
    val a3 = sharedInterpreter.getValue(
      s"""$dfName.values.tolist()""".stripMargin,
      classOf[util.ArrayList[util.ArrayList[String]]]
    )
    sharedInterpreter.exec(s"${dfName}.columns.values")
    val dataset: List[Row] =
      a3.asScala.toList.map(item => Row.fromSeq(item.toArray))

    val tupleItemList: List[(String, String)] =
      columnValus.asScala.toList.map(r => {
        val item1 = sharedInterpreter
          .getValue(s"$dfName.dtypes['$r'].name", classOf[String])
        (r, item1)
      })

    if (isDevelopment) {
      logger.info(GetObj.convertColumnsToCaseClass(tupleItemList))
      logger.info(GetObj.convertColumnsList(tupleItemList))
    }

    val deptSchema: StructType = StructType(
      columnValus.asScala.toList
        .map(r => {
          val item1 = sharedInterpreter
            .getValue(s"$dfName.dtypes['$r'].name", classOf[String])

          logger
            .info(
              "item1 {} {} getType {}",
              r,
              item1,
              GetClass.getTypeValue(item1)
            )

          StructField(r, GetClass.getTypeValue(item1))
        })
        .toArray
    )
    logger.info(s"dataset size size {}", dataset.size)
    val a1 = spark.createDataFrame(dataset.asJava, deptSchema)
    if (convertDate.isDefined) {
      val a2 =
        a1.withColumn(convertDate.get, a1(convertDate.get).cast(DateType))
      a2
    } else {
      a1
    }
  }

  // TODO test convertDate to String
//  private def toDataFrame(
//    dfName: String,
//    sharedInterpreter: SharedInterpreter,
//    convertDate: Boolean = false
//  ): DataFrame = {
//    toDataFrameDate(
//      dfName,
//      sharedInterpreter,
//      if (convertDate) Some("date") else Option.empty[String]
//    )
//  }

  import scala.reflect._

//  def runJqJepCode[T](
//    importFile: Option[File],
//    codeOpt: Option[String],
//    script: String
//  )(implicit
//    tag: ClassTag[T]
//  ): Future[Either[Error, T]] = {
//    val a = jepJqResource
//      .use { case interp =>
//        IO {
//          try {
//            logger.info(
//              "jep executor jep mak resource  {} {} {}",
//              importFile,
//              codeOpt
//            );
//            if (importFile.isDefined) {
//              interp.exec(importFile.get.getPath)
//            }
//            if (codeOpt.isDefined) {
//              interp.exec(codeOpt.get)
//            }
//            val r = interp
//              .getValue(
//                script,
//                tag.runtimeClass
//              )
//              .asInstanceOf[T]
//            Right(r)
//          } catch {
//            case NonFatal(t) =>
//              logger.error(
//                s"tt importFile:{} codeOpt{} {}",
//                importFile,
//                codeOpt,
//                t
//              )
//              //                interp.close()
//              Left(new Error(t))
//          }
//        }
//      }
//      .unsafeToFuture()
//    a
//  }

  def runJqJepCodeByImport[T](importCode: String, script: String)(implicit
    tag: ClassTag[T]
  ): Future[Either[Error, T]] = {
    val a = jepJqResource
      .use { case interp =>
        IO {
          logger
            .info("jep executor jep mak resource  {} {}", importCode, script);
          try {
            interp.exec(importCode)
            val r = interp
              .getValue(
                script,
                tag.runtimeClass
              )
              .asInstanceOf[T]
            Right(r)
          } catch {
            case NonFatal(t) =>
              logger.error(
                s"runJepCodeByImport importCode {} {} {}",
                importCode,
                script,
                t
              )
              Left(new Error(t))
          }
        }
      }
      .unsafeToFuture()
    a
  }

//  def runJepCodeByImport[T](importCode: String, script: String)(implicit
//    tag: ClassTag[T]
//  ): Either[Error, T] = {
//    val a = jepResource
//      .use { case interp =>
//        IO {
//          logger.info(
//            "jep executor jep mak resource run  {} {}",
//            importCode,
//            script
//          );
//          try {
//            interp.exec(importCode)
//            val r = interp
//              .getValue(
//                script,
//                tag.runtimeClass
//              )
//              .asInstanceOf[T]
//            Right(r)
//          } catch {
//            case NonFatal(t) =>
//              logger.error(
//                s"runJepCodeByImport importCode {} {} {}",
//                importCode,
//                script,
//                t
//              )
//              Left(new Error(t))
//          }
//        }
//      }
//      .unsafeRunSync()
//    a
//  }

  def runDateFrameList(
    script: List[String]
  ): Either[Error, util.ArrayList[String]] = {
    //    Collections.unmodifiableList()
    jepResource
      .use { case interp =>
        IO {
          logger.info("jep executor jep mak resource run  {}", script);
          try {
            script.dropRight(1).foreach(r => interp.exec(r))
            val f = interp.getValue(
              script.last,
              classOf[util.ArrayList[String]]
            )
            Right(
              f
            )
          } catch {
            case NonFatal(t) =>
              logger.error(s"script name {} {}", script, t)
              Left(new Error(t))
          }
        }
      }
      .unsafeRunSync()
  }

  def runDateFrameTuple(
    script: List[String]
  ): Either[Error, (util.ArrayList[String], util.ArrayList[String])] = {
//    Collections.unmodifiableList()
    jepResource
      .use { case interp =>
        IO {
          try {
            script.dropRight(1).foreach(r => interp.exec(r))
            val f = interp.getValue(
              script.last,
              classOf[util.ArrayList[util.ArrayList[String]]]
            )

            Right(
              (f.get(0), f.get(1))
            )
          } catch {
            case NonFatal(t) =>
              logger.error(s"script name {} {}", script, t)
              Left(new Error(t))
          }
        }
      }
      .unsafeRunSync()
  }

  def runDateFrameByExecImportListConvertByName(
    script: List[String],
    convertDate: Option[String] = Option.empty[String]
  ): Either[Error, DataFrame] = {
    jepResource
      .use { case interp =>
        IO {
          logger.info("jep executor jep mak resource run script {}", script);
          try {
            interp.exec("import pandas as pd")
            script.dropRight(1).foreach(r => interp.exec(r))
            val a = script.takeRight(1).head
            interp.exec(s"df22222=$a")
            Right(
              toDataFrameDate("df22222", interp, convertDate)
            )
          } catch {
            case NonFatal(t) =>
              logger.error(s"script name {} {}", script, t)
              Left(new Error(t))
          }
        }
      }
      .unsafeRunSync()
  }

  def runDateFrameByExecImportListConvert(
    script: List[String],
    convertDate: Boolean = false
  ): Either[Error, DataFrame] = {
    jepResource
      .use { case interp =>
        IO {
          logger.info("jep executor jep mak resource run script {}", script);
          try {
            interp.exec("import pandas as pd")
            script.dropRight(1).foreach(r => interp.exec(r))
            val a = script.takeRight(1).head
            interp.exec(s"df22222=$a")
            Right(
              toDataFrameDate("df22222", interp, Some("date"))
            )
          } catch {
            case NonFatal(t) =>
              logger.error(s"script name {} {}", script, t)
              Left(new Error(t))
          }
        }
      }
      .unsafeRunSync()
  }

  def runDateFrameByExecImportListSchedma(
    script: List[String],
    addDate: Boolean = false,
    schema: Option[StructType] = Option.empty[StructType]
  ): Either[Error, DataFrame] = {
    jepResource
      .use { case interp =>
        IO {
          logger.info("jep executor jep mak resource run script {}", script);
          try {
            interp.exec("import pandas")
            script.dropRight(1).foreach(r => interp.exec(r))
            val a = script.takeRight(1).head
            interp.exec(s"df22222=$a")
            if (addDate) {
              interp.exec(
                s"df22222['date']=pandas.Series(df22222.index.values, index = df22222.index);"
              )
            }
            Right(
              toDataFrameSchema("df22222", interp, schema)
            )
          } catch {
            case NonFatal(t) =>
              logger.error(s"script name {} {}", script, t)
              Left(new Error(t))
          }
        }
      }
      .unsafeRunSync()
  }

  def runDateFrameByExecImportList(
    script: List[String],
    addDate: Boolean = false,
    convertDate: Option[String] = Option.empty[String]
  ): Either[Error, DataFrame] = {
    jepResource
      .use { case interp =>
        IO {
          try {
            interp.exec("import pandas")
            script.dropRight(1).foreach(r => interp.exec(r))
            val a = script.takeRight(1).head
            interp.exec(s"df22222=$a")
            if (addDate) {
              interp.exec(
                s"df22222['date']=pandas.Series(df22222.index.values, index = df22222.index);"
              )
            }
            Right(
              toDataFrameDate("df22222", interp, convertDate)
            )
          } catch {
            case NonFatal(t) =>
              logger.error(s"script name {} {}", script, t)
              Left(new Error(t))
          }
        }
      }
      .unsafeRunSync()
  }

  def run[T](
                                importCode: String, clazz: Class[T]
            ): Either[Error, T] = {
    jepResource
      .use { case interp =>
        IO {
          try {
//            classOf[java.util.HashMap[String, Any]
//            classOf[T]
            interp.exec("import pysnowball")
            val f = interp.getValue(importCode,clazz)
            Right(f)
          } catch {
            case NonFatal(t) => {
              logger.info("okkkkkkkkkkk {}", t)
              Left(new Error(t))
            }
          }
        }
      }
      .unsafeRunSync()
  }

  def runDateFrameByExecImport(
    importCode: String,
    script: String
  ): Either[Error, DataFrame] = {
    jepResource
      .use { case interp =>
        IO {
          try {
            logger.info("jep executor jep mak resource run script {}", script);
            interp.exec("import pandas")
            interp.exec(importCode)
            interp.exec(s"df22222=$script")
            interp.exec(s"ak.__version__")
            Right(
              toDataFrameDate("df22222", interp, Option.empty)
            )
          } catch {
            case NonFatal(t) =>
              logger.error(s"script name {} {}", script, t)
              Left(new Error(t))
          }
        }
      }
      .unsafeRunSync()
  }

  def runJqDateFrameByFile(
    scriptFile: File,
    script: String,
    convertDate: Boolean = false,
    addDate: Boolean = false
  ): Either[Error, DataFrame] = {
    jepJqResource
      .use { case interp =>
        IO {
          try {
            logger.info(
              "jep executor jep mak resource run script {} {}",
              scriptFile,
              script
            );
            interp.exec("import requests")
            interp.runScript(scriptFile.getPath)
            interp.exec(s"df22222=$script")
            if (addDate) {
              interp.exec(
                s"df22222['date']=pd.Series(df22222.index.values, index = df22222.index);"
              )
            }
            Right(
              toDataFrameDate("df22222", interp, Option.empty)
            )

          } catch {
            case NonFatal(t) =>
              logger.error(s"runDateFrame {} {}", script, t)
              println(s"runDateFrame {} {}", script, t)
              Left(new Error(t))
          }
        }
      }
      .unsafeRunSync()
  }

//  def executeJqDateFrame(
//    scriptFile: File,
//    script: String,
//    convertDate: Boolean = false,
//    addDate: Boolean = false
//  ): Either[Error, DataFrame] = {
//    jepJqResource
//      .use { case interp =>
//        IO {
//          try {
//
//            logger.info(
//              "jep executor jep mak resource run script {} {}",
//              scriptFile,
//              script
//            );
//            //              interp.exec("import requests")
//            //              interp.exec("""a=requests.get("https://baidu.com")""")
//            logger.info("l {}", "1")
//            interp.runScript(scriptFile.getPath)
//            interp.exec(s"df22222=$script")
//            if (addDate) {
//              interp.exec(
//                s"df22222['date']=pd.Series(df22222.index.values, index = df22222.index);"
//              )
//            }
//            Right(
//              toDataFrame("df22222", interp, convertDate)
//            )
//
//          } catch {
//            case NonFatal(t) =>
//              logger.error(s"runDateFrame {} {}", script, t)
//              Left(new Error(t))
//          }
//        }
//      }
//      .unsafeRunSync()
//  }

  def runDateFrameByFile(
    scriptFile: File,
    script: String,
    convertDate: Boolean = false,
    addDate: Boolean = false
  ): Either[Error, DataFrame] = {
    jepResource
      .use { case interp =>
        IO {
          logger.info(
            "jep executor jep mak resource run script {} {}",
            scriptFile,
            script
          );
          try {

//              interp.exec("import requests")
//              interp.exec("""a=requests.get("https://baidu.com")""")
            logger.info("l {}", "1")
            interp.runScript(scriptFile.getPath)
            interp.exec(s"df22222=$script")
            if (addDate) {
              interp.exec(
                s"df22222['date']=pd.Series(df22222.index.values, index = df22222.index);"
              )
            }
            Right(
              toDataFrameDate("df22222", interp, Option.empty)
            )

          } catch {
            case NonFatal(t) =>
              logger.error(s"runDateFrame {} {}", script, t)
              Left(new Error(t))
          }
        }
      }
      .unsafeRunSync()
  }

}
