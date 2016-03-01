package project.gameDemo;
import project.directors.Game;


public class GameSubTeamDemo extends Game {

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
