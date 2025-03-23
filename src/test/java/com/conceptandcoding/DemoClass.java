package com.conceptandcoding;
import java.sql.*;
/*
1) Load the jdbc driver
2) Establish a connection
3) Create a statement
4) Execute a query
5) Close the connection
*/

public class DemoClass {
    public static void main(String[] args) {
        String url = "jdbc:mysql://127.0.0.1:3306/learningJ";
        String username = "root";
        String password = "root";
        String query = "INSERT INTO student VALUES (2,'user 2',22);";
        try{
//            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection cn = DriverManager.getConnection(
                    url,username,password
            );
            Statement st = cn.createStatement();
            int count  = st.executeUpdate(query);
            System.out.println("Number of rows affected : "+count);
            st.close();
            cn.close();
            System.out.println("Connection closed");
        } catch (SQLException e) {
            System.err.println("JDBC driver not found"+e.getMessage());
        }

    }
}
