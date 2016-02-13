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
		boolean playing = true;
		this.name = playerName;
		this.currency = startingAmount;
		this.imageSrc=playerImageSrc;
	}
	
	public ArrayList<Player> generateRandomPlayerOrder(){
		//Creates temp ArrayList for use later and ArrayList to be returned
		ArrayList<Player> minigameOrder = new ArrayList<Player>();
		ArrayList<Player> tempArrayList = playerOrder;
		
		//While returned ArrayList is less then all players currently in game
		while(minigameOrder.size() < playerOrder.size()){
			//Random player order
			int playerToAdd = (int)(Math.random()* tempArrayList.size());
			
			//Moves Player from tempArray to returned ArrayList
			minigameOrder.add(tempArrayList.get(playerToAdd));
			tempArrayList.remove(playerToAdd);
		}
		return minigameOrder;
	}
}
