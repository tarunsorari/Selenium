package oops;
import java.util.Scanner;

public class NestedIfElseCondition {
		
	public static void main(String[] args) {
		int a=1;
		while(a>=0 && a<=7)
		{
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter weekday between 1 to 7: ");
			int i = sc.nextInt();
			a=i;
			
			if(i==1)
			{
				System.out.println("Today is Sunday");
			}
			else if(i==2)
			{
				System.out.println("Today is Monday");
			}
			else if(i==3)
			{
				System.out.println("Today is Tuesday");
			}
			else if(i==4)
			{
				System.out.println("Today is Wednesday");
			}
			else if(i==5)
			{
				System.out.println("Today is Thursday");
			}
			else if(i==6)
			{
				System.out.println("Today is Friday");
			}
			else if(i==7)
			{
				System.out.println("Today is Saturday");
			}
			else
			{
				System.out.println("Invalid day entered");
			}
		}
		
		

	}

}
