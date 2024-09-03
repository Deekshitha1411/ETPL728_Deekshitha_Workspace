package com.evergent.corejava.exceptionhandling;

public class ExceptionDemo8Throws {
	String name=null;
	public void myData() throws NullPointerException{
		System.out.println("one");
		System.out.println(name.length());
		System.out.println("end");
	}
	public void myChange()//throws NullPointerException
	{
		myData();
		System.out.println("my change method");
	}

	public static void main(String[] args) {
		try {
			ExceptionDemo8Throws ex1=new ExceptionDemo8Throws();
			ex1.myChange();
		}
		catch(Exception e) {
			System.err.println("i can handle"+e);
			
		}
	}

}
