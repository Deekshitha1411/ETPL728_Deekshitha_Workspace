package com.evergent.corejava.Static;

public class StaticDemo3 {
	static String cname="India";
	String name="Ravi";
	static public void myData() {
		System.out.println("my data");
	}
	public void myShow() {
		System.out.println("my show non static method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(cname);
		myData();

	}

}
