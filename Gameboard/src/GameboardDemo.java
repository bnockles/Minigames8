import java.awt.Graphics2D;
import java.net.URL;

import javax.imageio.ImageIO;

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