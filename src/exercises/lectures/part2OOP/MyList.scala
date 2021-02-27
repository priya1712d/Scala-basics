package exercises.lectures.part2OOP

abstract class MyList[+T] {

  def head(): T
  def tail(): MyList[T]
  def isEmpty(): Boolean
  def add[V >:T](newV: V):MyList[V]
  def printElements: String
  override def toString: String = "[ " + printElements + " ]"
  def map[B](myTransformer: MyTransformer[T, B]): MyList[B]
  def flatMap[B](myTransformer: MyTransformer[T, MyList[B]]): MyList[B]
  def filter(myPredicate: MyPredicate[T]):MyList[T]

}

object Empty extends MyList[Nothing]{
  def head(): Nothing = throw new NoSuchElementException
  def tail(): MyList[Nothing] = throw new NoSuchElementException
  def isEmpty(): Boolean = true
  def add[B >: Nothing](newV: B):MyList[B]= new Cons(newV, Empty)
  def printElements: String = " "
  def map[B](myTransformer: MyTransformer[Nothing, B]): MyList[B] = Empty
  def flatMap[B](myTransformer: MyTransformer[Nothing, MyList[B]]): MyList[B] = Empty
  def filter(myPredicate: MyPredicate[Nothing]):MyList[Nothing] = Empty
}


class Cons[+A](h: A, t:MyList[A]) extends MyList[A] {
  def head(): A = h
  def tail(): MyList[A] = t
  def isEmpty(): Boolean= false
  def add[B >: A](newV: B):MyList[B] = new Cons(newV, this)
  def printElements: String =
    if(t.isEmpty()) "" + h
    else h + " " + t.printElements
  def map[B](myTransformer: MyTransformer[A, B]): MyList[B] = {
    new Cons[B](myTransformer.transform(h), t.map(myTransformer))
  }
  def flatMap[B](myTransformer: MyTransformer[A, MyList[B]]): MyList[B] = Empty
  def filter(myPredicate: MyPredicate[A]):MyList[A] = {
     if(myPredicate.test(h)) new Cons[A](h, t.filter(myPredicate))
     else t.filter(myPredicate)
  }
}

trait MyPredicate[-T] {
  def test(elem: T):Boolean
}


trait MyTransformer[-A, B] {
  def transform(ele: A): B
}

object InheritanceTest extends App {
  val list: Cons[Int] = new Cons(1, new Cons(2, new Cons(3, Empty)))
  val listStr: Cons[String] = new Cons("abc", new Cons("xys", new Cons("prop", Empty)))
  println(listStr.head())
  println(listStr.tail().head())
  println(listStr.toString())
}