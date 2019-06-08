package com.wbl.testcases22;

import org.testng.Assert;
import org.testng.annotations.Test;


public class TestReverseNum {
	ReverseNum rn=null;
	@Test
	public void LastZero() {
		rn=new ReverseNum();
		int input =rn.reverseNumber(10000);
		int output=1;
		Assert.assertEquals(input, output);
}
	@Test
	public void firstZero() {
		rn=new ReverseNum();
		int input =rn.reverseNumber(00001);
		int output=1;
		Assert.assertEquals(input, output);
}
	@Test
	public void zero() {
		rn=new ReverseNum();
		int input =rn.reverseNumber(0000);
		int output=0;
		Assert.assertEquals(input, output);
}
	@Test
	public void fourDigit() {
		rn=new ReverseNum();
		int input =rn.reverseNumber(2254);
		int output=4522;
		Assert.assertEquals(input, output);
	}
}