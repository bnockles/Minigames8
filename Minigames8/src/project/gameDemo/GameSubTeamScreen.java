package project.gameDemo;

import java.awt.Color;

import javax.swing.JFrame;

import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import project.directors.Game;
import project.directors.Screen;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;

public class GameSubTeamScreen extends Screen implements KeyListener {

	MatchingGame currentGame;
	PlayerInfo playerBoxes;
	int y;
	MinigameTimer timer;
	int count = 0;
	private boolean matching;
	private Card card1;
	private Card card2;
	private int limit = 0;

	public GameSubTeamScreen(Game game) {
		super(game);
		playerBoxes = new PlayerInfo();
		timer = new MinigameTimer(7);

		update();
		y = 50;
	}

	public void keyPressed(KeyEvent arg0) {
		int k = arg0.getKeyCode();
		if (k == KeyEvent.VK_P)
			playerBoxes.penalizeAllPlayers(10);
		if (k == KeyEvent.VK_SPACE) {
			int randPoint = (int) (Math.random() * 100 + 1);// 1-100
			int pScore = playerBoxes.getPlayer().getScore();
			playerBoxes.getPlayer().setScore(pScore += randPoint);

		}
		if (k == KeyEvent.VK_1) {
			this.game.setScreen(new RacingGame(this.game));

		}
		if (k == KeyEvent.VK_2) {
			currentGame = new MatchingGame();
			matching = true;
		}
		if (matching) {
			if (k == KeyEvent.VK_Q) {

				
				card1= currentGame.getDeck().get(0);
				currentGame.flipCard(card1);
				limit++;

			}
			if (k == KeyEvent.VK_W) {
				
				card2 = currentGame.getDeck().get(1);
				limit++;
			}
		}
		update();
	}

	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	public KeyListener getKeyListener() {
		// TODO Auto-generated method stub
		return this;
	}

	public void paintScreen(Graphics2D g2) {

		try {

			g2.setColor(Color.black);
			g2.drawString("This Demo is working!", 30, 75);
			// y = (y+1)%500;
			g2.drawImage(playerBoxes.getImage(), 50, 300, null);
			playerBoxes.update();
			if (matching) {
				g2.drawImage(currentGame.getImage(), 150, 100, null);
				currentGame.update();
			}
			count++;
			if (count >= 30 && timer.getSeconds() > 0) {
				count = 0;
				timer.setSeconds(timer.getSeconds() - 1);
			}
			if (timer.getSeconds() == 0) {
				playerBoxes.transitionTurn();
				resetTime();
			}
			g2.drawImage(timer.getImage(), 910, 50, null);
			timer.update();
		} catch (NullPointerException e) {
			// e.printStackTrace();
			System.out
					.println("NullPointerException was thrown (This is expected to happen once, at the very beginning. Check the paintScreen method in the GameSubTeam class if this ever happens more than once )");
		} catch (Exception e) {
			e.printStackTrace();
		}
		// Arik Commit test
	}

	private void resetTime() {
		// TODO Auto-generated method stub
		if (timer.getSeconds() == 0) {
			timer.setSeconds(7);
		}

	}

	public static void time(int seconds) {
		// TODO Auto-generated method stub

	}

}
