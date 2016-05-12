package project.directors.Shopping;

public class Beer extends CheapItem implements Alcoholic {

	public Beer(String name, int q, double price) {
		super(name, q, price);
	}

	public boolean isOver21(Person person)
	{
		if(person.getAge() >= 21)
			return true ;
		return false ;
	}

}