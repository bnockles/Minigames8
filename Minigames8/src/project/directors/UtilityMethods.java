package project.directors;

import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;

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
	
	public static void scaleImage(Graphics2D g2,BufferedImage originalImage, int x, int y, int newWidth, int newHeight){
		
		int w = originalImage.getWidth();
		int h = originalImage.getHeight();
		g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
		g2.drawImage(originalImage, x, y, x+newWidth,y+newHeight, 0, 0, w, h, null);


	}
}
