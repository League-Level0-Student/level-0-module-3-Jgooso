package _16_obedient_robot;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;
import java.util.Random;

public class obedientRobot {
	static Robot rob = new Robot();
	public static void main(String[] args) {
		
		Random ran = new Random();
		rob.setSpeed(10);
		rob.penDown();
		rob.setPenWidth(10);
		while (1==1) {
			String shape = JOptionPane.showInputDialog(null, "What shape do you want");
			/*
			rob.setPenWidth(50);
			rob.setX(rob.getX()-25);
			rob.microMove(50);
			*/
			if( shape.equals("Square")) {
				chooseColor();
				drawSquare();
			}else if( shape.equals("Circle")) {
				chooseColor();
				drawCircle();
			}else if( shape.equals("Triangle")) {
				chooseColor();
				drawTriangle();
			}
	}
	}
	
	public static void drawSquare() {
		
		for(int i = 0; i< 4; i++) {
		rob.move(50);
		rob.turn(90);
		}
		}
	public static void drawTriangle() {
		
		for(int i = 0; i< 3; i++) {
		rob.move(50);
		rob.turn(120);
		}
		}
	public static void drawCircle() {
		
		for(int i = 0; i< 360; i++) {
		rob.move(1);
		rob.turn(1);
		}
		}
	public static void chooseColor() {
		
		String color = JOptionPane.showInputDialog(null, "What color do you want");
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
		
	}

}
