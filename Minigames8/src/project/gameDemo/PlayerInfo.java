package project.gameDemo;

import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class PlayerInfo extends GameSubTeamDemo {
	// carmen - i basically created the players and set/get the scores-players.
	// confused on how to make the invisibility things, isnt that graphics? send
	// help S.O.S

	// Cindy - Carmen Playerinfo is used to change the player's stats and a
	// player is suppose
	// to be an object. So I am editing this class and making a Player class
	// which can be used to
	// make each individual players

	// static String players;
	// int score;
	// static boolean playerVisibility;
	//
	// public void setName(String p){
	// players = p;
	//
	// }
	// public String getName(){
	// return players;
	//
	// }
	//
	// public void setScore(int s){
	// score = s;
	//
	// }
	// public int getScore(){
	// return score;
	// }

	public static void continueGame() {

	}

	public static void endGame() {

	}
	
	

	//Cindy - I made a arraylist of players and there is a keylistener to look for when
	//player presses space bar and transitionturn is called when space par is pressed
	//transitionturn goes to the next player's turn
	ArrayList<Player> players = new ArrayList<Player>();
	Player p1 = new Player("a", "", true, 0);

	public Player getPlayer() {
		return p1;
	}

	public void keyPressed(KeyEvent ee) {
		// Assuming that there is a pop up in graphics display
		// calling upon graphics
		// Also the timer reached 0 already showing the popup
		if (ee.getKeyCode() == KeyEvent.VK_SPACE) {
			transitionTurn();
		}
	}

	public Player transitionTurn() {
		Player nextPlayer;
		// there will be an array of the players with their information and a
		// index desccrtinbing what their id is, assume arraylist is called
		// players
		if (getPlayer().getId() == players.size() - 1) {
			nextPlayer = players.get(0);
		} else {
			nextPlayer = players.get(getPlayer().getId() + 1);
		}
		return nextPlayer;
	}

	
	
	
	// hello friends, it is i lil carmz
	// look at trello pls
	// //implements chooseMinigame interface -- will pick the minigame that will
	// be choosen
	// implement chooseMinigame();
	//
	// //extend gamescreen dimensons taht Arikc created for the demo
	// extend DemoGameScreen();
	//
	// //abstract class timer
	// extend Timer();
	//
	// //keylistener p for pause
	//
	// public static void main {
	//
	// //transitioning between players when timer is done
	// //call timer class
	//
	// if (Timer.secondsLeft == 0) {
	// endGame();
	// } else {
	// continueGame();
	// }
	//
	// }
	// boolean visibility = true;
	//
	// //arik doesn’t want the playerScore to show when racing game is choosen
	// if (chooseMinigame == racingGame) {
	// visibility = false;
	// }
	//
	// //update score when player is changed
	// public static void playerScore() {
	// }
	//
	//
	//
	// public static void endGame() {
	// //turn off window
	// }
	//
	// String playerStatus;
	// Boolean invisibility;
	//
	// if (playerStatus == live) {
	// continueGame();
	// } else {
	// endGame();
	// }
	//
	// }
}
