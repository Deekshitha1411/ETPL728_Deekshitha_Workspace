package com.evergent.corejava.collections.Stack;

import java.util.Stack;

public class Stack_Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> stack=new Stack<>();
		stack.push("apple");
		stack.push("banana");
		stack.push("cherry");
		stack.push("date");
		//display
		System.out.println(stack);
		//peeking at the top element
		System.out.println(stack.peek());
		//popping an element from stack
		System.out.println(stack.pop());
		//display
		System.out.println(stack);
		
		//checking if empty
		boolean isEmpty=stack.isEmpty();
		System.out.println("is stack empty: "+isEmpty);
		int position=stack.search("banana");
		System.out.println(position);
		//clearing
		System.out.println(stack);

	}

}
