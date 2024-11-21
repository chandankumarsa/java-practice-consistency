package com.chandan.october24_Pattern;

import java.util.Scanner;

public class p5 {
	public static void main(String[] args) {
		System.out.println("Enter The Range");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i =1;i<=n;i++) {
			for(int j=1;j<n;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
