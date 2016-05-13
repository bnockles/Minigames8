package project.gameDemo;

public interface GameType {
	public final int MATCHING_GAME = 0;
	public final int RACING_GAME = 1;
	public final int PUZZLE_GAME = 2;

	public int getGameType();
	public void setGameType(int gameID);
}
