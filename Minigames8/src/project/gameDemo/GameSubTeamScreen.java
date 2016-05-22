package project.gameDemo;

import java.awt.Color;


import javax.swing.JOptionPane;

import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


import project.directors.Game;
import project.directors.Screen;

import java.util.ArrayList;

public class GameSubTeamScreen extends Screen implements KeyListener {

	Minigame currentGame;
	PlayerInfo playerBoxes;
	int y;
	MinigameTimer timer;
	int count = 0;
	private boolean matching;
	private Card card1;
	private Card card2;
	public int limit = 0;
	ArrayList<Card> twoCard = new ArrayList<Card>();
	private boolean tieGame = false;
	private boolean puzzle;

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

		if (k == KeyEvent.VK_N) {
			currentGame = new PuzzleGame();
			puzzle = true;
			timer.setSeconds(7);
		}
		
		if (k == KeyEvent.VK_M) {
			currentGame = new MatchingGame();
			playerBoxes.resetPlayers();
			playerBoxes.setCount(0);
			playerBoxes.setRound(1);
			matching = true;
			timer.setSeconds(7);
		}
		//checks to see if it is a matching game
		if (matching) {
			//cards can be turned over if 2 cards are not flipped
			if (limit != 2) {
				// 1,2,3,4,5,6,7,8 are the keys used to flip each card respectively
				if (k == KeyEvent.VK_1
						//checks to see if the card is not already removed
						&& !currentGame.getDeck().get(0).getCardImg()
								.equals("/images/Cards/gone.png")
						//checks to see if the card is not faced up already
						&& !currentGame.getDeck().get(0).getFace()) {
					//this will flip the card over
					currentGame.flipCard(currentGame.getDeck().get(0));
					twoCard.add(currentGame.getDeck().get(0));
					//makes a message box pop up telling us the value of the card
					JOptionPane.showMessageDialog(null, "The Card is "
							+ currentGame.getDeck().get(0).getletter());
					limit++;
				}
				if (k == KeyEvent.VK_2
						&& !currentGame.getDeck().get(1).getCardImg()
								.equals("/images/Cards/gone.png")
						&& !currentGame.getDeck().get(1).getFace()) {
					currentGame.flipCard(currentGame.getDeck().get(1));
					twoCard.add(currentGame.getDeck().get(1));
					JOptionPane.showMessageDialog(null, "The Card is "
							+ currentGame.getDeck().get(1).getletter());
					limit++;
				}
				if (k == KeyEvent.VK_3
						&& !currentGame.getDeck().get(2).getCardImg()
								.equals("/images/Cards/gone.png")
						&& !currentGame.getDeck().get(2).getFace()) {
					currentGame.flipCard(currentGame.getDeck().get(2));
					twoCard.add(currentGame.getDeck().get(2));
					JOptionPane.showMessageDialog(null, "The Card is "
							+ currentGame.getDeck().get(2).getletter());
					limit++;
				}
				if (k == KeyEvent.VK_4
						&& !currentGame.getDeck().get(3).getCardImg()
								.equals("/images/Cards/gone.png")
						&& !currentGame.getDeck().get(3).getFace()) {
					currentGame.flipCard(currentGame.getDeck().get(3));
					twoCard.add(currentGame.getDeck().get(3));
					JOptionPane.showMessageDialog(null, "The Card is "
							+ currentGame.getDeck().get(3).getletter());
					limit++;
				}
				if (k == KeyEvent.VK_5
						&& !currentGame.getDeck().get(4).getCardImg()
								.equals("/images/Cards/gone.png")
						&& !currentGame.getDeck().get(4).getFace()) {
					currentGame.flipCard(currentGame.getDeck().get(4));
					twoCard.add(currentGame.getDeck().get(4));
					JOptionPane.showMessageDialog(null, "The Card is "
							+ currentGame.getDeck().get(4).getletter());
					limit++;
				}
				if (k == KeyEvent.VK_6
						&& !currentGame.getDeck().get(5).getCardImg()
								.equals("/images/Cards/gone.png")
						&& !currentGame.getDeck().get(5).getFace()) {
					currentGame.flipCard(currentGame.getDeck().get(5));
					twoCard.add(currentGame.getDeck().get(5));
					JOptionPane.showMessageDialog(null, "The Card is "
							+ currentGame.getDeck().get(5).getletter());
					limit++;
				}
				if (k == KeyEvent.VK_7
						&& !currentGame.getDeck().get(6).getCardImg()
								.equals("/images/Cards/gone.png")
						&& !currentGame.getDeck().get(6).getFace()) {
					currentGame.flipCard(currentGame.getDeck().get(6));
					twoCard.add(currentGame.getDeck().get(6));
					JOptionPane.showMessageDialog(null, "The Card is "
							+ currentGame.getDeck().get(6).getletter());
					limit++;
				}
				if (k == KeyEvent.VK_8
						&& !currentGame.getDeck().get(7).getCardImg()
								.equals("/images/Cards/gone.png")
						&& !currentGame.getDeck().get(7).getFace()) {
					currentGame.flipCard(currentGame.getDeck().get(7));
					twoCard.add(currentGame.getDeck().get(7));
					JOptionPane.showMessageDialog(null, "The Card is "
							+ currentGame.getDeck().get(7).getletter());
					limit++;
				}
			}
			//if there are 2 cards flipped already
			if (limit == 2) {
				//card 1 and card 2 are the 2 cards flipped
				card1 = twoCard.get(0);
				card2 = twoCard.get(1);
				
				//determine match checks if the two cards are equal or not
				boolean check = currentGame.determineMatch(card1, card2,
						twoCard);
				//these two cards are a match
				if (check == true) {
					playerBoxes.getPlayer().setScore(
							playerBoxes.getPlayer().getScore() + 1);
				//they are not a match
				} else {
					playerBoxes.transitionTurn();
					timer.setSeconds(7);

				}
				
				if (playerBoxes.getCount() == 4) {
					int[] dScores = playerBoxes.getScores();
					for (int i = 0; i < dScores.length - 1; i++) {
						if (dScores[i] == dScores[i + 1]) {
							JOptionPane.showMessageDialog(null, "It's a tie.");
							tieGame = true;
							break;
						}
					}
					if (tieGame == false) {
						JOptionPane.showMessageDialog(null,
								playerBoxes.determineWin().getName()
										+ "is the winner of round "
										+ playerBoxes.getRound() + ".");
					}
					playerBoxes.resetPlayers();
					playerBoxes.setCount(0);
				}
				if (currentGame.getCounter() == 8) {
					JOptionPane.showMessageDialog(
							null,
							playerBoxes.determineWin().getName()
									+ "is the winner of round "
									+ playerBoxes.getRound() + ".");
					JOptionPane.showMessageDialog(
							null,
							"All cards have been matched. Press 'M' to play again.");
				}
				limit = 0;
			}
		}
		update();
	}

	public void keyReleased(KeyEvent arg0) {

	}

	public void keyTyped(KeyEvent arg0) {


	}

	public KeyListener getKeyListener() {

		return this;
	}

	public void paintScreen(Graphics2D g2) {

		try {

			g2.setColor(Color.black);
			g2.drawImage(playerBoxes.getImage(), 50, 300, null);
			playerBoxes.update();
			if (matching) {
				g2.drawString("This is a matching game", 30, 75);
				g2.drawImage(currentGame.getImage(), 150, 100, null);
				g2.drawString("It is " + playerBoxes.getPlayer().getName()
						+ " turn.", 150, 120);
				currentGame.update();

			}
			if(puzzle){
				g2.drawString("This is a puzzle game", 30, 75);
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
	}

	private void resetTime() {
		if (timer.getSeconds() == 0) {
			timer.setSeconds(7);
		}

	}


}
