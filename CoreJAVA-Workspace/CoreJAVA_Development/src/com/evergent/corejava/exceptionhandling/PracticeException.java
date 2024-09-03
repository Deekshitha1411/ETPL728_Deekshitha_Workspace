package com.evergent.corejava.exceptionhandling;
class Shuttle_RouteNotFoundException extends Exception{
	public Shuttle_RouteNotFoundException(String message) {
		super(message);
	}
}

public class PracticeException{
	
	public static void myRoute(String destination)throws Shuttle_RouteNotFoundException
	{ 
		String area="kphb";
		if(!area.equals(destination)) {
			throw new Shuttle_RouteNotFoundException("Cab not found");
		}
		else {  
			System.out.println("cab found");
		}
		
	}
	

	public static void main(String[] args) {
		try {
			myRoute("alwal");
		}
		catch(Shuttle_RouteNotFoundException e) {
			System.out.println("caught Shuttle_RouteNotFoundException: "+e.getMessage());
		}

	}

}
