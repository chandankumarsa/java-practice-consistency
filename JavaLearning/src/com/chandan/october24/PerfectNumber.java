package com.chandan.october24;

import java.util.Scanner;

public class PerfectNumber {
public static void main(String[] args) {
	System.out.println("ENter A number To check Perfect Number Or Not");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int sum =0;
	for(int i =1;i<=n/2;i++) {
		if(n%i==0) {
			sum = sum+i;
		}
	}
	if(sum==n) {
		System.out.println("Perfect Number");
	}else {
		System.out.println("Not a Perfect Number");
	}
	
}
}