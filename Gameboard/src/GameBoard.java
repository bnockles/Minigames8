import java.util.ArrayList;

public class GameBoard {
	//2D arrayList of all property values
	ArrayList<ArrayList<Property>> allProperties = new ArrayList<ArrayList<Property>>();
	
	public static void main(String[] args) {
		generateProperty("Blue1", "Blue1 is the worst property, it's like owning nothing ");
		
	}
	public static void generateProperty(String name,String description){
		new Property(name,description);
	}
}
