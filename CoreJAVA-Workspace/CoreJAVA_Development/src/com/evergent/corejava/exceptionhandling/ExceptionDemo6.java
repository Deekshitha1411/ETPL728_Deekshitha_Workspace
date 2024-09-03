package com.evergent.corejava.exceptionhandling;

public class ExceptionDemo6 {
	String name="null";
	int k=0;
	public void myData() {
		try {
			System.out.println("one");
			System.out.println(name.length());
			int t=10/k;
			System.out.println(t);
			System.out.println("end");
		}
		
		finally {
			System.out.println("finally block");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionDemo6 ed2=new ExceptionDemo6();
		ed2.myData();

	}

}
