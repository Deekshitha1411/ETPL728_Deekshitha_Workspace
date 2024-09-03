package com.evergent.corejava.arrays;

public class DDArray5 {
	public static void main(String args[]) {
		int arr[][]=new int[5][5];
		int c=0;
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				c++;
				arr[i][j]=c;
			}
			
		}
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
