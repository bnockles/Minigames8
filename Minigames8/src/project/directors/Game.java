package project.directors;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Game extends JFrame{

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
		activeScreen=startScreen;
		setScreen(startScreen);
	}

	public void setScreen(Screen newScreen) {
		//remove former keyListeners (if any)
		try{
			removeKeyListener(activeScreen.getKeyListener());
		}catch(NullPointerException e){
			e.printStackTrace();
			//nothing happens, since this just mean there is no listener to remove
		}
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

	public void paint(Graphics g){
		g.drawImage(activeScreen.getScreenImage(), 0, 0, null);
	}
	
	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}
	
	
	
}
