package project.directors;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ControlScreen extends Screen implements KeyListener {

	public ControlScreen(Game game) {
		super(game);
		// TODO Auto-generated constructor stub
	}

	public KeyListener getKeyListener() {
		// TODO Auto-generated method stub
		return this;
	}

	public void paintScreen(Graphics2D g2) {
		// TODO Auto-generated method stub
		g2.setColor(Color.yellow);
		g2.fillRect(0,0,width,height);
		g2.setColor(Color.red);
		UtilityMethods.centerTextAtY(g2, "Controls: ", width, 50);
		UtilityMethods.centerTextAtY(g2, "1: blah", width, 100);
		UtilityMethods.centerTextAtY(g2, "2: blah blah", width, 150);
		UtilityMethods.centerTextAtY(g2, "3: blah blah blah", width, 200);
	}

	public void keyPressed(KeyEvent k)
	{
		if(k.getKeyCode() == KeyEvent.VK_ESCAPE){
			
			Screen startScreen = new StartScreen(game);
			game.setScreen(startScreen);
		}
	}

	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
