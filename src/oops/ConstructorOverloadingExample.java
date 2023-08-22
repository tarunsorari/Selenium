package oops;

public class ConstructorOverloadingExample {
	
	int a = 0;
	int b = 0;
	double c = 0;
	
	ConstructorOverloadingExample()
	{
		a = 10;
		b = 20;
		c = 20.5;
	}
	
	ConstructorOverloadingExample(int x, int y)
	{
		a = x;
		b= y;		
	}
	
	ConstructorOverloadingExample(int x, double y)
	{
		a = x;
		c= y;		
	}
	
	ConstructorOverloadingExample(int x, int y, double z)
	{
		a = x;
		b = y;
		c= z;
	}
	
	void display(){
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	
	

	public static void main(String[] args) {
		
		ConstructorOverloadingExample obj = new ConstructorOverloadingExample();

	}

}
