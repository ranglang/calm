import java.util.jar.JarFile
import java.net.InetAddress
import $file.dependencies
import $file.settings
import coursier.Repository
import mill.{Agg, _}
import mill.modules.Assembly._
import mill.scalalib.{PublishModule, _}
import mill.scalalib.scalafmt.ScalafmtModule
import $ivy.`com.lihaoyi::mill-contrib-bloop:$MILL_VERSION`
import $file.dependencies
import $file.settings
import $file.env
import boat.ivy
import coursier.Repository
import cronish.millSourcePath
import jep.{forkArgsEnv}
import mill.bsp.BSP.millSourcePath
import mill.define.Target
import mill.modules.Assembly._
import mill.scalalib._
import mill.scalalib.publish.{PomSettings, _}
import os.{/, Path, RelPath}

import scala.Predef.->


val doobieVersion = "0.9.0";
val scassandraVersion = "3.2.0"
val qiniuVersion = "7.2.20"

val aPublishVersion = "0.0.42"
val wd =os.pwd

os.write.over(wd/"common.sh", s"VERSION=$aPublishVersion" )

trait SbtLqiongModule extends SbtModule with ScalafmtModule {

  override def scalaVersion: Target[String] = settings.scalaVersion

  override def scalacOptions: Target[Seq[String]] =
    settings.defaultScalacOptions1

 override def repositoriesTask = T.task {
    super.repositoriesTask() ++ settings.customRepositories
  }

  override def assemblyRules = super.assemblyRules.++(
    Seq(
      Rule.Exclude(JarFile.MANIFEST_NAME),
      Rule.Append("application.conf"),
      Rule.Append("application.prod.conf"),
      Rule.AppendPattern(".*\\.conf"),
      Rule.ExcludePattern(".*\\.[sS][fF]"),
      Rule.AppendPattern(".*\\.dic"),
      Rule.ExcludePattern(".*\\.[dD][sS][aA]"),
      Rule.ExcludePattern(".*\\.[rR][sS][aA]"),
      Rule.ExcludePattern("META-INF/versions/\\.*"),
      Rule.Append(".*spring\\.*")
    )
  )
}

object foo extends JavaModule {
  override def ivyDeps = super
    .ivyDeps()
    .++(
      Agg(
        ivy"org.thymeleaf:thymeleaf:3.1.0.M2",
        ivy"com.belerweb:pinyin4j:2.5.1",
        ivy"org.apache.commons:commons-lang3:3.12.0"
      )
    )

}

object tt extends  ScalaModule {

  override def scalacOptions: Target[Seq[String]] =
    settings.defaultScalacOptions12

  override def scalaVersion: Target[String] = settings.scala212Version

  override def moduleDeps = Seq(foo)
}

object oj extends  JavaModule {

  override def mainClass = Some("oj.R")

}

object generated extends  JavaModule with  LPublishModule {
  override def ivyDeps = super.ivyDeps().++(dependencies.lqiong.circleJava)
}

object arc extends ScalaModule with ScalafmtModule {
  override def scalacOptions: Target[Seq[String]] =
    settings.defaultScalacOptions12

  override def scalaVersion: Target[String] = settings.scala212Version

  override def sources = T.sources {
    millSourcePath / 'src / 'main / 'scala
  }

  override def mainClass = Some("e.Main")

  override def ivyDeps = super
    .ivyDeps()

 override def repositoriesTask = T.task {
    super.repositoriesTask() ++ settings.customRepositories
  }

}

object traitor extends ScalaModule with ScalafmtModule with LPublishModule {
  override def scalaVersion: Target[String] = settings.scalaVersion

  override def moduleDeps = Seq(shared.asInstanceOf[PublishModule])

  override def ivyDeps = super
    .ivyDeps()
    .++(dependencies.lqiong.jep)
    .++(
      dependencies.lqiong.modelDeps
    ).++(
    dependencies.lqiong.talib
  )
    .++(
      dependencies.lqiong.cache
    )
    .++(
      dependencies.lqiong.quill
    )
    .++(
      dependencies.lqiong.promise
    )
    .++(
      dependencies.lqiong.inject
    )
    .++(
      dependencies.lqiong.spark
    )
    .++(
      dependencies.lqiong.cats
    )

