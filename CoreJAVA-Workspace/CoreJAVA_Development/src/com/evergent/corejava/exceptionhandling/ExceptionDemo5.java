package com.evergent.corejava.exceptionhandling;

public class ExceptionDemo5 {
	String name=null;
	int k=0;
	public void myData() {
		try {
			System.out.println("one");
			int t=10/k;
			System.out.println(t);
			System.out.println(name.length());
			
			
			System.out.println("end");
		}
		
		catch(ArithmeticException e) {
			System.out.println("i can handle "+e);
		}
		catch(NullPointerException e) {
			System.out.println("i can handle "+e);
		}
		catch(Exception e) {
			System.out.println("i can handle "+e);
		}
		finally {
			System.out.println("finally block");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionDemo5 ed2=new ExceptionDemo5();
		ed2.myData();

	}

}
