package oops;

class Class1 {

	int a = 10;

	public void method1() {

		System.out.println("This is Method 1 of Class1");
	}

}

class Class2 extends Class1 {

	@Override
	public void method1() {

		System.out.println("This is Method 1 of Class 1 in Class 2");
	}

}

public class MethodOverridingExample {

	public static void main(String[] args) {
		
		Class1 obj1 = new Class1();
		obj1.method1(); //This method will run the Method 1 of Class 1
		
		Class2 obj2 = new Class2();
		obj2.method1(); //This method will run the Method 1 from Class 2
		
		
	}

}
