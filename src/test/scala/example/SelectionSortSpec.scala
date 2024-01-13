package example

import org.scalatest.flatspec._
import org.scalatest.matchers.should._

import SelectionSort._

class SelectionSortSpec extends AnyFlatSpec with Matchers {

  "Selection Sort" should "sort an array of integers in ascending order" in {
    val unsortedArray = Array(64, 34, 25, 12, 22, 11, 90)
    val sortedArray   = Array(11, 12, 22, 25, 34, 64, 90)
    selectionSort(unsortedArray) shouldEqual sortedArray
  }

  it should "handle an empty array" in {
    val emptyArray = Array.empty[Int]
    selectionSort(emptyArray) shouldEqual emptyArray
  }

  it should "handle an array with a single element" in {
    val singleElementArray = Array(42)
    selectionSort(singleElementArray) shouldEqual singleElementArray
  }

  it should "handle an array with duplicate elements" in {
    val arrayWithDuplicates = Array(5, 2, 8, 5, 9, 2, 1)
    val sortedArray         = Array(1, 2, 2, 5, 5, 8, 9)
    selectionSort(arrayWithDuplicates) shouldEqual sortedArray
  }

  "Selection Sort Reverse" should "sort an array of integers in descending order" in {
    selectionSortReverse(Array(1,2,3)) shouldEqual Array(3,2,1)
    selectionSortReverse(Array(4,3,5,6,2,1)) shouldEqual Array(6,5,4,3,2,1)
  }

}
