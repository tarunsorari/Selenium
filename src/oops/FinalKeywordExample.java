package oops;

class t1{
	
	final int a = 10;

	void testMethod1() {
		
		//a = 20; // This is not valid as we can't change the value of a final variable
		System.out.println(a);
	}
	
	final void testMethod2() {
		
		System.out.println("This is testMethod2 of t1 class t1");
	}
	
}

class t2{
	
	int b = 30;
	void testMethod2(){
		
		
		System.out.println();
	}
	
}


public class FinalKeywordExample {

	public static void main(String[] args) {
		
		t1 obj1 = new t1();
		obj1.testMethod1();

	}

}
