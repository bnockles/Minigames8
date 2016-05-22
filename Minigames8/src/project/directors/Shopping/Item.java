package project.directors.Shopping;

public class Item implements Drink {

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
	public void decrement()
	{
		quantity-- ;
	}
	
}
