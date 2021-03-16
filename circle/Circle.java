public class Circle {
	private double radius;
	private static int numberOfObjects = 0;

	public Circle() {
		this.radius = 1;
		numberOfObjects = numberOfObjects + 1;
	}

	public Circle(double radius) {
		this.radius = radius;
		numberOfObjects = numberOfObjects + 1;
	}

	public double getArea() {
		return Math.PI * radius * radius;
	}

	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public static int getNumberOfObjects() {
		return numberOfObjects;
	}

}
