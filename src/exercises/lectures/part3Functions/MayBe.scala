package exercises.lectures.part3Functions

abstract class MayBe[+T] {

  def map[B](f: T => B): MayBe[B]
  def flatMap[B](f: T  => MayBe[B]): MayBe[B]
  def filter(p: T => Boolean): MayBe[T]
}


case object MayBeNot extends MayBe[Nothing] {

  def map[]
}

case class Just[+T](value: T) extends MayBe[T] {

}