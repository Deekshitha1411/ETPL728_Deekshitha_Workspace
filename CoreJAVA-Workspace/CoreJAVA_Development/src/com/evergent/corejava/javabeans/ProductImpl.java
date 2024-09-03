package com.evergent.corejava.javabeans;

public class ProductImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product product=new Product(10, "laptop", 85000);
		System.out.println("product no: "+product.getPno());
		System.out.println("product name: "+product.getPname());
		System.out.println("product price: "+product.getPrice());

	}

}
