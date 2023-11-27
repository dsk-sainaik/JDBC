package com.mobile;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertMobile {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mobiledb","root","root");
		PreparedStatement preparedStatement=connection.prepareStatement(" insert into mobile values(?,?,?,?,?)");
		preparedStatement.setInt(1, 2);
		preparedStatement.setString(2,"vivo");
		preparedStatement.setDouble(3, 15000);
		preparedStatement.setString(4, "green");
		preparedStatement.setString(5, "512gb");
		preparedStatement.execute();
		connection.close();
		System.out.println("inserted");
	}

}
