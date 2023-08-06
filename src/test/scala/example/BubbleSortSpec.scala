package example

import munit.FunSuite

class BubbleSortSpec extends FunSuite {

  def bubbleSort(array: Array[Int]): Array[Int] = {

    var arr: Array[Int] = array // create a mutable copy
    var clean_pass      = false // set to false, to initialize the first run
    var length = arr.length

    while (!clean_pass) {
      clean_pass = true
      // set it to true, so that if this doesn't get modified in next statements
      // then loop stops and that would mean no variables had to be swapped,
      // and the list is sorted

      for (
        i <- 0 until length - 1
      ) {
        if (arr(i) > arr(i+1)) {
          arr = swap(arr, i, i+1)
          clean_pass = false
        }
      }

      length -= 1 // after one complete run of the `while` we set one element
      // to the correct place, so we don't have to check it anymore, thus the list
      // of elements we need to check decreases by one after each run

    }

    arr

  }

  def swap(arr: Array[Int], first: Int, second: Int): Array[Int] = {
    val temp = arr(first)
    arr(first) = arr(second)
    arr(second) = temp
    arr
  }

  test("swapping elemets in an Array works") {
    assert(swap(Array(1, 2, 3, 4, 5), 1, 2).sameElements(Array(1, 3, 2, 4, 5)))
    assert(!swap(Array(1, 2, 3, 4, 5), 1, 2).sameElements(Array(1, 2, 3, 4, 5)))
  }

  test(
    "A Bubble Sort should return a sorted version of an array passed to it"
  ) {
    assertEquals(
      bubbleSort(Array(3, 2, 7, 1, 9, 0)).toSeq,
      Array(0, 1, 2, 3, 7, 9).toSeq
    )
    assertEquals(
      bubbleSort(Array(1,2,3)).toSeq,
      Array(1,2,3).toSeq
    )
    assertEquals(
      bubbleSort(Array(1)).toSeq,
      Array(1).toSeq
    )
  }
}
