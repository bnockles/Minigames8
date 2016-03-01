public class GameboardDemo extends Game {

	public static void main(String[] args) {
		GameboardDemo x = new GameboardDemo();
		
	}
	public GameboardDemo(){
		super();
	}
	
	public void reset(){
		GameSubTeamScreen gameScreen = new GameSubTeamScreen(this);
		setScreen(gameScreen);
	}

}