package project.directors;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;

public abstract class Screen extends JFrame{

	protected Game game;
	BufferedImage screenImage;
	KeyListener keyListener;
	protected int width;
	protected int height;
	InfoBox info ;
	
	
	//Game is a parameter here so that every screen can control the game while it is active
	public Screen(Game game) {
		this.game = game;
		width = game.getWidth();
		height = game.getHeight();
		screenImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
		Graphics2D g2 = (Graphics2D)screenImage.getGraphics();
		paintScreen(g2);
		info = new InfoBox(50, 500, 200, 100, "New InfoBox", g2) ;
		InfoBox info2 = new InfoBox(50, 400, 200, 100, "Another InfoBox", g2, Color.red, Color.green) ;
		InfoBox info3 = new InfoBox(650, 400, 250, 50, "A Third InfoBox", g2, Color.red, Color.green) ;
		InfoBox info4 = new InfoBox(650, 500, 250, 50, "Fourth InfoBox", g2, Color.CYAN, Color.MAGENTA) ;
	}
	
	//returns the image of this screen (to be painted in the Game JFrame)
	//final makes it impossible to override this method
	public final BufferedImage getScreenImage(){
		return screenImage;
	}
	
	public void update()
	{
		Graphics2D g2 = (Graphics2D) screenImage.getGraphics();
		paintScreen(g2) ;
	}
	
	//I don't care how people implement this method,
	//so I made it abstract
	public abstract KeyListener getKeyListener();

	public abstract void paintScreen(Graphics2D g2);
	
	
	

}
