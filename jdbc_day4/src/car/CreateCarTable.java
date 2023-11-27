package car;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CreateCarTable {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/cardb","root","root");
		PreparedStatement preparedStatement= connection.prepareStatement("create table car(carId int,carBrand varchar(15),carPrice int,carColor varchar(15),carEingneType varchar(15),carStroks int,carSet int)");
		preparedStatement.execute();
		connection.close();
		System.out.println("car table created...");
	}

}
