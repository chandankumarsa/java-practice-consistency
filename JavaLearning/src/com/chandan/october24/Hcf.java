package com.chandan.october24;

import java.util.Scanner;

public class Hcf {
public static void main(String[] args) {
	int hcf =0;
	Scanner sc=new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	for(int i =1;i<=a;i++) {
		if(a%i==0 && b%i==0) {
			hcf=i;
		}
	}
	System.out.println(hcf);
	
}
}
