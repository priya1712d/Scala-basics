package exercises.lectures.part3Functions

object WhatsAFunction extends App {


  trait MyFunction[A,B] {
    def apply(elem: A): B
  }

  val doubler = new MyFunction[Int, Int] {
    override def apply(elem: Int): Int = elem * 2
  }

  println(doubler(3))

}
