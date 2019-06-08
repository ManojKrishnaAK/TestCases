package com.wbl.testcases22;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class TestCompareArray {
	CompareArray ca=new CompareArray();
@Test
public void testDiffLen() {
	int[] a= {1,2,3,4};
	int []b= {1,2,3,4,5};
	boolean actual =ca.compArray(a, b);
	assertEquals(actual, false);
}
@Test
public void sameValues() {
	int[] a= {1,2,3,4};
	int []b= {1,2,3,4};
	boolean actual =ca.compArray(a, b);
	assertEquals(actual, true);
}
@Test
public void differentValues() {
	int[] a= {1,2,3,4};
	int []b= {1,5,3,3};
	boolean actual =ca.compArray(a, b);
	assertEquals(actual, false);
}

}
