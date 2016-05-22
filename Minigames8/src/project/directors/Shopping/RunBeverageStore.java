package project.directors.Shopping;
import java.util.* ;
import java.text.* ;

public class RunBeverageStore {
	protected static int POPULATION ;
	protected static int DRINKING_AGE ;
	static String[] milk = {"1% fat","2% fat", "lactose-free","whole","fat-free","skim","chocolate","butter","raw"};
	static String[] juice = {"orange","cherry","grapefruit","grape","lemon","apple","mango"};
	static String[] beer = {"Guinness","Blue Moon","Heineken","Corona","Budweiser"};
	static String[] wine = {"Sweet White Wine", "Dry Red Wine", "Sweet Red Wine", "Dry White Wine"};
	static double alcoholics ;
	static double lactoseIntolerants ;
	static double underAgeAlcoholics ;
	static double satisfied ;
	
	static String alcoholismRate ;
	static String lactoseRate ;
	static String underAgeAlcoholism ;
	static String townSatisfaction ;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DecimalFormat percentage = new DecimalFormat("###.##%") ;
		Shop shop = new Shop(new Milk("1% fat", 10),new Milk("2% fat", 10),new Milk("lactose-free", 10),new Milk("whole", 10),
				new Milk("fat-free", 10),new Milk("skim", 10),new Milk("chocolate", 10),new Milk("butter", 10),new Milk("raw", 10),
				new Juice("orange", 10),new Juice("cherry", 10),new Juice("grapefruit", 10),new Juice("grape", 10),new Juice("lemon", 10),
				new Juice("apple", 10),new Juice("mango", 10),new Beer("Guinness", 10),new Beer("Blue Moon", 10),new Beer("Heineken", 10),
				new Beer("Corona", 10),new Beer("Budweiser", 10),new Wine("Sweet White Wine", 10),new Wine("Dry White Wine", 10),
				new Wine("Sweet Red Wine", 10),new Wine("Dry Red Wine", 10));
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a population");
		POPULATION = scanner.nextInt();
		System.out.println("Enter a legal Drinking age cap");
		DRINKING_AGE = scanner.nextInt();
		System.out.println("Enter quantities, followed by the name of each drink you would like in the local store. Separated by commas.");
		System.out.println("Ex. 1 orange, 3 Blue Moon, 20 1% fat");
		System.out.println("Milk Options are: 1% fat, 2% fat, lactose-free, whole, fat-free, skim, chocolate, butter, raw");
		System.out.println("Juice Options are: orange, cherry, grapefruit, grape, lemon, apple, mango");
		System.out.println("Beer Options are: Guinness, Blue Moon, Heineken, Corona, Budweiser");
		System.out.println("Wine Options are: Sweet White Wine, Dry Red Wine, Sweet Red Wine, Dry White Wine");
		String generalEntry = scanner.next();
		String[][] drinks = decipher(generalEntry) ;
		for(int i = 0 ; i < drinks.length ; i++)
		{
			shop.addItem(new Item(drinks[i][1], Integer.parseInt(drinks[i][0])));
		}
		Person[] residents = new Person[POPULATION] ;
		for(int i = 0 ; i < POPULATION ; i++)
		{
			residents[i] = new Person("Person" + i, juice, milk, beer, wine) ;
			residents[i].act(shop) ;
		}
		for(int i = 0 ; i < POPULATION ; i++)
		{
			Person p = residents[i] ;
			if(p.isAlcoholic())
			{
				alcoholics++ ;
				if(p.getAge() < DRINKING_AGE)
					underAgeAlcoholics++ ;
			}
			if(p.isLactoseIntolerant())
				lactoseIntolerants++ ;
			if(p.isHappy())
				satisfied++ ;
		}
		alcoholismRate = percentage.format((alcoholics/(double)POPULATION)) ;
		underAgeAlcoholism = percentage.format((underAgeAlcoholics/(double)POPULATION)) ;
		lactoseRate = percentage.format((lactoseIntolerants/(double)POPULATION)) ;
		townSatisfaction = percentage.format((satisfied/(double)POPULATION)) ;
		System.out.println("The rate of alcoholism in the town is: " + alcoholismRate) ;
		System.out.println("The rate of under age alcoholism in the town is: " + underAgeAlcoholism) ;
		System.out.println("The rate of lactose intolerance in the town is: " + lactoseRate) ;
		System.out.println("The rate of consumer satisfaction with the store in the town is: " + townSatisfaction) ;
	}
	
	//CHEN NEED THIS PLEASE
	//needs to take the user input as explained in the prints above, and make them into a 2d Array. one layer number, other layer the name
	private static String[][] decipher(String gE) {
		
		return new String[0][0];
	}
	
}