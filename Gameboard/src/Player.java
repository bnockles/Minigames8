import java.util.ArrayList;


public class Player {
	String name;
	int currency;
	String imageSrc;
	
	//Amount given to players at start of game
	int startingAmount = 150;
	boolean playing;
	
	//Order of players for GameBoard
	static ArrayList<Player> playerOrder = new  ArrayList<Player>();
	
	/*********** CONSTRUCTOR *******************/
	public Player(String playerName,String playerImageSrc){
		this.playing = true;
		this.name = playerName;
		this.currency = startingAmount;
		this.imageSrc=playerImageSrc;
	}
	/*********** END CONTSRUCTOR  **************/

	
	public ArrayList<Player> generateRandomPlayerOrder(){
		//Creates temporary ArrayList for use later and ArrayList to be returned
		ArrayList<Player> minigameOrder = new ArrayList<Player>();
		ArrayList<Player> tempArrayList = playerOrder;
		
		//Checks which players are still playing 
		for(int i=0;i<playerOrder.size();i++){
			if(playerOrder.get(i).getPlaying()==false){
				tempArrayList.remove(i);
			}
		}
		
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
}
