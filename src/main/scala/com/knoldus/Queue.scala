package com.knoldus


trait Queue {

    def enqueue(l1: List[Int], a: Int): List[Int] = {
      println(a+" added\n")
      l1 ::: List(a)
    }

    def dequeue(l1: List[Int]): List[Int] = {
      val a = l1.head
      println(a + " removed\n")
      l1.tail
    }
}
