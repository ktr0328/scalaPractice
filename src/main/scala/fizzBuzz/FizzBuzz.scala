package fizzBuzz

/**
  * Created by ktr on 2018/05/15.
  */
object FizzBuzz {
  def main(args: Array[String]): Unit = {
    1 to 20 map toFizzBuzz foreach println
  }

  def toFizzBuzz(n: Int): String = {
    (n % 3, n % 5) match {
      case (0, 0) => "FizzBuzz"
      case (0, _) => "Fizz"
      case (_, 0) => "Buzz"
      case _ => n.toString
    }
  }
}
