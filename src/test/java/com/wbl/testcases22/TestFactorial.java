package com.wbl.testcases22;


	import org.testng.Assert;
	import org.testng.annotations.Test;




	public class TestFactorial {
	  
	  
		  Factorial fa=null;
		  @Test
		  public void testZero() {
			 fa=new Factorial();
			 int input=fa.fac(0);
			 int output=1;
			 Assert.assertEquals(input,output);
		  }
		  @Test
		  public void testNegative() {
			  fa=new Factorial();
			  int input=fa.fac(-1);
			  int output=1;
			  Assert.assertEquals(input, output);
		  }
		  @Test
		  public void testPositive() {
			  fa=new Factorial();
			  int actual=fa.fac(5);
			  int expected=120;
			  Assert.assertEquals(expected, actual);
		  
	  }	
	}


