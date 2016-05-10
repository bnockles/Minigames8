package project.directors.Shopping;

public class ExpensiveItem extends Item implements ShipmentPurchase {

	public ExpensiveItem(String name, int q, double price) {
		super(name, q, price);
	}

	public Item addToCart(int quantity)
	{
		System.out.println("Shipment Only") ;
		return null ;
	}
	public Item buy(int amount)
	{
		System.out.println("will be shipped") ;
		return new ExpensiveItem(this.getName(), amount, this.getPrice());
	}

	public Item buy() {
		System.out.println("will be shipped") ;
		return new ExpensiveItem(this.getName(), 1, this.getPrice());
	}

}
