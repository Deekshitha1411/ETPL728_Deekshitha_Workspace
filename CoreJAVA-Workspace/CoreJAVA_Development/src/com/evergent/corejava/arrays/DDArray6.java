package com.evergent.corejava.arrays;

public class DDArray6 {
public static void main(String args[]) {
	String arr[][]=new String[3][3];
	for(int i=0;i<3;i++) {
		for(int j=0;j<3;j++) {
			arr[i][j]="JAVA";
		}
		
	}
	for(int i=0;i<3;i++) {
		for(int j=0;j<3;j++) {
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
}
}
