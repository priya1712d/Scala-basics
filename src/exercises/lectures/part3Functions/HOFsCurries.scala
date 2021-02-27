package exercises.lectures.part3Functions

object HOFsCurries extends App {
  // HOF --higher order function
//  val superFunction : (Int, (String, (Int=>Boolean)) => Int) => (Int => Int) =

  //nTimes(f, n , x)
  //(f, 3, x)=f(f(f(x)))

  def nTimes(f: Int => Int, n:Int, x:Int) : Int = {
    if(n<=0) x
    else nTimes(f, n-1, f(x))
  }

  def nTimesBetter(f: Int => Int, n: Int): (Int => Int) = {
    if(n<=0) (x: Int) => x
      else (x: Int) => nTimesBetter(f, n-1)(f(x))
  }

  val plusOne = (x: Int) => x+1
  println(nTimes(plusOne, 10, 1))


  val plusTen = nTimesBetter( plusOne, 10)
  println(plusTen(1))

  //Curried functions

  var superAdder:(Int => (Int => Int)) = (x: Int) => (y: Int) => x+y

  var addThree = superAdder(3)
  println(addThree(10))

  // curried formatter
  def curriedFormatter(c: String)(x: Double): String = c.format(x)

  val standardFormat: (Double => String) = curriedFormatter("%4.2f")
  val precise: (Double => String) = curriedFormatter("%10.8f")

  println(standardFormat(Math.PI))




}
