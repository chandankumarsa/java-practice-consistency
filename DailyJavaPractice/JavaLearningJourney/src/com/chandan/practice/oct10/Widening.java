package com.chandan.practice.oct10;

public class Widening {
	public static void main(String[] args) {
		byte a =10;
		int b = a;
		int c = 20;
		double d = c;
		System.out.println(a+" "+b);
		System.out.println(c+" "+ d);
	}

}

//The Process of Converting to Lower range type data To higher range type is known as widening
