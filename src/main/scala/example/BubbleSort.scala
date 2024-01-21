package example

import Utils._

object BubbleSort {
  def bubbleSort(array: Array[Int]): Array[Int] = {
    var arr = array         // creating a mutable copy

    var notCleanPass = true // to initialize the first run

    var size = arr.size

    while (notCleanPass) {
      notCleanPass = false  // if this doesn't get modified
                            // we'll know we had a clean run, refer line no. 20

      var i=0               // start at 0 every run
      while (i + 1 < size) {
        if (arr(i) > arr(i+1)) {
          arr = swap(arr, i, i+1)
          notCleanPass = true
        }
        i += 1
      }
      size -= 1 // because after each run, we'll at least end up putting
                // largest value (of that run) in place
    }

    arr
  }
}
