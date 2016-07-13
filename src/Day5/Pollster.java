package Day5;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Pollster {
public static void main(String[] args){
	new Pollster().start();
}
public void start(){
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton Op1 = new JButton();
	JButton Op2 = new JButton();
	Dimension VOTE = new Dimension(250, 100);
	/*boolean brexit;
	boolean trump;
	boolean guncontrol;
	boolean abortion;
	boolean taxes;*/
	//Start off by setting up the size of the buttons
	Op1.setPreferredSize(VOTE);
	Op2.setPreferredSize(VOTE);
	//Add buttons to panel
	panel.add(Op1);
	panel.add(Op2);
	//Panel to frame
	frame.add(panel);
	//Show Panel
	panel.setVisible(true);
	frame.pack();
	//Set up for Brexit
	
}
}
