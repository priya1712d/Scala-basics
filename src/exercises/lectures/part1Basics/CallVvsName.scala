package exercises.lectures.part1Basics

object CallVvsName extends App {

  def calledByVal(x: Long): Unit = {
    println(s"By value $x")
    println(s"By value $x")
  }

  def calledByName(x: => Long): Unit = {
    println(s"By name $x")
    println(s"By name $x")
  }


  calledByVal(System.nanoTime())
  calledByName(System.nanoTime())

}