  override def scalacOptions: Target[Seq[String]] =
    settings.defaultScalacOptions1

 override def repositoriesTask = T.task {
    super.repositoriesTask() ++ settings.customRepositories
  }
}

object cronish extends ScalaModule with ScalafmtModule with LPublishModule {
  override def scalaVersion: Target[String] = settings.scalaVersion

  override def ivyDeps = super
    .ivyDeps()
    .++(
      Agg(
        ivy"org.scala-lang.modules::scala-parser-combinators:2.0.0"
      )
    )
    .++(dependencies.lqiong.akka)

  override def scalacOptions: Target[Seq[String]] =
    settings.defaultScalacOptions1

 override def repositoriesTask = T.task {
    super.repositoriesTask() ++ settings.customRepositories
  }

  override def sources = T.sources {
    millSourcePath / 'src / 'main / 'scala
  }

}

object shared extends ScalaModule with ScalafmtModule with LPublishModule {

  override def scalacOptions: Target[Seq[String]] =
    settings.defaultScalacOptions1

  override def sources = T.sources {
    millSourcePath / 'src / 'main / 'scala
  }

  override def mainClass = Some("com.lqiong.main.A.scala")

  override def ivyDeps = super
    .ivyDeps()
    .++(dependencies.lqiong.enumeratum)
    .++(dependencies.lqiong.circle)
    .++(dependencies.lqiong.jodaTime)
    .++(dependencies.lqiong.phantom)
    .++(dependencies.lqiong.chimney)
    .++(dependencies.lqiong.html)
    .++(dependencies.lqiong.cal)
    .++(dependencies.lqiong.common)
    .++(dependencies.lqiong.inject)
    .++(dependencies.lqiong.promise)
    .++(dependencies.lqiong.slick)
    .++(Agg(dependencies.lqiong.aliyunLog))
    .++(
      dependencies.lqiong.doobie
    )
    .++(
      dependencies.lqiong.plotly
    )
    .++(
      dependencies.lqiong.scassandra
    )
    .++(
      dependencies.lqiong.notion
    )
    .++(
      dependencies.lqiong.cats
    )
    .++(
      dependencies.lqiong.logOthers
    )
    .++(
      Agg(
        ivy"org.typelevel::frameless-dataset:0.13.0",
        ivy"org.typelevel::frameless-cats:0.13.0"
      )
  )

 override def repositoriesTask = T.task {
    super.repositoriesTask() ++ settings.customRepositories
  }

  def sourceRoot1 = os.pwd / 'fe / 'packages / "kun-shared" / 'src / 'src_managed

  override def scalaVersion: Target[String] = settings.scalaVersion

