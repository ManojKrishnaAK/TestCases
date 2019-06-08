package com.wbl.testcases22;

public class Fibonacci {

	    public int fib(int n) {

	        int First = 0, Second = 1;
	        System.out.print("First " + n + " terms: ");

	       for (int i = 1; i <= n; ++i)
	        {
	            System.out.print(First + " , ");

	            int sum = First + Second;
	            First = Second;
	            Second = sum;
	        }
			return Second;
	    }
	    
	}


