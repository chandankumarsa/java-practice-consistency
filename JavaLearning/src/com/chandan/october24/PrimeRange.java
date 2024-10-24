package com.chandan.october24;

import java.util.Scanner;

public class PrimeRange {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("ENter The Starting Range");
		int start = sc.nextInt();
		System.out.println("Enter The Ending Range");
		int end = sc.nextInt();
		for(int n =start;n<=end;n++) {
			if(n<=1) {
				boolean flag=false;
			}
			else {
				boolean flag = true;
				for(int i =2;i<=n/2;i++) {
					if(n%i==0) {
						flag= false;
						break;
					}
				}
				if(flag) {
					System.out.println(n);
				}
			}
			
		}
		
	}

}
