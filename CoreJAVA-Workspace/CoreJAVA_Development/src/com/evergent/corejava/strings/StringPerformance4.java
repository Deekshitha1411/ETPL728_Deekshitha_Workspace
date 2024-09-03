package com.evergent.corejava.strings;

import java.util.Arrays;

public class StringPerformance4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="JavaTechnologies";
		System.out.println(Arrays.toString(name.toCharArray()));
		System.out.println(name.indexOf('T'));
		System.out.println("    JAVA    ".strip());
		System.out.println(name.toString());

	}

}
