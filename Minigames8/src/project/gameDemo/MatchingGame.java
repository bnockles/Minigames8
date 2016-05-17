package project.gameDemo;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.net.URL;
import java.util.ArrayList;

import javax.imageio.ImageIO;

public class MatchingGame extends Minigame {

	private BufferedImage image;
	private int width;
	private int height;
	private BufferedImage icon;
	private String[] cards;

	public MatchingGame() {
		width = 500;
		height = 100;
		image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
		icon = null;

		try {
			URL url = getClass().getResource("/images/Cards/back.png");
			icon = ImageIO.read(url);
		} catch (Exception e) {
			e.printStackTrace();
		}
		update();
	}

	public final void update() {
		Graphics2D g2 = (Graphics2D) image.getGraphics();
		paint(g2);
	}

	public void paint(Graphics2D g2) {
		// TODO Auto-generated method stub

		g2.setColor(Color.yellow);
		g2.fillRect(0, 0, width, height);
		g2.drawImage(image, 0, 0, width, height, 0, 0, image.getWidth(),
				image.getHeight(), null);

	}

	public BufferedImage getImage() {
		// TODO Auto-generated method stub
		return image;
	}

}
