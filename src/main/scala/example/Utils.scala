package example

object Utils {
  def swap(arr: Array[Int], x: Int, y: Int): Array[Int] = {
    val temp = arr(x)
    arr(x) = arr(y)
    arr(y) = temp

    arr
  }

}
