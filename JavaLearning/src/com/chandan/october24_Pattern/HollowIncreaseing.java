package com.chandan.october24_Pattern;

import java.util.Scanner;

public class HollowIncreaseing {
	public static void main(String[] args) {
		System.out.println("ENter The Range");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i =1;i<=n;i++) {
			for(int j =1;j<=i;j++) {
				if(j==1 || i==j||i==n) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
