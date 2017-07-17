package com.knoldus

class FirstName(val firstName: String) extends AnyVal

class LastName(val lastName: String) extends AnyVal

class Age(val age: Int) extends AnyVal

class ValueClass {

  class Assignment4_ValueClass {

    def displayDetails(f: FirstName, l: LastName, a: Age): String = {
      val f1 = f.firstName
      val l1 = l.lastName
      val a1 = a.age
      s"$f1 $l1 is of $a1 years."
    }

  }

}
