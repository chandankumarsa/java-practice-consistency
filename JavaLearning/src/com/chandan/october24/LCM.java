package com.chandan.october24;

import java.util.Scanner;

public class LCM {
	public static void main(String[] args) {
		System.out.println("ENter Two number To Perform The Lcm Operations");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int big=((a>b)?a:b);
		for(int lcm =1;lcm<=a*b;lcm++) {
			if(lcm%a==0 && lcm%b==0) {
				System.out.println(lcm);
				break;
			}
		}
	}

}
