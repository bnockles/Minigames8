package project.gameDemo;

import java.awt.image.BufferedImage;
import java.net.URL;

import javax.imageio.ImageIO;

//Cindy---completed player class 
 public class Player {
 	private String name;
 	private String playerImg;
 	boolean isVisible;
 	int index;
 	int score;
 	BufferedImage icon;
 
 	public Player(String name, String playerImg, boolean isVisible, int id) {
 		this.name = name;
 		this.playerImg = playerImg;
 		this.isVisible = isVisible;
 		index = id;
 		icon = null;
 		try{
 		URL url = getClass().getResource(playerImg); 
 		icon = ImageIO.read(url);
 		}catch(Exception e){
 		e.printStackTrace();
 		}
 	}
 
 	public void setVisible(boolean isVisible) {
 		this.isVisible = isVisible;
 	}
 
 	public String getName() {
 		return name;
 	}
 
 	public String getPlayerImg() {
 		return playerImg;
 	}
 
 	public boolean getVisible() {
 		return isVisible;
 	}
 	public int getId(){
 		return index;
 	}

	public void setScore(int randPoint) {
		score = randPoint;
	}

	public int getScore() {
		return score;
	}
 
	public BufferedImage getIcon(){
		return icon;
		
	}
 }
