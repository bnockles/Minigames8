package project.gameDemo;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.net.URL;

import javax.imageio.ImageIO;

public class Card {
	private boolean face;
	private String letter;
	private String cardImg;
	BufferedImage icon;

	public Card(String cardImg, String letter,boolean face) {
		this.cardImg = cardImg;
		this.letter = letter;
		this.face = face;
		icon = null;
		try {
			URL url = getClass().getResource(cardImg);
			icon = ImageIO.read(url);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void changeImg(){
		try {
			URL url = getClass().getResource(cardImg);
			icon = ImageIO.read(url);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public String getletter() {
		return letter;

	}

	public void setLetter(String letter) {
		this.letter = letter;

	}
	public String getCardImg(){
		return cardImg;
	}
	public void setCardImg(String cardImg){
		this.cardImg = cardImg;
	}

	public boolean getFace() {
		return face;
	}

	public void setFace(boolean face) {
		this.face = face;
	}

	public BufferedImage getIcon() {
		return icon;

	}
}
