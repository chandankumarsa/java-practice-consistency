package com.chandan.practice.oct10;

import java.util.Scanner;

public class SUM_OF_INTEGER {
	public static void main(String[] args) {
		System.out.println("ENter a number to calculate the Sum Of Teh Integer");
		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		int sum =0;
		String str = " ";
		for(int i =1;i<=n;i++) {
			sum = sum+i;
			str = str+i;
			if(i<n) {
				str = str+ "+";
			}
		}
		System.out.println(str+"="+sum);
	}

}
