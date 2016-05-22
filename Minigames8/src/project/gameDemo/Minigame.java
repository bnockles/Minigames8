package project.gameDemo;

import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import project.directors.Screen;

public abstract class Minigame {

	public Minigame() {

	}

	public abstract BufferedImage getImage();

	public abstract void paint(Graphics2D g2);

	public abstract void update();

	public abstract int getCounter();

	public boolean determineMatch(Card card1, Card card2,
			ArrayList<Card> twoCard) {
		// TODO Auto-generated method stub
		return false;
	}

	public ArrayList<Card> getDeck() {
		// TODO Auto-generated method stub
		return null;
	}

	public void flipCard(Card card) {
		// TODO Auto-generated method stub
		
	}

}
