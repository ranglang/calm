package com.lqiong.jep

import io.getquill.ast.NumericOperator.<
import levsha.dsl.html.i

import java.awt.Color
import java.awt.Dimension
import java.text.SimpleDateFormat
import java.util.Date
import java.util
import org.jfree.chart.ChartFactory
import org.jfree.chart.ChartPanel
import org.jfree.chart.JFreeChart
import org.jfree.chart.axis.DateAxis
import org.jfree.chart.plot.Marker
import org.jfree.chart.plot.ValueMarker
import org.jfree.chart.plot.XYPlot
import org.jfree.chart.ui.ApplicationFrame
import org.jfree.data.time.Minute
import org.jfree.data.time.TimeSeriesCollection
import org.jfree.ui.ApplicationFrame
import org.jfree.ui.RefineryUtilities
import org.ta4j.core.indicators.SMAIndicator
import org.ta4j.core.{
  Bar,
  BarSeries,
  BarSeriesManager,
  BaseBarSeries,
  BaseStrategy,
  Indicator,
  Position,
  Strategy
}
import org.ta4j.core.indicators.helpers.ClosePriceIndicator
import org.ta4j.core.num.Num
import org.ta4j.core.rules.{OverIndicatorRule, UnderIndicatorRule}

import scala.jdk.CollectionConverters.CollectionHasAsScala

/** This class builds a graphical chart showing the buy/sell signals of a strategy.
  */
object BuyAndSellSignalsToChart {

  /** Runs a strategy over a bar series and adds the value markers corresponding to buy/sell signals
    * to the plot.
    *
    * @param series
    *   the bar series
    * @param strategy
    *   the trading strategy
    * @param plot
    *   the plot
    */
  private def addBuySellSignals(
    series: BarSeries,
    strategy: Strategy,
    plot: XYPlot
  ): Unit = { // Running the strategy
    val seriesManager = new BarSeriesManager(series)
    val positions = seriesManager.run(strategy).getPositions.asScala.toList
    // Adding markers to plot
    for (position <- positions) { // Buy signal
      val buySignalBarTime = new Minute(
        Date.from(
          series.getBar(position.getEntry.getIndex).getEndTime.toInstant
        )
      ).getFirstMillisecond
      val buyMarker = new ValueMarker(buySignalBarTime)
      buyMarker.setPaint(Color.GREEN)
      buyMarker.setLabel("B")
      plot.addDomainMarker(buyMarker)
      // Sell signal
      val sellSignalBarTime = new Minute(
        Date.from(series.getBar(position.getExit.getIndex).getEndTime.toInstant)
      ).getFirstMillisecond
      val sellMarker = new ValueMarker(sellSignalBarTime)
      sellMarker.setPaint(Color.RED)
      sellMarker.setLabel("S")
      plot.addDomainMarker(sellMarker)
    }
  }

  /** Displays a chart in a frame.
    *
    * @param chart
    *   the chart to be displayed
    */
  private def displayChart(chart: JFreeChart): Unit = { // Chart panel

    import org.jfree.chart.ChartPanel
    import org.jfree.ui.RefineryUtilities
    val panel: ChartPanel = new ChartPanel(chart)
    panel.setFillZoomRectangle(true)
    import java.awt.Dimension

    panel.setMouseWheelEnabled(true)
    panel.setPreferredSize(new Dimension(1024, 400))
//    panel.setPreferredSize(new Nothing(1024, 400))
    // Application frame
    val frame = new org.jfree.ui.ApplicationFrame(
      "Ta4j example - Buy and sell signals to chart"
    )
    frame.setContentPane(panel)
    frame.pack()
    RefineryUtilities.centerFrameOnScreen(frame)

  }

  def buildChartTimeSeries(
    barSeries: BaseBarSeries,
    indicator: Indicator[Num],
    name: String
  ): org.jfree.data.time.TimeSeries = {
    val chartTimeSeries = new org.jfree.data.time.TimeSeries(name);
    for (i <- 0 until barSeries.getBarCount) {
      val bar = barSeries.getBar(i);
      chartTimeSeries.add(
        new Minute(Date.from(bar.getEndTime.toInstant)),
        indicator.getValue(i).doubleValue()
      );
    }
    chartTimeSeries
  }
  def execute(series: BaseBarSeries): Unit = { // Getting the bar series

    val closePrice: ClosePriceIndicator = new ClosePriceIndicator(series)
//    val sma = new SMAIndicator(closePrice, 3)
//    val strategy = new BaseStrategy(new UnderIndicatorRule(sma, closePrice), new OverIndicatorRule(sma, closePrice))

//    val dataset = new TimeSeriesCollection
//    dataset.addSeries(buildChartTimeSeries(series, new ClosePriceIndicator(series), "Bitstamp Bitcoin (BTC)"))
//    println(s"data${dataset.getSeries}")

//    /*
//             * Creating the chart
//             */ val chart = ChartFactory.createTimeSeriesChart("Bitstamp BTC", // title
//      "Date", // x-axis label
//      "Price", // y-axis label
//      dataset, // data
//      true, // create legend?
//      true, // generate tooltips?
//      false)// generate URLs?)
//    val plot = chart.getPlot.asInstanceOf[XYPlot]
//    val axis = plot.getDomainAxis.asInstanceOf[DateAxis]
//    axis.setDateFormatOverride(new SimpleDateFormat("MM-dd HH:mm"))
//
//    addBuySellSignals(series, strategy, plot)
//    displayChart(chart)
  }
}
