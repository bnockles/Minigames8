// Arik Idrisy P8
//package project.architecture;

import java.awt.Graphics2D;
import java.awt.event.KeyListener;

import project.directors.Game;
import project.directors.Screen;

public class gameDemoScreen extends Screen {
  static int playerBoxH;
  static int playerBoxW;
  
	public gameDemoScreen(Game game) {
		super(game);
		// TODO Auto-generated constructor stub
	}

	public KeyListener getKeyListener() {
		// TODO Auto-generated method stub
		return null;
	}
	/*
	public void paintScreen(Graphics2D g2) {
		// TODO Auto-generated method stub
		printPlayerInfoBox(g2, playerBoxInfoOne);
		printPlayerInfoBox(g2, playerBoxInfoTwo);
		printPlayerInfoBox(g2, playerBoxInfoThree);
		printPlayerInfoBox(g2, playerBoxInfoFour);
		// Since I print each player eveyrtime, I tihnk the boolean isDisplayed will have to be used
		
	}
	public void printPlayerInfoBox(Graphics2D g2, playerBoxInfo currentPlayerBox){
	if(currentPlayerBox.getIsDisplayed()){
		playerBoxH = (Screen.getHeigh()/5);//20 % of the screen
		playerBoxW = (Screen.getWidth()/4);//Denominator should be number of players, or we could make it so that the info of the payers who have dropped out just dont appear. Perhaps an isDisplaying variable
		// drawString(currentPlayerBox.getPlayerName(), playerBoxW/2, Screen.getHeight()-playerBoxH/2);
		UtilityMethods.centerText(g2,currentPlayerBox.getPlayerName(), playerBoxW, playerBoxH);
	}
	else{
		g2.setColor(black);
		g2.fillRect(playerBoxW,playerBoxH);
	}
	public void printPlayer
	*/
}