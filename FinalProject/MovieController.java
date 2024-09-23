package com.evergent.corejava.controller;

import java.util.Scanner;

import com.evergent.corejava.service.*;
import com.evergent.corejava.dao.*;
import com.evergent.corejava.bean.*;

public class MovieController {
    public static void main(String args[]) {
        int movieId;
        String movieName, genre;
        double ticketPrice;
        int availableSeats, ch, ch1 = 1;
        Scanner s = new Scanner(System.in);
        MovieService movieService = new MovieService();

        System.out.println("--------------------WELCOME TO MOVIE BOOKING SYSTEM------------------");
        while (ch1 != 0) {
            System.out.println("1. Add a New Movie");
            System.out.println("2. Show Movie Details");
            System.out.println("3. Book Tickets");
            System.out.println("4. Cancel Tickets");
            System.out.println("5. Show All Transactions");
            System.out.println("Enter your choice:");
            ch = s.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("Enter Movie ID:");
                    movieId = s.nextInt();
                    System.out.println("Enter Movie Name:");
                    movieName = s.next();
                    System.out.println("Enter Genre:");
                    genre = s.next();
                    System.out.println("Enter Ticket Price:");
                    ticketPrice = s.nextDouble();
                    System.out.println("Enter Available Seats:");
                    availableSeats = s.nextInt();
                    movieService.addMovie(movieId, movieName, genre, ticketPrice, availableSeats);
                    System.out.println("Movie Added Successfully!");
                    break;

                case 2:
                    System.out.println("Enter Movie ID:");
                    movieId = s.nextInt();
                    movieService.showMovieDetails(movieId);
                    break;

                case 3:
                    System.out.println("Enter Movie ID for Booking:");
                    movieId = s.nextInt();
                    System.out.println("Enter Number of Tickets:");
                    int tickets = s.nextInt();
                    movieService.bookTickets(movieId, tickets);
                    break;

                case 4:
                    System.out.println("Enter Movie ID to Cancel Booking:");
                    movieId = s.nextInt();
                    System.out.println("Enter Number of Tickets to Cancel:");
                    tickets = s.nextInt();
                    movieService.cancelTickets(movieId, tickets);
                    break;

                case 5:
                    System.out.println("Enter Movie ID to See Transactions:");
                    movieId = s.nextInt();
                    movieService.showTransactions(movieId);
                    break;

                default:
                    System.out.println("Enter a Valid Choice");
                    break;
            }
            System.out.println("\nEnter 1 for More Operations and 0 for Exit:");
            ch1 = s.nextInt();
        }
    }
}
