package project.directors;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.KeyListener;

public class RuleScreen extends Screen {

	
	
	public RuleScreen(Game game) {
		super(game);
		// TODO Auto-generated constructor stub
	}

	public KeyListener getKeyListener() {
		// TODO Auto-generated method stub
		return null;
	}

	public void paintScreen(Graphics2D g2) {
		// TODO Auto-generated method stub
		g2.setColor(Color.red);
		g2.fillRect(0,0,width,height);
		g2.setColor(Color.black);
		UtilityMethods.centerTextAtY(g2, "Rules: ", width, 50);
		UtilityMethods.centerTextAtY(g2, "1: blah", width, 100);
		UtilityMethods.centerTextAtY(g2, "2: blah blah", width, 150);
		UtilityMethods.centerTextAtY(g2, "3: blah blah blah", width, 200);
	}

}
