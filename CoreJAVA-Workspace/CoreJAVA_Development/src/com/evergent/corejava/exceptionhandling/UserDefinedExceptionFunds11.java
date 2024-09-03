package com.evergent.corejava.exceptionhandling;

class InsufficientFundsException extends Exception{
	public InsufficientFundsException(String message) {
		super(message);
	}
}
public class UserDefinedExceptionFunds11 {
	public static void withdraw(double amount)//throws Exception
	{
		try {
		double balance=500.0;
		if(amount>balance) {
			throw new InsufficientFundsException("insufficient funds for withdrawal");
		}
		else {
			System.out.println("withdrawal successfull");
		}
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) {
		
			withdraw(600.0);
		
		System.out.println("program continues after handling the exception");
		
	}

}
