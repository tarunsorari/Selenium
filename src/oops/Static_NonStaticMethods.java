package oops;

public class Static_NonStaticMethods {
	
	int a = 100;
	static int b = 200;
	
	//Static Methods can only access Static Variables
	static void show()
	{
		System.out.println(b);
	}
	
	//Non Static Methods can access both Static & Non Static Variables
	void disp()
	{
		System.out.println(a+ " " +b);
	}

	public static void main(String[] args) {
		//Static Variables can be called using its class name
		Static_NonStaticMethods.show();
		
		Static_NonStaticMethods obj1 = new Static_NonStaticMethods();
		obj1.disp();

	}

}
