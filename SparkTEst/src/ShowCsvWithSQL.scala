import org.apache.spark._
import org.apache.spark.SparkContext._
import org.apache.spark.sql._
import org.apache.log4j._

object ShowCsvWithSQL {
  
  case class Fruits(id: Int, name: String, quantity: Int)
  // Set the log level to only print errors
    Logger.getLogger("org").setLevel(Level.ERROR)
    
// Use new SparkSession interface in Spark 2.0
    val spark = SparkSession
      .builder
      .appName("ShowCsv")
      .master("local[*]")
      .getOrCreate()

      def main(args: Array[String]) {
      
      import spark.implicits._
 
          
       val fruits = spark.sqlContext.sparkSession.read.textFile("../Fruits.txt").map(_.split(","))
      .map(frt => Fruits(frt(0).trim.toInt, frt(1), frt(2).trim.toInt))
      .toDF()
       
       
       fruits.registerTempTable("Fruits1")
       
       val result = spark.sql("SELECT * FROM Fruits1")
       
       result.show()
      
    }
  
}