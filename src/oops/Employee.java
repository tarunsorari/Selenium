package oops;

public class Employee {

	int empid;
	String empname;
	int salary;
	int deptno;
	
	/*Employee(int id, String name, int sal, int dno)
	{
		empid = id;
		empname = name;
		salary = sal;
		deptno= dno;
	}*/
	
	void display()
	{
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(salary);
		System.out.println(deptno);
	}
	
	void setdata(int id, String name, int sal, int dno)
	{
		empid = id;
		empname = name;
		salary = sal;
		deptno= dno;
	}
	
	
	
	public static void main(String[] args) {
		
		//Assigning values to class variables using object directly
		/*Employee emp1 = new Employee(); //First Employee
		emp1.empid = 101;
		emp1.empname = "Tarun";
		emp1.salary = 100000;
		emp1.deptno = 1;
		emp1.display();
		
		Employee emp2 = new Employee(); //Second Employee
		emp2.empid = 102;
		emp2.empname = "Ajay";
		emp2.salary = 200000;
		emp2.deptno = 2;
		emp2.display();
		
		Employee emp3 = new Employee(); //Third Employee
		emp3.empid = 103;
		emp3.empname = "Rahul";
		emp3.salary = 300000;
		emp3.deptno = 3;
		emp3.display();*/
		
		
		
		//Assigning values to class variable using Constructor
		/*Employee emp1 = new Employee(101, "Tarun", 100000, 1);//First Employee
		emp1.display();
		
		Employee emp2 = new Employee(102, "Ajay", 200000, 2);//Second Employee
		emp2.display();
		
		Employee emp3 = new Employee(103, "Raul", 300000, 3);//Third Employee
		emp3.display();*/
		
		
		//Assigning values to class variable using Method
		Employee emp1 = new Employee();
		emp1.setdata(101,"Tarun",100000,1);
		emp1.display();
		
		Employee emp2 = new Employee();
		emp2.setdata(102, "Ajay", 200000, 2);
		emp2.display();
		
		Employee emp3 = new Employee();
		emp3.setdata(103, "Rahul", 300000, 3);
		emp3.display();
		
		
		
	}
}
