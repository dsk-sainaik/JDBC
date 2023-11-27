package controler;

import java.sql.SQLException;
import java.util.Scanner;

import dao.playerDao;
import dto.Player;

public class FetchPlayerControler {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
		Player player=new Player();
		playerDao playerDao=new playerDao();
		playerDao.getData(player);
		
	}

}
