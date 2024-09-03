package com.evergent.corejava.collections.queue;

import java.util.ArrayDeque;

public class Queue_ArrayDeque7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<String> aDeque=new ArrayDeque<>();
		aDeque.add("banana");
		aDeque.addFirst("pineapple");
		aDeque.add("watermelon");
		aDeque.addLast("papaya");
		aDeque.offerFirst("kiwi");
		aDeque.offer("apple");
		aDeque.offerLast("mango");
		System.out.println(aDeque);
		System.out.println(aDeque.size());
		boolean b=aDeque.isEmpty();
		System.out.println(b);
		aDeque.clear();
		System.out.println(aDeque);

	}

}
