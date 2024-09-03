package com.evergent.corejava.collections.queue;

import java.util.ArrayDeque;

public class Queue_ArrayDeque8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<String> aDeque=new ArrayDeque<>();
		aDeque.add("banana");
		aDeque.addFirst("pineapple");
		aDeque.add("watermelon");
		aDeque.addLast("papaya");
		System.out.println(aDeque);
		System.out.println(aDeque.peek());
		System.out.println(aDeque.peekLast());
		System.out.println(aDeque.peekFirst());

	}

}
