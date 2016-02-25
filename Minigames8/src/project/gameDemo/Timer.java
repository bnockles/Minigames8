package project.gameDemo;

/* John Hocknell and Christine Yu */

public class Timer {
	
	private int seconds;
	private int interval;
	
	public Timer(int seconds, int interval) {
		this.seconds = seconds;
		this.interval = interval;	
		interval = Math.abs(interval); //ensures that the interval is not negative
		while (seconds >= 0){
			GameSubTeamScreen.time(seconds);
			long time1 = System.currentTimeMillis();
			while (System.currentTimeMillis() - time1 < 1000){
				//creates a delay
			}
			seconds -= interval;
		}
	}
}