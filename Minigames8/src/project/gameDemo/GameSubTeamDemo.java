package project.gameDemo;
import java.util.Scanner;
import project.directors.Game;
import project.directors.Screen;

public class GameSubTeamDemo extends Game {

	public static void main(String[] args) {
		GameSubTeamDemo x = new GameSubTeamDemo();
		
	}
	public GameSubTeamDemo(){
		super();
	}
	
	public void reset(){
		GameSubTeamScreen gameScreen = new GameSubTeamScreen(this);
		setScreen(gameScreen);
	}

}
