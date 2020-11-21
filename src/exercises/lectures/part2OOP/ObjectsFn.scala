package exercises.lectures.part2OOP

object ObjectsFn extends App {

  object Person { // SINGLETON INSTANCE
    val N_EYES = 2
    def canFly: Boolean = false
  }

  println(Person.N_EYES)
  println(Person.canFly)
}
