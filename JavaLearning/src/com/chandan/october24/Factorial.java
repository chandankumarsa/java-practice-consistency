package com.chandan.october24;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		System.out.println("ENter A number To Find Factorial");
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int fact =1;
		for(int i =1;i<=n;i++) {
			fact = fact*i;
		}
		System.out.println(fact);
	}

}
