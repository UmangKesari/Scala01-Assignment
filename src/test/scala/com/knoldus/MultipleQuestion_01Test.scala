package com.knoldus
import org.scalatest.FunSuite

class MultipleQuestion_01Test extends FunSuite{
  val check = new MultipleQuestion_01()
  test(" Find element in Pascal triangle"){
    val element = check.elePascalTriangle(1,3)

    assert(element == 3)

  }
  test("When column is more than Row value ") {
    val element = check.elePascalTriangle(5, 3)

    assert(element == 0)
  }
  test("When column=0") {
    val element = check.elePascalTriangle(0,3)

    assert(element == 1)
  }
  test("When column==row") {
    val element = check.elePascalTriangle(3,3)

    assert(element == 1)
  }

  test("sum of the list"){
    val list = List(1,2,3,4)
    val sum = check.listSum(list)
    assert(sum == 10)
  }

  test("Gcd of two numbers")
  {
    val gcd = check.gcd(8,2)
    assert( gcd == 2)
  }

  test("Sum of two list"){
    val list1 = List(1,2,3)
    val list2 = List(4,5,6)
    val newList = check.sumOfTwoList(list1,list2)
    assert(newList == List(5,7,9))
  }


}
