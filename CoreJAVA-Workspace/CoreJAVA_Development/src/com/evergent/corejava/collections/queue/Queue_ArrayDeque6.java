package com.evergent.corejava.collections.queue;

import java.util.ArrayDeque;

public class Queue_ArrayDeque6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayDeque<String>pqArrayDeque=new ArrayDeque<>();
		pqArrayDeque.add("ravi");
		pqArrayDeque.offer("bhanu");
		pqArrayDeque.add("shankar");
		pqArrayDeque.add("chandu");
		  
		System.out.println(pqArrayDeque);
		System.out.println(pqArrayDeque.peek());
		

	}

}
