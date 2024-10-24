package com.chandan.october24;

import java.util.Scanner;

public class SumOfDigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter a number To calculate The sum Of The Digit :");
		int n = sc.nextInt();
		int sum =0;
		while(n>0) {
			int rem = n%10;
			sum = sum+rem;
			n = n/10;
		}
		System.out.println(sum);
	}

}
