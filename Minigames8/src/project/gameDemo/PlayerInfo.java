package project.gameDemo;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Arrays;

import project.directors.UtilityMethods;
/** 
 * @author Cindy
 * **/
public class PlayerInfo {
	ArrayList<Player> players;
	int index;
	BufferedImage image;
	int width ;
	int height;
	
	/**
	 * Cindy - I made an arraylist of players so that we can add however many
	 * players we need, for example, I made 4 player already
	 **/

	public PlayerInfo() {
		players = new ArrayList<Player>();
		index = 0;
		Player p1 = new Player("Player 1", "/images/Characters/toad.png", true, 0);
		Player p2 = new Player("Player 2", "/images/Characters/boo.png", true, 1);
		Player p3 = new Player("Player 3", "/images/Characters/goomba.png", true, 2);
		Player p4 = new Player("Player 4", "/images/Characters/mario.png", true, 3);
		
		players.add(p1);
		players.add(p2);
		players.add(p3);
		players.add(p4);
		width = 850;
		height = 500;
		image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
		
		
		update();
	}
	public BufferedImage getImage(){
		return image;
	}
	public void paint(Graphics2D g){
		//repaint the background;
		g.setColor(Color.black);
		g.fillRect(0, 0, width, height);

		g.setColor(Color.white);
		int currentY= 60;
		int currentX = 50;
		
		for(Player p: players){
			g.drawString(p.getName(),50,currentY);
			g.drawString("Score: " + p.getScore(), 50, currentY+20);
			double scaleFactor = (double)50/p.getIcon().getHeight();
			UtilityMethods.scaleImage(g,p.getIcon(),20,currentY+20,(int) (p.getIcon().getWidth()*scaleFactor),50);
			currentY+=100;
		}
		if(getPlayer().getId() == players.size() - 1)
		g.drawString(determineWin().getName()+" is the winner. ",20,currentY);
	}
	
	public final void update(){
	    Graphics2D g2 = (Graphics2D)image.getGraphics();
	    paint(g2);
	}
	
	
	/**example of something that can change while playing
	 * 
	 */
	public void penalizeAllPlayers(int pointsToTakeAway){
		for(Player p: players){
			p.setScore(p.getScore()-pointsToTakeAway);
		}
		//update will change the graphics to show the new information
		update();
	}
	


	
	/**
	 * Cindy - I made a arraylist of players and there is a keylistener to look
	 * for when player presses space bar, when the player presses space bar then
	 * there will be an random number from 1-100 that will be given to the
	 * player as points.
	 **/

	public Player getPlayer() {
		return players.get(index);

	}
	
	public ArrayList<Player> getPlayers(){
		return players;
	}

//	public void keyPressed(KeyEvent ee) {
//		if (ee.getKeyCode() == KeyEvent.VK_SPACE) {
//			int randPoint = (int) (Math.random() * 100 + 1);// 1-100
//			getPlayer().setScore(randPoint);
//			transitionTurn();
//		}
//	}

	/**
	 * Cindy- transitionturn is called when timer has reached 0, then it goes to
	 * the next player's turn
	 **/
	public Player transitionTurn() {

		Player nextPlayer = null;
		// there will be an array of the players with their information and a
		// index describing what their id is, assume arraylist is called
		// players
		if (getPlayer().getId() == players.size() - 1) {
			
		} else {
			nextPlayer = players.get(getPlayer().getId() + 1);
			index++;
		}
		return nextPlayer;
	}

	

	//Celina - wrote code to determine the winner(determineWin())
		public Player determineWin(){
			//puts score into an variable
			Player winner = null;
			
			int p1Score = players.get(0).getScore();
			int p2Score = players.get(1).getScore();
			int p3Score = players.get(2).getScore();
			int p4Score = players.get(3).getScore();
			
			int scores[] = {p1Score, p2Score, p3Score, p4Score};
			//sorts all the scores
			Arrays.sort(scores);
			
			int winScore = scores[scores.length - 1];
			
			//display winner
			if(p1Score == winScore){
				winner = players.get(0);
			}else if(p2Score == winScore){
				winner = players.get(1);
			}else if(p3Score == winScore){
				winner = players.get(2);
			}else if(p4Score == winScore){
				winner = players.get(3);
			}
			
			
			return winner;
		}
}
