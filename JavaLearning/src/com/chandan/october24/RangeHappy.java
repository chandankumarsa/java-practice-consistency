package com.chandan.october24;

import java.util.Scanner;

public class RangeHappy {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter The starting Range");
		int start = sc.nextInt();
		System.out.println("ENter The ENding Range");
		int end = sc.nextInt();
		
		for(int n =start;n<=end;n++) {
			int res =n;
			while(res!=1 &&res!=4) {
				int sum =0;
				while(res>0) {
					int rem = res%10;
					sum = sum+rem*rem;
					res= res/10;
				}
				res=sum;
			}
			if(res==1) {
				System.out.println(n);
			}
			
		}
		
	}

}
