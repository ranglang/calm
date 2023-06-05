package com.lqiong.jep.option

import _root_.retry.Success
import akka.event.LoggingAdapter
import com.github.takezoe.retry.{FixedBackOff, RetryPolicy, retry}
import com.google.inject.Inject
import com.lqiong.jep.entry.ChaodieDataListName
import com.lqiong.jep.option.cassandra.GetSparkTable
import com.lqiong.model.{IndexSymbol, LSymbol, StockSymbol, SwIndexSymbol}
import com.lqiong.shared.email.PostgresqlConfig
import org.apache.spark.sql.functions.udf
import org.apache.spark.sql.{DataFrame, SaveMode, SparkSession}

import scala.concurrent.duration._
import scala.concurrent.{ExecutionContext, Future}
import scala.util.Try
import scala.util.control.NonFatal

trait RowIndex {
  val rowIndex = "date_idx"
}

class DataFrameDao @Inject() (
  implicit val spark: SparkSession,
  val cassandraConfig: PostgresqlConfig,
  val jepExecutor: JepExecutor,
  quill: GetSparkTable,
  val logger: LoggingAdapter,
  implicit val ex: ExecutionContext
) extends RowIndex {

  val database = cassandraConfig.database

  implicit val retryProxy = RetryPolicy(
    maxAttempts = 10,
    retryDuration = 10.second,
    backOff = FixedBackOff, // default is FixedBackOff
    jitter = 5.second // default is no jitter
  )

  def executeQL(txt: String): Unit = {
    quill.executeSQL(txt)
  }

  def savePanmingDataFrame(tableName: String, dataFrame: DataFrame) = {
    retry {
      Try {
        val dropTable = {
          s"DROP TABLE IF EXISTS ${tableName}"
        }
        executeQL(dropTable)

        val selectGroupsByUser = {
          s"CREATE TABLE IF NOT EXISTS ${tableName} (date timestamp PRIMARY KEY, chaodie real)"
        }
        executeQL(selectGroupsByUser)
        import org.apache.spark.sql._
        dataFrame.write
          .mode(SaveMode.Overwrite)
          .format("jdbc")
          .option(
            "url",
            s"jdbc:postgresql://${cassandraConfig.host}:${cassandraConfig.port}/${cassandraConfig.database}"
          )
          .option("user", cassandraConfig.user)
          .option("password", cassandraConfig.password)
          .option("dbtable", tableName)
          .save()
        logger.info("dataframe saved savePanmingDataFrame {}", tableName)
      }.recover { case NonFatal(e) =>
        logger.info("eeeeeeeee {}", e)
      }
    }
  }

  def saveVixDataFrame(dataFrame: DataFrame) = {
    retry {
      val dropTable = {
        s"DROP TABLE IF EXISTS ${TableNames.vixs}"
      }

      executeQL(dropTable)

      val selectGroupsByUser = {
        s"CREATE TABLE IF NOT EXISTS ${TableNames.vixs} (date timestamp PRIMARY KEY, vix bigint, skew bigint)"
      }

      executeQL(selectGroupsByUser)
      import org.apache.spark.sql._
      dataFrame.write
        .mode(SaveMode.Overwrite)
        .format("jdbc")
        .option(
          "url",
          s"jdbc:postgresql://${cassandraConfig.host}:${cassandraConfig.port}/${cassandraConfig.database}"
        )
        .option("user", cassandraConfig.user)
        .option("password", cassandraConfig.password)
        .option("dbtable", TableNames.vixs)
        .save()
      logger.info("dataframe saved vix")
    }
  }

  def saveDynamicTableWithout(
    dataFrame: DataFrame,
    tableName: String
  ) = {
    retry {
      val f = Try {
        import org.apache.spark.sql._
        dataFrame.write
          .mode(SaveMode.Overwrite)
          .format("jdbc")
          .option(
            "url",
            s"jdbc:postgresql://${cassandraConfig.host}:${cassandraConfig.port}/${cassandraConfig.database}"
          )
          .option("user", cassandraConfig.user)
          .option("password", cassandraConfig.password)
          .option("dbtable", tableName)
          .save()
        logger.info("dataframe saved saveDynamicTableWithout")
      }.recover { case NonFatal(x) =>
        logger.error("some {}", x)
      }
    }
  }

  def saveDynamicTable(
    dataFrame: DataFrame,
    tableName: String,
    createTableString: Option[String] = Option.empty[String]
  ) = {
    retry {
      Try {
        val sql = createTableString.getOrElse("")
        if (sql.nonEmpty) {
          executeQL(sql)
        }
        import org.apache.spark.sql._
        dataFrame.write
          .mode(SaveMode.Overwrite)
          .format("jdbc")
          .option(
            "url",
            s"jdbc:postgresql://${cassandraConfig.host}:${cassandraConfig.port}/${cassandraConfig.database}"
          )
          .option("user", cassandraConfig.user)
          .option("password", cassandraConfig.password)
          .option("dbtable", tableName)
          .save()
        logger.info("dataframe saved saveDynamicTable {}", tableName)
      }.recover {
        case NonFatal(x) =>
          dataFrame.printSchema()
          throw new Error(s"dataframe saved saveDynamicTable ${tableName} ${x}")
          logger.error("dataframe saved saveDynamicTable {}", tableName)
          logger.error("saveDynamicTable {}", x)
      }
    }
  }


  def saveOptionsDaily(dataFrame: DataFrame, code: String) = {
    val tableName = s"${TableNames.optTablesPrefix}${code}"

//    date: String,
//    open: Double,
//    high: Double,
//    low: Double,
//    close: Double,
//    volume: Double)
    retry {

      val drop = s"DROP TABLE IF EXISTS ${tableName}"
      executeQL(drop)

      val selectGroupsByUser =
        s"CREATE TABLE IF NOT EXISTS ${tableName} (date timestamp PRIMARY KEY, volume real,  close real, low real, high Double, open real )"
      executeQL(selectGroupsByUser)

      import org.apache.spark.sql._
      dataFrame.write
        .mode(SaveMode.Overwrite)
        .format("jdbc")
        .option(
          "url",
          s"jdbc:postgresql://${cassandraConfig.host}:${cassandraConfig.port}/${cassandraConfig.database}"
        )
        .option("user", cassandraConfig.user)
        .option("password", cassandraConfig.password)
        .option("dbtable", tableName)
        .save()
      logger.info("dataframe saved")
    }
  }

  def saveCodeNames(dataFrame: DataFrame) = {
    retry {
      val selectGroupsByUser =
        s"CREATE TABLE IF NOT EXISTS ${TableNames.codenames} (code text PRIMARY KEY NOT NULL, name text)"

      logger.info("xxxxxxx {}", selectGroupsByUser)
      try {
        val drop = s"DROP TABLE IF EXISTS ${TableNames.codenames}"
        quill.executeSQL(drop)
        quill.executeSQL(selectGroupsByUser)
      } catch {
        case NonFatal(x) =>
          logger.error("create table {}", x)
      }

//      executeQL(selectGroupsByUser)
      //        .options(
      //          Map(
      //            "table" -> s"codenames",
      //            "keyspace" -> cassandraConfig.cassandraKeyspace
      //          )
      //        )

      import org.apache.spark.sql._

      val dropElements = udf((array: Seq[Double], indices: Seq[Int]) =>
        array.zipWithIndex
          .filterNot { case (x, i) => indices.contains(i + 1) }
          .map(_._1)
      )
      val f1 = dataFrame
        .filter(dataFrame("code") === "000002")

      f1.show()

      //      .drop(dataFrame.tail(1).index,inplace=True)
//        .filter(dataFrame("code") === "000002")
//        .transform(r => r)
      dataFrame.write
        .mode(SaveMode.Overwrite)
        .format("jdbc")
        .option(
          "url",
          s"jdbc:postgresql://${cassandraConfig.host}:${cassandraConfig.port}/${cassandraConfig.database}"
        )
        .option("user", cassandraConfig.user)
        .option("password", cassandraConfig.password)
        .option("dbtable", TableNames.codenames)
        .save()

      logger.info("dataframe save codeNames")
    }
  }

  def saveChaodie(name: LSymbol, dataFrame: DataFrame) = {

    retry {

      try {
        val name1 = ChaodieDataListName.getTableName(name)

        val drop =
          s"DROP TABLE IF EXISTS $name1 "

        executeQL(drop)

        val selectGroupsByUser =
          s"CREATE TABLE IF NOT EXISTS $name1 (date timestamp PRIMARY KEY, chaodie bigint)"

        executeQL(selectGroupsByUser)

        import org.apache.spark.sql._
        dataFrame.write
          .mode(SaveMode.Overwrite)
          .format("jdbc")
          .option(
            "url",
            s"jdbc:postgresql://${cassandraConfig.host}:${cassandraConfig.port}/${cassandraConfig.database}"
          )
          .option("user", cassandraConfig.user)
          .option("password", cassandraConfig.password)
          .option("dbtable", name1)
          .save()
        logger.info("dataframe saved chaodie")
      } catch {
        case NonFatal(e) =>
          logger.error("save chaodie {}", e)
      }
    }
  }

  def saveSWIndex(dataFrame: DataFrame) = {
    retry {

//      amount: Double,
//      price: Double,
      val drop =
        s"DROP TABLE IF EXISTS ${TableNames.sw_index} "

      executeQL(drop)
      //      volume: Long
      val selectGroupsByUser =
        s"CREATE TABLE IF NOT EXISTS ${TableNames.sw_index} (code text PRIMARY KEY,  name text, close real, open real, high real, low real,  amount real, price real, volume real )"

      executeQL(selectGroupsByUser)

      try {
        dataFrame.write
          .mode(SaveMode.Overwrite)
          .format("jdbc")
          .option(
            "url",
            s"jdbc:postgresql://${cassandraConfig.host}:${cassandraConfig.port}/${cassandraConfig.database}"
          )
          .option("user", cassandraConfig.user)
          .option("password", cassandraConfig.password)
          .option("dbtable", TableNames.sw_index)
          .save()
        logger.info("dataframe saved")
      } catch {
        case NonFatal(e) =>
          logger.error("create sw_index {}", e)
      }
    }
  }

  def saveHkItems(dataFrame: DataFrame) = {
    retry {

      val selectGroupsByUser =
        s"CREATE TABLE IF NOT EXISTS ${TableNames.hkSpot} (symbol text PRIMARY KEY,name text,engname text,tradetype text,lasttrade real,prevclose real,open real,high real,low real,volume real,amount real,ticktime text,buy real,sell real,pricechange real,changepercent real)"

      val drop =
        s"DROP TABLE IF EXISTS ${TableNames.hkSpot} "

      executeQL(drop)

      logger.info(selectGroupsByUser)
      executeQL(selectGroupsByUser)

      logger.info("date frame count {}", dataFrame.count)

      dataFrame.write
        .mode(SaveMode.Overwrite)
        .format("jdbc")
        .option(
          "url",
          s"jdbc:postgresql://${cassandraConfig.host}:${cassandraConfig.port}/${cassandraConfig.database}"
        )
        .option("user", cassandraConfig.user)
        .option("password", cassandraConfig.password)
        .option("dbtable", TableNames.hkSpot)
        .save()
      logger.info("dataframe saved hk")
    }
  }

  def saveConvertibleBond(dataFrame: DataFrame) = {
    retry {
      val drop = s"DROP TABLE IF EXISTS ${TableNames.convertible_bond}"

      executeQL(drop)

      val selectGroupsByUser =
        s"CREATE TABLE IF NOT EXISTS ${TableNames.convertible_bond} (symbol text PRIMARY KEY, name text,trade text, pricechange text,changepercent text,buy text,sell text,settlement text ,open text,high text,low text,volume bigint,amount bigint,code text,ticktime text)"

      executeQL(selectGroupsByUser)

      dataFrame.write
        .mode(SaveMode.Overwrite)
        .format("jdbc")
        .option(
          "url",
          s"jdbc:postgresql://${cassandraConfig.host}:${cassandraConfig.port}/${cassandraConfig.database}"
        )
        .option("user", cassandraConfig.user)
        .option("password", cassandraConfig.password)
        .option("dbtable", TableNames.convertible_bond)
        .save()
      logger.info("dataframe saved saveConvertibleBond")
    }
  }

  def saveIndexNames(dataFrame: DataFrame) = {
    retry {
      val drop =
        s"DROP TABLE IF EXISTS index_spot"
      executeQL(drop)

      val selectGroupsByUser =
        s"CREATE TABLE IF NOT EXISTS index_spot (code text PRIMARY KEY, name text, low real, high real, price real, exchange real, open real, close real, volume bigint)"
      executeQL(selectGroupsByUser)

      dataFrame
        .withColumnRenamed("代码", "code")
        .withColumnRenamed("名称", "name")
        .withColumnRenamed("最新价", "price")
        .withColumnRenamed("涨跌幅", "exchange")
        .withColumnRenamed("今开", "open")
        .withColumnRenamed("昨收", "close")
        .withColumnRenamed("最高", "high")
        .withColumnRenamed("最低", "low")
        .withColumnRenamed("成交量", "volume")
        .drop("涨跌额")
        .drop("昨收")
        .drop("昨收")
        .drop("成交额")
        .write
        .mode(SaveMode.Overwrite)
        .format("jdbc")
        .option(
          "url",
          s"jdbc:postgresql://${cassandraConfig.host}:${cassandraConfig.port}/${cassandraConfig.database}"
        )
        .option("user", cassandraConfig.user)
        .option("password", cassandraConfig.password)
        .option("dbtable", TableNames.indexSpot)
        .save()
      logger.info("dataframe saved swIndex")
    }
  }

  def saveUsNames(dataFrame: DataFrame) = {
    retry {

      try {
        val drop =
          s"DROP TABLE IF EXISTS ${TableNames.usStockName}"
        executeQL(drop)

        val selectGroupsByUser =
          s"CREATE TABLE IF NOT EXISTS ${TableNames.usStockName} (symbol text PRIMARY KEY, name text, cname text)"
        executeQL(selectGroupsByUser)

        dataFrame.write
          .mode(SaveMode.Overwrite)
          .format("jdbc")
          .option(
            "url",
            s"jdbc:postgresql://${cassandraConfig.host}:${cassandraConfig.port}/${cassandraConfig.database}"
          )
          .option("user", cassandraConfig.user)
          .option("password", cassandraConfig.password)
          .option("dbtable", TableNames.usStockName)
          .save()
      } catch {
        case NonFatal(ex) =>
          logger.error("save us name {}", ex)
      }
    }
  }

  def saveFundPriceList(dataFrame: DataFrame, tableName: String) = {
    try {
      retry {

        val drop = s"DROP TABLE IF EXISTS ${tableName} "

        executeQL(drop)
        val selectGroupsByUser =
          s"CREATE TABLE IF NOT EXISTS ${tableName} (date timestamp primary key, price real, change_pct real)"
        executeQL(selectGroupsByUser)

        dataFrame.write
          .mode(SaveMode.Overwrite)
          .format("jdbc")
          .option(
            "url",
            s"jdbc:postgresql://${cassandraConfig.host}:${cassandraConfig.port}/${cassandraConfig.database}"
          )
          .option("user", cassandraConfig.user)
          .option("password", cassandraConfig.password)
          .option("dbtable", tableName)
          .save()
        logger.info("dataframe saved fund list")
      }
    } catch {
      case NonFatal(ex) =>
        logger.error("save fund price values {}", ex)
    }
  }

  def saveList(dataFrame: DataFrame) = {
    try {
      retry {

        val drop =
          s"DROP TABLE IF EXISTS ${TableNames.option_list}"
        executeQL(drop)

        val selectGroupsByUser =
          s"CREATE TABLE IF NOT EXISTS ${TableNames.option_list} (productname text, code text, price text, exerciseprice text, amount text, PRIMARY KEY (productName, code))"
        executeQL(selectGroupsByUser)

        dataFrame.write
          .mode(SaveMode.Overwrite)
          .format("jdbc")
          .option(
            "url",
            s"jdbc:postgresql://${cassandraConfig.host}:${cassandraConfig.port}/${cassandraConfig.database}"
          )
          .option("user", cassandraConfig.user)
          .option("password", cassandraConfig.password)
          .option("dbtable", TableNames.option_list)
          .save()
        logger.info("dataframe saved")
      }
    } catch {
      case NonFatal(ex) =>
        logger.error("save option_list {}", ex)
    }
  }

  def saveOptionsList(dataFrame: DataFrame) = {
    try {
      retry {

        val drop =
          s"DROP TABLE IF EXISTS ${TableNames.option_list}"
        executeQL(drop)

        val selectGroupsByUser =
          s"CREATE TABLE IF NOT EXISTS ${TableNames.option_list} (productname text, code text, price text, exerciseprice text, amount text, PRIMARY KEY (productName, code))"
        executeQL(selectGroupsByUser)

        dataFrame.write
          .mode(SaveMode.Overwrite)
          .format("jdbc")
          .option(
            "url",
            s"jdbc:postgresql://${cassandraConfig.host}:${cassandraConfig.port}/${cassandraConfig.database}"
          )
          .option("user", cassandraConfig.user)
          .option("password", cassandraConfig.password)
          .option("dbtable", TableNames.option_list)
          .save()
      }
    } catch {
      case NonFatal(ex) =>
        logger.error("save options list {}", ex)
        throw new Error(ex)
    }
  }

  def checkCreateVegaTable() = {
    try {
      retry {

        val drop =
          s"DROP TABLE IF EXISTS ${TableNames.vega_option}"
        executeQL(drop)
        val selectGroupsByUser =
          s"CREATE TABLE IF NOT EXISTS ${TableNames.vega_option} (code text PRIMARY KEY, contract_num text, short_name  text, delta  real, volume  real, gamma  real, vega  real, theta  real, embedded_value  real, vix  real, exercise_price  real, new_price  real)"

        executeQL(selectGroupsByUser)
      }
    } catch {
      case NonFatal(ex) =>
        logger.error("check create vega table {}", ex)
    }
  }

  def saveFundNameList(dataFrame: DataFrame) = {
    try {

      val drop =
        s"DROP TABLE IF EXISTS ${TableNames.fundNamesTableName}"
      executeQL(drop)
      val selectGroupsByUser =
        s"CREATE TABLE IF NOT EXISTS ${TableNames.fundNamesTableName} (code text PRIMARY KEY, short_pinyin text, short_name text, fund_type text, full_fund text)"
      executeQL(selectGroupsByUser)

      dataFrame.write
        .mode(SaveMode.Overwrite)
        .format("jdbc")
        .option(
          "url",
          s"jdbc:postgresql://${cassandraConfig.host}:${cassandraConfig.port}/${cassandraConfig.database}"
        )
        .option("user", cassandraConfig.user)
        .option("password", cassandraConfig.password)
        .option("dbtable", TableNames.fundNamesTableName)
        .save()
    } catch {
      case NonFatal(ex) =>
        logger.error("save fundname list {}", ex)
    }
  }

//  def saveFundNames(dataFrame: DataFrame) = {
//    retry {
//      try {
//        val selectGroupsByUser =
//          s"CREATE TABLE IF NOT EXISTS ${TableNames.fundTableName} (code text PRIMARY KEY, name text, dayGrowValue text, dayGrowRate text, claimStatus text, redeemStatus text, changeFee text)"
//        executeQL(selectGroupsByUser)
//
//        dataFrame.write
//          .format("org.apache.spark.sql.cassandra")
//          .options(
//            Map(
//              "table" -> TableNames.fundTableName,
//              "keyspace" -> cassandraConfig.cassandraKeyspace
//            )
//          )
//          .mode(SaveMode.Append)
//          .save()
//        logger.info("dataframe saved")
//      } catch {
//        case NonFatal(ex) =>
//          logger.error("savefunnames {}", ex)
//      }
//    }
//  }

  def saveSwIndexDataframe(name: SwIndexSymbol, dataFrame: DataFrame) = {
    retry {

      // (index_code,index_name,date,open,high,low,close,vol,amount,change_pct
      val drop =
        s"DROP TABLE IF EXISTS ${name.getTableName}"
      executeQL(drop)

      val selectGroupsByUser =
        s"CREATE TABLE IF NOT EXISTS ${name.getTableName} (date timestamp PRIMARY KEY, index_code text,index_name text,open real,high real ,low real,close real,vol real,amount real,change_pct real)"
      executeQL(selectGroupsByUser)
      //    open
      //    high
      //    low
      //    close
      //    volume
      //    outstanding_share
      //    turnover
      //    import sql._
      import org.apache.spark.sql._
      //    PARTITIONED BY (key_1
      //    DROP TABLE <tablename>
      //    val sqlContext = new org.apache.spark.sql.SQLContext(spark.sparkContext)
      //    val p = spark.sql(s"CREATE TABLE IF NOT EXISTS ${name.getTableName} (date timestamp PRIMARY KEY, open BIGINT, high BIGINT, low BIGINT, close BIGINT, volume BIGINT, outstanding_share BIGINT, turnover BIGINT)")
      //    .mode(SaveMode.Append).save(
      //    .mode(SaveMode.Append)
      dataFrame.write
        .mode(SaveMode.Overwrite)
        .format("jdbc")
        .option(
          "url",
          s"jdbc:postgresql://${cassandraConfig.host}:${cassandraConfig.port}/${cassandraConfig.database}"
        )
        .option("user", cassandraConfig.user)
        .option("password", cassandraConfig.password)
        .option("dbtable", name.getTableName)
        .save()
      logger.info("dataframe saved saveSwIndexDataframea {}", name)
    }
  }

  def saveIndexDataframe(name: IndexSymbol, dataFrame: DataFrame) = {
    retry {
      try {
        logger.info(s"saveIndexDataframe name ${name.code}")
        logger.info(s"saveIndexDataframe name ${name.code}")
        logger.info(s"saveIndexDataframe name ${name.code}")

        val drop =
          s"DROP TABLE IF EXISTS ${name.getTableName}"
        executeQL(drop)

        val selectGroupsByUser =
          s"CREATE TABLE IF NOT EXISTS ${name.getTableName} (date timestamp PRIMARY KEY, open real, high real, low real, close real, volume bigint)"
        executeQL(selectGroupsByUser)

        logger.info("date size {}", dataFrame.count)
        logger.info("date size {}", dataFrame.count)
        logger.info("date size {}", dataFrame.count)
        logger.info("date size {}", dataFrame.count)

        dataFrame.write
          .mode(SaveMode.Overwrite)
          .format("jdbc")
          .option(
            "url",
            s"jdbc:postgresql://${cassandraConfig.host}:${cassandraConfig.port}/${cassandraConfig.database}"
          )
          .option("user", cassandraConfig.user)
          .option("password", cassandraConfig.password)
          .option("dbtable", name.getTableName)
          .save()
        logger.info("dataframe saved indexSymbol")

      } catch {
        case NonFatal(x) =>
          logger.error("xxxxxxxxxxxxx save index {}", x)
      }
    }
  }

  def checkCreate(name: StockSymbol): Unit = {
    val selectGroupsByUser =
      s"CREATE TABLE IF NOT EXISTS ${name.getTableName} (date timestamp PRIMARY KEY, open Text, high text, low text, close text, volume text, outstanding_share text, turnover text)"
    executeQL(selectGroupsByUser)
  }

  def createCodeTable(code: StockSymbol): Unit = {
    val selectGroupsByUser =
      s"CREATE TABLE IF NOT EXISTS ${code.getTableName} (date timestamp PRIMARY KEY, open Text, high text, low text, close text, volume text, outstanding_share text, turnover text)"
    executeQL(selectGroupsByUser)
  }

  def saveDataframe(name: StockSymbol, dataFrame: DataFrame): Future[Unit] = {
    import scala.concurrent.Future

    implicit val perfectTen: Success[Unit] =
      _root_.retry.Success[Unit](_ => true)

    val f = Future {
      logger.info(s"saving Dateframe ${name}")
      val dropTable =
        s"DROP TABLE IF EXISTS ${name.getTableName}"

      executeQL(dropTable)

      logger.info(s"saving Dateframe ${name}")
      val selectGroupsByUser =
        s"CREATE TABLE IF NOT EXISTS ${name.getTableName} (date timestamp PRIMARY KEY, open Text, high text, low text, close text, volume text, outstanding_share text, turnover text)"
      executeQL(selectGroupsByUser)
      //    open
      //    high
      //    low
      //    close
      //    volume
      //    outstanding_share
      //    turnover
      //    import sql._
      import org.apache.spark.sql._
      //    PARTITIONED BY (key_1
      //    DROP TABLE <tablename>
      //    val sqlContext = new org.apache.spark.sql.SQLContext(spark.sparkContext)
      //    val p = spark.sql(s"CREATE TABLE IF NOT EXISTS ${name.getTableName} (date timestamp PRIMARY KEY, open BIGINT, high BIGINT, low BIGINT, close BIGINT, volume BIGINT, outstanding_share BIGINT, turnover BIGINT)")
      //    .mode(SaveMode.Append).save(
      //    .mode(SaveMode.Append)
      dataFrame.write
        .mode(SaveMode.Overwrite)
        .format("jdbc")
        .option(
          "url",
          s"jdbc:postgresql://${cassandraConfig.host}:${cassandraConfig.port}/${cassandraConfig.database}"
        )
        .option("user", cassandraConfig.user)
        .option("password", cassandraConfig.password)
        .option("dbtable", name.getTableName)
        .save()
      logger.info("dataframe saved stocksymbol")
    }
    _root_.retry.Backoff(max = 3, delay = 20.seconds).apply(() => f)
  }
}
