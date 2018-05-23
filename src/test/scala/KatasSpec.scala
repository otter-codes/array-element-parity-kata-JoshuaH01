import org.scalatest._

class KatasSpec extends WordSpec with MustMatchers {

  "ArrayElementParity" must {

    "When called must take a list of int and return a single int" in {
      Katas.arrayelementparity(List(1)) mustEqual 1
    }

  }

}
