package com.mobile;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MobileSchema {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","root");
		
		PreparedStatement preparedStatem=connection.prepareStatement("create schema mobiledb");
		preparedStatem.execute();
		connection.close();
		System.out.println("bd created...");
	}

}
