package project.directors.Shopping;

public class Item {

	private int quantity ;
	private String name ;
	private double price ;
	private String type;
	
	public Item(String name, int q, double price)
	{
		this.name = name ;
		this.quantity = q ;
		this.price = price ;
	}
	public Item(String name, int q, double price, String type)
	{
		this.name = name ;
		this.quantity = q ;
		this.price = price ;
		this.type  = type;
	}
	public int getQuantity()
	{
		return quantity ;
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
			return new Item(name, amount, price) ;
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
			return new Item(name, amount, price) ;
		}
	}
	public double getPrice()
	{
		return price ;
	}
}
