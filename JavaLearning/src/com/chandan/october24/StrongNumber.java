package com.chandan.october24;

import java.util.Scanner;

public class StrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ENter a Number To check Strong Number Or Not");
		int n = sc.nextInt();
		int t1=n;
		int sum =0;
		while(t1>0) {
			int rem = t1%10;
			int fact =1;
			for(int i =1;i<=rem;i++) {
				fact =fact*i;
			}
			sum = sum+fact;
			t1= t1/10;
		}
		if(n ==sum) {
			System.out.println("is a strong Number");
		}else {
			System.out.println("is Not a strong Number");
		}
	}

}
