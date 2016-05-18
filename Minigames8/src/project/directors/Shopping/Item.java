package project.directors.Shopping;

public class Item {

	private int quantity ;
	private String name ;
	
	public Item(String name, int q)
	{
		this.name = name ;
		this.quantity = q ;
	}
	public int getQuantity()
	{
		return quantity ;
	}
	
	public void addStockOfItem(int i)
	{
		quantity += i ;
	}
	public String getName()
	{
		return name ;
	}
	public Item addToCart(int amount)
	{
		if(this.quantity - amount < 0)
		{
			this.quantity = 0 ;
			return this ;
		}
		else
		{
			this.quantity -= amount ;
			return new Item(name, amount) ;
		}
	}
	public Item addToCart()
	{
		int amount = 1 ;
		if(this.quantity - amount < 0)
		{
			this.quantity = 0 ;
			return this ;
		}
		else
		{
			this.quantity -= amount ;
			return new Item(name, amount) ;
		}
	}
}
