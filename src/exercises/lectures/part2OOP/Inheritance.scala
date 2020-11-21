package exercises.lectures.part2OOP

object Inheritance extends App {


  abstract class Animal() {
    val creatureType:String
    def eat: Unit
  }


  class Dog extends Animal{
    val creatureType:String = "Canine"
    def eat:Unit = println("Crunch Crunsh")
  }

  trait Carnivore {
    def eat(animal: Animal) : Unit
  }

  class Crocodile extends Animal with Carnivore {
    override val creatureType: String = "croc"
    override def eat(): Unit = println("nom nom nom")
    def eat(animal: Animal): Unit= println(s"I am a croc and I am eating ${animal.creatureType}")
  }


  val dog: Dog = new Dog()
  val croc: Crocodile =  new Crocodile()
  croc eat dog


  //TRAITS dont have constructor parameters

}
