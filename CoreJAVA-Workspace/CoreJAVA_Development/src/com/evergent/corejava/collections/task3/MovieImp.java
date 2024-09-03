package com.evergent.corejava.collections.task3;

import java.util.HashSet;
import java.util.Set;


public class MovieImp implements MovieInterface{
	Set<Movie> movieSet=null;
	public MovieImp() {
		movieSet=new HashSet<Movie>();
	}
	
	@Override
	public String addMovie(Movie m) {
		movieSet.add(m);
		 return m.getMid();
	} 

	@Override
	public void searchByMid(String mid) {
		boolean b=false;
		if(movieSet.size()>0 && movieSet!=null){
			for(Movie movie:movieSet){
				if(movie.getMid().equals(mid)){
					System.out.println(movie.getMid()+" "+movie.getMname()+" "+movie.getTicket_cost());	
					b=true;
					break;	
				}
			}
		}
		if(!b)
			System.out.println("The movie is not found");
			
	}

	@Override
	public void  getAllMovies() {
			if(movieSet.size()>0){
				for(Movie movie:movieSet){
					System.out.println(movie.getMid()+" "+movie.getMname()+" "+movie.getTicket_cost());
				}
					
			}else{
				System.out.println("No movies are available");
			}
	}


}
