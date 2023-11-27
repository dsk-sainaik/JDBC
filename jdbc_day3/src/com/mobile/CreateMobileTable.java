package com.mobile;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CreateMobileTable {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mobiledb","root","root");
		PreparedStatement preparedStatement=connection.prepareStatement(" create table mobile(mobileId int,mobileBrand varchar(15),mobilePrice double,mobileColour varchar(20),mobileRam int)");
		preparedStatement.execute();
		connection.close();
		System.out.println("table created");
	}

}
