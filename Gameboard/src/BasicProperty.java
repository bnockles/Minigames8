
public class BasicProperty extends Property {
		int initialPrice;/** DOES NOT HAVE A SETTER**/
		int currentPrice;
		//HELP COMMENT
		/**
		 * NEED TO IMPLEMENT OUR CONSTRUCTOR
		 **/
		
		//Getters and Setters
		public int getInitialPrice(){
			return this.initialPrice;
		}
		
		public int getCurrentPrice(){
			return this.currentPrice;
		}
		public void setCurrentPrice(int newPrice){
			this.currentPrice = newPrice;
		}
		
		//Methods required by BUYABLE interface
		public void buy(){
			
		}
		public void sell(){
			
		}
		public void resetToInitial(){
			this.currentPrice = this.initialPrice;
		}
}
