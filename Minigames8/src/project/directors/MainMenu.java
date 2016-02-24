package project.directors;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;

import javax.swing.JButton;

import project.menus.GameMenu;

public class MainMenu extends Screen {
	
	GameMenu gameMenu;
	
	public MainMenu(Game game) {
		super(game);
		//gameMenu();
	}

	public KeyListener getKeyListener() {
		return null;
	}

	//MOCK's DEMO CODE
		InfoBox info = new InfoBox(50, 500, 100, 50) ;
		Question question = new Question(this) ;
		Alert alert = new Alert(this) ;
	
	public void paintScreen(final Graphics2D g2) {
		g2.setColor(Color.blue);
		g2.fillRect(0,0,width,height);
		g2.setColor(Color.white);
		UtilityMethods.centerTextAtY(g2, "This will be the game menu where you can save/load data.", width, 50);
		
		//MOCK's DEMO CODE
		
//		info.paint(g2) ;
		setLayout(new GridLayout(20, 2, 10, 10));
		
		JButton bTech = new JButton("Brooklyn Tech (example property)");        
	    JButton play = new JButton("PLAY");
	    bTech.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	            info.message(g2, "Brooklyn Tech /n Current Owner: DOE /n Value: $priceless");
	         }          
	      });

	    play.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
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
	      });
	    add(bTech) ;
	    add(play) ;
	}

}
