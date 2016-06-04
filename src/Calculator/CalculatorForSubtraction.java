package Calculator;

import javax.swing.JOptionPane;

public class CalculatorForSubtraction {
	public static void main(String[] args){
		String num1 = JOptionPane.showInputDialog("What is the Minuend?");
		double numOne = Double.parseDouble(num1);
		String num2 = JOptionPane.showInputDialog("What is the Subtrahend?");
		double numTwo = Double.parseDouble(num2);
		subtract(numOne, numTwo);
	}
	static void subtract(double one, double two){
		double minusAnswer = one - two;
		System.out.println(minusAnswer);
	}
}
