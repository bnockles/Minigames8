import java.util.ArrayList;

public class GameBoard {
	//2D arrayList of all property values, we will decide what goes in this array with or peers 
	ArrayList<ArrayList<Property>> allProperties = new ArrayList<ArrayList<Property>>();
	ArrayList<ArrayList<String>> allBasicPropertiesInfo = new ArrayList<ArrayList<String>>();

	
	public static void main(String[] args) {
		//We will discuss with our peers what the names and descriptions will be
		generateBasicProperty("Blue1", "Blue1 is the worst property, it's like owning nothing ");
		generateBasicProperty("Blue2", "Blue2 is the 2nd worst property, it's almost like owning nothing ");
		generateBasicProperty("Blue3", "Blue3 is the 3rd worst property, it's pretty much like owning nothing ");
		
	}
	
	//Generates all Basic Properties at beginning of game
	/**
	public void generateallBasicProperties(){
		for(int i=0;i<allBasicPropertiesInfo.size();i++){
			for(int j=0;j<allBasicPropertiesInfo.size();j++){
				generateBasicProperty(allBasicPropertiesInfo.get(i),allBasicPropertiesInfo.get(i).get(j));
			}
		}
	}
	**/
	public static void generateBasicProperty(String name,String description){
		printPropertyInfo(new BasicProperty(name,description));
	}
	private static void printPropertyInfo(Property subject) {
		System.out.println("You created a basic property with a name of " + 
							subject.getName()+
							" and a description of '"+
							subject.getDescription()+
							"'");
	}
}
