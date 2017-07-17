package com.knoldus

import org.scalatest.FunSuite

class FibonacciLimitTest extends FunSuite {
  val fibonacciLimit = new FibonacciLimit()
  test("Fibonacci Limit Series") {
    val list = fibonacciLimit.FibonacciSeries(3)
    assert(list == List(0,1,1) )

  }
}