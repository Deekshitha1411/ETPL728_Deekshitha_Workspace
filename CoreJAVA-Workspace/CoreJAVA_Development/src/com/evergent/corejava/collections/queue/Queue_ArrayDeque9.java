package com.evergent.corejava.collections.queue;

import java.util.ArrayDeque;

public class Queue_ArrayDeque9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<String> aDeque=new ArrayDeque<>();
		aDeque.add("banana");
		aDeque.addFirst("pineapple");
		aDeque.add("watermelon");
		aDeque.addLast("papaya");
		System.out.println(aDeque);
		System.out.println(aDeque.poll());
		System.out.println(aDeque.pollLast());
		System.out.println(aDeque.pollFirst());

	}

}
