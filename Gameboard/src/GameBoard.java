import java.util.ArrayList;

public class GameBoard {
	
	//2D arrayList of all property values, we will decide what goes in this array with or peers 
	static ArrayList<ArrayList<Property>> allProperties = new ArrayList<ArrayList<Property>>();
	
	/**
	 * allBasicPropertiesInfo.get(0) = name;
	 * allBasicPropertiesInfo.get(1) = description;
	 * allBasicPropertiesInfo.get(2) = initialPrice;
	 */
	static String[][] allBasicPropertiesInfo ={{"Unknown","A mysterious pokemon that nobody knows about. ","100"},
												{"Venasaur", "A leaf lizard thing that looks cool","115"},
												{"Megaton","Another lizard pokemon that looks cool","130"},
												{"UnKnown","This Pokemon seems to be in the shape of an eight, but then again all Unknown are...","150"},
												{"Sceptile","Marijuana looking Pokemon","165"},
												{"","Another lizrad pokemon that looks cool","130"},
												{"Megaton","Another lizrad pokemon that looks cool","130"},
												{"Megaton","Another lizrad pokemon that looks cool","130"},
												{"Megaton","Another lizrad pokemon that looks cool","130"},
												{"Megaton","Another lizrad pokemon that looks cool","130"},
												{"Megaton","Another lizrad pokemon that looks cool","130"},
												{"Megaton","Another lizrad pokemon that looks cool","130"},
												{"Megaton","Another lizrad pokemon that looks cool","130"},
												{"Megaton","Another lizrad pokemon that looks cool","130"},
												{"Megaton","Another lizrad pokemon that looks cool","130"},
												};
	
	/**
	 * allChanceCardPropertiesInfo.get(0) = name;
	 * allChanceCardPropertiesInfo.get(1) = description;
	 * allChanceCardPropertiesInfo.get(2) = card;
	 */
	static ArrayList<ArrayList<String>> allChanceCardPropertiesInfo = new ArrayList<ArrayList<String>>();
	
	
	public static void main(String[] args) {
		genPlayers(4);
		for(int i = 0;i<allBasicPropertiesInfo.length;i++){
			for(int j=0;j<allBasicPropertiesInfo[i].length;j++){
				System.out.println(allBasicPropertiesInfo[i][j]);
			}
		}
		/*
		generateBoard();
		displayGameBoard();
		*/
	}
	
	//Generates all Basic Properties at beginning of game
	public static void generateBoard() {
		generateAllBasicProperties();
		generateAllChanceCardProperties();
	}

	public static void generateAllChanceCardProperties() {
		for(int i=0;i<allChanceCardPropertiesInfo.get(0).size();i++){
			new ChanceCardProperty(allChanceCardPropertiesInfo.get(i).get(0),allChanceCardPropertiesInfo.get(i).get(1));
		}
	}

	public static void generateAllBasicProperties() {
			for(int i=0;i<allBasicPropertiesInfo[0].length;i++){
				new BasicProperty(allBasicPropertiesInfo[i][0],allBasicPropertiesInfo[i][1],Integer.parseInt(allBasicPropertiesInfo[i][2]));
			}
	}
	
	//Generates Players at beginning of game
	public static void genPlayers(int numOfPlayers){
		for(int i=0;i<numOfPlayers+1;i++){
			Player.playOrder.add(new Player(choosePlayerName(),chooseImageSrc()));
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
