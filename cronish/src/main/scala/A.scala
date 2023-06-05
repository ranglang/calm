import scalendar.Scalendar

import cronish._
import scalendar._
import cronish.dsl._
object  A extends  App {

  import cronish._
  import cronish.dsl._

  val cron = "every 10 days".cron
  val now = Scalendar.now


  println(cron.nextFrom(now)) // returns milliseconds
  println(cron.nextFrom(now + 12.days)) // can advance

  println(cron.nextTime) // returns a Scalendar object
  println(now to cron.nextTime) // This is obviously a duration

  println(cron.next) // returns milliseconds from Scalendar.now

  println(cron.nextFrom(cron.nextTime)) // The next-next run

  val payroll = task {
    println("You have just been paid... Finally!")
  }

  val payroll1 = task {
    println("You have just been paid... Finally!")
  }
  // Yes... that's how you run it
  payroll executes "every 5 seconds"
  payroll1 executes "every 2 seconds"

}