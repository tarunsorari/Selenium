package oops;

public class Calculation {
	
	int a;
	int b;
	
	//1)A Method may not take parameters/empty parameters
	
	/*void sum()
	{
		System.out.println(a+b);
	}*/
	
	
	
	//2)Method takes parameters
	/*void sum(int x, int y)
	{
		int a = x;
		int b = y;
		System.out.println(a+b);
	}*/
	
	
	//3)Method return sum value
	
	int sum()
	{
		return(a+b);
	}
	

	public static void main(String[] args) {
		
		Calculation cal = new Calculation();
		
		//1)Method may not take parameters/empty parameters
		/*cal.a=100;
		cal.b=200;
		cal.sum();*/
		
		
		//2)Method takes parameters
		/*cal.sum(100,200);*/
		
		//3) Method return some value
		cal.a = 100;
		cal.b = 200;
		int r = cal.sum();
		System.out.println(r);

	}

}
