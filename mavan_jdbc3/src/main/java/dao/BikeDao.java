package dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import dto.Bike;

public class BikeDao {

	public void save(Bike bike) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/bikedb","root","root");
		CallableStatement callableStatement=connection.prepareCall("call bikedb.insert(?,?,?,?,?,?)");
		callableStatement.setInt(1, bike.getBikeId());
		callableStatement.setString(2,bike.getBikeName());
		callableStatement.setString(3, bike.getColour());
		callableStatement.setString(4,bike.getBikeType());
		callableStatement.setInt(5,bike.getPrice());
		callableStatement.setInt(6, bike.getBikecc());
		callableStatement.execute();
		connection.close();
		System.out.println("insert sucess");
	}
}
