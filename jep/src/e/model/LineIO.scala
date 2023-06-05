package e.model

import cats.effect.IO
import e.TerminalSingleton
import org.jline.reader.LineReaderBuilder

object LineIO {

  @inline final val reader = LineReaderBuilder
    .builder()
    .terminal(TerminalSingleton.get)
    .build();

  def prompt(prompt: String): IO[String] = {
    for {
      i <- IO {
        reader.readLine(prompt)
      }
    } yield s"${prompt}: ${i}"
  }

  def prompt(prompt: String, required: Boolean): IO[String] = {
    if (required) {
      IO(
        reader.readLine(s"${prompt} (必选)")
      ).flatMap { r =>
        if (r.isEmpty) {
          LineIO.prompt(prompt, required)
        } else {
          IO.print(r)
        }
      }.map(i => s"${prompt}: ${i}")

    } else {
      for {
        i <- IO {
          reader.readLine(prompt)
        }
      } yield s"${prompt}: ${i}"
    }

  }
}
