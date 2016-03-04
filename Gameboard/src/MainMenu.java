
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.net.URL;

import javax.imageio.ImageIO;

public class MainMenu extends Screen {
	BufferedImage icon;
	public static Player Ash = new Player("Ash", determineImgSrc());
	
	public MainMenu(Game game) {
		super(game);
	}

	public KeyListener getKeyListener() {
		return null;
	}

	public void paintScreen(Graphics2D g2) {
		icon = null;
		String imgSrc = determineImgSrc();
		try{
		URL url = getClass().getResource(imgSrc); 
		icon = ImageIO.read(url);
		}catch(Exception e){
		e.printStackTrace();
		}
		g2.drawImage(icon, 0, 0, null);
		g2.drawImage(Ash.getPlayerImage(), 270, 270, null);
	}
	public String determineImgSrc(){
		int thing = Math.random()*3;
		if(int==0){
		return 
		}
		if(int==1){
		return "/images/pokemonDemo1.png";	
		}
		if(int==2){
		return "/images/pokemonDemo2.png";
		}
		return "/images/pokemonDemo.png";
	}
}
