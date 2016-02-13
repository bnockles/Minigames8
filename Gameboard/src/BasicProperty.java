
public class BasicProperty extends Property {
		//Fields
		int initialPrice;
		int currentPrice;
		
		/*********** Constructor ***********************/
		public BasicProperty(String propertyName, String propertyDescription) {
		super(propertyName, propertyDescription);
		}
		/*********** END CONSTRUCTOR *******************/
		
		
		/*********** Getters and Setters****************/
		public int getInitialPrice(){
			return this.initialPrice;
		}
		
		public int getCurrentPrice(){
			return this.currentPrice;
		}
		public void setCurrentPrice(int newPrice){
			this.currentPrice = newPrice;
		}
		/*********** GETTERS AND SETTERS*****************/
		
		
		/*********** Methods required by BUYABLE interface ****/
		public void buy(){
			
		}
		public void sell(){
			
		}
		public void resetToInitial(){
			this.currentPrice = this.initialPrice;
		}
}
