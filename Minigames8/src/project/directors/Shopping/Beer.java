package project.directors.Shopping;

public class Beer extends Item {

	public Beer(String name, int q) {
		super(name, q);
	}

	public boolean isOver21(Person person)
	{
		if(person.getAge() >= 21)
			return true ;
		return false ;
	}

}
