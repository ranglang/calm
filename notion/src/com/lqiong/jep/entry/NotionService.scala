package com.lqiong.jep.entry

import com.lqiong.jep.entry.a.UUIDUtil
import com.typesafe.config.ConfigFactory
import main.scala.com.a.lqiong.jep.option.StoreItem
import org.apache.spark.sql.{DataFrame, Dataset}
import org.jraf.klibnotion.client.{
  Authentication,
  ClientConfiguration,
  HttpConfiguration,
  NotionClient
}
import org.jraf.klibnotion.model.base.reference.DatabaseReference
import org.jraf.klibnotion.model.block.MutableBlockList
import org.jraf.klibnotion.model.color.Color
import org.jraf.klibnotion.model.database.Database
import org.jraf.klibnotion.model.database.query.DatabaseQuery
import org.jraf.klibnotion.model.emoji.EmojiKt.Emoji
import org.jraf.klibnotion.model.file.FileKt.File
import org.jraf.klibnotion.model.page.Page
import org.jraf.klibnotion.model.pagination.{Pagination, ResultPage}
import org.jraf.klibnotion.model.property.sort.PropertySort
import org.jraf.klibnotion.model.property.spec.PropertySpecList
import org.jraf.klibnotion.model.property.value.{PropertyValue, PropertyValueList}
import org.jraf.klibnotion.model.richtext.{Annotations, RichTextList}

import java.util
import java.util.UUID
import scala.collection.JavaConverters.collectionAsScalaIterableConverter

class NotionService() {

  val ak = ConfigFactory.load().getString("NOTION_AK")
  println(s"ak ${ak}")
  val n = new Authentication(ak)
  val s = new HttpConfiguration()
  val m = new ClientConfiguration(n, s)

  val notionClient = NotionClient.newInstance(m)

  //  val client = FutureNotionClientUtils.asFutureNotionClient(notionClient)

  import org.jraf.klibnotion.client.blocking.BlockingNotionClientUtils

  val client = BlockingNotionClientUtils.asBlockingNotionClient(notionClient)
  //

  def savePageForItemType[T](parentId: UUID, title: String, itme3: DataFrame) = {

    val ddddd: RichTextList = new RichTextList()

    val t = new RichTextList()
    val psl = new PropertySpecList()
//          .title("index")

    val d22 = itme3.dtypes.toList.foldLeft(psl.title("index"))((c, p) => {
      if (p._2 == "StringType") {
        c.text(p._1)
      } else {
        c
      }
    })

//      psl
//        .title("stock")
//        .text("code")
//        .text("name")

    val database2: Database = client.getDatabases.createDatabase(
      parentId.toString,
      (t.text(title, new Annotations(Color.RED))),
      null,
      null,
      d22
    )

    implicit def scalaToKotlin(u: Unit): kotlin.Unit = kotlin.Unit.INSTANCE

    //  def createPage(databaseReference: DatabaseReference, emojiOrFile: EmojiOrFile, file: File, propertyValueList: PropertyValueList, function1: Function1[_ >: MutableBlockList, Unit])

    //  val dddddddd = client.getPages.createPage
    // def createPage(databaseReference: DatabaseReference, emojiOrFile: EmojiOrFile, file: File, propertyValueList: PropertyValueList, mutableBlockList: MutableBlockList): Page

    //    .createPage

    itme3.collect().toList.zipWithIndex.foreach { a11 =>
      {
        val item = a11._1

        //  new PropertyValueList(),
//      val a = d
        val propertyValueList = new PropertyValueList()

        val d22 = itme3.dtypes.toList
          .foldLeft(propertyValueList.title("index", a11._2.toString))((c, p) => {
            if (p._2 == "StringType") {
              c.text(p._1, item.getAs[String](p._1))
            } else {
              c
            }
          })
//      val s1 = propertyValueList
//        .title("stock", "title")
//
//        .text("code", item.code)
//        .text("name", item.name)
        val createdPageInDb1 = client.getPages.createPage(
          new DatabaseReference(database2.getId),
          null,
          //        Emoji("⚙️"),
          //        File("https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885__480.jpg️"),
          null,
          d22,
          //    new PropertyValueList(),
          new MutableBlockList()
          //    a222.asInstanceOf[kotlin.jvm.functions.Function1[_ >: org.jraf.klibnotion.model.block.MutableBlockList, kotlin.Unit]]
        )
      }
    }
  }

  def savePageForItem(parentId: UUID, item: Dataset[StoreItem]) = {

    val ddddd: RichTextList = new RichTextList()

    val t = new RichTextList()
    val psl = new PropertySpecList()
//      .title("stock")

    val database2: Database = client.getDatabases.createDatabase(
      parentId.toString,
      (t.text("code names ", new Annotations(Color.RED))),
      null,
      null,
      psl
        .title("stock")
        .text("code")
        .text("name")
    )

    implicit def scalaToKotlin(u: Unit): kotlin.Unit = kotlin.Unit.INSTANCE

    //  def createPage(databaseReference: DatabaseReference, emojiOrFile: EmojiOrFile, file: File, propertyValueList: PropertyValueList, function1: Function1[_ >: MutableBlockList, Unit])

    //  val dddddddd = client.getPages.createPage
    // def createPage(databaseReference: DatabaseReference, emojiOrFile: EmojiOrFile, file: File, propertyValueList: PropertyValueList, mutableBlockList: MutableBlockList): Page

    //    .createPage

    item.columns
    println("item.columns.toList.mkString")
    println(item.columns.toList.mkString)
    println(item.dtypes.length)
    println("item.dtypes(0)._2")
    println(item.dtypes(0)._2)
    println("item.dtypes(0)._1")
    println(item.dtypes(0)._1)

    item.collectAsList().asScala.foreach { item =>
      {

        //  new PropertyValueList(),
        val propertyValueList = new PropertyValueList()
        val s1 = propertyValueList
          .title("stock", item.name)
          .text("code", item.code)
          .text("name", item.name)
        val createdPageInDb1 = client.getPages.createPage(
          new DatabaseReference(database2.getId),
          null,
//        Emoji("⚙️"),
//        File("https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885__480.jpg️"),
          null,
          s1,
          //    new PropertyValueList(),
          new MutableBlockList()
          //    a222.asInstanceOf[kotlin.jvm.functions.Function1[_ >: org.jraf.klibnotion.model.block.MutableBlockList, kotlin.Unit]]
        )
      }
    }
  }

