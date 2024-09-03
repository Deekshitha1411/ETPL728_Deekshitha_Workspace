package com.evergent.corejava.exceptionhandling;

public class ExceptionDemo19_Multiple_Catch {
	String nameString="null";
	int k=0;
	public void myData(){
		try {
		System.out.println("one");
		System.out.println(nameString.length());
		int d=10/k;
		System.out.println(d);
		System.out.println("end");
	}
		catch(NullPointerException|ArithmeticException e) {
			System.out.println("i can handle: "+e);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			ExceptionDemo19_Multiple_Catch ed2=new ExceptionDemo19_Multiple_Catch();
			ed2.myData();
	
	}

}
