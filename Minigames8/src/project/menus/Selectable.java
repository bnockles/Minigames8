package project.menus;

import java.awt.Graphics2D;

public interface Selectable {
	
	void paintSelected(Graphics2D g);
	void paintUnselected(Graphics2D g);
	void confirm();
	
}
