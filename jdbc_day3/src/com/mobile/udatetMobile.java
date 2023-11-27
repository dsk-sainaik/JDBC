package com.mobile;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class udatetMobile {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mobiledb","root","root");
		PreparedStatement preparedStatement=connection.prepareStatement(" delete from mobile where  mobileid=?");
		preparedStatement.setInt(1,2);
	

		preparedStatement.execute();
		connection.close();
		System.out.println("deleted");
	}

}
