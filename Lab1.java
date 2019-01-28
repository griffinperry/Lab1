 /* Program Name: Lab 1 */
 /* */
 /* Student Name: Griffin McPherson */
 /* Semester: Spring 2019 */
 /* Class-Section: CoSc10403-035 */
 /* Instructor: Dr. Sanchez */
 /* */
 /* Program Overview: */
 /* This program creates a simple Java applet with one */
 /* label and two buttons. */
 /* */
 /* Input: */
 /* There is no user input to this program. */
 /* */
 /* Output: */
 /* An applet displaying a GUI with a label and 2 buttons. */
 /* */
 /* Program Limitations: */
 /* The buttons are inactive. */
 /* */
 /* Significant Program Variables: */
 /* lblPress - a label displaying "Two Buttons Frame" */
 /* startB - an inactive START button */
 /* haltB - an inactive HALT button */

import java.awt.*;
import javax.swing.*;
public class Lab1 extends JFrame
	{
		public JButton startB = new JButton("START");
		public JButton haltB = new JButton("HALT");
		JLabel lblPress = new JLabel("two buttons frame");
		public static void main(String args[])
		{
			// Construct the frame
			new Lab1();
		}
	public Lab1()
	{ setTitle("POP UP WINDOW");
		// Frame Constructor
	  add(startB);
	  add(lblPress);
	  add(haltB);
	  // although lab1 instructions ask for 300 x 200 pixels, I set mine to 300 x 100 to accurately match the picture of the JFrame in the instructions 
	  setBounds(200, 400, 300, 100);
	  setLayout(new FlowLayout());
	  setVisible(true);
	  	// Set statement to be printed on the console
	  System.out.println("Feedback on the console" + " Button 1 " + startB.getText() + ", Button 2 " + haltB.getText() + ", Label " + lblPress.getText());
	}
}

