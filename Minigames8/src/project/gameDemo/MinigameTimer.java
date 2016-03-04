package project.gameDemo;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

public class MinigameTimer {

	private int seconds;
	private int width;
	private int height;
	BufferedImage image;
	

	public MinigameTimer(int seconds) {
		this.seconds = seconds;
		width = 50;
		height = 25;
		image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
	}
	
	public final void update(){
		Graphics2D g2 = (Graphics2D)image.getGraphics();
		paint(g2);
	}

	private void paint(Graphics2D g2) {
		if(this.seconds > 5){
			g2.setColor(Color.blue);
			g2.fillRect(0, 0, width, height);	
			g2.setColor(Color.white);
			g2.drawString(Integer.toString(getSeconds()), 20, 20);
		} else {
			g2.setColor(Color.red);
			g2.fillRect(0, 0, width, height);	
			g2.setColor(Color.white);
			g2.drawString(Integer.toString(getSeconds()), 20, 20);
		}
	}

	public int getSeconds() {
		return seconds;
	}
	
	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}
	
	public BufferedImage getImage(){
		return image;
	}
}