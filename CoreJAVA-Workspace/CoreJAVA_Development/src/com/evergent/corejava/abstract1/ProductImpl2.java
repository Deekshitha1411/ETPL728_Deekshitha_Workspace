package com.evergent.corejava.abstract1;

public class ProductImpl2 extends Product{
	public void newProduct() {
		System.out.println("my new products");
	}
	public void show() {
		System.out.println("local methods");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p=new ProductImpl2();
		//p.show();
		p.newProduct();
		p.allProducts();
		

	}

}
