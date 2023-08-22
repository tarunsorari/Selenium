package oops;

public class Variables {
	
	//Instance/Global Variable
	int var1 = 30;
	
	//Static Variable
	static int var2 = 20;
	
	final int var3 = 40;

	public static void main(String[] args) {
		
		//Local Variable
		int var4 = 10;
		System.out.println(var4);
		
		//Static variables can be called using the Class Name
		System.out.println(Variables.var2);
		
		//Calling Instance/Global Variable
		Variables obj1 = new Variables();
		System.out.println(obj1.var1);
		System.out.println(obj1.var3);
		
		
	}

}
