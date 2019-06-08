package com.wbl.testcases22;

public class PrimeNumber {
	

		public boolean primeNum(int num) {

		int count = 0;
		boolean bool = false;

		if (num < 0) {
		System.out.println("Negative integer can't be prime");
		} else {
		for (int i = 1; i <= num; i++) {

		if (num % i == 0) {
		count++;
		}
		}
		if (count == 2) {
		bool = true;
		} else {
		bool = false;
		}
		}
		return bool;
		}
	}
