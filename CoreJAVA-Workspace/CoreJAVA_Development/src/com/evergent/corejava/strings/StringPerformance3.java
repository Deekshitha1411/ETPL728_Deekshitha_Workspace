package com.evergent.corejava.strings;

public class StringPerformance3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder bul=new StringBuilder();
		for(int i=0;i<26;i++)
		{
			char ch=(char)('a'+i);
			bul.append(ch);
			
			System.out.print(ch);
		}
		

}
}
