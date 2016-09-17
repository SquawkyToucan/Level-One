package Day7;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/* This recipe is to be used with the Jeoprady Handout: http://bit.ly/1bvnvd4 */

public class Jeoprady implements ActionListener {
	private JButton firstButton;
	private JButton secondButton;
	private JButton thirdButton;

	private JPanel quizPanel;
	int score = 0;
	JLabel scoreBox = new JLabel("0");
	int buttonCount = 0;

	public static void main(String[] args) {
		new Jeoprady().start();
	}

	private void start() {
		JFrame frame = new JFrame();
		quizPanel = new JPanel();
		frame.setLayout(new BorderLayout());

		// 1. Make the frame show up
		frame.setVisible(true);
		// 2. Give your frame a title
		frame.setTitle("Jeoprady");
		// 3. Create a JPanel variable to hold the header using the createHeader method
		JPanel header = createHeader("Politics, States, and Countries of the World");
		// 4. Add the header component to the quizPanel
		quizPanel.add(header);
		// 5. Add the quizPanel to the frame
		frame.add(quizPanel);
		// 6. Use the createButton method to set the value of firstButton
		firstButton = createButton("$250");
		// 7. Add the firstButton to the quizPanel
		quizPanel.add(firstButton);
		// 8. Write the code inside the createButton() method below. Check that your game looks like Figure 1 in the
		// Jeoprady Handout - http://bit.ly/1bvnvd4.
		// 9. Use the secondButton variable to hold a button using the createButton method
		secondButton = createButton("$500");
		thirdButton = createButton("$1000");
		// 10. Add the secondButton to the quizPanel
		quizPanel.add(secondButton);
		quizPanel.add(thirdButton);
		// 11. Add action listeners to the buttons (2 lines of code)
		firstButton.addActionListener(this);
		secondButton.addActionListener(this);
		thirdButton.addActionListener(this);
		// 12. Fill in the actionPerformed() method below
		
		frame.pack();
		quizPanel.setLayout(new GridLayout(buttonCount + 1, 3));
		frame.add(makeScorePanel(), BorderLayout.NORTH);
		frame.setSize(Toolkit.getDefaultToolkit().getScreenSize().height, Toolkit.getDefaultToolkit().getScreenSize().width);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//}

	/*
	 * 13. Use the method provided to play the Jeoprady theme music
	 * 
	 * 14. Add buttons so that you have $200, $400, $600, $800 and $1000 questions
	 *
	 * [optional] Use the showImage or playSound methods when the user answers a question
	 */
	}
	private JButton createButton(String dollarAmount) {
		// Create a new JButton
		JButton money = new JButton();
		// Set the text of the button to the dollarAmount
		money.setText(dollarAmount);
		// Increment the buttonCount (this should make the layout vertical)
		buttonCount++;
		// Return your new button instead of the temporary button
		return(money);
	}

