package com.chandan.october24;

import java.util.Scanner;

public class ArmstrongNumberRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking range input from the user
        System.out.println("Enter the lower limit of the range:");
        int lower = sc.nextInt();

        System.out.println("Enter the upper limit of the range:");
        int upper = sc.nextInt();

        System.out.println("Armstrong numbers between " + lower + " and " + upper + ":");
        
        // Loop through each number in the range
        for (int n = lower; n <= upper; n++) {
            int t1 = n;
            int count = 0;
            int sum = 0;

            // Counting the number of digits in the number
            while (t1 > 0) {
                count++;
                t1 = t1 / 10;
            }

            int t2 = n;
            // Calculating the sum of the digits raised to the power of the number of digits
            while (t2 > 0) {
                int rem = t2 % 10;
                int mul = 1;
                for (int i = 1; i <= count; i++) {
                    mul = mul * rem;
                }
                sum = sum + mul;
                t2 = t2 / 10;
            }

            // If the sum of powers of digits equals the number, it's an Armstrong number
            if (sum == n) {
                System.out.println(n);
            }
        }
    }
}
