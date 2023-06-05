package com.lqiong.jep.entry

import com.google.inject.Inject
import plotly.Scatter
import plotly.layout.Layout

import java.io.File

class PlotChart @Inject() (
  val polyty: Polyty
) {

  def run(): Unit = { // adds save(...) method to plotly-scala

    val x = (0 to 100).map(_ * 0.1)
    val y1 = x.map(d => 2.0 * d + 1)
    val y2 = x.map(math.exp)

    val plot1 = Seq(
      Scatter(x, y1).withName("Approx twice"),
      Scatter(x, y2).withName("Exp")
    )

    val layout = Layout().withTitle("Curves")
    polyty.print(new File("/tmp/1.png"), plot1, layout, save = true)
  }
}
