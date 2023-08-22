package oops;

//Private Access Modifiers
/*class A{
		private int i;
		
		private void disp()
		{
			System.out.println(i);
		}
	}*/

//Default Access Modifiers
class B{
	 int j;
	
	 void disp1()
	{
		System.out.println(j + " " + "Default Variables & Methods can be accessible only within the package");
	}
}


//Protected Access Modifiers
class C{
		protected int k;
	
		protected void disp2()
	{
		System.out.println(k + " " + "Protected Variables & Methods can be accessible within the Package and outside the Package but using Inheritance(Extending the Class)");
	}
}


//Public Access Modifiers
class D{
		public int l;
	
		public void disp3()
	{
		System.out.println(l + " " + "Public Variables & Methods can be accessible everywhere");
	}
}

public class AccessModifiersExample {

	public static void main(String[] args) {
		
		/*A aobj1 = new A();
		aobj1.i = 10;	//Private Variables cannot be accessed outside the Class
		aobj1.disp();*/	//Private Methods cannot be accessed outside the Class
		
		B bobj1 = new B();
		bobj1.j = 10; 	//Default Variables can be accessible only within the Package (across all the classes within the package)
		bobj1.disp1();	//Default Methods can be accessible only within the Package(across all the classes within the package) 
		
		C cobj1 = new C();
		cobj1.k = 20;	//Protected Variables can be accessible within the Package and outside the Package as well but through Inheritance (extends the Class)
		cobj1.disp2();	//Protected Methods can be accessible within the Package and outside the Package as well but through Inheritance (extends the Class)
		
		D dobj1 = new D();
		dobj1.l = 30;	//Public Variables can be accessible everywhere
		dobj1.disp3();	//Public Methods can be accessible everywhere
		
	}

}
