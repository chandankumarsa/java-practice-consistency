package com.chandan.october24;

import java.util.Scanner;

public class SumOfInteger1_to_n {
public static void main(String[] args) {
	System.out.println("ENter a number To calculate the Sum Of Integer(1 to N)");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int sum =0;
	String str = "";
	for(int i =1;i<=n;i++) {
		sum = sum+i;
		str= str+i;
		if(i<n) {
			str = str+"+";
		}
	}
	System.out.println("Sum Of Integer"+str+"="+sum);
	
}
}
