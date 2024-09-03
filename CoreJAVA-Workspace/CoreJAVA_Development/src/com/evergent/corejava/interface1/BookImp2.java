package com.evergent.corejava.interface1;

public class BookImp2 implements Book{
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
		System.out.println("local methods of BookImp1");
	}
	public static void main(String args[]) {
		//Book b2=new Book();
		Book b2=new BookImp2();
		b2.bookAuthor();
		b2.bookTitle();
		b2.bookPrice();
		System.out.println(cName);
		//b2.show();
	}
	

}
