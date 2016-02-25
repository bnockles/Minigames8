+package project.gameDemo;
 +
 +//Cindy---completed player class 
 +public class Player {
 +	private String name;
 +	private String playerImg;
 +	boolean isVisible;
 +	int index;
 +	int score;
 +
 +	public Player(String name, String playerImg, boolean isVisible, int id) {
 +		this.name = name;
 +		this.playerImg = playerImg;
 +		this.isVisible = isVisible;
 +		index = id;
 +	}
 +
 +	public void setVisible(boolean isVisible) {
 +		this.isVisible = isVisible;
 +	}
 +
 +	public String getName() {
 +		return name;
 +	}
 +
 +	public String getPlayerImg() {
 +		return playerImg;
 +	}
 +
 +	public boolean getVisible() {
 +		return isVisible;
 +	}
 +	public int getId(){
 +		return index;
 +	}
 +
 +}
