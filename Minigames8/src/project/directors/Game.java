package project.directors;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Game extends JFrame{

	public static void main(String[] args) {
		new Game();
	}

	public Game() {
		applySettings();//for JFrame-related methods
		setVisible(true);//makes the frame visible
		reset();//starts a game
	}

	private void reset() {
		// TODO Auto-generated method stub
		
	}

	private void applySettings() {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		//dimensions for the game (can change freely):
		int width = 1000;
		int height = 800;
		//for JFrame
		setSize(width,height);
		setLocation((int)(screenSize.getWidth()-width)/2, (int)(screenSize.getHeight()-height)/2);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setUndecorated(true);
		
	}
}
