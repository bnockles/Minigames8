
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.KeyListener;

public class MainMenu extends Screen {
	
	public MainMenu(Game game) {
		super(game);
	}

	public KeyListener getKeyListener() {
		return null;
	}

	public void paintScreen(Graphics2D g2) {
		for (int i = 0; i < mapSections.size(); i++) {
			if (i == playerRegion) {
				BufferedImage backgrnd = mapSections.get(i).getMap();
				UtilityMethods.scaleImage(g2, backgrnd, 0, 0, width, height);
			}
		}
		for (int i = 0; i < obstacles.size(); i++) {
			if(playerRegion == obstacles.get(i).getRegion()){
				BufferedImage test = obstacles.get(i).getImage();
				UtilityMethods.scaleImage(g2, test, obstacles.get(i).getxPos(), obstacles.get(i).getyPos(),
						obstacles.get(i).getSizeX(), obstacles.get(i).getSizeY());
			}
		}
		g2.setColor(Color.red);
		g2.drawOval(xPos, yPos, 30, 30);
		
	}

}