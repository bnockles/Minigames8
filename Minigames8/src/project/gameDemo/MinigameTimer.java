package project.gameDemo;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

public class MinigameTimer {

	private int seconds;
	private int width;
	private int height;
	BufferedImage image;
	BufferedImage icon;	

	public MinigameTimer(int seconds) {
		this.seconds = seconds;
		width = 55;
		height = 55;
		image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
	}
	
	public final void update(){
		Graphics2D g2 = (Graphics2D)image.getGraphics();
		paint(g2);
	}

	private void paint(Graphics2D g2) {
		g2.setColor(Color.black);
		g2.fillArc(0, 0, 54, 54, 0, 360);
		if(getSeconds() <= 5){
			g2.setColor(Color.red);
			g2.fillOval(2, 2, 50, 50);	
			g2.setColor(Color.white);
			g2.setFont(new Font(g2.getFont().getFontName(), Font.PLAIN, 25));
		} else {
			g2.setColor(Color.white);
			g2.fillOval(2, 2, 50, 50);	
			g2.setColor(Color.black);
			g2.setFont(new Font(g2.getFont().getFontName(), Font.PLAIN, 25));
		}
		if(getSeconds() >= 10){
			g2.drawString(Integer.toString(getSeconds()) , 12, 37);
		} else {
			g2.drawString(Integer.toString(getSeconds()) , 20, 37);
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