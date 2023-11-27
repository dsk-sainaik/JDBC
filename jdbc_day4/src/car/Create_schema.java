package car;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Create_schema {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","root");
			
			PreparedStatement preparedStatem=connection.prepareStatement("create schema cardb");
			preparedStatem.execute();
			connection.close();
			System.out.println("carbd sucessfully created...");
	}

}
