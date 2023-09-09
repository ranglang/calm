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
      selfCheckInput <- {
        ReadListOption(
          "Is there a list of self-tested use cases that are available and tested?",
          ListBuffer("YES", "NO")
        )
      }
      moduleInput <- {
        LineIO.prompt("Is the module and code directory structure clear?")
      }
      changeLogInput <- {
        LineIO.prompt("Do your changes affect ChangeLog or the relevant documentation?")
      }
      uselessInput <- {
        LineIO.prompt("Is there code that needs to be refactored or removed? ")
      }
      relationshipInput <- {
        LineIO.prompt("Is there a better design pattern in code?")
      }
      performanceOptimizationInput <- {
        LineIO.prompt("Is there  considerration for optionmizaiton for example for lazy import ?")
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
          whySolutionInput,
          moduleInput,
          whyOpensource,
          changeLogInput,
          uselessInput,
          uiThemeInput,
          relationshipInput,
          performanceOptimizationInput,
          sureInput,
          designPatternInput,
          selfCheckInput
        ).mkString("\n")
        Clipboard.text(resultMsg)
      }
    } yield ExitCode.Success
}
