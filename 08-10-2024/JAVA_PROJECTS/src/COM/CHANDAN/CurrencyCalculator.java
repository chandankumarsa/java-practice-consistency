package COM.CHANDAN;

import java.util.Scanner;

public class CurrencyCalculator {
	public static void main(String[] args) {
		System.out.println("Enter an Amount to calculate the currency");
		Scanner sc = new Scanner(System.in);
		int amount = sc.nextInt();
		int count = 0;
		if (amount >= 2000) {
			count = amount / 2000;
			System.out.println("2000's = 2000  x " + count);
			amount = amount % 2000;
		}
		if (amount >= 500) {
			count = amount / 500;
			System.out.println(("500's = 500  x " + count));
			amount = amount % 500;
		}

		if (amount >= 200) {
			count = amount / 200;
			System.out.println("200's = 200   x " + count);
			amount = amount % 200;
		}
		if (amount >= 100) {
			count = amount / 100;
			System.out.println("100's = 100  x " + count);
			amount = amount % 100;
		}

	}

}
