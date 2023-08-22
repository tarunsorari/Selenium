package oops;

public class MethodOverloadingExample {

	int a;
	int b;
	
	//First Method
	void sum() {
		a = 10;
		b = 20;
		System.out.println(a + b);
	}
	
	//Second Method
	void sum(int x, int y) {
		int a = x;
		int b = y;
		System.out.println(a + b);
	}
	
	//Third Method
	void sum(int x, int y, int z) {
		System.out.println(x + y + z);
	}
	
	//Fourth Method
	void sum(int x, double y) {
		System.out.println(x+y);
	}

	public static void main(String[] args) {

		MethodOverloadingExample obj1 = new MethodOverloadingExample();
		obj1.sum(); //It will call the First Method
		
		obj1.sum(20, 20); //It will call the Second Method
		
		obj1.sum(10, 10, 30); //It will call the Third Method
		
		obj1.sum(10, 10.5); //It will call the Fourth Method
			

	}

}
