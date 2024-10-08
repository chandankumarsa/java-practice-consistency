package COM.CHANDAN;

import java.util.Scanner;

public class HappyNumberCode {
	public static void main(String[] args) {
		System.out.println("ENter a number To check if the number is a Happy Number or not");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int res = n;
		while (res != 1 && res != 4) {
			int sum = 0;
			while (res > 0) {
				int rem = res % 10;
				sum = sum + rem * rem;
				res = res/10;
			}
			res = sum;
		}
		if (res == 1) {
			System.out.println("is a Happy Number");
		} else {
			System.out.println("is Not a Happy Number");
		}

	}
}
