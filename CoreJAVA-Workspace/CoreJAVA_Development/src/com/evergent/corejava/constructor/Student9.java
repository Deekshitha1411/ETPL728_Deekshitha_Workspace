package com.evergent.corejava.constructor;

//copy constructor

public class Student9 {
	String name;
	int age;
	public Student9(String name,int age) {
		this.name=name;
		this.age=age;
		
	}
	public Student9(Student9 s) {
		this.name=s.name;
		this.age=s.age;
	}
	public void displayDetails() {
		System.out.println("name:"+name);
		System.out.println("age:"+age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student9 stud1=new Student9("sai",20);
		Student9 stud2=new Student9(stud1);
		stud1.displayDetails();
		stud2.displayDetails();

	}

}
