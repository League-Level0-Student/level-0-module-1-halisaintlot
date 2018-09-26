package ifs_ints_and_loops;

import javax.swing.JOptionPane;

public class Remarkable {
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Enter your name.");
		if (name.equals("Maran")) {
			JOptionPane.showMessageDialog(null, "You are good at coding.");
		} else if (name.equals("Alex")) {
			JOptionPane.showMessageDialog(null, "You are a good person.");
		} else if (name.equals("Bryan")) {
			JOptionPane.showMessageDialog(null, "You are nice.");
		} else if (name.equals("Andy")) {
			JOptionPane.showMessageDialog(null, "You are remarkable.");
		} else if (name.equals("Carmen")) {
			JOptionPane.showMessageDialog(null, "You are a good student.");
		} else if (name.equals("Emily")) {
			JOptionPane.showMessageDialog(null, "You are kind.");
		}

	}
}
