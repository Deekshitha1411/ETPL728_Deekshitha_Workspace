package com.evergent.corejava.strings;

public class Split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="java is a powerful language";
		String[] words=str.split(" ");
		for(int i=0;i<words.length;i++) {
			System.out.println(words[i]);
		}

	}

}
