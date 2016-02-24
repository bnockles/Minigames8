
public class BasicProperty extends Property {
		//Fields
		int initialPrice;
		int currentPrice;
		Player owner;
		
		/*********** Constructor ***********************/
		public BasicProperty(String propertyName, String propertyDescription,int initialPrice) {
		super(propertyName, propertyDescription);
		this.name = propertyName;
		this.description = propertyDescription;
		this.initialPrice = initialPrice;
		this.currentPrice = initialPrice;
		}
		/*********** END CONSTRUCTOR *******************/
		
		
		/*********** Getters and Setters****************/
		public int getCurrentPrice(){
			return this.currentPrice;
		}
		public void setCurrentPrice(int newPrice){
			this.currentPrice = newPrice;
		}

		
		/*********** Methods required by BUYABLE interface ****/
		public void buy(){
			
		}
		public void sell(){
			
		}
		public void resetToInitialPrice(){
			this.currentPrice = this.initialPrice;
		}
}
