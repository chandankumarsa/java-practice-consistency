package com.chandan.practice.oct10;

import java.util.Scanner;

public class FibonaccieRange {
    public static void main(String[] args) {
        System.out.println("Enter a number to check if it belongs to the Fibonacci series or not");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0, b = 1, c;

        for (int i = 0; a <= n; i++) {
            if (a == n) {
                System.out.println(n + " belongs to the Fibonacci Series");
                return;  // Exits the program after finding the number in the series
            }
            c = a + b;  // Generate the next Fibonacci number
            a = b;
            b = c;
        }

        System.out.println(n + " does not belong to the Fibonacci Series");
    }
}
