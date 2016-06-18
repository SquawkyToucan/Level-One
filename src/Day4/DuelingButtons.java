package Day4;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DuelingButtons implements ActionListener {
	public static void main(String[] args) {
		new DuelingButtons().createUI();
	}
	int rightDim = 200;
	int leftDim = 200;
	int left = 0;
	int right = 0;
	JButton leftButton = new JButton();
	JButton rightButton = new JButton();
	Dimension BIG = new Dimension(400,400);
	Dimension SMALL = new Dimension(rightDim, rightDim);
	Dimension SCHEISSE = new Dimension(leftDim, leftDim);
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	private void createUI() {
		// 1. Add the panel to the frame
		frame.add(panel);
		leftButton.setPreferredSize(SMALL);
		rightButton.setPreferredSize(SMALL);
		// 2. Make the frame visible
		frame.setVisible(true);
		// 3. Set the text of the leftButton to "Click me!"
		leftButton.setText("Click me!");
		// 4. Set the text of the rightButton to "Click me!"
		rightButton.setText("Click me!");
		// 5. Add an action listener to the leftButton
		leftButton.addActionListener(this);
		// 6. Add an action listener to the rightButton
		rightButton.addActionListener(this);
		// 7. Add the leftButton to the panel
		panel.add(leftButton);
		// 8. Add the rightButton to the panel
		panel.add(rightButton);
		// 9. Pack the frame
		frame.pack();
		// 10. Set the title of the frame to "Demanding Buttons"
		frame.setTitle("Demanding Buttons");
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		JButton buttonPressed = (JButton) arg0.getSource();
		if(buttonPressed == leftButton){
			left++;
			for (int i = 0; i < 10; i++) {
				rightDim++;	
				leftDim--;
			}
			Dimension SMALL = new Dimension(rightDim, rightDim);
			Dimension SCHEISSE = new Dimension(leftDim, leftDim);
			rightButton.setText("No, click me!");
			rightButton.setPreferredSize(SMALL);
			leftButton.setText("Click me!");
			leftButton.setPreferredSize(SCHEISSE);
			frame.pack();
			System.out.println("Left: " + left + " Right: " + right);
		}
		if(buttonPressed == rightButton){
			right++;
			for (int i = 0; i < 10; i++) {
				rightDim--;	
				leftDim++;
			}
			Dimension SMALL = new Dimension(rightDim, rightDim);
			Dimension SCHEISSE = new Dimension(leftDim, leftDim);
			leftButton.setText("No, click me!");
			leftButton.setPreferredSize(SCHEISSE);
			rightButton.setText("Click me!");
			rightButton.setPreferredSize(SMALL);
			frame.pack();
			System.out.println("Left: " + left + " Right: " + right);
		}
		frame.pack();
	}
}