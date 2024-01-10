package example

object BubbleSort {
  def bubbleSort(array: Array[Int]): Array[Int] = {
    var arr = array         // creating a mutable copy

    var notCleanPass = true // to initialize the first run

    var size = arr.size - 1 // because we'll ahve to access the address at size+1
                            // so we want to avoid the index out of range error

    while (notCleanPass) {
      notCleanPass = false  // if this doesn't get modified
                            // we'll know we had a clean run
                            // refer line no. 20

      for (i <- 0 until size) {
        if (arr(i) > arr(i+1)) {
          arr = swap(arr, i, i+1)
          notCleanPass = true
        }
      }
      size -= 1 // because after each run, we'll at least end up putting
                // largest value (of that run) in place
    }

    arr
  }

  private def swap(arr: Array[Int], x: Int, y: Int): Array[Int] = {
    val temp = arr(x)
    arr(x) = arr(y)
    arr(y) = temp

    arr
  }
}
