package com.evergent.corejava.Static;

public class Person6 {
	static String name="raju";
	int age=28;
	String address="hyderabad";
	public void display() {
		name="welcome";
		System.out.println("name:"+name);
		System.out.println("age:"+age);
		System.out.println("address:"+address);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person6 p1=new Person6();
		System.out.println(p1.name);
		p1.display();
		Person6 p2=new Person6();
		System.out.println(p2.name);

	}

}
