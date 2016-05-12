package project.directors.Shopping;

public class CheapItem extends Item implements InStock {

	public CheapItem(String name, int q, double price) {
		super(name, q, price);
		// TODO Auto-generated constructor stub
	}

	public boolean ifItemIsInStock(Item i) {
		// TODO Auto-generated method stub
		if(i.getQuantity() > 0)
		{
			return true;
		}
		return false;
	}

	public int howMany(Item i) {
		// TODO Auto-generated method stub
		return i.getQuantity();
	}

	

}
