package controler;

import java.sql.SQLException;
import java.util.Scanner;

import dao.playerDao;
import dto.Player;

			//insert
public class UpdatePlayerControler {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter player id");
		int id=scanner.nextInt();
		

		System.out.println("enter player type");
		String type=scanner.next();

		Player player=new Player();
		player.setPlayerId(id);
		
		player.setPlayerType(type);
		
		playerDao playerDao=new playerDao();
		playerDao.update(player);	
		
	}

}
