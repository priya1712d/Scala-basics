package exercises.lectures.part1Basics

object FunctionsObject extends App {

  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }

  println(aFunction("hello", 3))


  def repFn(aStr: String, aInt: Int): String = {
    if(aInt==1) aStr
    else aStr + repFn(aStr ,aInt-1)
  }

  def agingFn(name:String, age:Int): Unit= {
    println(s"Hi My Name is $name and I am $age years old")
  }


  def factorialFn(n:Int): Int= {
    if(n==0) 1
    else if (n==1) 1
    else n * factorialFn(n-1)
  }

  println(agingFn("priya",28))
  println(factorialFn(2))

}
