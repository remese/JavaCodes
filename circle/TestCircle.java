
public class TestCircle {

	public static void main(String[] args) {
		
		System.out.println("Before creating objects:");
		System.out.println("\tThe number of Circle objects is " + Circle.getNumberOfObjects());
		
		System.out.println("\nAfter creating the first object");
		Circle circle1 = new Circle();
		System.out.println("Radius of circle1 = " + circle1.getRadius());
		System.out.println("Perimeter of circle1 = " + circle1.getPerimeter());
		System.out.println("Area of circle1 = " + circle1.getArea());
		System.out.println("\tThe number of Circle objects is " + Circle.getNumberOfObjects());

		
		System.out.println("\nAfter creating the second object");
		Circle circle2 = new Circle(8.5);
		System.out.println("Radius of circle2 = " + circle2.getRadius());
		System.out.println("Perimeter of circle2 = " + circle2.getPerimeter());
		System.out.println("Area of circle2 = " + circle2.getArea());
		System.out.println("\tThe number of Circle objects is " + Circle.getNumberOfObjects());
		
		System.out.println("\nAfter modifying the radius of the second object");
		circle2.setRadius(6);
		System.out.println("Radius of circle2 = " + circle2.getRadius());
		System.out.println("\tThe number of Circle objects is " + Circle.getNumberOfObjects());
	}

}
