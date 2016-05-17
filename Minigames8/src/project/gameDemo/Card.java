package project.gameDemo;

public class Card {
	private boolean face;
	private String letter;

	public Card(String cardImg, String letter) {
		this.letter = letter;
	}

	public String getletter() {
		return letter;

	}

	public void setLetter(String letter) {
		this.letter = letter;

	}

	public boolean getFace() {
		return face;
	}

	public void setFace(boolean face) {
		this.face = face;
	}
}
