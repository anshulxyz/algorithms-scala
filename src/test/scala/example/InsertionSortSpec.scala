package example

import InsertionSort.insertionSort

import org.scalatest.flatspec._
import org.scalatest.matchers.should._

class InsertionSortSpec extends AnyFlatSpec with Matchers {

  "Insertion Sort" should "sort an array of integers in ascending order" in {
    val unsortedArray = Array(4, 2, 7, 1, 3)
    val sortedArray   = Array(1, 2, 3, 4, 7)
    insertionSort(unsortedArray) shouldEqual sortedArray
  }

  it should "handle an empty array" in {
    val emptyArray = Array.empty[Int]
    insertionSort(emptyArray) shouldEqual emptyArray
  }

  it should "handle an array with a single element" in {
    val singleElementArray = Array(42)
    insertionSort(singleElementArray) shouldEqual singleElementArray
  }

  it should "handle an array with duplicate elements" in {
    val arrayWithDuplicates = Array(5, 2, 8, 5, 9, 2, 1)
    val sortedArray         = Array(1, 2, 2, 5, 5, 8, 9)
    insertionSort(arrayWithDuplicates) shouldEqual sortedArray
  }
}
