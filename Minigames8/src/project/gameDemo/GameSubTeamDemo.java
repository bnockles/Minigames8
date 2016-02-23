package project.gameDemo;

import project.directors.Game;
import project.directors.Screen;

public class GameSubTeamDemo extends Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameSubTeamDemo x = new  GameSubTeamDemo();
	}
	public GameSubTeamDemo(){
		super();
	}
	
	public void reset(){
		GameSubTeamScreen gameScreen = new GameSubTeamScreen(this);
		setScreen(gameScreen);
	}

}
