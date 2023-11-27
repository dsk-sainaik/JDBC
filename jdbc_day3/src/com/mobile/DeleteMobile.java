package com.mobile;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteMobile {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mobiledb","root","root");
		PreparedStatement preparedStatement=connection.prepareStatement(" update mobile set mobileBrand=? where mobileid=2");
		preparedStatement.setString(1, "samsung");
	

		preparedStatement.execute();
		connection.close();
		System.out.println("updated");
	}

}
