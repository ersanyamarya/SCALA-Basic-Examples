
import Array._

object multiDArray {
  def main(args: Array[String]) {
    var myMatrix = ofDim[Int](3, 3)
    for (i <- 0 to 2; j <- 0 to 2) {

      myMatrix(i)(j) = j;

    }
    for (i <- 0 to 2; j <- 0 to 2) {

      println(" " + myMatrix(i)(j));

    }

  }

}