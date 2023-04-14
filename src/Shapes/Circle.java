package Shapes;

import util.Input;

import java.util.Scanner;

public class Circle {
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}
	public double getArea() {
		return Math.PI * radius * radius;
	}
	public double getCircumference() {
		return 2 * Math.PI * radius;
	}

	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}

	private static int totalCircles = 0;
	public static void createCircle() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the radius of the circle: ");
		double radius = Input.getDouble();
		Circle circle = new Circle(radius);
		System.out.println("The area of the circle is: " + circle.getArea());
		System.out.println("The circumference of the circle is: " + circle.getCircumference());
		totalCircles++;
		if (Input.yesNo("Would you like to create another circle? [y/n]")) {
			createCircle();
		} else {
			System.out.println("You have created " + totalCircles + " circles.");
		}
	}
}
