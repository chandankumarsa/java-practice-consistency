package com.chandan.october24;

import java.util.Scanner;

public class SpyNumber {
	public static void main(String[] args) {
		System.out.println("Enter A number To check Spy Number Or not");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum =0;
		int mul=1;
		while(n>0) {
			int rem = n%10;
			sum = sum+rem;
			mul = mul*rem;
			n = n/10;
		}
		if(sum==mul) {
			System.out.println("Spy Number");
		}else {
			System.out.println("Not a  Spy Number");
		}
		
	}

}

//sum of its digit is equals to the Prouct of its digit