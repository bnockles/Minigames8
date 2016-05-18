package project.gameDemo;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.KeyListener;

import project.directors.Game;
import project.directors.Screen;

public class RacingGame extends Screen {

	public RacingGame(Game game) {
		super(game);
		// TODO Auto-generated constructor stub
	}

	@Override
	public KeyListener getKeyListener() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void paintScreen(Graphics2D g2) {
		// TODO Auto-generated method stub
		try {

			g2.drawString("This is a racing game!", 30, 75);
			// y = (y+1)%500;

		} catch (NullPointerException e) {
			// e.printStackTrace();
			System.out
					.println("NullPointerException was thrown (This is expected to happen once, at the very beginning. Check the paintScreen method in the GameSubTeam class if this ever happens more than once )");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
