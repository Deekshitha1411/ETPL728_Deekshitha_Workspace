package com.evergent.corejava.Static;

public class StaticDemo5 {
	static {
	System.out.println("static block:open db/network connections");
	}
	static String cname="india";
	static public void myData() {
		System.out.println("my data");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(StaticDemo5.cname);
		StaticDemo5.myData();

	}

}
