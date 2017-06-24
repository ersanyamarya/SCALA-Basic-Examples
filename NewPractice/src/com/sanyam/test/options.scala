object options {
  def main(args: Array[String]) {
    println("-------------------------------------------------")
    val capitals = Map("France" -> "Paris", "Japan" -> "Tokio")
    println("capitals.get(\"France\"):\t" + capitals.get("France"))
    println("capitals.get(\"India\"):\t" + capitals.get("India"))
    println("-------------------------------------------------")
    //-------------------getOrElse--------------------
    val a: Option[Int] = Some(5)
    val b: Option[Int] = None
    println("a.getOrElse(0):\t" + a.getOrElse(0))
    println("b.getOrElse(0):\t" + b.getOrElse(0))
    println("-------------------------------------------------")
    //---------------isEmpty---------------------------
    println("a.isEmpty:\t" + a.isEmpty)
    println("b.isEmpty:\t" + b.isEmpty)
    println("-------------------------------------------------")
  }
}