import java.util.ArrayList;


public class Player {
	int startingAmount = 150;
	String name;
	int currency;
	String imageSrc;
	int turnOrder;
	int currentPlayerOrder=0;
	
	public Player(String playerName,String playerImageSrc){
		this.name = playerName;
		this.currency = startingAmount;
		this.imageSrc=playerImageSrc;
		currentPlayerOrder+=1;
		this.turnOrder = currentPlayerOrder;
	}
	
	public arrayList<Player> generateRandomPlayerOrder(){
		
	}
}
