package com.chandan.practice.oct10;

import java.util.Scanner;

public class HappyNumberOrNot {
	public static void main(String[] args) {
		System.out.println("ENter a number To Check Happy Number Or Not");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int res = n;
		while (res != 1 && res != 4) {
			int sum = 0;
			while (res > 0) {
				int rem = res % 10;
				sum = sum + rem * rem;
				res = res / 10;
			}
			res = sum;
		}
		if (res == 1) {
			System.out.println("is a happy Number");
		} else {
			System.out.println("is Not a Happy Number");
		}
	}

}