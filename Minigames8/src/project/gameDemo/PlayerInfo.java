package project.gameDemo;

public class PlayerInfo extends GameSubTeamDemo{
	//carmen - i basically created the players and set/get the scores-players. 
	//confused on how to make the invisibility things, isnt that graphics? send help S.O.S
	static String players;
	int score;
	static boolean playerVisibility;

	public void setName(String p){
		players = p;
		
	}
	public String getName(){
		return players;
		
	}
	
	public void setScore(int s){
		score = s;
		
	}
	public int getScore(){
		return score;
	}

	
	public static void continueGame(){
		
	}
	
	public static void endGame(){
		
	}
	
	public static void transition(){
		
	}


	// hello friends, it is i lil carmz
	// look at trello pls 
//	//implements chooseMinigame interface -- will pick the minigame that will be choosen
//	implement chooseMinigame();
//
//	//extend  gamescreen dimensons taht Arikc created for the demo
//	extend DemoGameScreen();
//
//	//abstract class timer
//	extend Timer();
//
//	//keylistener p for pause
//
//	public static void main {
//
//	//transitioning between players when timer is done
//	//call timer class
//
//	if (Timer.secondsLeft == 0) {
//	endGame();
//	} else {
//	continueGame();
//	}
//
//	}
//	boolean visibility = true;
//
//	//arik doesn’t want the playerScore to show when racing game is choosen
//	if (chooseMinigame == racingGame) {
//		visibility = false;
//	}
//
//	//update score when player is changed
//	public static void playerScore() {
//	}
//
//
//
//	public static void endGame() {
//		//turn off window
//	}
//
//	String playerStatus;
//	Boolean invisibility;
//
//	if (playerStatus == live) {
//		continueGame();
//	} else  {
//		endGame();
//	}
//
//	}
}
