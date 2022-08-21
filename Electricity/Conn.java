package Electricity;

import java.sql.*;

public class Conn {
    Connection c; //helps to establish a connection with the database
    Statement s;  //define the methods that enable to send SQL commands and receive data from database

    public Conn(){
        try{
            c = DriverManager.getConnection("jdbc:sqlite:D:\\Database\\ebsDB.db");  //used to establish connection with the given database URL
            s = c.createStatement(); //creates a statement object for sending SQL statements to the database.
        }
        catch(SQLException e){
            System.out.println(e);
        }
    }

    public void close() throws SQLException {
        s.close();
        c.close();
    }
}
