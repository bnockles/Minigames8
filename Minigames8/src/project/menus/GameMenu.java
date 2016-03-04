package project.menus;

import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import project.directors.*;


public class GameMenu extends Screen{
	
	public static final int GAME_STATUS_OFF = 0;
	public static final int GAME_STATUS_ON = 1;
	
	
	
	public GameMenu(Game game){
		super(game);
	}
	
	public void keyPressed(KeyEvent k)
	{
		/**if(k.getKeyCode() == KeyEvent.VK_1){
			
			Screen startScreen = new StartScreen(game);
			game.setScreen(startScreen);
		}**/

	}

	public KeyListener getKeyListener() {
		// TODO Auto-generated method stub
		return null;
	}

	public void paintScreen(Graphics2D g2) {
		// TODO Auto-generated method stub
		
	}
}
