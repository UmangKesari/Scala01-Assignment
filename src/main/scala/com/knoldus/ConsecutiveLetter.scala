package com.knoldus

/**
  * Created by knoldus on 7/17/17.
  */
class ConsecutiveLetter {

    def findConsecutive(s: String): String = {

      def compute(s: String, pos: Int, output: String): String = {
        if(pos >= s.length()-1)
          output
        else if(s(pos)==s(pos+1)){
          val ch = s(pos)+ ""+ s(pos)
          compute(s,pos+2,output+ch)
        }
        else
          compute(s, pos+1, output)
      }

      compute(s,0,"")
    }

}
