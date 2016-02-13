import java.util.ArrayList;

public class GameBoard {
	
	//2D arrayList of all property values, we will decide what goes in this array with or peers 
	static ArrayList<ArrayList<Property>> allProperties = new ArrayList<ArrayList<Property>>();
	
	/**
	 * allBasicPropertiesInfo.get(0) = name;
	 * allBasicPropertiesInfo.get(1) = description;
	 * allBasicPropertiesInfo.get(2) = initialPrice;
	 */
	static ArrayList<ArrayList<String>> allBasicPropertiesInfo = new ArrayList<ArrayList<String>>();
	
	/**
	 * allChanceCardPropertiesInfo.get(0) = name;
	 * allChanceCardPropertiesInfo.get(1) = description;
	 * allChanceCardPropertiesInfo.get(2) = card;
	 */
	static ArrayList<ArrayList<String>> allChanceCardPropertiesInfo = new ArrayList<ArrayList<String>>();
	
	
	public static void main(String[] args) {
		genPlayers(4);
		generateBoard();
		displayGameBoard();
	}
	
	//Generates all Basic Properties at beginning of game
	public static void generateBoard() {
		generateAllBasicProperties();
		generateAllChanceCardProperties();
		generateAllOtherProperties();	
	}

	public static void displayGameBoard() {
		//TO BE  WRITTEN
	}

	public static void generateAllOtherProperties() {
		
	}

	public static void generateAllChanceCardProperties() {
		for(int i=0;i<allChanceCardPropertiesInfo.get(0).size();i++){
			new ChanceCardProperty(allChanceCardPropertiesInfo.get(i).get(0),allChanceCardPropertiesInfo.get(i).get(1));
		}
	}

	public static void generateAllBasicProperties() {
			for(int i=0;i<allBasicPropertiesInfo.get(0).size();i++){
				new BasicProperty(allBasicPropertiesInfo.get(i).get(0),allBasicPropertiesInfo.get(i).get(1),Integer.parseInt(allBasicPropertiesInfo.get(i).get(2)));
			}
	}
	
	//Generates Players at beginning of game
	public static void genPlayers(int numOfPlayers){
		for(int i=0;i<numOfPlayers+1;i++){
			Player.playerOrder.add(new Player(choosePlayerName(),chooseImageSrc()));
		}
	}
	
	public static String choosePlayerName() {
		/*
		 * POPUP
		 * PLAYER IS ASKED WHAT NAME HE/SHE WANTS
		 * WAITFORINPUT
		 * CONFIRM NAME
		 * RETURN NAME
		 */
		return "Fish";
	}

	public static String chooseImageSrc() {
		/*
		 * POPUP
		 * PLAYER IS ASKED WHAT CHARCTER HE/SHE WANTS
		 * PRINT LIST OF CHARACTERS
		 * WAITFORINPUT
		 * CONFIRM CHOICE
		 * RETURN CHOICE
		 */
		return "Fish.src";
	}
}
