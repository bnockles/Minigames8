import java.util.ArrayList;

public class GameBoard {
	//2D arrayList of all property values
	ArrayList<ArrayList<Property>> allProperties = new ArrayList<ArrayList<Property>>();
	
	public static void main(String[] args) {
		//We will discuss with our peers what the names and descriptions will be
		generateProperty("Blue1", "Blue1 is the worst property, it's like owning nothing ");
		generateProperty("Blue2", "Blue2 is the 2nd worst property, it's almost like owning nothing ");
		generateProperty("Blue3", "Blue3 is the 3rd worst property, it's pretty much like owning nothing ");
		
	}
	public static void generateProperty(String name,String description){
		printPropertyInfo(new Property(name,description));
	}
	private static void printPropertyInfo(Property subject) {
		System.out.println("You created a property with a name of " + 
							subject.getName()+
							" and a description of '"+
							subject.getDescription()+
							"'");
	}
}
