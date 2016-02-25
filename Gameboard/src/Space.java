import java.util.ArrayList;

public class Space {
	String name;
	int spaceNum;
	static ArrayList<Space> spaces = new ArrayList<Space>();
	
	public static void main(String[] args) {
		generateSpaces();
		printSpacesInfo();
	}
	
	public Space(String spaceName, int spaceNumber){
		this.name = spaceName;
		this.spaceNum = spaceNumber;
	}
	
	public static void generateSpaces(){
		for(int i=0;i<20;i++){
			spaces.add(new Space("Property" + Integer.toString(i),i));
		}
	}
	
	public static void printSpacesInfo(){
		for (int i =0;i<spaces.size();i++){
			System.out.println(spaces.get(i).name +"'s spaceNum is "+ spaces.get(i).spaceNum);
		}
	}
}
