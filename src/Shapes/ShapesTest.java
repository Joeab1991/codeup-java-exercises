package Shapes;

public class ShapesTest {
	public static void main(String[] args) {
//		Rectangle box1 = new Rectangle(5, 4);
//		System.out.println("box1.getPerimeter() = " + box1.getPerimeter());
//		System.out.println("box1.getArea() = " + box1.getArea());
//		Rectangle box2 = new Square(5);
//		System.out.println("box2.getPerimeter() = " + box2.getPerimeter());
//		System.out.println("box2.getArea() = " + box2.getArea());
		Quadrilateral myShape;
		myShape = new Rectangle(5, 4);
		System.out.println("Perimeter = " + myShape.getPerimeter());
		System.out.println("Area = " + myShape.getArea());
		System.out.println(myShape.getLength());
		System.out.println(myShape.getWidth());

	}
}
