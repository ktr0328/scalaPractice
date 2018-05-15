package tekitou

/**
  * Created by ktr on 2018/05/15.
  */
object Distance {
  def main(args: Array[String]): Unit = {
    val kiloPerHour = 11
    val minutes = 120
    val distance = kiloPerHour * minutes / 60

    println(s"${distance}km")
  }
}
