package oops;

class P{
	int a;
	int b;

	public void disp() {
		System.out.println(a + b);
	}
}

class Q extends P {
	int x;
	int y;

	public void show() {
		System.out.println(x - y);
	}
}

public class InheritanceExampleTest1 {

	public static void main(String[] args) {

		/*P aobj = new P();
		aobj.a = 100;
		aobj.b = 200;
		aobj.disp();*/

		Q bobj = new Q();
		bobj.x = 300;
		bobj.y = 100;
		bobj.show();
		
		/*As Q class has extended(Inherited) Class P therefore, Variables
		and Methods of Class Q can be accessed by Object of Class Q*/
		bobj.a = 100;
		bobj.b = 200;
		bobj.disp();		

	}

}
