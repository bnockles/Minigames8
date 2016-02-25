/**
 * 
 */
package project.directors;
import java.awt.* ;
import javax.swing.* ;
/**
 * @author Matyas Fenyves
 *
 */
public class Alert {
	private Frame frame ;
	
	public Alert(Frame frame)
	{
		this.frame = frame ;
	}
	
	public void message(String playerName, String message)
	{
		JOptionPane.showMessageDialog(frame,
			    message,
			    playerName,
			    JOptionPane.WARNING_MESSAGE);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
}
