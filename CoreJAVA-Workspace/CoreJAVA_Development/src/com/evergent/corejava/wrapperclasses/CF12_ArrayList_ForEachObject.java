package com.evergent.corejava.wrapperclasses;

import java.util.ArrayList;
import java.util.Iterator;

public class CF12_ArrayList_ForEachObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Object> myList=new ArrayList<>();
		myList.add(100);
		myList.add("venu");
		myList.add("ramesh");
		for(Object o:myList) {
			System.out.println(o);
		}

	}

}
