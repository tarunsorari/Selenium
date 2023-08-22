package oops;
import java.util.Scanner;

public class IfElseCondition {

	public static void main(String[] args) {
		
		//if...else condition when taking value from the user using Scanner Class
		int a=1;
		while(a<=110)
			{		
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter your age in number \n");
				int i = sc.nextInt();
				a=i;
			
		
			if(i>=18 && i<=110)
			{
				System.out.println("Eligible for voting");
			}
			
			else if(i<18)
			{
				System.out.println("Not eligible for voting");
			}
			else
				System.out.println("Invalid Age");
			}
	}

}
