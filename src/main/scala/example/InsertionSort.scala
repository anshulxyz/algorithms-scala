package example

object InsertionSort {
  def insertionSort(array: Array[Int]): Array[Int] = {
    var arr = array;

    for (i <- 1 until arr.size) {
      val temp = arr(i);
      var j = i-1;
      while (j >= 0 && (arr(j) > temp)) {
        arr(j+1) = arr(j);
        j -= 1;
      }
      arr(j+1) = temp;
    }

    arr
  }
}
