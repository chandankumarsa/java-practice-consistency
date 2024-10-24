package com.chandan.october24;

import java.util.Scanner;

public class SumOfDigit_SingleDIgit {
	public static void main(String[] args) {
		System.out.println("ENter A umber To Calculate The Sum Of The Digit Should Be Single DIgit");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum =0;
		while(n>0) {
			int rem = n%10;
			sum = sum+rem;
			n = n/10;
			if(n==0&&sum>9) {
				n=sum;
				sum = 0;
			}
		}
		System.out.println(sum);
	}

}
