package exercises.lectures.part2OOP

object MethodNotations extends App {


  class Person(val name:String, favMov:String) {
    def likes(movie:String): Boolean  = movie == favMov
    def hangout(persn:Person): Unit = println(s"$persn is hanging out with ${this.name}")
  }

  val mary = new Person("Mary", "Inception")
  println(mary.likes("Inception"))
  println(mary likes "Inception") // Infix notation = operator Notation
  val tom = new Person("Tom", "Fight Club")
  println(mary hangout tom)
}

