package com.chandan.october24;

import java.util.Scanner;

public class StrongNumberRange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Start Range");
		int start= sc.nextInt();
		System.out.println("ENter The ENding Range");
		int end = sc.nextInt();
		System.out.println("Starting and Ending Range Upto : ");
		for(int n =start;n<=end;n++) {
			int t1=n;
			int sum =0;
			while(t1>0) {
			int rem =t1%10;
			int fact=1;
			for(int i =1;i<=rem;i++) {
				fact = fact*i;
			}
			sum = sum+fact;
			t1= t1/10;
			}
			if(sum==n) {
				System.out.println(n);
			}
		}
	}

}
