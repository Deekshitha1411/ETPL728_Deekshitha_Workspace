package com.evergent.corejava.exceptionhandling;

import java.util.ArrayList;

public class CF12_ArrayList_ForEachObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Object> mylist=new ArrayList<>();
			mylist.add(100);
			mylist.add("venu");
			mylist.add("ramesh");
			for(Object o:mylist) {
				System.out.println(o);
			
			}
		

	}

}
