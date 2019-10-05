
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _06_birthday_reminder;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "December 24th";
		String dadsBirthday = "July 31st";
		String myBirthday = "February 20th";

		// 2. Find out which birthday the user wants and and store their response in a variable
		String answer = JOptionPane.showInputDialog(null,"Whose birthday do you want?");
		// 3. Print out what the user typed
		System.out.print(answer);
		if(answer.equalsIgnoreCase("mom")) {
			JOptionPane.showConfirmDialog(null, momsBirthday);
		} else if(answer.equalsIgnoreCase("Dad")) {
			JOptionPane.showConfirmDialog(null, dadsBirthday);
		} else if(answer.equalsIgnoreCase("me")) {
			JOptionPane.showConfirmDialog(null, myBirthday);
		} else {
			JOptionPane.showConfirmDialog(null, "Sorry, I do not know that birthday");
		}
		// 4. if user asked for "mom"
			//print mom's birthday
		// 5. if user asked for "dad"
			// print dad's birthday
		// 6. if user asked for your name
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	} 
}
