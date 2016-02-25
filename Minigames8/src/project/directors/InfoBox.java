/**
 * 
 */
package project.directors;

import java.awt.*;

import javax.swing.JFrame;

/**
 * @author Matyas Fenyves
 *
 */
public class InfoBox extends JFrame {
	
//	public static String info = "hello" ;
	public static int x ;
	public static int y ;
	public static int width ;
	public static int height ;
	public static String info = "No Current Message" ;
	Graphics g ;
	
	public void setGraphics(Graphics g)
	{
		this.g = g ;
	}
	
	public InfoBox(int x, int y, int width, int height, Graphics g)
	{
		this.x = x ;
		this.y = y ;
		this.width = width ;
		this.height = height ;
		this.g = g ;
		paint(g) ;
	}
	
	public void paint(Graphics g) {
	    int fontSize = 20;
	    
	    g.setFont(new Font("TimesRoman", Font.PLAIN, fontSize));
	    g.setColor(Color.green);
	    g.fillRect(x, y, width, height) ;
	    g.setColor(Color.red);
	    g.drawString(info, x+25, y+25);
	    
//	    message(g, info) ;
	  }
	public void message(String newInfo)
	{
		info = newInfo ;
		repaint() ;
	}
	//main is for testing
	public static void main(String[] args) {
//		JFrame frame = new JFrame();
//		frame.getContentPane().add(new InfoBox(100, 100, 100, 100));
//	
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.setSize(200,200);
//		frame.setVisible(true);
	}
	
}
