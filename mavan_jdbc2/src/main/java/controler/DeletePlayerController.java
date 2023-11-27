package controler;

import java.sql.SQLException;
import java.util.Scanner;

import dao.playerDao;
import dto.Player;

public class DeletePlayerController {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter id to delete");
	int id= scanner.nextInt();
	Player player=new Player();
	player.setPlayerId(id);
	playerDao playerDao=new playerDao();
	playerDao.delete(player);

	}

}
