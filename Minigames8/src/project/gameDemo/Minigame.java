package project.gameDemo;

import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;

import project.directors.Screen;

public class Minigame implements KeyListener, GameType {
	MatchingGame mG;
	RacingGame rG;
	private BufferedImage image;

	public Minigame() {
		
	}

	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		int k = arg0.getKeyCode();
		if (k == KeyEvent.VK_Q) {

		}
	}

	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	public BufferedImage getImage() {
		// TODO Auto-generated method stub
		return image;
	}

	public void update() {
		// TODO Auto-generated method stub
		Graphics2D g2 = (Graphics2D) image.getGraphics();
		paint(g2);
	}

	private void paint(Graphics2D g2) {
		// TODO Auto-generated method stub
		
	}

	public Screen getScreen() {
		// TODO Auto-generated method stub
		return null;
	}





}
