package com.evergent.corejava.wrapperclasses;

import java.util.ArrayList;

public class ArrayList_WrapperClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//JDK 1.44
		int a=10;
		Integer i1=new Integer(a);
		ArrayList mylist=new ArrayList();
		mylist.add(i1);
		Integer i2=new Integer(100);
		mylist.add(i2);
		mylist.add(new Integer(200));
		System.out.println(mylist);
		
		//JDK 1.5
		ArrayList myList1 =new ArrayList();
		mylist.add(100);
		System.out.println(mylist.get(0));

	}

}
