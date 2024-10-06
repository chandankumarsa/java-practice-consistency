import java.util.Scanner;

public class SUM_OF_DIGIT_SINGLE_DIGIT {
	public static void main(String[] args) {
		System.out.println("ENter a number to Perform the SUM OF DIGIT SHOULD BE SINGLE DIGIT");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum =0;
		while(n>0) {
			int rem = n%10;
			sum = sum+rem;	
			n = n/10;
			if(n==0 && sum>9 ) {
				n= sum;
				sum =0;
			}	
		}
		System.out.println("SUM OF DIGIT SHOULD BE SINGLE DIGIT is "+sum);
		
	}

}

//ENter a number to Perform the SUM OF DIGIT SHOULD BE SINGLE DIGIT