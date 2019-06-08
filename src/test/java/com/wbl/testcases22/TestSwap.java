package com.wbl.testcases22;

import org.testng.Assert;
import org.testng.annotations.Test;



public class TestSwap {
	SwapNumber sn;		
	@Test
	public void negNum() {
		int a=-100;
		int b=-300;
		sn=new SwapNumber();
		int result[] = sn.swapNum(a,b);
		Assert.assertEquals(result[0],-100);
		Assert.assertEquals(result[1], -300);
	}
	@Test
	public void negPosNum() {
		int a=222;
		int b=-300;
		sn=new SwapNumber();
		int result[] = sn.swapNum(a,b);
		Assert.assertEquals(result[0],222);
		Assert.assertEquals(result[1], -300);
	}
	@Test
	public void posNum() {
		int a=10;
		int b=20;
		sn=new SwapNumber();
		int result[] = sn.swapNum(a,b);
		Assert.assertEquals(result[0],10);
		Assert.assertEquals(result[1], 20);
	}
}


