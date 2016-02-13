
public class Property {
	String name;
	String description;
	
	/********Constructor ******************/
	public Property(String propertyName, String propertyDescription) {
		name = propertyName;
		description = propertyDescription;
	}
	/******** END CONSTRUCTOR *************/
	
	
	/*******Getters and setters *************/
	public String getName(){
		return this.name;
	}
	public void setName(String newName){
		this.name=newName;
	}
	
	public String getDescription(){
		return this.description;
	}
	public void setDescription(String newDescription){
		this.description = newDescription;
	}
	/******* END GETTERS AND SETTERS*********/
}
