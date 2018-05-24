import org.scalatest._

class KatasSpec extends WordSpec with MustMatchers {

  "ArrayElementParity" must {

    "When called must take a list of one int and return a single int" in {
      Katas.arrayelementparity(List(1)) mustEqual 1
    }

    "When called must take a list of multiple ints and return a single int" in {
      Katas.arrayelementparity(List(1,2)) mustEqual 3
    }

    "When called must take a list of multiple ints and return the correct answer(kataTest1)" in {
      Katas.arrayelementparity(List(1, -1, 2, -2, 3)) mustEqual 3
    }

    "When called must take a list of multiple ints and return the correct answer(kataTest2)" in {
      Katas.arrayelementparity(List(-3, 1, 2, 3, -1, -4, -2)) mustEqual -4
    }

    "When called must take a list of multiple ints with possible doubles and return the correct answer(kataTest3)" in {
      Katas.arrayelementparity(List(1, -1, 2, -2, 3, 3)) mustEqual 3

    }
  }
}
