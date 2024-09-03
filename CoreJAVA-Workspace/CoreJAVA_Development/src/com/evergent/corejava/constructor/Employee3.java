package com.evergent.corejava.constructor;

public class Employee3 {
	int eno;
	String ename;
	double sal;
	Employee3(){
		System.out.println("default constructor");
	}
	Employee3(int eno,String ename,double sal){
		this.eno=eno;
		this.ename=ename;
		sal=sal;
		
	}
	public void display() {
		System.out.println("Employee no:"+eno);
		System.out.println("Employee name:"+ename);
		System.out.println("Employee sal:"+sal);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Employee3();
		//Employee3 emp=new Employee3(123,"raj",55000);
		//emp.display();
		new Employee3(123,"raj",55000).display();
		
		

	}

}
