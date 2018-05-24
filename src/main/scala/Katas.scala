object Katas extends App {

  def arrayelementparity(numbers: List[Int]) : Int = {
    numbers.distinct.foldRight(0)(_+_)
  }
}
