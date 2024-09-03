package com.evergent.corejava.exceptionhandling;
class ProductNotFoundException extends Exception{
	public ProductNotFoundException(String message) {
		System.out.println("hello:"+message);
	}
}

public class ProductImpl {
	int pno=105;
	public void myData() throws ProductNotFoundException{
		if(pno>100)
			throw new ProductNotFoundException("there are no products");
		else
			System.out.println("products are there");
	}
	

	public static void main(String[] args) {
		try {
			ProductImpl product1=new ProductImpl();
			product1.myData();
		}
		catch(ProductNotFoundException e) {
			System.out.println(e);
		}
		
		

	}

}
