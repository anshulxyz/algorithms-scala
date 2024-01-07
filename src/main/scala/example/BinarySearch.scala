package example

object BinarySearch {
  def binarySearch(array: Array[Int], num: Int): Option[Int] = {
    var start = 0
    var end = array.size - 1

    while (start <= end) {
      val mid: Int = (start + end) / 2

      if (array(mid) == num) {
        return Some(mid)
      } else if (num < array(mid)) {
        end = mid - 1
      } else {
        start = mid + 1
      }
    }
    None
  }
}
