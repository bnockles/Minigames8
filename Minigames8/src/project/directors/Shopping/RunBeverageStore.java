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
	static double sold ;
	
	static String alcoholismRate ;
	static String lactoseRate ;
	static String underAgeAlcoholism ;
	static String townSatisfaction ;
	static String shopSold ;
	static String shopExcess ;
	
	/**
	 * @param args
	 */
	static String generalEntry = "" ;
	static DecimalFormat percentage = new DecimalFormat("###.##%") ;
	static Scanner scanner = new Scanner(System.in);
	static Shop shop = new Shop(new Milk("1%fat", 10),new Milk("2%fat", 10),new Milk("lactose-free", 10),new Milk("whole", 10),
			new Milk("fat-free", 10),new Milk("skim", 10),new Milk("chocolate", 10),new Milk("butter", 10),new Milk("raw", 10),
			new Juice("orange", 10),new Juice("cherry", 10),new Juice("grapefruit", 10),new Juice("grape", 10),new Juice("lemon", 10),
			new Juice("apple", 10),new Juice("mango", 10),new Beer("Guinness", 10),new Beer("BlueMoon", 10),new Beer("Heineken", 10),
			new Beer("Corona", 10),new Beer("Budweiser", 10),new Wine("SweetWhiteWine", 10),new Wine("DryWhiteWine", 10),
			new Wine("SweetRedWine", 10),new Wine("DryRedWine", 10));
	static Person[] residents ;
	
	public static void main(String[] args) {
		System.out.println("Enter a population");
		POPULATION = scanner.nextInt();
		residents = new Person[POPULATION] ;
		System.out.println("Enter a legal Drinking age cap");
		DRINKING_AGE = scanner.nextInt();
		System.out.println("Milk Options are: 1%fat, 2%fat, lactose-free, whole, fat-free, skim, chocolate, butter, raw");
		System.out.println("Juice Options are: orange, cherry, grapefruit, grape, lemon, apple, mango");
		System.out.println("Beer Options are: Guinness, BlueMoon, Heineken, Corona, Budweiser");
		System.out.println("Wine Options are: SweetWhiteWine, DryRedWine, SweetRedWine, DryWhiteWine");
		for(int i = 0 ; i < POPULATION ; i++)
		{
			residents[i] = new Person("Person" + i, juice, milk, beer, wine) ;
		}
		while(!generalEntry.equals("quit"))
		{
			run() ;
		}
	}
	public static void run()
	{
		alcoholics = 0 ;
		underAgeAlcoholics = 0 ;
		lactoseIntolerants = 0 ;
		satisfied = 0 ;
		System.out.println() ;
		System.out.println("Enter quantities, followed by the name of each drink you would like in the local store. Separated by commas.");
		System.out.println("Ex. 1 orange,3 BlueMoon,20 1%fat");
		generalEntry = scanner.next();
		generalEntry += scanner.nextLine();
		if(generalEntry.equals("quit"))
		{
			return ;
		}
		String[][] drinks = decipher(generalEntry) ;
		
		for(int i = 0 ; i < drinks.length ; i++)
		{
			shop.addItem(new Item(drinks[i][1], Integer.parseInt(drinks[i][0])));
		}
		for(int i = 0 ; i < POPULATION ; i++)
		{
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
		sold = ((double)shop.getPurchased()/(double)shop.getTotal())/100.00 ;
//		System.out.println(shop.getPurchased());
//		System.out.println(shop.getTotal());
		alcoholismRate = percentage.format((alcoholics/(double)POPULATION)) ;
		underAgeAlcoholism = percentage.format((underAgeAlcoholics/(double)POPULATION)) ;
		lactoseRate = percentage.format((lactoseIntolerants/(double)POPULATION)) ;
		townSatisfaction = percentage.format((satisfied/(double)POPULATION)) ;
		shopSold = percentage.format(sold) ;
		shopExcess = percentage.format((100.00 - sold)/100.00) ;
		System.out.println("The rate of alcoholism in the town is: " + alcoholismRate) ;
		System.out.println("The rate of under age alcoholic in the town is: " + underAgeAlcoholism) ;
		System.out.println("The rate of lactose intolerance in the town is: " + lactoseRate) ;
		System.out.println("The rate of consumer satisfaction with the store in the town is: " + townSatisfaction) ;
		System.out.println("The satisfaction of the shop owner is " + shopSold + ", due to a " + shopExcess + " excess of drinks in stock.") ;
	}
	
	private static String[][] decipher(String gE) {
//		System.out.println(gE);
		String[] s = gE.split(",");
		String[][] de = new String[s.length][2];
//		System.out.println(Arrays.toString(s));
		for(int i = 0; i < s.length; i++)
		{
			String[] temp = s[i].split(" ");
//			System.out.println(Arrays.toString(temp));
			de[i][0] = temp[0];
			de[i][1] = temp[1];
		}
		
		
		return de;
	}
	
}
