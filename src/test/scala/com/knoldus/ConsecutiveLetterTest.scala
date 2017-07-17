package com.knoldus

import org.scalatest.FunSuite

class ConsecutiveLetterTest extends FunSuite{
  val str = new ConsecutiveLetter()

  test("String reduction"){
    assert(str.findConsecutive("aaabbccbbcdd") == "aabbccbbdd")
    assert(str.findConsecutive("abcd")=="")
  }

}
