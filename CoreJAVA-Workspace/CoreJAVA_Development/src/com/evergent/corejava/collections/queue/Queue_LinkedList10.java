package com.evergent.corejava.collections.queue;

import java.util.Deque;
import java.util.LinkedList;

public class Queue_LinkedList10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<String> q1=new LinkedList<>();
		q1.add("banana");
		q1.add("pineapple");
		q1.add("watermelon");
		q1.add("papaya");
		System.out.println(q1);
		System.out.println(q1.peek());
		System.out.println(q1.poll());

	}

}
