package com.evergent.corejava.Static;

public class StaticDemo1 {
	static String cname="India";
	static public void myData() {
		System.out.println("My Data");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(StaticDemo1.cname);
		StaticDemo1.myData();

	}

}
