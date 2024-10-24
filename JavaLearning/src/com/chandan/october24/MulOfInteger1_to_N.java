package com.chandan.october24;

import java.util.Scanner;

public class MulOfInteger1_to_N {
	public static void main(String[] args) {
		System.out.println("ENTER A NUMBER TO CALCULATE THE MULTIPLICATION OF INTEGER (1 to N)");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int mul =1;
		String str ="";
		for(int i =1;i<=n;i++) {
			mul = mul*i;
			str=str+i;
			if(i<n) {
				str = str+"x";
			}
		}
		System.out.println("MULTIPLICATION OF INTEGER NUMBER IS : "+str+" = "+mul);
	}

}
