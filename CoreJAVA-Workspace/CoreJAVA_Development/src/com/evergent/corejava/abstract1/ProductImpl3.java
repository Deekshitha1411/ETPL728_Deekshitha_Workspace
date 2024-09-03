package com.evergent.corejava.abstract1;

public class ProductImpl3 extends Product3 {
	public ProductImpl3() {
		System.out.println("sub class constructor");
	}
	public void newProducts() {
		System.out.println("new products");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductImpl3 p3=new ProductImpl3();
		p3.allProducts();
		p3.newProducts();
		
		

	}

}
