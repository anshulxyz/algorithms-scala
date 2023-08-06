package example

import munit._

class BinarySearchSuite extends FunSuite {

  def binarySearch(arr: Array[Int], num: Int): Option[Int] = {
    var start: Int = 0
    var end: Int   = arr.length - 1
    while (start <= end) {
      val mid: Int = (start + end) / 2

      if (arr(mid) == num) {
        return Some(mid)
      } else if (arr(mid) > num) {
        end = mid - 1
      } else {
        start = mid + 1
      }
    }

    None
  }

  test(
    "Binary Search should return index zero for an array with a single element matching the target"
  ) {
    val array = Array(3)
    assertEquals(binarySearch(array, 3), Some(0))
  }
  test(
    "Binary Search should return the correct index for an element in the array"
  ) {
    val array = Array(1, 3, 5, 7, 9, 11, 13)
    assertEquals(binarySearch(array, 7), Some(3))
    assertEquals(binarySearch(array, 1), Some(0))
    assertEquals(binarySearch(array, 13), Some(6))
  }

  test(
    "Binary Search should return None for an element not present in the array"
  ) {
    val array = Array(2, 4, 6, 8, 10)
    assertEquals(binarySearch(array, 5), None)
    assertEquals(binarySearch(array, 1), None)
    assertEquals(binarySearch(array, 11), None)
  }

  test("Binary Search should return None for an empty array") {
    val array = Array.empty[Int]
    assertEquals(binarySearch(array, 5), None)
  }

  test(
    "Binary Search should return None for an array with a single element not matching the target"
  ) {
    val array = Array(3)
    assertEquals(binarySearch(array, 5), None)
  }

  test(
    "Binary Search should return the correct index for an array with multiple identical elements"
  ) {
    val array = Array(2, 2, 2, 2, 2)
    assertEquals(binarySearch(array, 2), Some(2))
  }
}
