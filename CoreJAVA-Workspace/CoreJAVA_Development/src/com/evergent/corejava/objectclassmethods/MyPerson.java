package com.evergent.corejava.objectclassmethods;
class Person{
	String name;
	int age;
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public String toString() {
		return "Name:"+name+"Age:"+age;
	}
}

public class MyPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p=new Person("sai",20);
		System.out.println(p);
		System.out.println(p.hashCode());
		

	}

}
