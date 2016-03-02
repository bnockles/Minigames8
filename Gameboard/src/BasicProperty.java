public class BasicProperty extends Property {
		private int initialPrice;
		private int currentPrice;
		private Player owner;
		
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
		public void buy(BasicProperty property,Player buyer ,int price){
			if(buyer.currency<price){
				//Displays pop-up cannot buy
			}else{
				//Exchanges property
				this.owner.properties.remove(this);
				buyer.properties.add(this);
				//Exchanges currency
				this.owner.setCurrency(this.owner.getCurrency()+price);
				buyer.setCurrency(buyer.getCurrency()-price);
			}
		}
		
		public void resetToInitialPrice(){
			this.currentPrice = this.initialPrice;
		}
}
