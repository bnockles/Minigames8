package project.directors;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Toolkit;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Game extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Screen activeScreen;//the screen that is currently showing;
	int width;
	int height;
	
	public static void main(String[] args) {
		new Game();
	}

	public Game() {
		applySettings();//for JFrame-related methods
		reset();//starts a game
		setVisible(true);//makes the frame visible
	}

	private void reset() {
		Screen startScreen = new StartScreen(this);
		setScreen(startScreen);
	}

	public void setScreen(Screen newScreen) {
		//remove former keyListeners (if any)
		if(activeScreen!=null)removeKeyListener(activeScreen.getKeyListener());

		activeScreen=newScreen;
		repaint();//so that the old screen is no longer visible
		addKeyListener(activeScreen.getKeyListener());
	}

	private void applySettings() {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		//dimensions for the game (can change freely):
		width = 1000;
		height = 800;
		//for JFrame
		setSize(width,height);
		setLocation((int)(screenSize.getWidth()-width)/2, (int)(screenSize.getHeight()-height)/2);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setUndecorated(false);
		
	}
	
	//MOCK's DEMO CODE
//	InfoBox info = new InfoBox(50, 500, 100, 50) ;
//	Question question = new Question(this) ;
//	Alert alert = new Alert(this) ;
	
	public void paint(Graphics g){
		g.drawImage(activeScreen.getScreenImage(), 0, 0, null);
		
//		info.paint(g) ;
//		setLayout(new GridLayout(20, 2, 10, 10));
//		
//		JButton bTech = new JButton("Brooklyn Tech (example property)");        
//	    JButton play = new JButton("PLAY");
//	    bTech.addActionListener(new ActionListener() {
//	         public void actionPerformed(ActionEvent e) {
//	            info.message(g, "Brooklyn Tech /n Current Owner: DOE /n Value: $priceless");
//	         }          
//	      });
//
//	    play.addActionListener(new ActionListener() {
//	         public void actionPerformed(ActionEvent e) {
//	            alert.message("Chen", "You Landed on the property Brooklyn Tech");
//	            String[] options = {"Offer to purchase", "Battle for ownership", "Pay Rent"} ;
//	            int n = question.Prompt("You landed on Brooklyn Tech. What would you like to do?", "Brooklyn Tech", options);
//	            switch(n){
//		            case 0:
//		            	alert.message("Chen", "You offered DOE to buy Brooklyn Tech");
//		            	break ;
//		            case 1:
//		            	alert.message("Chen", "You started a battle with DOE for Brooklyn Tech");
//		            	break ;
//		            case 2:
//		            	alert.message("Chen", "You paid rent to DOE");
//		            	break ;
//	            }
//	         }
//	      });
//	    add(bTech) ;
//	    add(play) ;
	}
	
	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}
	
	
	
}
