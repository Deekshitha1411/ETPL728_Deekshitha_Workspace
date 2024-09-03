package com.evergent.corejava.interface1;

public class BookImp1 implements Book{
	public void bookTitle() {
		System.out.println("core java");
		
	}
	public void bookAuthor() {
		System.out.println("oracle crop");
	}
	public void bookPrice() {
		System.out.println("Rs 550");
	}
	public void show() {
		System.out.println("show method");
	}
	
	public static void main(String args[]) {
		BookImp1 b=new BookImp1();
		b.bookAuthor();
		b.bookTitle();
		b.bookPrice();
		b.show();
		System.out.println(cName);
		
	}
	

}
