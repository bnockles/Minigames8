package project.gameDemo;
import java.util.Scanner;
import project.directors.Game;
import project.directors.Screen;

public class GameSubTeamDemo extends Game {

	public static void main(String[] args) {
		GameSubTeamDemo x = new  GameSubTeamDemo();
		// carmen
		PlayerInfo Carmen = new PlayerInfo();
		PlayerInfo Celina = new PlayerInfo();
		PlayerInfo Cindy = new PlayerInfo();
		PlayerInfo Radhika = new PlayerInfo();
		
		Carmen.score = 10;
		Carmen.playerVisibility = true;
		Celina.score = 21;
		Celina.playerVisibility = true;
		Cindy.score = 8;
		Cindy.playerVisibility = true;
		Radhika.score = 56;
		Radhika.playerVisibility = true;
		
		
	}
	public GameSubTeamDemo(){
		super();
	}
	
	public void reset(){
		GameSubTeamScreen gameScreen = new GameSubTeamScreen(this);
		setScreen(gameScreen);
	}

}
