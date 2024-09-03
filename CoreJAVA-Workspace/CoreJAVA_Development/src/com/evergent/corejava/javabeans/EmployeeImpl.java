package com.evergent.corejava.javabeans;

public class EmployeeImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp=new Employee();
		emp.setEno(100);
		emp.setEname("sai");
		emp.setSal(50000);
		
		System.out.println("employee no: "+emp.getEno());
		System.out.println("employee name: "+emp.getEname());
		System.out.println("employee sal: "+emp.getSal());
		

	}

}
