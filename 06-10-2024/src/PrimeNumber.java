import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		System.out.println("ENter a number to check Prime Number Or Not");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n<=1) {
			System.out.println("is not a prime number");
		}
		else {
			boolean flag = true;
			for(int i =2;i<=n/2;i++) {
				if(n%i==0) {
					flag = false;
					break;
				}
			}
			if(flag) {
				System.out.println("is a Prime number");
			}else {
				System.out.println("is not a prime number");
			}
		}
	}

}

//PRIME NUMBER OR NOT