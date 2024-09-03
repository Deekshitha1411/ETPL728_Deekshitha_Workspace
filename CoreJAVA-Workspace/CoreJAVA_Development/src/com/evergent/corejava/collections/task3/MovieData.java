package com.evergent.corejava.collections.task3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.evergent.corejava.collections.task2.Book;
import com.evergent.corejava.collections.task2.BookImp;
import com.evergent.corejava.collections.task2.BookInterface;


public class MovieData{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		MovieInterface movie=new MovieImp();
		for(;;){
			System.out.println("1. Add Movie 2.Search by Movie-ID(mid) 3.displayAll 4. exit");
			int no=sc.nextInt();
			switch(no){
			case 1:System.out.println("Enter the mid");
				   String mid=sc.next();
				   System.out.println("Enter the movie name");
				   String mname=sc.next();
				   System.out.println("Enter the ticket cost");
				   int price=sc.nextInt();
				   Movie b=new Movie();
				   b.setMid(mid);
				   b.setMname(mname);
				   b.setTicket_cost(price);
				   String message=movie.addMovie(b);
				   System.out.println(message);
				   break;
			case 2:System.out.println("Enter the mid");
			   	   String md=sc.next();
			   	   movie.searchByMid(md);
			   	   break;
			  			
			case 3:movie.getAllMovies();
				break;
			case 4:System.exit(0);
			}
			
		}
	}
}
	
