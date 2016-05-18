package project.directors.Shopping;

public class Person {
	private String name ;
	private int age ;
	private boolean alcoholic ;
	private String craving ;
	private boolean lactoseIntolerant ;
	private boolean classy ;
	private boolean happy ;
	public Person(String name, int age, String[] juice, String[] milk, String[] beer, String[] wine)
	{
		this.name = name ;
		this.age = (int)(Math.random()*60 + 16) ;
		this.alcoholic = (Math.random()*100>75)?true:false ;
		this.classy = (Math.random()*100>60)?true:false ;
		this.lactoseIntolerant = (Math.random()*100>85)?true:false ;
		this.happy = true ;
		if(alcoholic)
		{
			if(classy)
				craving = wine[(int)(Math.random()*wine.length)] ;
		}
	}
	public int getAge()
	{
		return age ;
	}
	public String getName()
	{
		return name ;
	}
	public void act()
	{
		
	}
}
