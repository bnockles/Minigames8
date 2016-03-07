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
public class InfoBox  {
	
//	public static String info = "hello" ;
	public static int x ;
	public static int y ;
	public static int width ;
	public static int height ;
	public static String info ;
	public static Color rectColor ;
	public static Color textColor ;
	static Graphics g ;
	
	public void setGraphics(Graphics g)
	{
		this.g = g ;
	}
	
	public InfoBox(int x, int y, int width, int height, String info, Graphics g)
	{
		this.x = x ;
		this.y = y ;
		this.width = width ;
		this.height = height ;
		this.info = info ;
		this.g = g ;
		this.rectColor = Color.green ;
		this.textColor = Color.red ;
		paint(g) ;
	}
	
	public InfoBox(int x, int y, int width, int height, String info, Graphics g, Color rectColor, Color textColor)
	{
		this.x = x ;
		this.y = y ;
		this.width = width ;
		this.height = height ;
		this.info = info ;
		this.g = g ;
		this.rectColor = rectColor ;
		this.textColor = textColor ;
		paint(g) ;
	}
	
	private static void paint(Graphics g) {
	    int fontSize = 20;
	    
	    g.setFont(new Font("TimesRoman", Font.PLAIN, fontSize));
	    g.setColor(rectColor);
	    g.fillRect(x, y, width, height) ;
	    g.setColor(textColor);
	    g.drawString(info, x+25, y+25);
	    
//	    message(g, info) ;
	  }
	public void message(String newInfo)
	{
		info = newInfo ;
		paint(g) ;
		//repaint() ;
	}
	
	public static void Clear()
	{
		info = "" ;
		paint(g) ;
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
