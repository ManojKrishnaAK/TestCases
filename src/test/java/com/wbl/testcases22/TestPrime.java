package com.wbl.testcases22;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestPrime {
	PrimeNumber pn =null;
@Test
public void Zero() {
pn=new PrimeNumber();
int num=0;
boolean output=pn.primeNum(num);
Assert.assertFalse(output);
}
@Test
public void TwoDigitPrime() {
	pn=new PrimeNumber();
	int num=29;
	boolean output=pn.primeNum(num);
	Assert.assertTrue(output);
}
@Test
public void ThreeDigitPrime() {
	pn=new PrimeNumber();
	int num=100;
	boolean output=pn.primeNum(num);
	Assert.assertFalse(output);
	}
}
