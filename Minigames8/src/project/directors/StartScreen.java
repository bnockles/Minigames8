package project.directors;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class StartScreen extends Screen implements KeyListener{

	public StartScreen(Game game) {
		super(game);
	}

	public KeyListener getKeyListener() {
		return this;
	}

	public void paintScreen(Graphics2D g2) {
		g2.setColor(Color.white);
		g2.fillRect(0, 0, width, height);
		g2.setColor(Color.black);
		UtilityMethods.centerText(g2, "Press spacebar to start", width, height);
	}

	public void keyPressed(KeyEvent k) {
		if(k.getKeyCode() == KeyEvent.VK_SPACE){
			Screen mainMenu = new MainMenu(game);
			game.setScreen(mainMenu);
		}
	}

	public void keyReleased(KeyEvent arg0) {

	}

	public void keyTyped(KeyEvent arg0) {
	}

	
	
	
	
	
	
	
}
