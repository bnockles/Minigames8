package project.directors;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class StartScreen extends Screen implements KeyListener{

	public StartScreen(Game game) {
		super(game);
	}

	public KeyListener getKeyListener() {
		return this;
	}

	public void paintScreen(Graphics2D g2) {
		g2.setColor(Color.white);
		g2.fillRect(0, 0, width, height);
		g2.setColor(Color.black);
		UtilityMethods.centerText(g2, "Press 1 to start", width, height/2);
		UtilityMethods.centerText(g2, "Press 2 to see the rules screen", width, height);
		UtilityMethods.centerText(g2, "Press 3 to see control help", width, (int)(height*1.5));
	}

	public void keyPressed(KeyEvent k)
	{
		if(k.getKeyCode() == KeyEvent.VK_1){
			
			Screen mainMenu = new MainMenu(game);
			game.setScreen(mainMenu);
		}
		if(k.getKeyCode() == KeyEvent.VK_2){
			Screen ruleScreen = new RuleScreen(game);
			game.setScreen(ruleScreen);
		}
		
		if(k.getKeyCode() == KeyEvent.VK_3){
			Screen controlScreen = new ControlScreen(game);
			game.setScreen(controlScreen);
		}
	}

	public void keyReleased(KeyEvent arg0) {

	}

	public void keyTyped(KeyEvent arg0) {
	}

	
	
	
	
	
	
	
}
