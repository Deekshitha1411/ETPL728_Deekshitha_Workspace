package com.evergent.corejava.interface1;

public class BookImp3 implements Book,NewBook{
	public void bookTitle() {
		System.out.println("core java");
		
	}
	public void bookAuthor() {
		System.out.println("oracle crop");
	}
	public void bookPrice() {
		System.out.println("Rs 550");
	}
	/*public void bookPrice() {
		System.out.println("Rs 550");
	}*/
	
	public void show() {
		System.out.println("local methods of BookImp1");
	}
	public void myNewBook() {
		System.out.println("my new book");
	}
	public void dataInfo() {
		System.out.println("my data info");
	}
	public static void main(String args[]) {
		BookImp3 b3=new BookImp3();
		b3.bookAuthor();
		b3.bookTitle();
		b3.bookPrice();
		b3.show();
		b3.myNewBook();
		b3.dataInfo();
		
	}
	

}
