package com.evergent.corejava.strings;

public class StringBuilderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb=new StringBuilder("hello");
		System.out.println("initial string "+sb);
		sb.append("world");
		System.out.println("after appending "+sb);
		sb.insert(6, "beautiful");
		System.out.println("after inserting "+sb);
		sb.replace(0, 5, "hi");
		System.out.println("after replacing "+sb);
		sb.delete(0, 3);
		System.out.println("after deleting "+sb);
		sb.reverse();
		System.out.println(sb);
		System.out.println(sb.capacity());
		System.out.println(sb.length());

	}

}
