package oops;
import java.util.Scanner;

public class ScannerUserInput {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Principal Amount");
		int principal = sc.nextInt();
		System.out.println("Enter Rate of Interest");
		float rateOfInterest = sc.nextFloat();
		System.out.println("Enter Tenure");
		int tenure = sc.nextInt();
		
		float simpleInterest = principal * rateOfInterest * tenure /100;
		System.out.println("The simple interest calculated is " + simpleInterest);

	}

}
