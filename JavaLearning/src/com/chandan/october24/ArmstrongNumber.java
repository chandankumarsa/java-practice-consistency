package com.chandan.october24;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		System.out.println("Enter A number To check Armstrong Number Or Not");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t1=n;
		int count=0;
		int sum =0;
		
		while(t1>0) {
			count++;  
			t1=t1/10;
		}
		int t2=n;
		while(t2>0) {
			int rem = t2%10;
			int mul =1;
			for(int i =1;i<=count;i++) {
				mul = mul*rem;
			}
			sum = sum+mul;
			t2=t2/10;
		}
		if(sum==n) {
			System.out.println("Armstrong Number");
		}else {
			System.out.println("is not Armstrong Number");
		}
	}

}