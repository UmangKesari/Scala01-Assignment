package com.knoldus

import org.scalatest.FunSuite
class CalculateAreaTest extends FunSuite{
  val shape = new CalculateArea()

  test(" Calculate shape area"){
    assert(shape.area("rectangle",4,5,shape.rectangleArea) == "Area of rectangle is 20")
  }

}
