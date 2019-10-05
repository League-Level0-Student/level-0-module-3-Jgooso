//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _01_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;
import java.util.Random;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		Robot rob = new Robot();
		Random ran = new Random();
		rob.setSpeed(10);
		rob.penDown();
		rob.setPenWidth(10);
		while (1==1) {
		//3. Ask the user what color they would like the robot to draw
		String color = JOptionPane.showInputDialog(null, "What color do you want");
		//5. Use an if/else statement to set the pen color that the user requested
		if( color.equals("red")) {
			rob.setPenColor(255,10,10);
		}else if( color.equals("orange")) {
			rob.setPenColor(255,120,0);
		}else if( color.equals("yellow")) {
			rob.setPenColor(125,125,0);
		}else if( color.equals("green")) {
			rob.setPenColor(0,255,0);
		}else if( color.equals("blue")) {
			rob.setPenColor(0,0,255);
		}else if(color.equals("purple")) {
			rob.setPenColor(125,0,255);
		}
        //6. If the user doesn’t enter anything, choose a random color
			if(color.contentEquals("")) {
				int rand = ran.nextInt(5);
				if( rand == 0) {
					rob.setPenColor(255,10,10);
				}else if( rand == 1) {
					rob.setPenColor(255,120,0);
				}else if(rand == 2) {
					rob.setPenColor(125,125,0);
				}else if(rand == 3) {
					rob.setPenColor(0,255,0);
				}else if(rand == 4) {
					rob.setPenColor(0,0,255);
				}else if(rand == 5) {
					rob.setPenColor(125,0,255);
				} 
			}
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		
	    //2. Make the robot draw a shape (this will take more than one line of code)
			for(int i = 0; i<4; i++) {
				rob.move(100);
				rob.turn(90);
			}

	}
	}
}
