package com.billing.java;

//correct
public class NaturalSumUsingRecursion {
	
	private static int sum=0;

	public static void main(String[] args) {
		int n=10;
		sum = rec(n);
		System.out.println(sum);
	}

	private static int rec(int n) {
		if(n==1) {
			return 1;
		}
		sum = n + rec(n-1);
		return sum;
	}

}
