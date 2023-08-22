package oops;

abstract class abstractClass {
	abstract void run(); 
	void abc()
	{
		System.out.println("Testing");
	}
}

class Honda4 extends abstractClass{
    
	 void run()
	{
	    System.out.println("running safely..");
	    
	}
	 
	

	 public static void main(String args[]){
		 abstractClass obj = new Honda4();
	  obj.run();
	 }

		 }