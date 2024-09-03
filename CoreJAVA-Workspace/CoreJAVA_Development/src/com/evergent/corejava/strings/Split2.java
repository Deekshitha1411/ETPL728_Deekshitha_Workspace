package com.evergent.corejava.strings;

public class Split2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="java is a powerful language";
		String[] words=str.split(" ");
		for(String w:words) {
			System.out.println(w);
		}

	}

}
