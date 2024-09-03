package com.evergent.corejava.oops;

public class MethodFlow {
	public void display(){
		System.out.println("hi");
	}
	public void add(int a,int b) {
		System.out.println(a+b);
	}
	public int myData(int a,int b) {
		return a*b;
	}
	public int myChange() {
		return 100;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodFlow mf=new MethodFlow();
		mf.display();
		mf.add(10,5);
		int t=mf.myData(5,5);
		System.out.println(t);
		int k=mf.myChange();
		System.out.println(k);

	}

}
