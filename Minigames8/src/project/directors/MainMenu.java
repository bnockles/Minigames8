package project.directors;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.KeyListener;

import project.menus.GameMenu;

public class MainMenu extends Screen {
	
	GameMenu gameMenu;
	
	public MainMenu(Game game) {
		super(game);
		gameMenu 
	}

	public KeyListener getKeyListener() {
		return null;
	}


	
	public void paintScreen(Graphics2D g2) {
		g2.setColor(Color.blue);
		g2.fillRect(0,0,width,height);
		g2.setColor(Color.white);
		UtilityMethods.centerTextAtY(g2, "You can select a game on this menu.", width, 50);
	}

}
