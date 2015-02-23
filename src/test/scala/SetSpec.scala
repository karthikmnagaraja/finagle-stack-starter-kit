

import org.scalatest.FlatSpec
import com.twitter._
class SetSpec extends FlatSpec {

  behavior of "An empty Set"

  it should "have size 0" in {
    assert(Set.empty.size === 0)
  }

  it should "produce NoSuchElementException when head is invoked" in {
    intercept[NoSuchElementException] {
      Set.empty.head
    }
  }
}