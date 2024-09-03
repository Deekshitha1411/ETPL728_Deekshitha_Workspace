package com.evergent.corejava.strings;

public class StringPerformance2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String series="";
		for(int i=0;i<26;i++)
		{
			char ch=(char)('a'+i);
			series=series+ch;
		}
		System.out.println(series);	}

}
