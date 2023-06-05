package m

import plotly.Plotly.TraceOps
import plotly.Scatter

object PlotlyEntry extends App {

  val trace1 = Scatter(
    Seq(1, 2, 3, 4),
    Seq(10, 15, 13, 17)
  )

  val trace2 = Scatter(
    Seq(1, 2, 3, 4),
    Seq(16, 5, 11, 9)
  )

  val data = Seq(trace1, trace2)

  import plotly._
  import plotly.element._
  import plotly.layout._

  //  val (x, y) = Seq(
  //    "Banana" -> 10,
  //    "Apple" -> 8,
  //    "Grapefruit" -> 5
  //  ).unzip

  val layout = Layout().withTitle("")

  import plotly._
  import plotly.element._
  import plotly.layout._

  val (x, y) = Seq(
    "Banana"     -> 10,
    "Apple"      -> 8,
    "Grapefruit" -> 5
  ).unzip

  Bar(x, y).plot()
}

//IV1dHD9vayrzJFQNK3j7
