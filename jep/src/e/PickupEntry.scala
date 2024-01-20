package e

//class PickupEntry {
//  package e

  import cats.effect.{ExitCode, IO, IOApp}
  import e.model.LineIO
  import m.utils.Clipboard
  import org.fusesource.jansi.AnsiConsole

  object PickupEntry extends IOApp {
    override def run(args: List[String]): IO[ExitCode] =
      for {
        _ <- {
          IO {
            AnsiConsole.systemInstall()
          }
        }
        repeatInfo <- {
          LineIO.prompt("Did you repeat the word Use Scenario", required = true)
        }

        licensamaintainere <- {
          LineIO.prompt("Do you know the license and maintainer", required = true)
        }

        performancePoint <- {
          LineIO.prompt("Does it meet the performance requirements.", required = true)
        }
        philosophy <- {
          LineIO.prompt("Did you design pattern and philosophy ? ", required = true)
        }
        quality <- {
          LineIO.prompt("Do you know the quality, strength", required = true)
        }
        rightThing <- {
          LineIO.prompt("Every thing do it right don't mix up", required = true)
        }
        _ <- {
          val resultMsg = List(
            repeatInfo,
            performancePoint,
            quality,
            philosophy,
            licensamaintainere,
            rightThing
          ).mkString("\n")
          Clipboard.text(resultMsg)
        }
      } yield ExitCode.Success
  }
