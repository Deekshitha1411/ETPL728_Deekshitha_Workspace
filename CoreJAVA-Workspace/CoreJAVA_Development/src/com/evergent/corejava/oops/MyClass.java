package com.evergent.corejava.oops;

public class MyClass extends Calculation{
	public void show() {
		System.out.println("show method local class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass m=new MyClass();
		m.show();
		m.add();

	}

}
