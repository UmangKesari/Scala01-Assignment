package com.knoldus


class DoubleQueue(l: List[Int]) extends Queue{
  def enqueue(a: Int) =  new DoubleQueue(super.enqueue(l,a*2))


  def dequeue() = new DoubleQueue(super.dequeue(l))

  override def toString: String = s"$l"
}

class SquareQueue(l: List[Int]) extends Queue{
  def enqueue(a: Int) =  new SquareQueue(super.enqueue(l,a*a))


  def dequeue() = new SquareQueue(super.dequeue(l))

  override def toString: String = s"$l"
}
