package example

object InsertionSort {
  def insertionSort(array: Array[Int]): Array[Int] = {
    var arr = array;

    // 1. temporarily remove element at index 1 (pin)
    // 2. Begin comparing phase, compare the item left to the _pin_
    // 3. if the item left of pin is greater than the item in pin, we move _it_ to the right
    // 4. we keep going left until we reach the end, or we reach an element smaller than _pin_
    // 5. We put the value in pin there
    // 6. We start step 1, with index 2 and keep going until the end of the loop.

    for (i <- 1 until arr.size) {
      // store value at i in a temp variable
      val temp = arr(i);
      var j = i-1 // immediate value left of the _i_
      while (j >= 0) {
        if (arr(j) > temp){
          arr(j+1) = arr(j);
          arr(j) = temp;
        }
        j -= 1;
      }
    }

    arr
  }
}
