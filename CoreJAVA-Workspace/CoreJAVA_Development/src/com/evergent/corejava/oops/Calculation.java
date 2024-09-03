package com.evergent.corejava.oops;

public class Calculation {
	int a=10,b=20,c;
	public void add() {
		c=a+b;
		System.out.print("addition: "+c);
	}
	public static void main(String args[]) {
		Calculation cal=new Calculation();
		cal.add();
	}
}
