object Katas extends App {

  def arrayelementparity(numbers: List[Int]) : Int = {
    numbers.foldRight(0)(_ + _)
  }
}
