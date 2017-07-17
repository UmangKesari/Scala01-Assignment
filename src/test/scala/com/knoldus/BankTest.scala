package com.knoldus

import org.scalatest.FunSuite

class BankTest extends FunSuite{

    val account = new Bank(13424,"Umang Kesari",15000)
    test("credit"){
      assert(account.credit(25000).checkBalance()==40000)
    }

    test("take credit"){
      assert(account.debit(3000).checkBalance()==12000)
    }

    test("Underflow account"){
      intercept[java.lang.Exception]{
        account.debit(19000)
      }
    }

}