  def pre_clean: Target[Unit] = T {
    os.remove(os.pwd / 'shared / 'target / "scala-ts" / 'src_managed)
  }

  def copy() = T.command {
    os.remove.all(sourceRoot1)
    os.copy.over(os.pwd / 'shared / 'target / "scala-ts" / 'src_managed, sourceRoot1)
    os.list(os.pwd / 'fe / 'packages / "kun-shared" / 'src / 'common)
      .foreach((f: Path) => {
        println(s"copying ${f.last}")
        os.copy.over(f, sourceRoot1 / f.last)
      })
  }

  def sbt() = T.command {
    os.proc("sbt", "clean").call(cwd = os.pwd / 'shared);
    os.proc("sbt", "compile").call(cwd = os.pwd / 'shared);
    copy()
  }

  def rm() = T.command {
    os.remove(os.pwd / 'shared / 'target / "scala-ts" / 'src_managed)
  }
}

trait JepLqiongModule extends ScalaModule with ScalafmtModule {

  object test extends ScalaTests  with TestModule.ScalaTest  {

    override def ivyDeps =
      Agg(
        dependencies.scalatest
      )
        .++(
          dependencies.lqiong.test
        )

    override def forkArgs = forkArgsEnv

  }

  override def scalaVersion: Target[String] = settings.scalaVersion

  override def scalacOptions: Target[Seq[String]] =
    settings.defaultScalacOptions1

 override def repositoriesTask = T.task {
    super.repositoriesTask() ++ settings.customRepositories
  }

  override def assemblyRules = super.assemblyRules.++(
    Seq(
      Rule.Exclude(JarFile.MANIFEST_NAME),
      Rule.Append(
        "application.conf"
      ), // all application.conf files will be concatenated into single file
      Rule.Append(
        "application.prod.conf"
      ), // all application.conf files will be concatenated into single file
      Rule.AppendPattern(".*\\.conf"),
      Rule.ExcludePattern(".*\\.[sS][fF]"),
      Rule.AppendPattern(".*\\.dic"),
      Rule.ExcludePattern(".*\\.[dD][sS][aA]"),
      Rule.ExcludePattern(".*\\.[rR][sS][aA]"),
      Rule.ExcludePattern("META-INF/versions/\\.*"),
      Rule.Append(".*spring\\.*")
    )
  )

  val f = System.getProperty("LD_LIBRARY_PATH")


  val forkArgsEnv = Seq(
    "-Dquill.binds.log=true",
    //"--illegal-access=permit",
    s"-Djava.library.path=${env.env.jepHome}"
  )
}

trait LqiongModule extends ScalaModule with ScalafmtModule {

  override def scalaVersion: Target[String] = settings.scalaVersion

  override def scalacOptions: Target[Seq[String]] =
    settings.defaultScalacOptions1

  override def repositoriesTask = T.task {
    super.repositoriesTask() ++ settings.customRepositories
  }
}

object boat extends LqiongModule with LPublishModule {
  override def scalaVersion: Target[String] = settings.scalaVersion

 override def forkArgs = Seq("-Xss2G", "-Xmx12G")
  override def moduleDeps = Seq(generated.asInstanceOf[PublishModule])

  override def ivyDeps = dependencies.lqiong.selenium
    .++(
      dependencies.lqiong.monovore
  )
    .++(
      dependencies.lqiong.modelJar
    )
    .++(
      dependencies.lqiong.tapir
    )
    .++(
      dependencies.lqiong.modelJar
    ).++(
      dependencies.lqiong.cache
  )
    .++(dependencies.lqiong.akka)
    .++(
      dependencies.lqiong.stream1
    )
    .++(
      dependencies.lqiong.cats
    )
    .++(
      dependencies.lqiong.chimneybase
    )
  .++(
      dependencies.lqiong.tofu
    )
    .++(
      dependencies.lqiong.html
    )
    .++(
      dependencies.lqiong.shapeless
    )
    .++(
      dependencies.lqiong.chimneybase
    )
    .++(
      dependencies.lqiong.cal
    )
    .++(
      dependencies.lqiong.sttpV3
    )
    .++(
      dependencies.lqiong.circle
    )
    .++(
      dependencies.lqiong.config
    )
    .++(
      dependencies.lqiong.promise
    )
    .++(
      dependencies.lqiong.enumeratumBase
    )
    .++(
      dependencies.lqiong.jodaTime
    )
}

object notion extends LqiongModule with LPublishModule {
//  override def moduleDeps: Seq[PublishModule]  = super.moduleDeps ++ Seq(admin.asInstanceOf[PublishModule])
  override def scalaVersion: Target[String] = settings.scalaVersion
  override def pomSettings = PomSettings(
    description = "models for stock via dsl",
    organization = "tech.shangche",
    url = "https://maven.pkg.github.com/ranglang/packages",
    licenses = Seq(License.MIT),
    versionControl = VersionControl.github("lihaoyi", "example"),
    developers = Seq(
      Developer("ranglang", "Rang Lang", "https://github.com/ranglang")
    )
  )

  override def forkArgs = forkArgsEnv

  override def ivyDeps = dependencies.lqiong.selenium
    .++(
      dependencies.lqiong.monovore
    )
    .++(
      dependencies.lqiong.cats
    )
    .++(
      dependencies.lqiong.notion
    )
    .++(
      dependencies.lqiong.tofu
    )
    .++(
      dependencies.lqiong.html
    )
    .++(
      dependencies.lqiong.shapeless
    )
    .++(
      dependencies.lqiong.chimneybase
    )
    .++(
      dependencies.lqiong.cal
    )
    .++(
      dependencies.lqiong.sttpV3
    )
    .++(
      dependencies.lqiong.circle
    )
    .++(
      dependencies.lqiong.config
    )
    .++(
      dependencies.lqiong.promise
    )
    .++(
      dependencies.lqiong.spark
    )
    .++(
      dependencies.lqiong.enumeratumBase
    )
    .++(
      dependencies.lqiong.jodaTime
    )
    .++(
      dependencies.lqiong.logOthers
    )
}

trait LPublishModule extends PublishModule {
  override def publishVersion = aPublishVersion
  override def sonatypeUri: String = "https://maven.pkg.github.com/ranglang/claim"
  def pomSettings = PomSettings(
    description = "tools for shangche",
    organization = "tech.shangche",
    url = "https://maven.pkg.github.com/ranglang/packages",
    licenses = Seq(License.MIT),
    versionControl = VersionControl.github("lihaoyi", "example"),
    developers = Seq(
      Developer("ranglang", "Rang Lang", "https://github.com/ranglang")
    )
  )
}

object model extends LqiongModule with LPublishModule {
  override def moduleDeps: Seq[PublishModule] = super.moduleDeps

  override def scalaVersion: Target[String] = settings.scalaVersion

  override def pomSettings = PomSettings(
    description = "tools for shangche",
    organization = "tech.shangche",
    url = "https://maven.pkg.github.com/ranglang/packages",
    licenses = Seq(License.MIT),
    versionControl = VersionControl.github("lihaoyi", "example"),
    developers = Seq(
      Developer("ranglang", "Rang Lang", "https://github.com/ranglang")
    )
  )

  override def ivyDeps = dependencies.lqiong.selenium
    .++(
      dependencies.lqiong.monovore
    )
    .++(
      dependencies.lqiong.cats
    )
    .++(
      dependencies.lqiong.tofu
    )
    .++(
      dependencies.lqiong.html
    )
    .++(
      dependencies.lqiong.shapeless
    )
    .++(
      dependencies.lqiong.chimneybase
    )
    .++(
      dependencies.lqiong.cal
    )
    .++(
      dependencies.lqiong.sttpV3
    )
    .++(
      dependencies.lqiong.circle
    )
    .++(
      dependencies.lqiong.config
    )
    .++(
      dependencies.lqiong.promise
    )
    .++(
      dependencies.lqiong.enumeratumBase
    )
    .++(
      dependencies.lqiong.jodaTime
    )

}

object jep extends JepLqiongModule {
  override def moduleDeps =
    super.moduleDeps ++ Seq(shared, traitor, oj)

  override def ivyDeps = dependencies.lqiong.jep.++(
    Agg(
      ivy"tech.shangche::boat:${dependencies.lqiong.boatVersion}",
    ))
    .++(dependencies.lqiong.cats)
    .++(dependencies.lqiong.osLIb)
    .++(
      dependencies.lqiong.modelDeps
    )
    .++(
      dependencies.lqiong.quill
    )
    .++(
      dependencies.lqiong.amyKubernate
    )
    .++(
      dependencies.lqiong.di
    )
    .++(
      dependencies.lqiong.nameof
    )
    .++(
      dependencies.lqiong.sttpV3
    )
    .++(
      dependencies.lqiong.tapir
    )
    .++(
      dependencies.lqiong.rainer
    )
    .++(
      dependencies.lqiong.postgresql
    )
    .++(
      dependencies.lqiong.json
    )
    .++(
      dependencies.lqiong.html
    )
    .++(
      dependencies.lqiong.tofu
    )
    .++(
      dependencies.lqiong.talib1
    )
    .++(
      dependencies.lqiong.jfree
    )
    .++(
      dependencies.lqiong.cache
    )
    .++(
      dependencies.lqiong.cluster
    )
    .++(
      dependencies.lqiong.kamon
    )
    .++(dependencies.lqiong.akka)
    .++(
      dependencies.lqiong.cli
    )
    .++(
      dependencies.lqiong.talib
    )
    .++(
      dependencies.lqiong.test
  )

  override def mainClass = Some("e.Entry")

  override def forkArgs = forkArgsEnv
}
