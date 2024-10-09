package com.chandan.practice.oct10;

import java.util.Scanner;

public class DecimalToBinary {
	public static void main(String[] args) {
		System.out.println("Enter a number To Convert Decimal To Binary");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int place =1;
		int sum=0;
		while(n>0) {
			int rem = n%2;
			sum = sum+rem*place;
			n = n/2;
			place = place*10;
		}
		System.out.println(sum);
	}

}
