package com.me;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo1 {

	public static void main(String[] args) {
		
		Connection connection=null;
		try{
			//Step 1 - Load Driver 
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded successfully");
			
			//Step 2 - Open Connection
			String url="jdbc:mysql://localhost:3306/rev_india";
			String username="root";
			String password="Kantidas69@";
			connection=DriverManager.getConnection(url, username, password);
			System.out.println("Connection established");
			
			//Step 3 - Create Statement
			Statement statement=connection.createStatement();
			String sql="Select id,name,age,gender,city,sportsName,contact from player";
			
			//Step 4 - Execute Query
			ResultSet resultset=statement.executeQuery(sql);
			System.out.println("Query executed successfully");
			
			//Step 5 - Process Results
			while(resultset.next())
			{
				System.out.print("Id : "+resultset.getInt("id"));
				System.out.print("Name : "+resultset.getString("name"));
				System.out.print("Gender : "+resultset.getString("gender"));
				System.out.print("City : "+resultset.getString("city"));
				System.out.print("Sports Name : "+resultset.getString("sportsName"));
				System.out.print("Age : "+resultset.getInt("age"));
				System.out.println("Contact : "+resultset.getLong("contact"));
			}
			System.out.println("Results processed");
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				//Step 6 - Close connection
				connection.close();
				System.out.println("Connection closed");
			} catch (SQLException e) {
				System.out.println(e);
			}
		}

	}

}
