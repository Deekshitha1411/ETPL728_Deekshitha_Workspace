package com.evergent.corejava.exceptionhandling;

public class StackOverflowErrorExample16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			recursiveMethod();
		}
		catch(StackOverflowError e) {
			System.out.println("StackOverFlowError caught: "+e.getMessage());
		}

	}
	public static void recursiveMethod() {
		recursiveMethod();
	}

}
