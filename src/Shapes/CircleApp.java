package Shapes;
import util.Input;
public class CircleApp {

	private static int totalCircles = 0;
	public static void createCircle() {
		Input input = new Input();
		System.out.println("Enter the radius of the circle: ");
		double radius = input.getDouble();
		Circle circle = new Circle(radius);
		System.out.println("The area of the circle is: " + circle.getArea());
		System.out.println("The circumference of the circle is: " + circle.getCircumference());
		totalCircles++;
		if (input.yesNo("Would you like to create another circle? ")) {
			createCircle();
		} else {
			System.out.println("You have created " + totalCircles + " circles.");
		}
	}

	public static void main(String[] args) {
		createCircle();
	}
}
