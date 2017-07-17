package com.knoldus

import org.scalatest.FunSuite

class QueueOperationTest extends FunSuite{
  val list = List(3,6,8,9)
  val dq = new DoubleQueue(list)
  val sq = new SquareQueue(list)
  dq.enqueue(1)
  dq.enqueue(2)
  sq.enqueue(2)
  sq.enqueue(3)

  test("check double queue") {
    assert(dq.dequeue() == 2)
    assert(dq.dequeue() == 4)
  }

  test("check square queue") {
    assert(sq.dequeue()==4)
    assert(sq.dequeue()==9)
  }
}
