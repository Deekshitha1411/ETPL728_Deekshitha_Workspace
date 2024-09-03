package com.evergent.corejava.collections.Stack;

import java.util.Stack;

public class Stack_Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack myStack=new Stack();
		myStack.push("red");
		myStack.push("black");
		myStack.push("white");
		System.out.println(myStack);
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
	

	}

}
