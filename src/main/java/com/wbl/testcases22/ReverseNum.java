package com.wbl.testcases22;

public class ReverseNum {
	public int reverseNumber(int num) {
		 int rev= 0,remainder;
	     
	 while(num > 0)
	 {
	     remainder = num % 10;
	     rev = rev * 10 + remainder;
	     num = num / 10;
	 }
	 
	     System.out.println("Reversed number is:"+rev);
		return rev;
	             
		    }

}
