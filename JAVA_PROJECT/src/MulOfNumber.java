import java.util.Scanner;

public class MulOfNumber {
	public static void main(String[] args) {
		System.out.println("ENter a number to CALCULATE THE MULTIPLICATIONOF INTEGER (1 to N)");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int mul =1;
		String str ="";
		for(int i =1;i<=n;i++) {
			mul = mul*i;
			str = str+i;
			if(i<n) {
				str = str+"x";
			}
		}
		System.out.println(str +"="+mul);
	}

}


//CALCULATE THE MULTIPLICATIONOF INTEGER (1 to N)