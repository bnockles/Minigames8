package project.gameDemo;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

public class Timer {
	
	public static void main(String[] args) {
		Timer timer = new Timer(30, 1);
	}

	private int seconds;
	private int interval;
	private int width;
	private int height;
	BufferedImage image;
	

	public Timer(int seconds, int interval) {
		this.seconds = seconds;
		this.interval = interval;	
		interval = Math.abs(interval); //ensures that the interval is not negative
		width = 250;
		height = 150;
		image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
		while (seconds >= 0){
			update();
			long time1 = System.currentTimeMillis();
			while (System.currentTimeMillis() - time1 < 1000){
				//creates a delay
			}
			seconds -= interval;
		}
	}
	
	public final void update(){
		Graphics2D g2 = (Graphics2D)image.getGraphics();
		paint(g2);
	}

	private void paint(Graphics2D g2) {
		g2.setColor(Color.blue);
		g2.fillRect(250, 0, width, height);		
		g2.setColor(Color.white);
		g2.drawString(getStringSeconds(), 20, 20);
	}

	public int getIntSeconds() {
		return seconds;
	}
	
	public String getStringSeconds() {
		return Integer.toString(seconds);
	}
	
	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}
	
	public void setInterval(int interval) {
		this.interval = interval;
	}
	
	public BufferedImage getImage(){
		return image;
	}
}
