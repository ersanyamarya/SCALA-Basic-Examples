package com.sanyam.test.regeX
import java.io.PrintWriter
import scala.io.Source

object File2 {
  def main(args: Array[String]): Unit = {
    val out = new PrintWriter("/home/arya/workspaces/workspace_scala/01.out")
    val source = Source.fromFile("/home/arya/workspaces/workspace_scala/01.txt").getLines.toArray[String].reverse.foreach(out.println(_))
    out.close()
    //read files with tabs, replace tabs with spaces
    
    val column = 8
    var count = 0

    val source0 = Source.fromFile("/home/arya/workspaces/workspace_scala/02.txt")
    val out0 = new PrintWriter("/home/arya/workspaces/workspace_scala/02.out")

    for (c <- source0)
      c match {
        case '\t' => {
          //println("Inside t")
          out0.print(""*(column - count % column))
          count = 0
        }
        case '\n' => {
          //println("Inside n")
          out0.print(c)
          count = 0
        }
        case _ => {
          //println("Inside else")
          out0.print(c)
          count += 1
        }

      }
    source0.close()
    out0.close()
    
    io.Source.fromFile("03.txt").mkString.split("""[\s"\.,\)\()/]""").filter(_.length>12).distinct.foreach(println(_))
    
  }
}

