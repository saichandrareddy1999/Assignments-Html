package com.stackroute.jdbcdemo;

import java.sql.*;

public class CrudOperation {
    private Connection conn;
    public void displayCustomers(){
    Class.forName("com.mysql.cj.jdbc.Driver");
    System.out.println("Driver loaded");
    conn=DriverManager.getConnection("jdbc:mysql://localhost:3306//customerDB","root","root");
        System.out.println("Driver loaded");
}
}
