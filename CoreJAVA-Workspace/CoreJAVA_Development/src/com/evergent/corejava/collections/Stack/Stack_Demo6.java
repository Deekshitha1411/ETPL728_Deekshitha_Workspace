package com.evergent.corejava.collections.Stack;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Stack;

public class Stack_Demo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String>myStack=new Stack<>();
		myStack.push("red");
		myStack.push("black");
		myStack.push("white");
		System.out.println(myStack);
		
		System.out.println("enumeration iteration");
		Enumeration enumeration=myStack.elements();
		while (enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());			
		}
		
		System.out.println("iterator");
		Iterator i1=myStack.iterator();
		while (i1.hasNext()) {
			System.out.println(i1.next());
		}
		
		System.out.println("foreach adv loop");
		for(String s:myStack) {
			System.out.println(s);
		}

	}

}
