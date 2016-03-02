
public class Property {
	protected String name;
	protected String description;

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
	public String getDescription(){
		return this.description;
	}
	/******* END GETTERS AND SETTERS*********/
}
