package com.knoldus

import org.scalatest.FunSuite

class SumOfDigitOfProductTest extends FunSuite{
  val num = new SumOfDigitOfProduct()
  test("Sum of digit of the factorial") {
    val fact = num.fact(5)
    assert(num.sum(fact) == 3)

  }

}
