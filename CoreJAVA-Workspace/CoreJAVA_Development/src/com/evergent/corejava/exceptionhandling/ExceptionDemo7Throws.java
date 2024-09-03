package com.evergent.corejava.exceptionhandling;

public class ExceptionDemo7Throws {
	String name=null;
	
	public void myData() throws ArithmeticException
	{
		System.out.println("one");
		System.out.println(name.length());
		System.out.println("end");
	}
	public void mylogic() {
		try {
			
			myData();
		}
		catch(ArithmeticException e) {
			System.err.println("i can handle"+e);
			
		}
	}

	public static void main(String[] args) {
		ExceptionDemo7Throws ex1=new ExceptionDemo7Throws();
		ex1.mylogic();
	}

}
