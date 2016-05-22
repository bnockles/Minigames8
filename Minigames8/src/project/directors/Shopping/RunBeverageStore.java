package project.directors.Shopping;
import java.util.* ;

public class RunBeverageStore {
	static int POPULATION ;
	static int DRINKING_AGE ;
	static String[] milk = {"1% fat","2% fat", "lactose-free","whole","fat-free","skim","chocolate","butter","raw"};
	static String[] juice = {"orange","cherry","grapefruit","grape","lemon","apple","mango"};
	static String[] beer = {"Guinness","Blue Moon","Heineken","Corona","Budweiser"};
	static String[] wine = {"Sweet White Wine", "Dry Red Wine", "Sweet Red Wine", "Dry White Wine"};
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
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
		String generalEntry = scanner.nextLine();
		String[][] drinks = decipher(generalEntry) ;
	}

	private static String[][] decipher(String gE) {
		
		return null;
	}
	
}
