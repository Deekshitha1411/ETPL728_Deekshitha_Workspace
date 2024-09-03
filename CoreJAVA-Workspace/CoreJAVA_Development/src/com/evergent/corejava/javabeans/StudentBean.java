package com.evergent.corejava.javabeans;

import java.io.Serializable;

public class StudentBean implements Serializable{
	private String sname;
	private int sno;
	private String addressString;
	
	public void setSname(String sname) {
		this.sname = sname;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public void setAddressString(String addressString) {
		this.addressString = addressString;
	}
	
	public String toString() {
		return "Student no: "+sno+"\nStudent Name: "+sname+"\nStudent Address: "+addressString;
	}
	
	

}
