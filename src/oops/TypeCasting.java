package oops;

public class TypeCasting {

	public static void main(String[] args) {
		
		//Widening(Automatic) Type Casting
		byte a = 5;
		int b = a;
		System.out.println(b);
		
		//Narrowing(Manual) Type Casting
		double myDouble = 2.12345;
		int c = (int)myDouble;
		System.out.println(c);
		
		//Narrowing(Manual) Type Casting
		double myDouble1 = 3.12345;
		float myFloat = (float)myDouble1;
		System.out.println(myFloat);
		

	}

}
