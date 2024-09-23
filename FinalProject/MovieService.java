package com.evergent.corejava.service;

import com.evergent.corejava.bean.*;
import com.evergent.corejava.controller.*;
import com.evergent.corejava.dao.*;

public class MovieService {
    MovieDAO movieDAO = new MovieDAO();
    String transaction = "";

    public void addMovie(int movieId, String movieName, String genre, double ticketPrice, int availableSeats) {
        MovieBean movie = new MovieBean();
        movie.setMovieId(movieId);
        movie.setMovieName(movieName);
        movie.setGenre(genre);
        movie.setTicketPrice(ticketPrice);
        movie.setAvailableSeats(availableSeats);
        movieDAO.addMovie(movie);
        transaction = "Added Movie: " + movieName;
        movieDAO.addTransaction(movieId, transaction);
    }

    public void showMovieDetails(int movieId) {
        MovieBean movie = movieDAO.getMovieDetails(movieId);
        System.out.println("Movie Details:\nMovie Name: " + movie.getMovieName() + "\nGenre: " + movie.getGenre() +
                           "\nTicket Price: " + movie.getTicketPrice() + "\nAvailable Seats: " + movie.getAvailableSeats());
    }

    public void bookTickets(int movieId, int tickets) {
        MovieBean movie = movieDAO.getMovieDetails(movieId);
        int availableSeats = movie.getAvailableSeats();
        if (tickets > availableSeats) {
            System.out.println("Not enough seats available.");
        } else {
            movieDAO.updateAvailableSeats(movieId, availableSeats - tickets);
            transaction = "Booked " + tickets + " tickets for Movie: " + movie.getMovieName();
            movieDAO.addTransaction(movieId, transaction);
            System.out.println("Tickets booked successfully.");
        }
    }

    public void cancelTickets(int movieId, int tickets) {
        MovieBean movie = movieDAO.getMovieDetails(movieId);
        int availableSeats = movie.getAvailableSeats();
        movieDAO.updateAvailableSeats(movieId, availableSeats + tickets);
        transaction = "Cancelled " + tickets + " tickets for Movie: " + movie.getMovieName();
        movieDAO.addTransaction(movieId, transaction);
        System.out.println("Tickets cancelled successfully.");
    }

    public void showTransactions(int movieId) {
        String transactions = movieDAO.getTransactions(movieId);
        if (transactions != null && !transactions.isEmpty()) {
            System.out.println("Transaction History for Movie ID " + movieId + ":\n" + transactions);
        } else {
            System.out.println("No transactions found for Movie ID " + movieId);
        }
    }
}