	public void actionPerformed(ActionEvent arg0) {
		// Use the method that plays the Jeoprady theme music.
		playJeopradyTheme();
		JButton buttonPressed = (JButton) arg0.getSource();
		// If the buttonPressed was the firstButton
		int chooser250 = 0;
		boolean twohundredfifty = true;
		boolean fivehundred = true;
		boolean onethousand = true;
		if(buttonPressed == firstButton) {
			if(chooser250 == 0) {
				askQuestion("This state revolted from Mexico in 1846 during the month of June. What is...?", "California", 250);
				chooser250++;
			}
			if(chooser250 == 1) {
				askQuestion("This state was once a country and was known for the \"Green Mountain Boys.\" What is...?", "Vermont", 250);
				chooser250++;
			}
			if(chooser250 == 2) {
				askQuestion("The Original London Bridge was rebuilt in Lake Havasu City, in this State. What is...?", "Arizona", 250);
				chooser250++;
			}
			if(chooser250 == 3) {
				askQuestion("Cheeseburgers were invented in this state. What is...?", "Kentucky", 250);
				chooser250++;
			}
			if(chooser250 == 4) {
				JOptionPane.showMessageDialog(null, "No more questions in the 250 category!");
				twohundredfifty = false;
			}
		}
		int chooser500 = 0;
		if(buttonPressed == secondButton) {
			if(chooser500 == 0) {
				JOptionPane.showMessageDialog(null, "Daily Double!");
				String dd = JOptionPane.showInputDialog(null, "How much do you want to wager?");
				int dailydouble = Integer.parseInt(dd);
				if(dailydouble > score) {
					JOptionPane.showMessageDialog(null, "Too much! You wagered max.");
					dailydouble = score;
				}
				askQuestion("This was the last state to join the Confederacy. What is...?", "Tennessee", dailydouble);
				chooser500++;
			}
			if(chooser500 == 1) {
				askQuestion("This country has the world's longest coastline.", "Canada", 500);
				chooser500++;
			}
			if(chooser500 == 2) {
				askQuestion("Rio de Jainero hosts this bay, a natural harbor. Where is...?", "Guanabara Harbor", 500);
				chooser500++;
			}
			if(chooser500 == 3) {
				askQuestion("The main colors in the Peruvian flag are white and this color. What is...?", "Red", 500);
				chooser500++;
			}
			if(chooser500 == 4) {
				JOptionPane.showMessageDialog(null, "No more questions in the 500 category!");
				fivehundred = false;
			}
		}
		int chooser = 0;
		if(buttonPressed == thirdButton) {
			if(chooser == 0) {
				askQuestion("The most corrupt country in the world, according to Forbes. What is...?", "Somalia", 1000);
				chooser++;
			}
			if(chooser == 1) {
				askQuestion("This right wing party in Europe, called Alternative für Deutschland, is translated to this. What is ...?", "Alternative for Germany", 1000);
				chooser++;
			}
			if(chooser == 2) {
				JOptionPane.showMessageDialog(null, "Daily Double!");
				String dd = JOptionPane.showInputDialog(null, "How much do you want to wager?");
				int dailydouble = Integer.parseInt(dd);
				if(dailydouble > score) {
					JOptionPane.showMessageDialog(null, "Too much! You wagered max.");
					dailydouble = score;
				}
				askQuestion("Jo Cox, a British MP who was killed by an anti-Euro radical, was a member of this political party. What is the...?", "Labour Party", dailydouble);
				chooser++;
			}
			if(chooser == 3) {
				askQuestion("This person cheats in walking all the time. Who is...?", "Dalia", 1000);
				chooser++;
			}
			if(chooser == 4) {
				JOptionPane.showMessageDialog(null, "No more questions in the 1000 category!");
				onethousand = false;
			}
		}
		if(twohundredfifty&&fivehundred&&onethousand == false) {
			JOptionPane.showMessageDialog(null, "No more questions! You earned $" + score + "!");
		}
		
		// Call the askQuestion() method

		// Fill in the askQuestion() method. When you play the game, the score should change.

		// Or if the buttonPressed was the secondButton

		// Call the askQuestion() method with a harder question

		// Clear the button text (set the button text to nothing)

	}

	private void askQuestion(String question, String correctAnswer, int prizeMoney) {
		// Remove this temporary message
		// Use a pop up to ask the user the question
		String ask = JOptionPane.showInputDialog(null, question);
		// If the answer is correct
		if(ask.contains(correctAnswer)) {
			score = score + prizeMoney;
			JOptionPane.showMessageDialog(null, correctAnswer + " was the correct answer. You were awarded " + prizeMoney + ".");
		}
		// Increase the score by the prizeMoney
		updateScore();
		// Call the updateScore() method
		// Pop up a message to tell the user they were correct

		// Otherwise
		if(!ask.contains(correctAnswer)) {
			score = score - prizeMoney;
			JOptionPane.showMessageDialog(null, "Sorry, the correct answer was " + correctAnswer + ". You lost " + prizeMoney + " points.");
		}
		// Decrement the score by the prizeMoney
		// Pop up a message to tell the user the correct answer

		// Call the updateScore() method
		updateScore();
	}

	public static void playJeopradyTheme() {
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("/Users/League/Google Drive/league-sounds/Jeopardy.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}


	private Component makeScorePanel() {
		JPanel panel = new JPanel();
		panel.add(new JLabel("score:"));
		panel.add(scoreBox);
		panel.setBackground(Color.CYAN);
		return panel;
	}

	private void updateScore() {
		scoreBox.setText("" + score);
	}

	private JPanel createHeader(String topicName) {
		JPanel panelj = new JPanel();
		panelj.setLayout(new BoxLayout(panelj, BoxLayout.PAGE_AXIS));
		JLabel l1 = new JLabel(topicName);
		l1.setAlignmentX(Component.CENTER_ALIGNMENT);
		panelj.add(l1);
		return panelj;
	}

	void showCorrectImage() {
		showImage("correct.jpg");
	}

	void showIncorrectImage() {
		showImage("incorrect.jpg");
	}

	private void showImage(String fileName) {
		JFrame frame = new JFrame();
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		JLabel image = new JLabel(icon);
		frame.add(image);
		frame.setVisible(true);
		frame.pack();
	}
}
