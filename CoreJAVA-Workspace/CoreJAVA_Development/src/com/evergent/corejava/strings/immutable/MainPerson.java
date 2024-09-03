package com.evergent.corejava.strings.immutable;


public  class MainPerson {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonImmutable p=new PersonImmutable("Raju",30);
		System.out.println("name:"+p.myName());
		System.out.println("age:"+p.myAge());
		
		

	}

}
