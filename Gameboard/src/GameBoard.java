import java.util.ArrayList;

public class GameBoard {
	//2D arrayList of all property values, we will decide what goes in this array with or peers 
	ArrayList<ArrayList<Property>> allProperties = new ArrayList<ArrayList<Property>>();
	
	public static void main(String[] args) {
		//We will discuss with our peers what the names and descriptions will be
		generateBasicProperty("Blue1", "Blue1 is the worst property, it's like owning nothing ");
		generateBasicProperty("Blue2", "Blue2 is the 2nd worst property, it's almost like owning nothing ");
		generateBasicProperty("Blue3", "Blue3 is the 3rd worst property, it's pretty much like owning nothing ");
		
	}
	
	//Generates all Basic Properties at beginning of game
	/**
	public void generateallBasicProperties(){
		for(int i=0;i<allProperties.size();i++){
			for(int j=0;j<allProperties.size();j++){
				generateBasicProperty(allProperties.get(i),allProperties.get(i).get(j));
			}
		}
		new Property(name,description)
	}
	**/
	public static void generateBasicProperty(String name,String description){
		printPropertyInfo(new Property(name,description));
	}
	private static void printPropertyInfo(Property subject) {
		System.out.println("You created a basic property with a name of " + 
							subject.getName()+
							" and a description of '"+
							subject.getDescription()+
							"'");
	}
}
