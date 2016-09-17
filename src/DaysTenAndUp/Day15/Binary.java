package DaysTenAndUp.Day15;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

public class Binary implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton convert = new JButton();
	JTextField entry = new JTextField(20);
	JTextField answer = new JTextField(20);
	public static void main(String[] args) {
		new Binary().run();
	}
	public void run() {
		panel.add(entry);
		panel.add(convert);
		panel.add(answer);
		frame.add(panel);
		frame.setVisible(true);
		frame.pack();
		frame.setSize(275, 135);
		convert.setText("Convert");
		convert.addActionListener(this);
	}
	int convert(String binary) {
		if(binary.length() != 8){
			JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
			return 0;
		}
		 if(!Pattern.matches("\2", binary)) {
			 JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
				return 0;
		 }
		try {
			int asciiValue = Integer.parseInt(binary, 2);
			return asciiValue;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
			//question.setText("");
			return 0;
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		answer.setText(Integer.toString(convert(entry.getText())));
	}
}
