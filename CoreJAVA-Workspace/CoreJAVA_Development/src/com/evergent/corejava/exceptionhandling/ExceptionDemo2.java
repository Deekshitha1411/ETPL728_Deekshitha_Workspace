package com.evergent.corejava.exceptionhandling;

public class ExceptionDemo2 {
	String name="null";
	public void myData(){
		try {
			System.out.println("one");
			System.out.println(name.length());
			System.out.println("end");
		}
		catch(NullPointerException e) {
			System.out.println("i can handle "+e);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionDemo2 ed2=new ExceptionDemo2();
		ed2.myData();
		
		
	}

}
