package project.gameDemo;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import project.directors.Game;
import project.directors.Screen;


public class GameSubTeamDemo extends Game{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3663230504773952092L;

	public static void main(String[] args) {
		new GameSubTeamDemo();
		
	}
	public GameSubTeamDemo(){
		super();
	}
	
	public void reset(){
		GameSubTeamScreen gameScreen = new GameSubTeamScreen(this);
		setScreen(gameScreen);
	}
	
	
	
	
	
	

}
