package project.gameDemo;

import java.awt.Color;
import javax.swing.JFrame;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import project.directors.Game;
import project.directors.Screen;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;

public class GameSubTeamScreen extends Screen implements KeyListener { 
	Player marioy;
	Player booy;
	Player goombay;
	Player toady;
			
//	public static void main(String[] args) {
		
		//Carmen and Radhika - Trying to display characters and playerinfo
//		new GameSubTeamScreen(String name, String playerImg, boolean isVisible, int id);
//	}
//	
//	public GameSubTeamScreen( name,playerImg,isVisible,id) {
//		marioy = new Player("Player 1", "images/Characters/mario.png", "true", "0");
//		booy = new Player("Player 2", "images/Characters/boo.png", "true", "0");
//		goombay = new Player("Player 3", "images/Characters/goomba.png", "true", "0");
//		toady = new Player("Player 4", "images/Characters/toad.png", "true", "0");
//		}
//	}
	public GameSubTeamScreen(Game game) {
		super(game);
		// TODO Auto-generated constructor stub
	}

	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
	}

	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public KeyListener getKeyListener() {
		// TODO Auto-generated method stub
		return null;
	}

	public void paintScreen(Graphics2D g2) {
		// TODO Auto-generated method stub
		g2.setColor(Color.black);
		g2.drawString("This Demo is working!", 30, 75);
		//Arik Commit test 
	}

}
