package example

object SelectionSort {
  def selectionSort(array: Array[Int]): Array[Int] = {
    var arr = array           // create a mutable copy
    for (i <- 0 until arr.size) {
      var smallest = i      // assuming smallest element is at index i
      for (j <- i until arr.size) {
        // linear search to find the smallest element in the list (so far)
        if (arr(j) < arr(smallest)) {
          smallest = j
        }
      }
      // after the inner for loop we'll have the index of the smallest element
      // avaialable at 'smallest', then we can place that element to beginning
      swap(arr, i, smallest)

    }
    arr
  }

  def selectionSortReverse(array: Array[Int]): Array[Int] = {
    var arr = array // creating a mutable copy
    for (i <- 0 until arr.size) {
      var biggest = i // assmuing biggest element is at index i
      for (j <- i until arr.size) {
        // a linear search to find the index of the biggest element
        if (arr(j) > arr(biggest)) {
          biggest = j
        }
      }

      swap (arr, i, biggest)
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
