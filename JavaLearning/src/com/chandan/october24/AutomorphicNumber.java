package com.chandan.october24;

import java.util.Scanner;

public class AutomorphicNumber {
	public static void main(String[] args) {
		System.out.println("ENter A Number To Check Automorphic Number Or Not");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sq = n*n;
		boolean flag = true;
		while(n>0) {
			if(n%10!=sq%10) {
				flag = false;
				break;
			}
			n = n/10;
			sq=sq/10;
		}
		if(flag) {
			System.out.println("Automorphic Number");
		}else {
			System.out.println("Not a Automorphic Number");
		}
	}

}
