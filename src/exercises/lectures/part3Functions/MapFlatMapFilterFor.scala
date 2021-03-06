package exercises.lectures.part3Functions

object MapFlatMapFilterFor extends App {

  val list = List(1,2,3)
  println(list.head)
  println(list.tail)


  println(list.map(_ + 1))
  println(list.map(_ + " is a number"))

  println(list.filter(_ % 2 == 0))

  //Flatmap
  val toPair = (x: Int) => List(x, x+1)
  println(list.flatMap(toPair))

  //print  all combinations between two lists
  val numbers = List(1,2,3,4)
  val characters = List('a','b')
  println(numbers.flatMap(n => characters.map(c => "" + c + n)))

  list.foreach(println)

  val forCombo = for {
  n <- numbers if n %  2 == 0
  c <- characters
  } yield ( "" + c + n)
  println(forCombo)

}
