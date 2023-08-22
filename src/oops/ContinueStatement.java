package oops;

public class ContinueStatement {

	public static void main(String[] args) {
		
		//Usage of continue
		for(int i=1; i<=10; i++)
		{
			if(i==5)
			{
				continue;
			}
			System.out.println("The value of i is " + i);
		}

	}

}
