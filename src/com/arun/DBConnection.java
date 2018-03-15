package com.arun;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private static DBConnection dbConnection;

    public static DBConnection getInstance(){
        if(dbConnection == null){
            dbConnection = new DBConnection();
        }
        return dbConnection;
    }
    Connection connection = null;
    public Connection getConnection() {
        System.out.println("-------- PostgreSQL ------------");

        try {

            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/training", "postgres","admin");

        } catch (ClassNotFoundException e) {

            System.out.println("Include driver!");
            e.printStackTrace();
        } catch (SQLException e) {

            System.out.println("Connection Failed");
            e.printStackTrace();
        }

        if (connection != null) {
            System.out.println("database connected!");
            return  connection;
        } else {
            System.out.println("Failed to make connection!");
            return null;
        }
    }
}
