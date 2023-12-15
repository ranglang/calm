package e

import cats.effect.{ExitCode, IO, IOApp}
import e.model.LineIO
import m.utils.Clipboard
import org.fusesource.jansi.AnsiConsole

import scala.collection.mutable.ListBuffer

object CommitEntry extends IOApp {
  override def run(args: List[String]): IO[ExitCode] =
    for {
      _ <- {
        IO {
          AnsiConsole.systemInstall()
        }
      }
      repeatInfo <- {
        LineIO.prompt("Did you repeat the word", required = true)
      }
      specInfomation <- {
        LineIO.prompt("Did you know your delivery specification", required = true)
      }
      whyInput <- {
        LineIO.prompt("Why you are submitting this code", required = true)
      }
      whyOpensource <- {
        LineIO.prompt("Opensource Header", required = true)
      }
      whySolutionInput <- {
        LineIO.prompt("Why you are use this solution", required = true)
      }
      uiThemeInput <- {
        LineIO.prompt("Have you check the theme", required = true)
      }
      styleSheetLogic <- {
        LineIO.prompt("Do you have stylesheet hierarchy , gap  border autoWidth ", required = true)
      }
      styleRecover <- {
        LineIO.prompt("Have you check the theme", required = true)
      }
      selfCheckInput <- {
        ReadListOption(
          "Is there a list of self-tested use cases that are available and tested?",
          ListBuffer("YES", "NO")
        )
      }
      typeSafe <- {
        LineIO.prompt("Is your code is type safe , your input should be clarify ?")
      }
      moduleInput <- {
        LineIO.prompt("Is the module and code directory structure clear?")
      }
      changeLogInput <- {
        LineIO.prompt(
          "Do your changes affect ChangeLog or the relevant documentation, feature or hotfix ?"
        )
      }
      uselessInput <- {
        LineIO.prompt("Is there code that needs to be refactored or removed? ")
      }
      sizeInput <- {
        LineIO.prompt("Size limitted for Pull Request ? ")
      }
      relationshipInput <- {
        LineIO.prompt("Is there a better design pattern in code?")
      }
      permissionInput <- {
        LineIO.prompt("Is permission is handled ?")
      }
      loadingRetry <- {
        LineIO.prompt("Is there a logic which handles retry and timeout ?")
      }
      refactorTarget <- {
        LineIO.prompt("Is there a better for todo list for next thing to do  ?")
      }
      performanceOptimizationInput <- {
        LineIO.prompt("Is there  considerration for optionmizaiton for example for lazy import ?")
      }
      longTerm <- {
        LineIO.prompt(
          "Do you summarize the specific for you components , ex. Tooltip & typhony  or LoadingButton ?"
        )
      }
      sureInput <- {
        LineIO.prompt("Do you understand boundary conditions? Do you deal with exceptions?")
      }
      designPatternInput <- {
        LineIO.prompt("Does your code meet the SOLID principle？")
      }
      _ <- {
        val resultMsg = List(
          whyInput,
          sizeInput,
          loadingRetry,
          longTerm,
          styleRecover,
          whySolutionInput,
          styleSheetLogic,
          moduleInput,
          whyOpensource,
          changeLogInput,
          uselessInput,
          uiThemeInput,
          relationshipInput,
          performanceOptimizationInput,
          sureInput,
          specInfomation,
          repeatInfo,
          permissionInput,
          designPatternInput,
          refactorTarget,
          selfCheckInput,
          typeSafe
        ).mkString("\n")
        Clipboard.text(resultMsg)
      }
    } yield ExitCode.Success
}
