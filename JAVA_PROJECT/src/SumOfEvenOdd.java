import java.util.Scanner;

public class SumOfEvenOdd {
	public static void main(String[] args) {
		System.out.println("Enter a number to Perform the Sum Of Even Or Odd Number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int esum =0;
		int osum =0;
		while(n>0) {
			int rem = n%10;
			if(n%2==0) {
				esum = esum+rem;
			}else{
				osum = osum+rem;
			}
			n = n/10;
		}
		System.out.println("sum of Even = " + esum);
		System.out.println("sum of Odd = " + osum);
	}

}