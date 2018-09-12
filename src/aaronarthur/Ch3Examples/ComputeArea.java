package aaronarthur.Ch3Examples;

import java.util.Scanner;

// Aaron Arthur 9/18 Computes the area of shapes

public class ComputeArea {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// enter the radius of a circle
		double radius;
		double pi;
		double area;
		
		// assign a value to radius
		System.out.print("Enter the radius: ");
		radius = input.nextDouble();
		
		
		// compute the area
		//pi * radius * radius
		
		area = radius*radius*3.141592;
		
		// print the result
		System.out.println("Area: " + area);
		
		
		
	}

}
