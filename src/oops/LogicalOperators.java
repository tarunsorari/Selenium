package oops;

public class LogicalOperators {

	public static void main(String[] args) {
		
		//Logical And &&
		int number = 45;
		
		if(number >= 1 && number <= 100)
		{
			System.out.println("Number is in expected range");
		}
		
		else
		{
			System.out.println("Number is out of range");
		}
		
		//Logical OR ||
		int grade = 11;
		
		if(grade >= 12 || grade <= 11)
		{
			System.out.println("You are eligible for Board Exams");
		}
		
		else
		{
			System.out.println("You are not eligible for Board Exams");
		}
		
		
		//Logical NOT !
		int age = 11;
		
		if(age != 18 && age >= 18)
		{
			System.out.println("You are eligible for Voting");
		}
		
		else
		{
			System.out.println("You are not eligible for Voting");
		}

	}

}
