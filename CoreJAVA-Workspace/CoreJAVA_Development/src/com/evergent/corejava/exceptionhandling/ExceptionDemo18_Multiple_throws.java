package com.evergent.corejava.exceptionhandling;

public class ExceptionDemo18_Multiple_throws {
	String nameString="null";
	int k=0;
	public void myData() throws NullPointerException, ArithmeticException{
		System.out.println("one");
		System.out.println(nameString.length());
		int d=10/k;
		System.out.println(d);
		System.out.println("end");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ExceptionDemo18_Multiple_throws ed2=new ExceptionDemo18_Multiple_throws();
			ed2.myData();
		}
		catch (Exception e) {
			System.out.println("I CAN HANDLE: "+e);
			// TODO: handle exception
		}

	}

}
