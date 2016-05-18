package project.directors.Shopping;


public interface Inventory {
	
	public void newItems(Item...items);
	public boolean contains(Item item);
	public void purchase(Item item) ;
}