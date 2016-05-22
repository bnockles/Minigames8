package project.gameDemo;

import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Collections;

import project.directors.UtilityMethods;

public class MatchingGame extends Minigame {

	private BufferedImage image;
	private int width;
	private int height;

	private ArrayList<Card> deck;
	private int counter = 0;

	public MatchingGame() {

		deck = new ArrayList<Card>();

		Card c1 = new Card("/images/Cards/back.png", "Ace", false);
		Card c2 = new Card("/images/Cards/back.png", "King", false);
		Card c3 = new Card("/images/Cards/back.png", "Queen", false);
		Card c4 = new Card("/images/Cards/back.png", "Jack", false);
		Card c5 = new Card("/images/Cards/back.png", "Ace", false);
		Card c6 = new Card("/images/Cards/back.png", "King", false);
		Card c7 = new Card("/images/Cards/back.png", "Queen", false);
		Card c8 = new Card("/images/Cards/back.png", "Jack", false);

		deck.add(c1);
		deck.add(c2);
		deck.add(c3);
		deck.add(c4);
		deck.add(c5);
		deck.add(c6);
		deck.add(c7);
		deck.add(c8);
		Collections.shuffle(deck);
		width = 800;
		height = 200;

		image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);

		update();
	}

	public BufferedImage getImage() {

		return image;
	}

	public void paint(Graphics2D g2) {

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
		if (c.getletter().equals("Ace")) {
			c.setCardImg("/images/Cards/Ace.png");
		}
		if (c.getletter().equals("King")) {
			c.setCardImg("/images/Cards/King.png");
		}
		if (c.getletter().equals("Queen")) {
			c.setCardImg("/images/Cards/Queen.png");
		}
		if (c.getletter().equals("Jack")) {
			c.setCardImg("/images/Cards/Jack.png");
		}
		c.setFace(true);
		c.changeImg();

	}

	public int getCounter() {
		return counter;
	}

	public boolean determineMatch(Card a, Card b, ArrayList<Card> deck) {

		if (a.getletter().equals(b.getletter())) {
			deck.remove(0);
			deck.remove(0);
			a.setCardImg("/images/Cards/gone.png");
			b.setCardImg("/images/Cards/gone.png");
			a.changeImg();
			b.changeImg();
			counter += 2;
			return true;
		}

		else {
			flipBack(a, b);
			deck.remove(0);
			deck.remove(0);

		}
		a.changeImg();
		b.changeImg();
		return false;

	}

	private void flipBack(Card a, Card b) {
	
		a.setCardImg("/images/Cards/back.png");
		a.setFace(false);
		b.setCardImg("/images/Cards/back.png");
		b.setFace(false);
		a.changeImg();
		b.changeImg();

	}

	public String getCard(Card c) {
		return "The card is " + c.getletter();
	}

	public ArrayList<Card> getDeck() {

		return deck;
	}

}
