package object scalendar {
  import java.util.{Date, Calendar}
  import conversions._

  // Conveniences
  implicit def number2Conversion(num: Int) = 
    new FromConversion(num)

  implicit def fromString(dateString: String)
                         (implicit pattern: java.text.SimpleDateFormat) = {
      val time = pattern.parse(dateString)
      Scalendar(time.getTime)
  }

  // From Java Things
  implicit def fromDate(date: Date) = Scalendar(date.getTime)

  implicit def fromCalendar(cal: Calendar) = new Scalendar(cal)

  // To Java things
  implicit def toDate(cal: Scalendar): Date = cal.date 
  implicit def toCalendar(cal: Scalendar): Calendar = cal.cal

  // Use these only when necessary
  implicit def day2Int(day: Day.Value) = day.id
  implicit def month2Int(month: Month.Value) = month.id
}
