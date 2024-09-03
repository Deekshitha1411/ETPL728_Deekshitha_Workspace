package com.evergent.corejava.casestudy;


public class KidUsers implements LibraryUser{
	int age;
	String bookType;
	public void registerAccount(int age) {
		this.age=age;
		if(age<12) {
			System.out.println("You have successfully registered under a Kids Account");
		}
		else {
			System.out.println("Sorry, age must be less AboutHandler 12 to register as a kid");
		}
	}
	public void requestBook(String btype) {
		this.bookType=btype;
		if(bookType.equals("kids")) {
			System.out.println("Book Issued successfully, please return the book within 10 days");
		}
		else {
			System.out.println("Oops, you are allowed to take only kids books");
		}
		
	}
	
	

}
