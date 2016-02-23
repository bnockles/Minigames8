package project.gameDemo;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import project.directors.Game;
import project.directors.Screen;

public class GameSubTeamScreen extends Screen implements KeyListener {

	public GameSubTeamScreen(Game game) {
		super(game);
		// TODO Auto-generated constructor stub
	}

	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public KeyListener getKeyListener() {
		// TODO Auto-generated method stub
		return null;
	}

	public void paintScreen(Graphics2D g2) {
		// TODO Auto-generated method stub
		g2.setColor(Color.black);
		g2.drawString("This Demo is working!", 30, 75);
	}

}
