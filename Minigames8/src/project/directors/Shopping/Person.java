package project.directors.Shopping;

public class Person {
	private String name ;
	private int age ;
	private boolean alcoholic ;
	private String[] cravings ;
	private boolean lactoseIntolerant ;
	private boolean classy ;
	private boolean happy ;
	private boolean likesMilk ;
	public Person(String name, String[] juice, String[] milk, String[] beer, String[] wine)
	{
		this.name = name ;
		this.age = (int)(Math.random()*60 + 16) ;
		this.alcoholic = (Math.random()*100>75)?true:false ;
		this.likesMilk = (Math.random()*100>50)?true:false ;
		this.classy = (Math.random()*100>60)?true:false ;
		this.lactoseIntolerant = (Math.random()*100>85)?true:false ;
		this.happy = true ;
		int i = 0 ;
		if(alcoholic)
		{
			if(classy)
				cravings[i] = wine[(int)(Math.random()*wine.length)] ;
			else
				cravings[i] = beer[(int)(Math.random()*beer.length)] ;
			i++ ;
		}
		if(likesMilk)
		{
			if(lactoseIntolerant)
			{
				cravings[i] = "lactose-free" ;
			}
			else
			{
				cravings[i] = milk[(int)(Math.random()*milk.length)] ;
			}
			i++ ;
		}
		cravings[i] = juice[(int)(Math.random()*juice.length)] ;
		
	}
	public int getAge()
	{
		return age ;
	}
	public String getName()
	{
		return name ;
	}
	public void act(Shop shop)
	{
		Item currCraving ;
		if(alcoholic && age < 21)
			happy = false ;
		for(int i = 0 ; i < cravings.length ; i++)
		{
			currCraving = new Item(cravings[i], 1) ;
			if(!shop.contains(currCraving))
				happy = false ;
			else
				shop.purchase(currCraving) ;
		}
	}
}
