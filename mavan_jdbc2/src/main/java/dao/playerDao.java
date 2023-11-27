package dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dto.Player;

public class playerDao {

	public void save(Player player) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/playerdb","root","root");
		CallableStatement callableStatement=connection.prepareCall("call playerdb.insertplayer(?,?,?,?,?,?)");
		callableStatement.setInt(1, player.getPlayerId());
		callableStatement.setString(2,player.getPlayerName());
		callableStatement.setString(3, player.getPlayerTeam());
		callableStatement.setInt(4,player.getPlayerAge());
		callableStatement.setString(5,player.getPlayerType());
		callableStatement.setInt(6,player.getPlayerJurcyNumber());
		callableStatement.execute();
		connection.close();
		System.out.println("suessfulluy saved int db");
		
	}
	
	public void update(Player player)throws ClassNotFoundException, SQLException
	{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/playerdb","root","root");
		CallableStatement callableStatement=connection.prepareCall("call playerdb.updatePlayer(?,?)");
		callableStatement.setString(1, player.getPlayerType());
		callableStatement.setInt(2,player.getPlayerId());
		callableStatement.execute();
		connection.close();
		System.out.println("update sucess");
		
	}
	
	
	public void delete(Player player) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/playerdb","root","root");
	CallableStatement callableStatement=connection.prepareCall("call playerdb.deletePlayer(?)");
	callableStatement.setInt(1,player.getPlayerId());
	callableStatement.execute();
	connection.close();
	System.out.println("delete sucess");
	
	}
	public void getData(Player player) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/playerdb","root","root");
		CallableStatement callableStatement= connection.prepareCall("call playerdb.fetch()");
		ResultSet resultSet=callableStatement.executeQuery();
		while(resultSet.next()) 
		{
			System.out.println( resultSet.getInt(1));
			System.out.println( resultSet.getString(2));
			System.out.println(resultSet.getString(3));
			System.out.println(resultSet.getInt(4));
			System.out.println(resultSet.getString(5));
			System.out.println(resultSet.getInt(6));
		}
		
		
	}
	
	
	
	
	
	
	public void fetchid(Player player) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/playerdb","root","root");
		CallableStatement callableStatement= connection.prepareCall("call playerdb.fetchByid(?)");
		callableStatement.setInt(1, player.getPlayerId());
		ResultSet resultSet=callableStatement.executeQuery();
		while(resultSet.next()) 
		{
			System.out.println( resultSet.getInt(1));
			System.out.println( resultSet.getString(2));
			System.out.println(resultSet.getString(3));
			System.out.println(resultSet.getInt(4));
			System.out.println(resultSet.getString(5));
			System.out.println(resultSet.getInt(6));
		}
		
		
	}
	
	
	
	
	
	
	
	
}
