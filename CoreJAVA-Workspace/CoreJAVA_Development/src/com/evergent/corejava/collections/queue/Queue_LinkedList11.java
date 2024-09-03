package com.evergent.corejava.collections.queue;

import java.util.Deque;
import java.util.LinkedList;

public class Queue_LinkedList11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<String> q1=new LinkedList<>();
		q1.add("banana");
		q1.add("pineapple");
		q1.add("watermelon");
		q1.add("papaya");
		
		boolean b=q1.isEmpty();
		System.out.println(q1.size());
		q1.clear();
		System.out.println(q1);

	}

}
