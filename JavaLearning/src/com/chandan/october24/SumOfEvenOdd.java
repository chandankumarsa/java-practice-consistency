package com.chandan.october24;

import java.util.Scanner;

public class SumOfEvenOdd {
	public static void main(String[] args) {
		System.out.println("ENter A number To Perform The Sum Of EVen And Odd Separately");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int esum =0;
		int osum=0;
		while(n>0) {
			int rem = n%10;
			if(n%2==0) {
				esum = esum+rem;
			}else {
				osum = osum+rem;
			}
			n = n/10;
		}
		System.out.println("Sum Of Even Number : "+esum);
		System.out.println("Sum Of Odd  Number : "+osum);
	}

}
