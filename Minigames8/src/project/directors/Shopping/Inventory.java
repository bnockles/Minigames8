package project.directors.Shopping;


public interface Inventory {
	
	public void addItem(Item item);
	public boolean contains(Item item);
	public void purchase(Item item) ;
}