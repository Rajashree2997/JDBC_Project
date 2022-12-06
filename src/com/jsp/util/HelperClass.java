package com.jsp.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class HelperClass {

	
	 String url="jdbc:mysql://localhost:3306/javabatch";
     String username="root";
     String password="root";
     
     public Connection getConnection() {
    	 Connection connection=null;
    	 try {
        	 //load/Register the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//To establish the connection
			connection =DriverManager.getConnection(url,username,password);
			
			
			} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  catch(SQLException e) {
			e.printStackTrace();
    	 
     }
    	 return connection;
     }
}
