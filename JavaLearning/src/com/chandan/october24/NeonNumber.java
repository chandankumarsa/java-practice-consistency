package com.chandan.october24;

import java.util.Scanner;

public class NeonNumber {
	public static void main(String[] args) {
		System.out.println("Enter a Number To check A Neon Number Or not");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sq= n*n;
		int sum =0;
		while(sq>0) {
			int rem = sq%10;
			sum = sum+rem;
			sq= sq/10;
		}
		if(sum==n) {
			System.out.println("is a Neon Number ");
		}else {
			System.out.println("is not a Neon Number");
		}
	}

}


//square of sum number is equals to to original Number