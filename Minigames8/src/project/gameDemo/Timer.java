package project.gameDemo;

public class Timer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		countdown();
	}
	public static void countdown(){
		countdown(30);
	}

	public static void countdown(int start){
		countdown(start, 1);
	}

	public static void countdown(int start, int step){
		int num = start;
		step = Math.abs(step);
		while (num >= 0)
		{
			System.out.print(num + " ");
			num -= step;
			long time1 = System.currentTimeMillis();
			while (System.currentTimeMillis() - time1 < 1000)
			{
				//creates a delay
			}
		}

	}}
