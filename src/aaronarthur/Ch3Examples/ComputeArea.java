package aaronarthur.Ch3Examples;

import java.util.Scanner;

// Aaron Arthur 9/18 Computes the area of shapes

public class ComputeArea {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// enter the radius of a circle
		
		// Variables
		double radius;
		double area;
		// Constants
		double PI = 3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679; 
		
		// assign a value to radius
		System.out.print("Enter the radius: ");
		radius = input.nextDouble();
		
		
		// compute the area
		//pi * radius * radius
		
		area = radius*radius*PI;
		
		// print the result
		System.out.println("Area: " + area);
		
		
		
	}

}
// I added this in git
