package project.directors;

import java.awt.FontMetrics;
import java.awt.Graphics2D;

public class UtilityMethods {
	
	public static void centerText(Graphics2D g2, String text, int areaWidth, int areaHeight){
		FontMetrics fm = g2.getFontMetrics();
		int x = (areaWidth-fm.stringWidth(text))/2;
		int y = (areaHeight+g2.getFont().getSize()+fm.getAscent())/2;
		g2.drawString(text, x, y);
	}
	public static void centerTextAtY(Graphics2D g2, String text, int areaWidth, int y){
		FontMetrics fm = g2.getFontMetrics();
		int x = (areaWidth-fm.stringWidth(text))/2;
		g2.drawString(text, x, y);
	}
}
