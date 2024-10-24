package com.chandan.october24;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {
		System.out.println("ENter a number To check Palindrome Number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp=n;
		int rev =0;
		while(temp>0) {
			int rem = temp%10;
			rev = rev*10+rem;
			temp = temp/10;
		}
		if(n==rev) {
			System.out.println("is a Palindrome Number");
		}else {
			System.out.println("is not a Palindrome Number");
		}
	}

}
