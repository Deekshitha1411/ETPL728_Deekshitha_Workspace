package com.evergent.corejava.exceptionhandling;
class AgeNotFoundException extends Exception{
	public AgeNotFoundException(String message) {
		System.out.println("you are "+message);
	}
}

public class VotingAge {
	int age=10;
	public void myData() throws AgeNotFoundException{
		if(age<18)
			throw new AgeNotFoundException("not eligible to vote");
		else
			System.out.println("eligible to vote");
	}
	

	public static void main(String[] args) {
		try {
			VotingAge age1=new VotingAge();
			age1.myData();
		}
		catch(AgeNotFoundException e) {
			System.out.println(e);
		}
		
		

	}

}
