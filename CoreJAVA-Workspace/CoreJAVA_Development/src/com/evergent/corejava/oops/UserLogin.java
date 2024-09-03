package com.evergent.corejava.oops;

public class UserLogin {
	public void loginData() {
	System.out.println("login info");
	}
	public void loginData(String name,String pass) {
		System.out.println("uname"+name);
		System.out.println("pass"+pass);
	}
	public void loginData(String name,String pass,String captcha) {
		System.out.println("uname"+name);
		System.out.println("pass"+pass);
		System.out.println("captcha"+captcha);
	}
	public int loginData(int mobile,String pass) {
		System.out.println("mobile"+mobile);
		System.out.println("pass"+pass);
		return 0;
	}
	public void show() {
		System.out.println("show method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserLogin login=new UserLogin();
		login.loginData();
		login.loginData("raj","raj123");
		login.loginData("ravi","ravi123","abc");
		login.loginData(123456789,"welcome");
		login.show();

	}

}
