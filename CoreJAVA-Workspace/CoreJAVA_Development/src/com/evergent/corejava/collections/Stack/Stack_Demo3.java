package com.evergent.corejava.collections.Stack;

import java.util.Stack;

public class Stack_Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack myStack=new Stack();
		myStack.push("red");
		myStack.push("black");
		myStack.push("white");
		System.out.println(myStack);
		System.out.println(myStack.search("white"));
		System.out.println(myStack);
	

	}

}
