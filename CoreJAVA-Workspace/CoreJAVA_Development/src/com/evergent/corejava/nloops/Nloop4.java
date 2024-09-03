package com.evergent.corejava.nloops;

public class Nloop4 {
	public static void main(String args[]) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(j<=i) {
				System.out.print(i);
				}
				
			}
			System.out.println();
		}
		for(int i=4;i>0;i--) {
			for(int j=4;j>0;j--) {
				if(j<=i) {
					System.out.print(i);
				}
			}
			System.out.println();
		}
		}

}
