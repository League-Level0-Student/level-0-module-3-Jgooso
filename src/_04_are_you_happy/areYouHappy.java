package _04_are_you_happy;
import javax.swing.JOptionPane;

public class areYouHappy {
	public static void main(String args[]) {
		String answer = "";
		answer = JOptionPane.showInputDialog(null,"Are you happy");
		if(answer.equalsIgnoreCase("yes")) {
			JOptionPane.showConfirmDialog(null,"Keep doing what you are doing");
		}else if(answer.equalsIgnoreCase("no")) {
			answer = JOptionPane.showInputDialog(null,"Do you want to be happy");
			if(answer.equalsIgnoreCase("no")) {
				JOptionPane.showConfirmDialog(null,"Keep doing what you are doing");
				
			}else if(answer.equalsIgnoreCase("yes")) {
				JOptionPane.showConfirmDialog(null,"Change something");
				
			}
		}
	}
}
