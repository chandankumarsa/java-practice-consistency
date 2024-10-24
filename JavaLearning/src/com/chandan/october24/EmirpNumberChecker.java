package com.chandan.october24;
import java.util.Scanner;
public class EmirpNumberChecker {
    
    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i < num; i++) { // Check all numbers less than num
            if (num % i == 0) return false;
        }
        return true;
    }

    // Method to reverse the digits of a number
    public static int reverse(int num) {
        int rev = 0;
        while (num > 0) {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is an Emirp number:");
        int n = sc.nextInt();

        if (isPrime(n)) {
            int reversed = reverse(n);
            if (n != reversed && isPrime(reversed)) { // Check if the reversed number is different and prime
                System.out.println(n + " is an Emirp number.");
            } else {
                System.out.println(n + " is not an Emirp number.");
            }
        } else {
            System.out.println(n + " is not an Emirp number.");
        }
    }
}
