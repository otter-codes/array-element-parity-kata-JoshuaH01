def arrayelementparity(numbers: List[Int]) : Int = {
  numbers.toIndexedSeq.toList.indexOf(3)

}
arrayelementparity(List(0,1,2,3,4))

def arrayelementparity2(numbers: List[Int]) : Int = {
  numbers.foldRight(0)(_ + _)
}
arrayelementparity2(List(1, -1, 2, -2, 3))

def arrayelementparity3(numbers: List[Int]) : Int = {
  numbers.sum
}
arrayelementparity2(List(1, -1, 2, -2, 3))

val x = List(1,1,2,2,3,4,5)
val y = x.distinct
val z = x diff y
(y diff z).sum