package exercises.lectures.part2OOP

object OOBasics extends App {

  val person = new Person("Priya", 28)
  println(person.age)
  person.greetWName("Bannie")
}

// Constructor
class Person(name: String, val age: Int) {
  val x=2
  println("inside class")
  def greetWName(name: String):Unit = println(s"${this.name} says hi $name")
}

