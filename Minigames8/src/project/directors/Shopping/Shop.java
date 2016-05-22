package project.directors.Shopping;

public class Shop implements Inventory {

	private Item[] items ;
	public Shop(Item...items)
	{
		this.items = items ;
	}
	public void addItem(Item item) {
		// CHEN need this to add the given item to the array items. OR if the item is already in the array,
		//increase the quantity by the given amount
		
	}
	public boolean contains(Item item) {
		for(int i = 0 ; i < items.length ; i++)
		{
			if(items[i].getName().equals(item.getName()) && items[i].getQuantity() > 0)
			{
				return true ;
			}
		}
		return false;
	}
	public void purchase(Item item) {
		//CHEN need to subtract item here
		
	}

}
