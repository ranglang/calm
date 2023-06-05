package m

import cats.effect.{ExitCode, IO, IOApp}
import e.model.LineIO
import io.circe.generic.JsonCodec
import io.circe.jawn
import org.fusesource.jansi.AnsiConsole

import scala.util.Try

@JsonCodec
case class QAInterview(name: String, b: String)

object InterviewEntry extends IOApp {
  override def run(args: List[String]): IO[ExitCode] =
    for {
      _ <- {
        IO {
          AnsiConsole.systemInstall()
        }
      }
      questionInput <- {
        LineIO.prompt("Question: ")
      }
      answerInput <- {
        LineIO.prompt("Answer: ")
      }
      _ <- {
        IO {

          val wd = os.home / "qa.json"

          val w2: List[QAInterview] = Try {
            jawn
              .decode[List[QAInterview]](os.read(wd))
              .getOrElse(List.empty[QAInterview])
          }.toOption.getOrElse(List.empty)
          val item = QAInterview(
            questionInput,
            answerInput
          )
          import io.circe.syntax._
          os.write.over(wd, (w2.::(item)).asJson.spaces2)
        }
      }
    } yield ExitCode.Success
}
