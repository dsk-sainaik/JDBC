package car;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateCar_c {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/cardb","root","root");
		PreparedStatement preparedStatement= connection.prepareStatement("update car set carstroks=? where carprice='3400000' ");
		preparedStatement.setInt(1, 9);
	
		preparedStatement.execute();
		connection.close();
		System.out.println("update sucess....");

	}

}
