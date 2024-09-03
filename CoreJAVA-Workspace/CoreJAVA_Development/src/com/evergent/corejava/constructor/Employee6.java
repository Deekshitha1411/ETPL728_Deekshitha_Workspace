package com.evergent.corejava.constructor;
class MyEmployee{
	int eno;
	public MyEmployee(){
}
	public MyEmployee(int eno) {
		//this.eno = eno;
		System.out.println("MyEmployee No :"+eno);
		
	}
}



public class Employee6 extends MyEmployee
{
	int eno;
	String ename;
	double sal;
	Employee6() {
		System.out.println("Default constructor");
	}
	Employee6(int eno,String ename,double sal){
		super(eno);
		this.ename=ename;
		this.sal=sal;
	}
	public void display() {
		System.out.println("Emp No:"+eno);
		System.out.println("Emp Name:"+ename);
		System.out.println("Emp Sal:"+sal);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Employee6();
		Employee6 emp=new Employee6(123,"raj",55000);
		emp.display();

	}

}
