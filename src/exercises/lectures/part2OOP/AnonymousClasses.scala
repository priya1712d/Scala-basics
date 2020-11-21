package exercises.lectures.part2OOP

object AnonymousClasses extends App {

  abstract class Animal {
    def eat: Unit
  }

  var funnyAnimal: Animal = new Animal{
    override def eat = println("ha ha ha")
  }


  println(funnyAnimal.getClass)
}
