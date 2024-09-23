package com.evergent.corejava.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.evergent.corejava.bean.*;

public class MovieDAO {
    Connection con = null;
    PreparedStatement pstmt = null;

    public int addMovie(MovieBean movie) {
        try {
            con = MovieDBConnection.getConnection();
            String sql = "INSERT INTO movies (movieId, movieName, genre, ticketPrice, availableSeats) VALUES (?, ?, ?, ?, ?)";
            pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, movie.getMovieId());
            pstmt.setString(2, movie.getMovieName());
            pstmt.setString(3, movie.getGenre());
            pstmt.setDouble(4, movie.getTicketPrice());
            pstmt.setInt(5, movie.getAvailableSeats());
            int result = pstmt.executeUpdate();
            con.close();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public MovieBean getMovieDetails(int movieId) {
        try {
            con = MovieDBConnection.getConnection();
            String sql = "SELECT * FROM movies WHERE movieId = ?";
            pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, movieId);
            ResultSet rs = pstmt.executeQuery();
            MovieBean movie = new MovieBean();
            if (rs.next()) {
                movie.setMovieId(rs.getInt("movieId"));
                movie.setMovieName(rs.getString("movieName"));
                movie.setGenre(rs.getString("genre"));
                movie.setTicketPrice(rs.getDouble("ticketPrice"));
                movie.setAvailableSeats(rs.getInt("availableSeats"));
            }
            con.close();
            return movie;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public int updateAvailableSeats(int movieId, int seats) {
        try {
            con = MovieDBConnection.getConnection();
            String sql = "UPDATE movies SET availableSeats = ? WHERE movieId = ?";
            pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, seats);
            pstmt.setInt(2, movieId);
            int result = pstmt.executeUpdate();
            con.close();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public void addTransaction(int movieId, String transaction) {
        try {
            con = MovieDBConnection.getConnection();
            String sql = "INSERT INTO transactions (movieId, transaction) VALUES (?, ?)";
            pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, movieId);
            pstmt.setString(2, transaction);
            pstmt.executeUpdate();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getTransactions(int movieId) {
        try {
            con = MovieDBConnection.getConnection();
            String sql = "SELECT transaction FROM transactions WHERE movieId = ?";
            pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, movieId);
            ResultSet rs = pstmt.executeQuery();
            StringBuilder transactions = new StringBuilder();
            while (rs.next()) {
                transactions.append(rs.getString("transaction")).append("\n");
            }
            con.close();
            return transactions.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}