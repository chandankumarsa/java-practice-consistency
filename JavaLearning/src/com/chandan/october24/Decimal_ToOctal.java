package com.chandan.october24;

import java.util.Scanner;

public class Decimal_ToOctal {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("ENter a Number To Convert Decimal to octal");
		int n = sc.nextInt();
		int sum =0;
		int place =1;
		while(n>0) {
			int rem = n%8;
			sum = sum+rem*place;
			n =n/8;
			place = place*10;
		}
		System.out.println(sum);
	}

}
