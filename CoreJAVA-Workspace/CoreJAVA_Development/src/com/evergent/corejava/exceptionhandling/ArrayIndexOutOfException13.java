package com.evergent.corejava.exceptionhandling;

public class ArrayIndexOutOfException13 {

	public static void main(String[] args) {
		int[] numbers= {1,2,3,4,5};
		try {
			System.out.println(numbers[10]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			System.out.println(e.getMessage());
		}
		System.out.println("program continues after handling the exception");

	}

}
