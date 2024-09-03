package com.evergent.corejava.exceptionhandling;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class CompileTimeFileDemo15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			File f = new File("C:\\Users\\deekshitha.putta\\Documents\\FileNotFoundException.txt");
			
			Scanner scanner=new Scanner(f);
			while(scanner.hasNextLine()){
				System.out.println(scanner.nextLine());
			}
			scanner.close();
		}

		catch(FileNotFoundException e) {
			System.out.println("File not found: "+e.getMessage());
			e.printStackTrace();
		}
	}

}
