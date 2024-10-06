import java.util.Scanner;

public class STRONG_NUMBER {
	public static void main(String[] args) {
		System.out.println("Enter a number To check Strong Number Or Not");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t1 =n;
		int sum =0;
		while(t1>0) {
			int rem = t1%10;
			int fact =1;
			for(int i =1;i<=rem;i++) {
				fact = fact*i;
			}
			sum = sum+fact;
			t1 = t1/10;
		}
		if(sum == n) {
			System.out.println("is a Strong Number");
		}else {
			System.out.println("is not a Strong Number");
		}
	}

}
