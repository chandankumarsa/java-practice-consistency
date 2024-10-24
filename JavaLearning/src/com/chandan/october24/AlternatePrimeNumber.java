package com.chandan.october24;

import java.util.Scanner;

public class AlternatePrimeNumber {
	public static boolean isprime(int n) {
		if(n<=1) {
			return false;
		}
		for(int i =2;i<=n/2;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
		
	}
public static void main(String[] args) {
	System.out.println("Enter The Range Upto");
	Scanner sc= new Scanner(System.in);
	int range = sc.nextInt();
	int count =0;
	for(int i =2;i<=range;i++) {
		if(isprime(i)) {
			count++;
			if(count%2!=0) {
				System.out.println(i);
			}
		}
		
	}
	
}
}
