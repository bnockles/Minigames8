package project.gameDemo;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.net.URL;
import java.util.ArrayList;

import javax.imageio.ImageIO;

import project.directors.UtilityMethods;

public class MatchingGame extends Minigame implements MouseListener {

	private BufferedImage image;
	private int width;
	private int height;

	private ArrayList<Card> deck;

	public MatchingGame() {

		deck = new ArrayList<Card>();
		
		Card c1 = new Card("/images/Cards/back.png","A");
		Card c2 = new Card("/images/Cards/back1.png","B");
		Card c3 = new Card("/images/Cards/back2.png","C");
		Card c4 = new Card("/images/Cards/back3.png","D");
		Card c5 = new Card("/images/Cards/back.png","A");
		Card c6 = new Card("/images/Cards/back1.png","B");
		Card c7 = new Card("/images/Cards/back2.png","C");
		Card c8 = new Card("/images/Cards/back3.png","D");
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
			double scaleFactor = (double) 200 / p.getIcon().getWidth();
            
			UtilityMethods.scaleImage(g2, p.getIcon(), currentX, currentY,72, 97);
		
			//UtilityMethods.scaleImage(g2, originalImage, x, y, newWidth, newHeight);
			currentX += 80;
		
		}
	}

	public final void update() {
		Graphics2D g2 = (Graphics2D) image.getGraphics();
		paint(g2);
	}

	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
