package com.evergent.corejava.exceptionhandling;

class InvalidScoreException extends RuntimeException{
	public InvalidScoreException(String message) {
		super(message);
	}
}
public class UserDefinedException12 {
	public static void validatescore(int score)//throws InvalidScoreException
	{
		if(score<0||score>100) {
			throw new InvalidScoreException("score must be between 0 and 100");
		}
		else {
			System.out.println("score is valid");
		}
	}

	public static void main(String[] args) {
		try {
			validatescore(110);
		}
		catch(InvalidScoreException e) {
			System.out.println("caught Exception: "+e.getMessage());
			System.out.println(e.toString());
			System.out.println(e);
		}
		System.out.println("program continues after handling the exception");
		
	}

}
