package _05_horoscope;
import javax.swing.JOptionPane;

public class horoscope {
	public static void main(String[]args) {
	String starSign = JOptionPane.showInputDialog(null,"What is your star sign");
	if( starSign.equalsIgnoreCase("Capricorn")) {
	JOptionPane.showConfirmDialog(null, "You will die");
	} else if( starSign.equalsIgnoreCase("Pisces")) {
	JOptionPane.showConfirmDialog(null, "You will die");
	} else if( starSign.equalsIgnoreCase("Virgo")) {
	JOptionPane.showConfirmDialog(null, "You will die");
	} else if( starSign.equalsIgnoreCase("Taurus")) {
	JOptionPane.showConfirmDialog(null, "You will die");
	} else if( starSign.equalsIgnoreCase("Cancer")) {
	JOptionPane.showConfirmDialog(null, "You will die");
	} else if( starSign.equalsIgnoreCase("Gemini")) {
	JOptionPane.showConfirmDialog(null, "You will die");
	} else if( starSign.equalsIgnoreCase("Leo")) {
	JOptionPane.showConfirmDialog(null, "You will die");
	} else if( starSign.equalsIgnoreCase("Aquarius")) {
	JOptionPane.showConfirmDialog(null, "You will die");
	} else if( starSign.equalsIgnoreCase("Aries")) {
	JOptionPane.showConfirmDialog(null, "You will die");
	} else if( starSign.equalsIgnoreCase("Scorpio")) {
	JOptionPane.showConfirmDialog(null, "You will die");
	} else if( starSign.equalsIgnoreCase("Libra")) {
	JOptionPane.showConfirmDialog(null, "You will die");
	}else {
		JOptionPane.showConfirmDialog(null, "That is not a star sign");
	}
}
}
