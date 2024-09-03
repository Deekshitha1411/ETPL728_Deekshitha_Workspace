package com.evergent.corejava.collections.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer>pQueue=new PriorityQueue<>();
		pQueue.add(8);
		pQueue.add(4);
		pQueue.add(9);
		pQueue.add(7);
		System.out.println(pQueue);
		System.out.println(pQueue.poll());
		System.out.println(pQueue);
		pQueue.clear();
		System.out.println(pQueue);
		

	}

}
