package example

import org.scalatest.flatspec._
import org.scalatest.matchers.should._

class InsertionSortSpec extends AnyFlatSpec with Matchers {

  def insertionSort(array: Array[Int]): Array[Int] = {
    var arr: Array[Int] = array // creating a mutable copy

    // 1. We store the value at i=1 in a temporary variable (temp)
    // 2. We examine the values on the left, moving right to left
    // 3. if the value on the right is greater than temp, it gets shifted to the right
    // 4. we keep moving left and shifting values (towards right) until we encounter a value < temp OR we reach i=0 (start)
    // 5. We INSERT the temp value at the gap/opening

    for (i <- 1 until arr.length) {
      val temp = arr(i)

      var j = i - 1 // immediate left value
      while (j >= 0 && arr(j) > temp) {
        arr(j + 1) = arr(j) // moving element to the right

        j -= 1 // to move further left
      }

      // j+1 is where the opening/gap is
      arr(j + 1) = temp
    }

    arr
  }

  def swap(arr: Array[Int], first: Int, second: Int): Array[Int] = {
    val temp = arr(first)
    arr(first) = arr(second)
    arr(second) = temp
    arr
  }

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
