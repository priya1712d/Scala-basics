package exercises.lectures.part1Basics

import scala.annotation.tailrec

object defaultArgs extends App {

  @tailrec
  def TrFact(n:Int, inter:Int = 1):Int = {
    if(n<=1) inter
    else TrFact(n-1, n * inter)
  }
}
