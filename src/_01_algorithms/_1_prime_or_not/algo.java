package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class algo {

	
	public static void main(String[] args) {
		String quantity = JOptionPane.showInputDialog("Pick a positive number.");
		
		int num = Integer.parseInt(quantity);
		
		for(int i = 2; i<num; i++) {
if(num % i == 0) {
	JOptionPane.showMessageDialog(null, "Your number is not prime");
	System.exit(0);
}
		}
		JOptionPane.showMessageDialog(null, "Your number is prime");
	}
}
