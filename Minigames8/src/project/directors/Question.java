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
public class Question {
	
	private Frame frame ;
	
	public Question(Frame frame)
	{
		this.frame = frame ;
	}
	
	public int Prompt(String question, String objName, Icon icon, String[] options)
	{
		return JOptionPane.showOptionDialog(frame,
			    question,
			    objName,
			    JOptionPane.YES_NO_CANCEL_OPTION,
			    JOptionPane.QUESTION_MESSAGE,
			    icon,
			    options,
			    options[2]);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
