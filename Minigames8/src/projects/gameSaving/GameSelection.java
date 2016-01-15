package projects.gameSaving;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import project.menus.Selectable;

public class GameSelection implements Selectable{

	boolean selected;
	BufferedImage image;
	int width;
	int height;
	
	public GameSelection(int width, int height){
		this.width = width;
		this.height = height;
		image = new BufferedImage(width,height,BufferedImage.TYPE_INT_ARGB);
	}
	
	public void paintSelected(Graphics2D g) {
		// TODO Auto-generated method stub
		
	}

	public void paintUnselected(Graphics2D g) {
		// TODO Auto-generated method stub
		
	}

	public void confirm() {
		// TODO Auto-generated method stub
		
	}

}
