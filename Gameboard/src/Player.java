import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.net.URL;
import java.util.ArrayList;

import javax.imageio.ImageIO;


public class Player {
	String name;
	int currency;
	String imageSrc;
	int height;
	int width;
	int position;
	ArrayList<BasicProperty> properties;
	String imageLoc;
	BufferedImage playerImage;
	
	//Amount given to players at start of game
	int startingAmount = 150;
	boolean playing;
	int defHeight = 160;
	int defWidth = 160;
	int startingPosition = 0;
	int playerNum = 0;
	
	//ArrayList of order of turns
	static ArrayList<Player> playOrder = new  ArrayList<Player>();
	
	//ArrayList of player Ranking (1st,2nd,3rd,4th)
	static ArrayList<Player> playerRanking = new  ArrayList<Player>();

	/*********** CONSTRUCTOR *******************/
	public Player(String playerName,String playerImageSrc){
		this.playing = true;
		this.name = playerName;
		this.currency = startingAmount;
		this.imageSrc=playerImageSrc;
		this.height = defHeight;
		this.width = defWidth;
		this.position = startingPosition;
		this.playerImage = null;
		try{
		URL url = getClass().getResource(imageSrc); 
		this.playerImage = ImageIO.read(url);
		}catch(Exception e){
		e.printStackTrace();
		}		
	}
	/*********** END CONTSRUCTOR  **************/

	
	public ArrayList<Player> generateRandomPlayerOrder(){
		//Creates temporary ArrayList for use later and ArrayList to be returned
		ArrayList<Player> minigameOrder = new ArrayList<Player>();
		ArrayList<Player> tempArrayList = playOrder;
		
		//While returned ArrayList is less then all players currently in game
		while(minigameOrder.size() < tempArrayList.size()){
			//Random player order
			int playerToAdd = (int)(Math.random()* tempArrayList.size());
			
			//Moves Player from tempArray to returned ArrayList
			minigameOrder.add(tempArrayList.get(playerToAdd));
			tempArrayList.remove(playerToAdd);
		}
		return minigameOrder;
	}
	
	
	/********* GETTERS AND SETTERS***************/
	public int getCurrency() {
		return currency;
	}
	public void setCurrency(int currency) {
		this.currency = currency;
	}
	public String getImageSrc() {
		return imageSrc;
	}
	public void setImageSrc(String imageSrc) {
		this.imageSrc = imageSrc;
	}
	public boolean isPlaying() {
		return playing;
	}
	public void setPlaying(boolean playing) {
		this.playing = playing;
	}
	public String getName() {
		return name;
	}
	public boolean getPlaying(){
		return this.playing;
	}
	/******** END GETTERS AND SETTERS ******************/
	public BufferedImage getPlayerImage() {
		return playerImage;
	}
	public void setPlayerImage(BufferedImage playerImage) {
		this.playerImage = playerImage;
	}
}
