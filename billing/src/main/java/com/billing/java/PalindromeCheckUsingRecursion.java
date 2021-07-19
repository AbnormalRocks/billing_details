package com.billing.java;

//wrong
public class PalindromeCheckUsingRecursion {
	
	private static int sum=0;
	
	public static void main(String[] args) {
		int n=10;
		sum = rec(n);
		if(sum==n) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
	}

	private static int rec(int n) {
		if(n==0) {
			return 0;
		}
		sum = n%10+rec(n/10)*10;
		return sum;
	}

}
