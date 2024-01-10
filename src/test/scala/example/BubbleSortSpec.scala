package example

import BubbleSort._
import munit.FunSuite

class BubbleSortSpec extends FunSuite {
  test(
    "A Bubble Sort should return a sorted version of an array passed to it"
  ) {
    assertEquals(
      bubbleSort(Array(3, 2, 7, 1, 9, 0)).toSeq,
      Array(0, 1, 2, 3, 7, 9).toSeq
    )
    assertEquals(
      bubbleSort(Array(3, 1, 2)).toSeq,
      Array(1, 2, 3).toSeq
    )
    assertEquals(
      bubbleSort(Array(4, 3, 2, 1)).toSeq,
      Array(1, 2, 3, 4).toSeq
    )
    assertEquals(
      bubbleSort(Array(1)).toSeq,
      Array(1).toSeq
    )
  }
}
