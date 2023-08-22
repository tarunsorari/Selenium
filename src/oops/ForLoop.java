package oops;
import java.util.Scanner;

public class ForLoop {
	

	public static void main(String[] args) {

		 //Printing value from 1 to 10 using for Loop
		/*for(int i=1; i<=10; i++)
		{
			System.out.println("Value of i is " + i + ". Now incrementing the value of i by 1 \n");
		}

		// Printing the Even numbers between 1 to 10 using for Loop
		for (int j = 1 ; j<=100 ; j++) {
			
			if(j%2==0)
			{
				System.out.println("Value of j is " + j + " which is a Even Number. Now incrementing the value of j by 1 \n");
			
			}
			else
				System.out.println("Value of j " + j + " is a odd number. Incrementing the j value by 1");		
			
		}*/
		
		//Taking input from User & printing the Even numbers between 1 to 10 using for Loop
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a value between 1 to 10 \n");
			int k = sc.nextInt();
			
			for(int l=k; l<=10; l++)
			{
				
				if(l%2==0)
				{
					System.out.println("Value of k is " + l + " which is a Even Number.\n");
				}
				
				else
					System.out.println(l + " is a odd number \n");
				
			}

	}

}
