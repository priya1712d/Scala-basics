package exercises.lectures.part2OOP

object NovelNWriter extends App {

}

class Writer(firstName: String, surname: String, val yearOfBirth:Int) {

  def fullName(): String ={
    this.firstName + this.surname
  }
}

class Novel(name: String, yearOfRel: Int, author: Writer){

  def authorAge: Int = {
    this.yearOfRel - this.author.yearOfBirth
  }

  def isWrittenBy(author: Writer): Unit ={

  }

  def copy(newYearOfRel: Int) = {
    new Novel(this.name, newYearOfRel,this.author)
  }
}

class Counter(var count: Int){
  def currentCount(): Int ={
    this.count
  }

  def increment():Unit={
    this.count = this.count + 1
  }

  def decrement():Unit={
    this.count = this.count - 1
  }

  def increment(byX: Int):Unit={
    this.count = this.count + byX
  }

  def decrement(byX: Int):Unit={
    this.count = this.count - byX
  }
}
