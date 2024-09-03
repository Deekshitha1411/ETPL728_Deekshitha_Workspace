package com.evergent.corejava.wrapperclasses;

public class WrapperClassDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float f1=4.5f;
		Float f2=new Float(f1);
		float f3=f2.floatValue();
		
		double d1=799.89;
		Double d2=new Double(d1);
		double t2=d2.doubleValue();
		
		byte b1=10;
		Byte b2=new Byte(b1);
		byte bb3=b2.byteValue();
		
		System.out.println("int value: "+f1);
		System.out.println("int object value is: "+f2);
		System.out.println("convert integer obj values is primitive: "+f3);
		
		System.out.println("double value: "+d1);
		System.out.println("double obj value: "+d2);
		System.out.println("convert double obj val to primitive: "+t2);
		
		System.out.println("byte vaue: "+b1);
		System.out.println("byte object value: "+b2);
		System.out.println("success: "+bb3);

	}

}
