package example

import org.scalatest.flatspec._
import org.scalatest.matchers.should._

class SelectionSortSpec extends AnyFlatSpec with Matchers {

  def selectionSort(array: Array[Int]): Array[Int] = {
    var arr: Array[Int] = array // creating a mutable copy
    var lowest          = 0
    var start           = 0

    for (start <- 0 until arr.length) {

      // loop over the Array and find the index of the smallest number
      for (i <- start until arr.length) {
        if (arr(i) < arr(lowest)) {
          lowest = i
        }
      }

      // swap between start and lowest
      arr = swap(arr, start, lowest)

      // reseting lowest to start clean comparison
      lowest = start+1
    }

    arr
  }

  def swap(arr: Array[Int], first: Int, second: Int): Array[Int] = {
    val temp = arr(first)
    arr(first) = arr(second)
    arr(second) = temp
    arr
  }

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
}
