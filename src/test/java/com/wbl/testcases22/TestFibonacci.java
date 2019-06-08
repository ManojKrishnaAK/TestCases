package com.wbl.testcases22;


import org.testng.Assert;
import org.testng.annotations.Test;



public class TestFibonacci {
	Fibonacci fi=null;
@Test
public void testZero() {
	fi=new Fibonacci();
	int actual=fi.fib(0);
	int expect=1;
	Assert.assertEquals(actual, expect);	
}
@Test
public void testNegative() {
	fi=new Fibonacci();
	int input=fi.fib(-1);
	int output=1;
	Assert.assertEquals(input, output);
	
}
@Test
public void testPositive() {
	fi=new Fibonacci();
	int input=fi.fib(10);
	int output=89;
	Assert.assertEquals(input, output);
	
}
}

