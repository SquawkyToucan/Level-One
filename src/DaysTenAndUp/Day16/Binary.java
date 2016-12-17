package DaysTenAndUp.Day16;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

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
	String convert(String binary) {
	   	 int asciiValue = Integer.parseInt(binary, 2);
	   	 char theLetter = (char) asciiValue;
	   	 return "" + theLetter;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		answer.setText(convert(entry.getText()));
	}
}
