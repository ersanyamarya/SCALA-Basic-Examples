
import org.apache.spark._
import org.apache.spark.SparkContext._
import org.apache.log4j._
object CountLines {
  
 
  Logger.getLogger("org").setLevel(Level.ERROR)
  val sc = new SparkContext("local[*]", "CountLines")
  val lines = sc.textFile("/home/arya/workspaces/workspace_scala/test.txt")
 println("NUmber of lines in this file: "+lines.count())
}