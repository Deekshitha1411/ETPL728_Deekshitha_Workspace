package com.evergent.corejava.Final;
class MyClass{
	final public void myProducts() {
		System.out.println("all products");
	}
}

public class FinalDemo2 extends MyClass{
	final String cname="india";
	//public void myProducts() {
		
	//}
	public void myData() {
		System.out.println(cname);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalDemo2 fd1=new FinalDemo2();
		fd1.myData();
		fd1.myProducts();

	}

}
