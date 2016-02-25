package project.gameDemo;

/** Cindy---completed player class **/
public class Player {
	static  String name;
	static String playerImg;
	static boolean isVisible;
	static int index;
	static int score;

	public Player(String name, String playerImg, boolean isVisible, int id) {
		this.name = name;
		this.playerImg = playerImg;
		this.isVisible = isVisible;
		index = id;
	}

	public void setVisible(boolean isVisible) {
		this.isVisible = isVisible;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getScore() {
		return score;
	}

	public String getName() {
		return name;
	}

	public String getPlayerImg() {
		return playerImg;
	}

	public boolean getVisible() {
		return isVisible;
	}

	public int getId() {
		return index;
	}

}
