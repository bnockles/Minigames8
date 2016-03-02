package project.menus;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import project.directors.Game;
import project.directors.Screen;
import project.directors.StartScreen;
import project.directors.UtilityMethods;

public class MainMenu extends Screen implements KeyListener {
	
	GameMenu gameMenu;
	
	public MainMenu(Game game) {
		super(game);
		//gameMenu();
	}
	
	public void keyPressed(KeyEvent k)
	{
		if(k.getKeyCode() == KeyEvent.VK_ESCAPE){
			
			Screen startScreen = new StartScreen(game);
			game.setScreen(startScreen);
		}
	}

	public KeyListener getKeyListener() {
		return this;
	}

	
	public void paintScreen(final Graphics2D g2) {
		g2.setColor(Color.blue);
		g2.fillRect(0,0,width,height);
		g2.setColor(Color.white);
		UtilityMethods.centerTextAtY(g2, "This will be the game menu where you can save/load data.", width, 50);
		
		
	}

	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
