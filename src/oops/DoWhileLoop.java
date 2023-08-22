package oops;

public class DoWhileLoop {

	public static void main(String[] args) {
		
		//Printing values from 1 to 10 using Do While Loop
		/*int i = 1;
		do
		{
			System.out.println(i);
			i++;
			
			System.out.println("Incremented value of i is " + i + ". Program will be exited when i value becomes greater than 10");
		}
		while(i<=10);
		System.out.println("Program Exited as the value of I became greater than 10");*/
		
		//Printing Even values from 1 to 10 using Do While Loop
		/*int j = 0;
		do 
		{
			System.out.println(j);
			j+=2;
			
			System.out.println("Incremented value of j is" + j + ". Program will be exited when j value becomes greater than 10. \n");
		}
		while(j<=10 && j%2==0);
		System.out.println("Program exited as the j value is now greater than 10");*/
		
		
		//Printing odd numbers between 1 to 10
		int k = 1;
		do
		{
			System.out.println(k + " is a odd number and less than 10 too. Now incrementing the j value to 2");
			k+=2;
			
			System.out.println("Incremented value of k is " +k + "\n");
			
		}
		while(k<=10 && k%2!=0);
		System.out.println("Program exited as the value of k is now greater than 10");
	}

}
