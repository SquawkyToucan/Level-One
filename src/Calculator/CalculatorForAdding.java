package Calculator;

import javax.swing.JOptionPane;

public class CalculatorForAdding {
public static void main(String[] args){
	String num1 = JOptionPane.showInputDialog("What is the first number you'd like to add?");
	double numOne = Double.parseDouble(num1);
	String num2 = JOptionPane.showInputDialog("What is the second number you would to add?");
	double numTwo = Double.parseDouble(num2);
	add(numOne, numTwo);
}
static void add(double one, double two){
	double addAnswer = one + two;
	System.out.println(addAnswer);
}
}
