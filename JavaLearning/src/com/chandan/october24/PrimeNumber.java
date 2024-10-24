package com.chandan.october24;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		System.out.println("ENter A NUmber To check Prime Number Or Not");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n<=1) {
			System.out.println("is Not a Prime Number");
		}else {
			boolean flag = true;
			for(int i =2;i<=n/2;i++) {
				if(n%i==0) {
					flag=false;
					break;
				}
			}
			if(flag) {
				System.out.println("Prime Number");
			}else {
				System.out.println("is Not a Prime Number");
			}
		}
	}

}
