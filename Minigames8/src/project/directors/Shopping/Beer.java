package project.directors.Shopping;

public class Beer extends Item implements Alcoholic {

	public Beer(String name, int q, double price) {
		super(name, q);
	}

	public boolean isOver21(Person person)
	{
		if(person.getAge() >= 21)
			return true ;
		return false ;
	}

}