  def createPagesInDatabse() = {
    //  val yourBotToken = weiboConf.oauth.notion.ak
    val database =
      client.getDatabases.getDatabase(UUIDUtil.insertDashUUID("04f4d91ace004a36b45855df754fa7d4"))
    //  .get
    println(database)
    println(database)
    //
    val database1 = client.getDatabases.queryDatabase(
      UUIDUtil.insertDashUUID("04f4d91ace004a36b45855df754fa7d4"),
      new DatabaseQuery()
        .any(
          //      new DatabaseQueryPropertyFilter.Text(
          //        "Title",
          //        new DatabaseQueryPredicate.Text.Equals("aaaa")
          //      )
        ),
      new PropertySort()
        .ascending("Title"),
      new Pagination()
    )

    val d: ResultPage[Page] = database1

    println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa")
    println(d)

    println("database1", d.results.get(0))

    println("database length", d.results.size)
    println("database length", d.results.size)
    println("database length", d.results.size)
    println("database length", d.results.size)

    val head: Page = d.results.get(0)
    println("xxxxxx")
    println("xxxxxx")
    println("xxxxxx")
    println("xxxxxx")
    println("xxxxxx")
    val a: util.List[PropertyValue[_]] = head.getPropertyValues
    println(s"a.get(1).toString ${a.get(0).getValue}", a.get(0).getName)

    println("xxxxxx")
    println("xxxxxx")
    val v = a.get(0).getValue.asInstanceOf[RichTextList]
    println("a.get(1).Value", v.getPlainText)

    println("xxxxxx")
    println("xxxxxx")
    println("xxxxxx")
    println("a.get(2).toString", a.get(1).toString)

    val v2 = a.get(0).getValue.asInstanceOf[RichTextList]
    println(s"a.get(2).Value ${a.get(1).getName}", v2.getPlainText)

    val ddddd: RichTextList = new RichTextList()

    val t = new RichTextList()
    val psl = new PropertySpecList()

    val database2 = client.getDatabases.createDatabase(
      UUIDUtil.insertDashUUID("36bb7808339041cba1809ac2b536ebb8"),
      (t.text("yyyyyyyyyyyyyyyes ", new Annotations(Color.RED))),
      null,
      null,
      psl
        .title("The title")
        .text("brand")
    )
    //    new PropertySpecList())
    println(t)

    val userResultPage = client.getUsers.getUserList(new Pagination())
    println(userResultPage)

    val id = userResultPage.results.asScala.headOption.get.getId

    //                  databaseReference: DatabaseReference,
    //  emojiOrFile: EmojiOrFile,
    //  file: File, propertyValueList: PropertyValueList, f
    //  unction1: Function1[_ >: MutableBlockList, Unit])

    println("Created page in database (with no properties):")
    //
    //  def createPage(databaseReference: DatabaseReference, emojiOrFile: EmojiOrFile,
    //  \file: File, propertyValueList: PropertyValueList, function1: Function1[_ >: MutableBlockList, Unit])

    implicit def scalaToKotlin(u: Unit): kotlin.Unit = kotlin.Unit.INSTANCE

    //  def createPage(databaseReference: DatabaseReference, emojiOrFile: EmojiOrFile, file: File, propertyValueList: PropertyValueList, function1: Function1[_ >: MutableBlockList, Unit])

    //  val dddddddd = client.getPages.createPage
    // def createPage(databaseReference: DatabaseReference, emojiOrFile: EmojiOrFile, file: File, propertyValueList: PropertyValueList, mutableBlockList: MutableBlockList): Page

    //    .createPage

    //  new PropertyValueList(),
    val propertyValueList = new PropertyValueList()
    val s1 = propertyValueList
      .title("The title", "A page in a database ${Random.nextInt()}")
      //    .email("Email", "aaa@aaa.com")
      //    .multiSelectByNames("Multi", "Red", "Green")
      //    .number("Number", null)
      .phoneNumber("Phone", "18507556361")
    val createdPageInDb1 = client.getPages.createPage(
      new DatabaseReference("689820a98a5140699feae84bee8f40c0"),
      Emoji("⚙️"),
      File("https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885__480.jpg️"),
      propertyValueList,
      //    new PropertyValueList(),
      new MutableBlockList()
      //    a222.asInstanceOf[kotlin.jvm.functions.Function1[_ >: org.jraf.klibnotion.model.block.MutableBlockList, kotlin.Unit]]
    )
    println("CCCCCCCCCC ", createdPageInDb1)
  }
}
