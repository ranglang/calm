package m

import cats.effect.{ExitCode, IO, IOApp}
import m.utils.Clipboard

object TestEntry1 extends IOApp {

  override def run(args: List[String]): IO[ExitCode] = {
    Clipboard.text("hi").map(_ => ExitCode.Success)
  }
}
