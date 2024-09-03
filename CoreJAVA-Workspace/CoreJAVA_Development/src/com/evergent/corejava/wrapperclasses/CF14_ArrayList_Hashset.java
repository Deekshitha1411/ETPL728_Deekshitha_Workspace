package com.evergent.corejava.wrapperclasses;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CF14_ArrayList_Hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>list=new ArrayList<>();
		list.add("core java");
		list.add("J2EE");
		list.add("J2SE");
		list.add("myjava");
		System.out.println(list);
		
		Set<String>s1=new HashSet<>();
		s1.add("core java");
		s1.add("J2EE");
		s1.add("J2SE");
		s1.add("myjava");
		s1.add("core java");
		
		if (list.equals(s1)) {
			System.out.println("same");
		}
		else {
			System.out.println("not same");
		}
		System.out.println(list.contains(s1));
	}

}
