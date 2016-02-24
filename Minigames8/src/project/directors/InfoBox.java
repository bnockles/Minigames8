/**
 * 
 */
package project.directors;

import java.awt.*;

import javax.swing.*;

/**
 * @author Matyas Fenyves
 *
 */
public class InfoBox extends JPanel {
	
//	public static String info = "hello" ;
	public static int x ;
	public static int y ;
	public static int width ;
	public static int height ;
	
	public InfoBox(int x, int y, int width, int height)
	{
		this.x = x ;
		this.y = y ;
		this.width = width ;
		this.height = height ;
	}
	
	public void paint(Graphics g) {
	    int fontSize = 20;
	    String info = "" ;
	    g.setFont(new Font("TimesRoman", Font.PLAIN, fontSize));
	    g.setColor(Color.blue);
	    g.fillRect(x, y, width, height) ;
	    
	    
	    message(g, info) ;
	  }
	public void message(Graphics g, String info)
	{
		g.setColor(Color.red);
	    g.drawString(info, x+25, y+25);
	}
	//main is for testing
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.getContentPane().add(new InfoBox(100, 100, 100, 100));
	
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(200,200);
		frame.setVisible(true);
	}
	
}
