package com.wbl.testcases22;


	import static org.testng.Assert.assertEquals;

	import org.testng.Assert;
	import org.testng.annotations.Test;
	public class TestReverse {
	ReverseStr r=null;
	@Test
	public void test() {
		r=new ReverseStr();
		String actual=r.reverse("hello");
		String except="olleh";
		Assert.assertEquals(actual,except);
	}
	@Test
	public void testText() {
		r=new ReverseStr();
		String actual=r.reverse("welcome");
		String except="emoclew";
		Assert.assertEquals(actual, except);			
	}
	@Test
	public void digitsZero() {
		r=new ReverseStr();
		String actual=r.reverse("1000000");
		String expect="0000001";
		assertEquals(actual, expect);
	}
	@Test
	public void digits() {
		r=new ReverseStr();
		String actual =r.reverse("123456");
		String expect ="654321";	
		Assert.assertEquals(actual, expect);
	
	}

}
