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


	PlayerInfo playerBoxes;
	int y;
	MinigameTimer timer;
	int count = 0;
	public GameSubTeamScreen(Game game) {
		super(game);
		playerBoxes = new PlayerInfo();
		timer = new MinigameTimer(30);
		update();
		y = 50;
	}

	public void keyPressed(KeyEvent arg0) {
		int k = arg0.getKeyCode();
		if(k == KeyEvent.VK_P)playerBoxes.penalizeAllPlayers(10);
		if(k == KeyEvent.VK_SPACE){
			int randPoint = (int) (Math.random() * 100 + 1);// 1-100
			playerBoxes.getPlayer().setScore(randPoint);
			playerBoxes.transitionTurn();
		}
		update();
	}

	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	public KeyListener getKeyListener() {
		// TODO Auto-generated method stub
		return this;
	}

	public void paintScreen(Graphics2D g2) {
		
		try{
			g2.setColor(Color.black);
			g2.drawString("This Demo is working!", 30, 75);
//			y = (y+1)%500;
			g2.drawImage(playerBoxes.getImage(),50,300,null);
			playerBoxes.update();
			count++;
			if(count >=30  && timer.getSeconds()>0){
				count=0;
				timer.setSeconds(timer.getSeconds()-1);
			}
			g2.drawImage(timer.getImage(), 250, 50, null);
			timer.update();
		}
		catch (NullPointerException e){
//			e.printStackTrace();
			System.out.println("NullPointerException was thrown (This is expected to happen once, at the very beginning. Check the paintScreen method in the GameSubTeam class if this ever happens more than once )");
		}
		catch (Exception e){
			e.printStackTrace();
		}
		//Arik Commit test 
	}

	public static void time(int seconds) {
		// TODO Auto-generated method stub

	}

}
