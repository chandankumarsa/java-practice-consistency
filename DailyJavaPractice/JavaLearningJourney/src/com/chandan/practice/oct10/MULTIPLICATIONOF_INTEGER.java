package com.chandan.practice.oct10;

import java.util.Scanner;

public class MULTIPLICATIONOF_INTEGER {
	public static void main(String[] args) {
		System.out.println("Enter a number to calculate Multiplication Of The Integer");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int mul =1;
		String str ="";
		for(int i =1;i<=n;i++) {
			mul = mul*i;
			str = str+i;
			if(i<n) {
				str= str+"x";
			}
		}
		System.out.println(str+"="+mul);
	}

}
