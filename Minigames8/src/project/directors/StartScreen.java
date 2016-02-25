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
		UtilityMethods.centerText(g2, "Press 4 to move your character (Demo only)", width, (int)(height*1.6));
	}
	
	//MOCK's DEMO CODE
		InfoBox info = new InfoBox(50, 500, 100, 50) ;
		Question question = new Question(this) ;
		Alert alert = new Alert(this) ;

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
		if(k.getKeyCode() == KeyEvent.VK_4){
			alert.message("Chen", "You Landed on the property Brooklyn Tech");
            String[] options = {"Offer to purchase", "Battle for ownership", "Pay Rent"} ;
            int n = question.Prompt("You landed on Brooklyn Tech. What would you like to do?", "Brooklyn Tech", options);
            switch(n){
	            case 0:
	            	alert.message("Chen", "You offered DOE to buy Brooklyn Tech");
	            	break ;
	            case 1:
	            	alert.message("Chen", "You started a battle with DOE for Brooklyn Tech");
	            	break ;
	            case 2:
	            	alert.message("Chen", "You paid rent to DOE");
	            	break ;
            }
		}
	}

	public void keyReleased(KeyEvent arg0) {

	}

	public void keyTyped(KeyEvent arg0) {
	}

	
	
	
	
	
	
	
}
