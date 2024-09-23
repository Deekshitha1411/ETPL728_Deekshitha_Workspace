package com.evergent.corejava.dao;
import java.sql.Connection;
import java.sql.DriverManager;

public class MovieDBConnection {
    private static Connection con;

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/moviedb", "root", "admin");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}
