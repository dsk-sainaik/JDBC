package controler;

import java.sql.SQLException;
import java.util.Scanner;

import dao.playerDao;
import dto.Player;

			//insert
public class PlayerControler {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter player id");
		int id=scanner.nextInt();
		
		System.out.println("enter player name");
		String name=scanner.next();
		
		System.out.println("enter player team");
		String team=scanner.next();
		System.out.println("enter player age");
		int age=scanner.nextInt();
		System.out.println("enter player type");
		String type=scanner.next();
		System.out.println("enter player jurcy number");
		int jc=scanner.nextInt();
		Player player=new Player();
		player.setPlayerId(id);
		player.setPlayerName(name);
		player.setPlayerTeam(team);
		player.setPlayerAge(age);
		player.setPlayerType(type);
		player.setPlayerJurcyNumber(jc);
		playerDao playerDao=new playerDao();
		playerDao.save(player);
	}

}
