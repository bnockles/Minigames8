package project.directors.Shopping;

public class Shop implements Inventory {

	private Item[] items ;
	public Shop(Item...items)
	{
		this.items = items ;
	}
	public void newItems(Item... items) {
		// TODO Auto-generated method stub
		
	}
	public boolean contains(Item item) {
		// TODO Auto-generated method stub
		return false;
	}

}
