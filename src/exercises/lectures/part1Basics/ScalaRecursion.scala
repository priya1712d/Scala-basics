package exercises.lectures.part1Basics

object ScalaRecursion extends App {

  def fact(n:Int): Int = {
    if(n<=1) 1
    else{
      println(s"Factorial of $n ")
      var res = n * fact(n-1)
      println(s"Computed factorial of $n")
      res
    }
  }

  println(fact(5))


  def anotherFact(n:Int):Int = {
    def factHelper(x:Int, acc:Int): Int = {
      if(x<=1) acc
      else factHelper(x-1, x * acc)
    }

    factHelper(n, 1)
  }
}
