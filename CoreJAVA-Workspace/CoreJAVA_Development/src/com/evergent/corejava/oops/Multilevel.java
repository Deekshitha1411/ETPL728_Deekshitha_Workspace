package com.evergent.corejava.oops;

class PersonData {
	public void myPersonData() {
		System.out.println("Person data class method");
	}
}
class PersonInfo extends PersonData{
	public void myDetails() {
		System.out.println("PersonInfo class method");
	}
}
public class Multilevel extends PersonInfo{
	public void show() {
		System.out.println("local method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multilevel ml=new Multilevel();
		ml.myPersonData();
		ml.myDetails();
		ml.show();

	}

}
