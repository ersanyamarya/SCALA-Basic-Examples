import org.apache.spark._
import org.apache.spark.SparkContext._
import org.apache.log4j._

object Activity {
  def parseLine(line: String) = {
    val fields = line.split(",")
    val customerID = fields(0)
    val amount = fields(2).toInt
    (customerID, amount)
  }
  def main(args: Array[String]) {
    Logger.getLogger("org").setLevel(Level.ERROR)
    val sc = new SparkContext("local[*]", "Activity")
    val lines = sc.textFile("/home/arya/workspaces/workspace_scala/testProduct.txt")
    val parsedLines = lines.map(parseLine)
    val sum = parsedLines.reduceByKey((x, y) => x + y)
    val results = sum.collect()

    for (result <- results.sorted) {
      val customer = result._1
      val sum = result._2
      println(s"$customer spends: $sum")
    }
  }
}