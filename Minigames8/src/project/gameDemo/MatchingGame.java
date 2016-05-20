package project.gameDemo;

import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import java.awt.image.BufferedImage;

import java.util.ArrayList;

import project.directors.UtilityMethods;

public class MatchingGame extends Minigame {

	private BufferedImage image;
	private int width;
	private int height;

	private ArrayList<Card> deck;

	public MatchingGame() {

		deck = new ArrayList<Card>();

		Card c1 = new Card("/images/Cards/back.png", "A");
		Card c2 = new Card("/images/Cards/back.png", "B");
		Card c3 = new Card("/images/Cards/back.png", "C");
		Card c4 = new Card("/images/Cards/back.png", "D");
		Card c5 = new Card("/images/Cards/back.png", "A");
		Card c6 = new Card("/images/Cards/back.png", "B");
		Card c7 = new Card("/images/Cards/back.png", "C");
		Card c8 = new Card("/images/Cards/back.png", "D");
		deck.add(c1);
		deck.add(c2);
		deck.add(c3);
		deck.add(c4);
		deck.add(c5);
		deck.add(c6);
		deck.add(c7);
		deck.add(c8);

		width = 800;
		height = 200;

		image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);

		update();
	}

	public BufferedImage getImage() {
		// TODO Auto-generated method stub
		return image;
	}

	public void paint(Graphics2D g2) {
		// TODO Auto-generated method stub
		int currentY = 30;
		int currentX = 30;
		for (Card p : deck) {
			UtilityMethods.scaleImage(g2, p.getIcon(), currentX, currentY, 72,
					97);
			currentX += 80;
		}
	}

	public final void update() {
		Graphics2D g2 = (Graphics2D) image.getGraphics();
		paint(g2);
	}

	public void flipCard(Card c) {
		
		c.setCardImg("/images/Cards/Ace.png");
		c.changeImg();
		update();
	}
	public void removeCard(Card a, Card b){
		
		
	}
	public void determineMatch(){
		
		
	}
	

	public ArrayList<Card> getDeck() {
		// TODO Auto-generated method stub
		return deck;
	}

}
