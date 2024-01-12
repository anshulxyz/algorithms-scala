package example

object SelectionSort {
  def selectionSort(array: Array[Int]): Array[Int] = {
    var arr = array

    for (i <- 0 until arr.size) {
      var lowest = i                    // assuming lowest is at the beginning
      for (j <- i until arr.size) {
        if (arr(j) < arr(lowest)) {
          lowest = j
        }
      }
      arr = swap(arr, i, lowest)
    }

    arr
  }

  def swap(arr: Array[Int], first: Int, second: Int): Array[Int] = {
    val temp = arr(first)
    arr(first) = arr(second)
    arr(second) = temp
    arr
  }
}
